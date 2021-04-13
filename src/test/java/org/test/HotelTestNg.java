package org.test;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class HotelTestNg extends Base{

@BeforeClass
private void beforeClass()
{
getDriver();
getUrl("https://adactinhotelapp.com/");
maximize();
}


@AfterMethod
private void screenShot(Method m) throws IOException {
screenshot(m.getName());
}

@Parameters({"username","password"})
@Test
private void tc0(String s, String s1) throws IOException 
{
WebElement user = findbyid("username");
user.sendKeys(s);
WebElement pwd = driver.findElement(By.id("password"));
pwd.sendKeys(s1);
WebElement login = driver.findElement(By.id("login"));
login.click();
}


@Parameters({"location","hotels","roomtype","roomnos","datecheckin","datecheckout","adultroom","childroom",})
@Test
private void tc1(String a, String b, String c, String d, String e, String f,String g, String h) {
	
	WebElement location = driver.findElement(By.id("location"));
	location.sendKeys(a);

	WebElement hotels = driver.findElement(By.id("hotels"));
	hotels.sendKeys(b);

	WebElement roomType = driver.findElement(By.id("room_type"));
	roomType.sendKeys(c);

	WebElement roomNos = driver.findElement(By.id("room_nos"));
	roomNos.sendKeys(d);

	WebElement checkIn = driver.findElement(By.id("datepick_in"));
	checkIn.sendKeys(e);

	WebElement checkOut = driver.findElement(By.id("datepick_out"));
	checkOut.sendKeys(f);

	WebElement adult = driver.findElement(By.id("adult_room"));
	adult.sendKeys(g);

	WebElement childRoom = driver.findElement(By.id("child_room"));
	childRoom.sendKeys("h");

	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	
}

@Test
private void tc2() {
	WebElement radioButton = driver.findElement(By.id("radiobutton_0"));
	radioButton.click();

	WebElement conti= driver.findElement(By.id("continue"));
	conti.click();

}
@Parameters({"firstname","lastname","address","ccnum","cctype","ccexp","ccexpyear","ccv"})
@Test
private void tc3(String a1,String a2,String a3,String a4,String a5,String a6,String a7,String a8) {
	WebElement firstName = driver.findElement(By.id("first_name"));
	firstName.sendKeys(a1);

	WebElement lastName = driver.findElement(By.id("last_name"));
	lastName.sendKeys(a2);

	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys(a3);

	WebElement ccnum = driver.findElement(By.id("cc_num"));
	ccnum.sendKeys(a4);

	WebElement cardType = driver.findElement(By.id("cc_type"));
	cardType.sendKeys(a5);

	WebElement cardMonth = driver.findElement(By.id("cc_exp_month"));
	cardMonth.sendKeys(a6);

	WebElement cardYear = driver.findElement(By.id("cc_exp_year"));
	cardYear.sendKeys(a7);

	WebElement ccv = driver.findElement(By.id("cc_cvv"));
	ccv.sendKeys(a8);

	WebElement book = driver.findElement(By.id("book_now"));
	book.click();

}

}
