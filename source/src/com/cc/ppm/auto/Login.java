package com.cc.ppm.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	public static void doLogin(WebDriver webDriver, String userName, String password) {
		webDriver.get(Constants.URL);
		webDriver.findElement(By.id("logonuidfield")).sendKeys(userName);
		WebElement passwordElement = webDriver.findElement(By.id("logonpassfield"));
		passwordElement.clear();
		passwordElement.sendKeys(password);
		webDriver.findElement(By.name("uidPasswordLogon")).click();
		///webDriver.findElement(By.name("uidPasswordLogon")).click();
	}
}
