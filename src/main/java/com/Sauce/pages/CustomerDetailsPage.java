package com.Sauce.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sauce.base.TestBase;
import com.Sauce.base.genericOperations;


public class CustomerDetailsPage extends TestBase{
	
	genericOperations operations = new genericOperations();
	
	@FindBy(xpath="//*[@id='first-name']")
	WebElement fnameField ;
	
	@FindBy(xpath="//*[@id='last-name']")
	WebElement lnameField ;
	
	@FindBy(xpath="//*[@id='postal-code']")
	WebElement codeField ;
	
	@FindBy(xpath="//*[@id='continue']")
	WebElement continuebtn ;
	
	public CustomerDetailsPage(){
		PageFactory.initElements(driver, this);
	}

	public void enterinfo(String fname,String lname,String pcode) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='first-name']")).sendKeys(fname);
		//operations.enterText(fnameField, fname);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='last-name']")).sendKeys(lname);
		//operations.enterText(lnameField, lname);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='postal-code']")).sendKeys(pcode);
		//operations.enterText(codeField, pcode);
		
	}
	
	public void clickcontinue() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='continue']")).click();
	}
}
