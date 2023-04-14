package com.Sauce.base;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericOperations {
	
	public boolean checkElementPresence(WebElement element) {
		Boolean isElementPresence = false;
		try {
			Wait<WebElement> wait = new FluentWait<WebElement> (element)
					.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(1))
					.ignoring(NoSuchElementException.class);
			isElementPresence = wait.until(new Function<WebElement,Boolean>(){
				public Boolean apply(WebElement element) {
					return element.isDisplayed();
				}
			});
			return true;
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void clickElement(WebElement element) {
		if(checkElementPresence(element)) {
			element.click();
		}
		else {
			System.out.println("Element could not be clicked");
		}
	}
	
	public void enterText(WebElement element,String text) {
		if(checkElementPresence(element)) {
			element.clear();
			element.sendKeys(text);
		}
		else {
			System.out.println("Text could not be entered");
		}
	}

}
