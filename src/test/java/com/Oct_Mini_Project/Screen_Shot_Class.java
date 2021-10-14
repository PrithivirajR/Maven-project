package com.Oct_Mini_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot_Class {
	
	public static void main(String[] args) throws Throwable {
		
		
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shree\\eclipse-workspace\\Selenium_Sep_Project\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
				
		Thread.sleep(3000);
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\shree\\eclipse-workspace\\Oct_Mini_Project\\Screenshot\\snap1.png");
		
		FileUtils.copyFile(src, dest);

	}

}
