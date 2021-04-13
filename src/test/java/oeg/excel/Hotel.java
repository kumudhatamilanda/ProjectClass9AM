package oeg.excel;


import java.sql.Date;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Hotel {
static WebDriver driver;
@BeforeClass
public static void beforeClass() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
driver.get("https://adactinhotelapp.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
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
