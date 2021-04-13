package oeg.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodCreate {
	WebDriver driver;
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GOWTHAM\\eclipse-workspace\\Excel\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 return driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void pageMaxi() {
		driver.manage().window().maximize();
	}
	
	public WebElement locatorById(String data) {
		WebElement locatorTxt1 = driver.findElement(By.id(data));
		return locatorTxt1;
	}
	
	public void enterKey(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public WebElement locatorByName(String data) {
		WebElement locatorByName = driver.findElement(By.name(data));
		return locatorByName;
	}
	
	public void btnClick(WebElement element) {
		element.click();
	}
	public void selectedByIndex() {

	}
	
	public void quitBrowser() {
		driver.quit();
		
		
	}
}
