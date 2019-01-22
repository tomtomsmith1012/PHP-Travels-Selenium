package com.smith.tomtom.PhpTravels;

import static org.junit.Assert.*;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PhpTravelsTest {

	WebDriver driver;
	Actions actions;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C://LocalInstall//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@After
	public void teardown() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}
	
	@Test
	public void webTest() throws InterruptedException {
		driver.get("https://www.phptravels.net/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		PhpTravelsLanding landing = PageFactory.initElements(driver, PhpTravelsLanding.class);
		landing.inputLocation(driver);
		landing.inputDates(driver);
		landing.inputPeople(driver, 2, 1);
		landing.search();
		
		PhpTravelsResults results = PageFactory.initElements(driver, PhpTravelsResults.class);
		results.selectHotel(driver);
		
		PhpTravelsHotel hotel = PageFactory.initElements(driver, PhpTravelsHotel.class);
		hotel.selectRoom(driver, js);
		
		PhpTravelsBooking booking = PageFactory.initElements(driver, PhpTravelsBooking.class);
		booking.fillForm();
		
		PhpTravelsInvoice invoice = PageFactory.initElements(driver, PhpTravelsInvoice.class);
		invoice.pay(driver);
		
		assertEquals("Booking was not reserved.", "Reserved", driver.findElement(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[1]/td/div/b")).getAttribute("innerHTML"));
		
	}
	
}
