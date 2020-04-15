package com.manas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchManApp {

	public static void main(String[] args) {
				System.setProperty("webdriver.gecko.driver","C:\\Users\\manas\\Desktop\\WD\\jar\\geckodriver.exe");
				  WebDriver driver=new FirefoxDriver();
				  driver.get("http://facebook.com");
				  driver.manage().window().maximize();
				  System.out.println("New ManashoreTech App Version 2");
	}

}
