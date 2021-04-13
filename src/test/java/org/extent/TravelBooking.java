package org.extent;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TravelBooking {

	ExtentReports reports;
	ExtentHtmlReporter htmlReporter;
	WebDriver driver;
	ExtentTest extentTest;
	
	@BeforeClass
	public void beforClassMethod() {
		reports=new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("extent.html");
		reports.attachReporter(htmlReporter);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\driver1.exe");
		driver=new ChromeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void afterclass() {
		driver.close();
		reports.flush();
	}
	
	@Test
	private void aFirstpage() {
		extentTest = reports.createTest("Welcome to Simple Travel Agency");
		extentTest.log(Status.INFO, "Choose your departure city by country");
		extentTest.log(Status.INFO, "Verify Agency city");
		if(driver.getCurrentUrl().contains("blaze")) {
			extentTest.log(Status.PASS, "Url is valid");
		}
		else {
			extentTest.log(Status.FAIL,"Invalid Url");
		}
	}
	
	@Parameters({"departure","destination"})
	@Test
	private void bsecpage(String dept,String dest) {
		extentTest = reports.createTest("Entering Values in Travel");
		extentTest.log(Status.INFO, "Verifying Departure city textbox is enabled");
		WebElement dDnDcity = driver.findElement(By.name("fromPort"));
		if (dDnDcity.isEnabled()&& dDnDcity.isDisplayed()) {
			extentTest.log(Status.PASS,"Departure city field is enabled");
			dDnDcity.sendKeys(dept);
			}
		else {
			extentTest.log(Status.FAIL, "Departure city filed is disabled");
		}
		
		WebElement dDnDestcity = driver.findElement(By.name("toPort"));
		if (dDnDestcity.isEnabled()&&dDnDestcity.isDisplayed()) {
			extentTest.log(Status.PASS,"Destination city field is enabled");
			dDnDcity.sendKeys(dest);
		}
		else {
			extentTest.log(Status.FAIL, "Destination city filed is disabled");
		}
		
		WebElement btnsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		if (btnsubmit.isEnabled()&&btnsubmit.isDisplayed()) {
			extentTest.log(Status.PASS,"Submit field is enabled");
			btnsubmit.click();
		}
		else {
			extentTest.log(Status.FAIL, "Submit filed is disabled");
		}
	
	}
	
	@Test
	private void flights() {
		extentTest = reports.createTest("Choose the flights in low cost");
		extentTest.log(Status.INFO, "Flights availability is enabled");
		WebElement table = driver.findElement(By.className("table"));
		List<WebElement> tablerows = table.findElements(By.tagName("tr"));
		WebElement firstrow = tablerows.get(0);
		List<WebElement> tablehead = firstrow.findElements(By.tagName("th"));
		for (int i = 0; i < tablehead.size(); i++) {
			
			WebElement th1 = tablehead.get(i);
			String price = th1.getText();
			System.out.println(price);
		}
		List<WebElement> tabledata = firstrow.findElements(By.tagName("td"));
		for (int i = 0; i < tabledata.size(); i++) {
			WebElement td1 = tabledata.get(i);
			String text = td1.getText();
			
		}
		
		
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

