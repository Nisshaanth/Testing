package com.selinium;







import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Handlinf {
	public static void main(String[] args) throws Throwable     {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\SeleniumPrj\\Driver\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
          driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		WebElement S = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		S.click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		WebElement C = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		C.click();
		driver.switchTo().alert().dismiss();
		
		
		Alert text = driver.switchTo().alert();
		String text2 = text.getText();
		System.out.println(text2);
		
		text.sendKeys("Rio");
		
		
		
		
		
	    
	    
	
	
		
		
		
		
	}

}
