package com.smith.tomtom.PhpTravels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhpTravelsInvoice {

	private WebElement wait;
	
	@FindBy(css = ".btn.btn-default.arrivalpay")
	private WebElement payButton;
	
	public void pay(WebDriver driver) {
		wait = (new WebDriverWait(driver, 10)).until(ExpectedConditions.elementToBeClickable(payButton));
		payButton.click();
		driver.switchTo().alert().accept();
		payButton = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"invoiceTable\"]/tbody/tr[1]/td/div/b")));
	}
}
