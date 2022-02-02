package com.selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumPrj\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		
		
		List<WebElement> column = driver.findElements(By.tagName("th"));
		int size = column.size();
		System.out.println("Number of Columns"+size);
		
		
		List<WebElement> row= driver.findElements(By.tagName("tr"));
		int size2 = row.size();
		System.out.println("Number of row"+size2);
		
		
		WebElement percentage = driver.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String percent = percentage.getText();
		System.out.println("percentage is"+percent);
		
		
		WebElement Remarks = driver.findElement(By.xpath("//td[normalize-space()='Learn XPath']//following::td[5] "));
		String Remark = Remarks.getText();
		System.out.println("Remarks is"+Remark);
	}

}
