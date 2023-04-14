package com.Sauce.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sauce.base.TestBase;
import com.Sauce.base.genericOperations;


public class ProductsPage extends TestBase {
	
	genericOperations operations = new genericOperations();

	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	WebElement addToCartbtn1;
	
	@FindBy(xpath = "//*[@id='shopping_cart_container']/a/span")
	WebElement cart;

	public ProductsPage() {
		PageFactory.initElements(driver, this);
	}
	//*[@id="add-to-cart-sauce-labs-backpack"]
	public void selectitem(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		//operations.clickElement(addToCartbtn1);
	}

	public void proceedtoCart() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='shopping_cart_container']/a/span")).click();
		//operations.clickElement(cart);
	}
}
