package com.Sauce.pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Sauce.base.TestBase;
import com.Sauce.base.genericOperations;

public class LoginPage extends TestBase {

	genericOperations operations = new genericOperations();
	
	@FindBy(xpath = "//*[@id='user-name']")
	WebElement usernameField;

	@FindBy(xpath = "//*[@id='password']")
	WebElement passwordField;

	@FindBy(xpath = "//*[@id='login-button']")
	WebElement loginbtn;
	
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password) {
		enterCredentials(username, password);
		clickLogin();
	}
	
	public void printalllinks() {
		List<WebElement> w1 = driver.findElements(By.tagName("a"));
		
		for(int i=0; i<w1.size()-1;i++) {
			for(int j=1;j<w1.size();j++) {
				if(w1.get(i).getText()!=w1.get(j).getText()) {
					if(w1.get(i).getText()!= "" || w1.get(i).getText()!= " ") {
						System.out.println(w1.get(i).getText());
					}
				}
			}
		}
	}
	
	public void enterCredentials(String username, String password) {
		if (username.isEmpty() == true || password.isEmpty() == true) {
			System.out.println("Username/Password cannot be Empty");
		} else {
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			operations.enterText(usernameField, username);
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			operations.enterText(passwordField, password);
		}
	}

	public void clickLogin() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		operations.clickElement(loginbtn);
	}
}
