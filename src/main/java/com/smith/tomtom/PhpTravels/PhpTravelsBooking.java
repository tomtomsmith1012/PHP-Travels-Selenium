package com.smith.tomtom.PhpTravels;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PhpTravelsBooking {

	@FindBy(xpath = "//*[@id=\"guestform\"]/div[1]/div[2]/input")
	private WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[1]/div[3]/input")
	private WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[2]/div[2]/input")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[2]/div[3]/input")
	private WebElement confirmEmail;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[3]/div[2]/input")
	private WebElement mobile;
	
	@FindBy(xpath = "//*[@id=\"guestform\"]/div[4]/div[2]/input")
	private WebElement address;
	
	@FindBy(xpath = "//*[@id=\"s2id_autogen1\"]/a")
	private WebElement countryBox;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/div/input")
	private WebElement countryInput;
	
	@FindBy(xpath = "//*[@id=\"select2-drop\"]/ul/li[2]/div")
	private WebElement countryChoice;
	
	@FindBy(xpath = "//*[@id=\"body-section\"]/div/div/div[1]/div/div[1]/div[2]/div[4]/button")
	private WebElement confirmButton;
	
	public void fillForm() throws InterruptedException {
		firstName.sendKeys("Tom");
		lastName.sendKeys("Smith");
		email.sendKeys("NotMyActualEmailMate123@gmail.com");
		confirmEmail.sendKeys("NotMyActualEmailMate123@gmail.com");
		mobile.sendKeys("01234567890");
		address.sendKeys("Manchester");
		countryBox.click();
		countryInput.sendKeys("United"); 
		countryChoice.click();
		confirmButton.click();
		Thread.sleep(4000);
	}
}
