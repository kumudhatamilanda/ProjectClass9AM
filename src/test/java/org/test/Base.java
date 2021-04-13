package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.internal.FindsByName;

public class Base {
	
public static WebDriver driver;

public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}

public void getUrl(String url) {
	driver.get(url);
}

public void maximize() {
	driver.manage().window().maximize();
}


	public static void screenshot(String name) throws IOException {
		TakesScreenshot ss= (TakesScreenshot)driver;
		File src = ss.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\target\\" +name + ".png");
		FileUtils.copyFile(src, dest);
	}
	
	
	public static WebElement findbyid(String data) {
		WebElement txtname = driver.findElement(By.id(data));
	return txtname;	
	}
	
	public static WebElement findbyName(String name) {
		WebElement txtuser = driver.findElement(By.name(name));
		return txtuser;
	}
	
	public void sendkeys (WebElement e,String s) {
		e.sendKeys(s);
	}
	

	
}
