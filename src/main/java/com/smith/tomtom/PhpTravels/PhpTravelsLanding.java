package com.smith.tomtom.PhpTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;

public class PhpTravelsLanding {

	@FindBy(xpath = "//*[@id=\"s2id_autogen8\"]/a")
	private WebElement locationBox;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement locationInput;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li/ul/li[1]/div")
	private WebElement locationResult;
	
	@FindBy(xpath = "//*[@id=\"dpd1\"]/div/input")
	private WebElement checkInBox;
	
	@FindBy(xpath = "//html/body/div[9]/div[1]/table/tbody/tr[4]/td[4]")
	private WebElement checkInDay;
	
	@FindBy(xpath = "//*[@id=\"dpd2\"]/div/input")
	private WebElement checkOutBox;
	
	@FindBy(xpath = "//html/body/div[10]/div[1]/table/tbody/tr[4]/td[6]")
	private WebElement checkOutDay;
	
	@FindBy(xpath = "//*[@id=\"travellersInput\"]")
	private WebElement peopleBox;
	
	@FindBy(xpath = "//*[@id=\"adultInput\"]")
	private WebElement adultInput;
	
	@FindBy(xpath = "//*[@id=\"childInput\"]")
	private WebElement childInput;
	
	@FindBy(xpath = "//*[@id=\"hotels\"]/form/div[5]/button")
	private WebElement searchButton;
	
	private WebElement wait;
	
	public void inputLocation(WebDriver driver) {
		locationBox.click();
		locationInput.sendKeys("London");
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(locationResult));
		locationResult.click();
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(checkInBox));
	}
	
	public void inputDates(WebDriver driver) {
		checkInBox.click();
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(checkInDay));
		checkInDay.click();
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(checkOutDay));
		checkOutDay.click();
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(peopleBox));
	}
	
	public void inputPeople(WebDriver driver, int adults, int children) {
		peopleBox.click();
		adultInput.clear();
		adultInput.sendKeys(Integer.toString(adults));
		childInput.clear();
		childInput.sendKeys(Integer.toString(children));
		childInput = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(searchButton));
	}
	
	public void search() {
		searchButton.submit();
	}
}
