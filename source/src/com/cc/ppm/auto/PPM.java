package com.cc.ppm.auto;

import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class PPM {
	public static void main(String[] args) {
		if (args == null || args.length < 2) {
			System.out
					.println("You must provider user name and password. \n e.g:java -jar ppmAuto.jar [username] [password]");
			System.exit(0);
			return;
		}

		WebDriver webDriver = initWebDriver();

		Login.doLogin(webDriver, args[0], args[1]);
		int retry_times = 3;
		while (retry_times-- > 0) {
			try {
				Thread.sleep(5000);
				FillIn.fillIn(webDriver);
				Thread.sleep(2000);
				FillIn.save(webDriver);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		retry_times = 3;
		while (retry_times-- > 0) {
			try {
				Thread.sleep(2000);
				FillIn.release(webDriver);
				Thread.sleep(2000);
				break;
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		webDriver.close();
	}

	private static WebDriver initWebDriver() {
		String os = getOS();
		if (os.startsWith("win")) {
			return initWindowsDriver();
		} else if (os.startsWith("linux") || os.startsWith("mac")) {
			return initLinuxDriver();
		} else if (os.startsWith("mac")) {
			return initMacDriver();
		}

		return null;
	}

	private static String getOS() {
		Properties prop = System.getProperties();

		String os = prop.getProperty("os.name").toLowerCase();
		return os;
	}

	private static WebDriver initMacDriver() {
		DesiredCapabilities cap = DesiredCapabilities.safari();
		cap.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		WebDriver driver = new SafariDriver(cap);
		return driver;
	}

	private static WebDriver initWindowsDriver() {
		DesiredCapabilities capability = DesiredCapabilities.internetExplorer();
		System.setProperty("webdriver.ie.driver", ".\\IEDriverServer.exe");
		capability
				.setCapability(
						InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
						true);
		WebDriver webDriver = new InternetExplorerDriver(capability);
		webDriver.manage().window().setSize(new Dimension(600, 600));
		return webDriver;
	}

	private static WebDriver initLinuxDriver() {
		DesiredCapabilities cap = DesiredCapabilities.firefox();
		cap.setCapability(
				InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		WebDriver driver = new FirefoxDriver(cap);
		return driver;
	}
}
