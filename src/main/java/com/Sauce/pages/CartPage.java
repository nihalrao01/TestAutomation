package com.Sauce.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Sauce.base.TestBase;
import com.Sauce.base.genericOperations;

public class CartPage extends TestBase{
	
	genericOperations operations = new genericOperations();
	
	@FindBy(xpath = "//*[@id='checkout']")
	WebElement checkoutbtn;

	public CartPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void proceedtoCheckout() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='checkout']")).click();
		//operations.clickElement(checkoutbtn);
	}
}
