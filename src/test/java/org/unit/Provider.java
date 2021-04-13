package org.unit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Provider {
	
		@Test(dataProvider ="Data")
	  private void tc0(String s , String s1) {
			
	          System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\driver1.exe");
	          WebDriver driver = new ChromeDriver();
	          driver.get("https://www.flipkart.com/");
	          
	          
	          WebElement txtfrom = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	          txtfrom.sendKeys(s);
	          
	          
	          WebElement txtto = driver.findElement(By.xpath("//input[@type='password']"));
	          txtto.sendKeys(s1);
	          
		}
		
	          @DataProvider(name="Data")
	          public static Object[][]loginData1(){
	        	  return new Object[][] {{"manikandan","mani123"},{"mohan","mohan123"},{"gowtham","gowtham123"}};
	        	  
	        	  
	          }
	          
}
	          
	          