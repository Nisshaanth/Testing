package com.selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Myminiproject {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\KARTHIK SURYA\\eclipse-workspace\\Selenium_Tool\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebElement google = driver.findElement(By.xpath("//input[@type='text']"));
		google.sendKeys("Automationpractice");
		WebElement search = driver.findElement(By.xpath("(//span[text()='automationpractice'])[1]"));
		search.click();
		WebElement click = driver.findElement(By.xpath("//h3[text()='Automation Practice']"));
		click.click();
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		signin.click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		WebElement emails = driver.findElement(By.id("email"));
		emails.sendKeys("techkarthik350@gmail.com");
		WebElement passwords = driver.findElement(By.id("passwd"));
		passwords.sendKeys("karthik2000");
		WebElement signup = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		signup.click();

		WebElement TS = driver.findElement(By.xpath("(//a[text()='T-shirts'])[2]"));
		Actions a = new Actions(driver);
		a.moveToElement(TS).build().perform();
		a.click(TS).build().perform();

		js.executeScript("window.scrollBy(0,400)");
		WebElement sl = driver.findElement(By.id("selectProductSort"));
		Select aa = new Select(sl);
		aa.selectByIndex(3);

		WebElement TS1 = driver.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		a.moveToElement(TS1).build().perform();
		a.click(TS1).build().perform();
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();

		WebElement size = driver.findElement(By.id("group_1"));
		Select q = new Select(size);
		q.selectByIndex(1);

		WebElement color = driver.findElement(By.id("color_14"));
		color.click();
		js.executeScript("window.scrollBy(0,400)");
		WebElement amount = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		a.moveToElement(amount).build().perform();
		a.click(amount).build().perform();

		WebElement shops = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]"));
        shops.click();
		js.executeScript("window.scrollBy(0,700)");
		WebElement continuoushops = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span"));
		a.moveToElement(continuoushops).build().perform();
		a.doubleClick(continuoushops).build().perform();
		js.executeScript("window.scrollBy(0,700)");
		WebElement nextstep = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]"));
		nextstep.click();
		js.executeScript("window.scrollBy(0,600)");
		WebElement accept = driver.findElement(By.id("cgv"));
		accept.click();
		WebElement nextstep1 = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		nextstep1.click();

		js.executeScript("window.scrollBy(0,600)");
		WebElement findElement = driver.findElement(By.xpath("//a[@class='cheque']"));
		findElement.click();
		js.executeScript("window.scrollBy(0,600)");
		WebElement findElements = driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]"));
		findElements.click();
		js.executeScript("window.scrollBy(0,400)");
		
		driver.close();

	}
}
