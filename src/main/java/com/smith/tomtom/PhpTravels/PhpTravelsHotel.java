package com.smith.tomtom.PhpTravels;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsHotel {
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div")
	private WebElement selectButton;
	
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/button")
	private WebElement confirmButton;
	
	private WebElement wait;
	
	public void selectRoom(WebDriver driver, JavascriptExecutor js) throws InterruptedException {
		
		js.executeScript("window.scrollBy(0,750)");
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(selectButton));
		selectButton.click();
		Thread.sleep(1000);
		confirmButton.click();
		Thread.sleep(1000);
	}
}
