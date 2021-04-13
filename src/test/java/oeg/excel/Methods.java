package oeg.excel;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Methods {
	
public static void main(String[] args) throws InterruptedException {
	MethodCreate global = new MethodCreate();
	global.getDriver();
	
	global.getUrl("https://www.facebook.com/");
	
	global.pageMaxi();
	
	WebElement locatorById = global.locatorById("email");
	global.enterKey(locatorById, "gowtham");
	
	WebElement locatorById2 = global.locatorById("pass");
	global.enterKey(locatorById2, "krishz");
	
	WebElement locatorByName = global.locatorByName("login");
	global.btnClick(locatorByName);
	
}
}
