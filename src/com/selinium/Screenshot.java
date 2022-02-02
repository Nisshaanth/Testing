package com.selinium;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	

	

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumPrj\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://instagram.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement c = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		c.click();
		WebElement k = driver.findElement(By.id("email"));
		k.sendKeys("niss123");
		Thread.sleep(2000);
		
		TakesScreenshot src=(TakesScreenshot) driver;
		File sr = src.getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\Admin\\eclipse-workspace\\SeleniumPrj\\ScreensShot.png");
		FileUtils.copyFile(sr, dest);
	}

}
