package com.cc.ppm.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FillIn {
	private static final String PPM_TIME_STRING = "8";

	public static void fillIn(WebDriver webDriver) {
		WebElement frame = webDriver.findElement(By.id("ivuFrm_page0ivu4")); // .getAttribute("");
		WebElement innierFrame = webDriver.switchTo().frame(frame)
				.findElement(By.id("isolatedWorkArea"));
		WebDriver contentElement = webDriver.switchTo().frame(innierFrame);
		if (webDriver instanceof FirefoxDriver) {

			try {
				WebElement element = contentElement
						.findElement(By
								.xpath("//*[@id='_pageContent_']/div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
										+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[2]/table/"
										+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[5]/table/tbody/tr/td/input"));
				element.click();
				element.sendKeys(PPM_TIME_STRING);

				element = contentElement
						.findElement(By
								.xpath("//*[@id='_pageContent_']/div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
										+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[2]/table/"
										+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[6]/table/tbody/tr/td/input"));
				element.click();
				element.sendKeys(PPM_TIME_STRING);

				element = contentElement
						.findElement(By
								.xpath("//*[@id='_pageContent_']/div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
										+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[2]/table/"
										+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[7]/table/tbody/tr/td/input"));
				element.click();
				element.sendKeys(PPM_TIME_STRING);

				element = contentElement
						.findElement(By
								.xpath("//*[@id='_pageContent_']/div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
										+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[2]/table/"
										+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[8]/table/tbody/tr/td/input"));
				element.click();
				element.sendKeys(PPM_TIME_STRING);

				element = contentElement
						.findElement(By
								.xpath("//*[@id='_pageContent_']/div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
										+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[2]/table/"
										+ "tbody/tr/td/table/tbody/tr/td/div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[9]/table/tbody/tr/td/input"));
				element.click();
				element.sendKeys(PPM_TIME_STRING);

			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			try {
				contentElement
						.findElement(
								By.xpath("//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
										+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/"
										+ "div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[5]/table/tbody/tr/td/input"))
						.sendKeys(PPM_TIME_STRING);

				contentElement
						.findElement(
								By.xpath("//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
										+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/"
										+ "div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[6]/table/tbody/tr/td/input"))
						.sendKeys(PPM_TIME_STRING);

				contentElement
						.findElement(
								By.xpath("//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
										+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/"
										+ "div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[7]/table/tbody/tr/td/input"))
						.sendKeys(PPM_TIME_STRING);

				contentElement
						.findElement(
								By.xpath("//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
										+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/"
										+ "div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[8]/table/tbody/tr/td/input"))
						.sendKeys(PPM_TIME_STRING);

				contentElement
						.findElement(
								By.xpath("//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
										+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[2]/table/tbody/tr/td/"
										+ "div/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr[2]/td[9]/table/tbody/tr/td/input"))
						.sendKeys(PPM_TIME_STRING);

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void save(WebDriver webDriver) {
		String savaBtnXpathString = webDriver instanceof FirefoxDriver ? "//*[@id='_pageContent_']//div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
								+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[1]/table/"
								+ "tbody/tr/td[1]/span[4]/a" 
								: "//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
								+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[1]/table/tbody/tr/td[1]/"
								+ "span[4]/a";
		webDriver
				.findElement(
						By.xpath(savaBtnXpathString)).click();

	}

	public static void release(WebDriver webDriver) {
		String releaseBtnXpathString = webDriver instanceof FirefoxDriver ? "//*[@id='_pageContent_']//div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
				+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[1]/table/"
				+ "tbody/tr/td[1]/span[5]/a" 
				: "//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
				+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[1]/table/tbody/tr/td[1]/"
				+ "span[5]/a";
		webDriver
				.findElement(
						By.xpath(releaseBtnXpathString)).click();

	}
	

	public static void nextWeek(WebDriver webDriver) {
		String releaseBtnXpathString = webDriver instanceof FirefoxDriver ? "//*[@id='_pageContent_']//div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
				+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[1]/table/"
				+ "tbody/tr/td[1]/span[3]/a" 
				: "//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
				+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[1]/table/tbody/tr/td[1]/"
				+ "span[3]/a";
		webDriver
				.findElement(
						By.xpath(releaseBtnXpathString)).click();

	}
	
	public static void preWeek(WebDriver webDriver) {
		String releaseBtnXpathString = webDriver instanceof FirefoxDriver ? "//*[@id='_pageContent_']//div[1]/div[2]/table/tbody/tr/td/div/table/tbody/tr[5]/td/table/tbody/tr[2]/"
				+ "td/div/span/span/div/div/table/tbody/tr/td/div/div[1]/span/span/table/tbody/tr[2]/td/div[1]/table/"
				+ "tbody/tr/td[1]/span[2]/a" 
				: "//*[@id='_pageContent_']/div[1]/div[2]/div/table/tbody/tr[2]/td/table/tbody/tr[2]/td/div"
				+ "/span/div/div/table/tbody/tr/td/div/div[1]/span/table/tbody/tr[2]/td/div[1]/table/tbody/tr/td[1]/"
				+ "span[2]/a";
		webDriver
				.findElement(
						By.xpath(releaseBtnXpathString)).click();

	}
}
