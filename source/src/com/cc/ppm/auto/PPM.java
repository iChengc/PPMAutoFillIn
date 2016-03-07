package com.cc.ppm.auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

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
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		FillIn.fillIn(webDriver);
		FillIn.save(webDriver);
		FillIn.release(webDriver);

		webDriver.close();
		System.exit(0);
	}

	private static WebDriver initWebDriver() {
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
}
