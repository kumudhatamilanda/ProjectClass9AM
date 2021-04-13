package org.unit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotyel {
	static WebDriver driver;
	@BeforeClass
	public static void beforeClass() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	
	}
	@AfterClass
	public static void afterClass()
	{
		driver.quit();
	}
	@Before
	public void beforeMethod() {
	System.out.println("beforemethod running successfully");

	}

	@After
	public void afterMethod() {
		System.out.println("aftermethod running successfully");

	}
	 @Test
	public void test() {
	WebElement txtuserName = driver.findElement(By.id("username"));
	txtuserName.sendKeys("gowtham");

	WebElement txtPassWord = driver.findElement(By.id("password"));
	txtPassWord.sendKeys("java");

	WebElement login = driver.findElement(By.id("login"));
	login.click();


}
}