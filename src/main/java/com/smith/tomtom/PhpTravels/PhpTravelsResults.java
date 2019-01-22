package com.smith.tomtom.PhpTravels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsResults {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement nextPage;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[2]/td/div[2]/div/h4/a")
	private WebElement hotelButton;
	
	public void selectHotel(WebDriver driver) {
		nextPage.click();
		nextPage = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(hotelButton));
		hotelButton.click();
	}
}
