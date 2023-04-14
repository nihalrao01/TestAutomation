package com.Sauce.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Sauce.base.TestBase;
import com.Sauce.pages.CartPage;
import com.Sauce.pages.CustomerDetailsPage;
import com.Sauce.pages.LoginPage;
import com.Sauce.pages.OverViewPage;
import com.Sauce.pages.ProductsPage;


public class orderItemTest extends TestBase{
	LoginPage loginPage;
	ProductsPage productspage = new ProductsPage();
	CartPage cartpage = new CartPage();
	CustomerDetailsPage customerdetailspage = new CustomerDetailsPage();
	OverViewPage overviewpage = new OverViewPage();
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test
	public void orderTest(){
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		productspage.selectitem();
		productspage.proceedtoCart();
		cartpage.proceedtoCheckout();
		customerdetailspage.enterinfo("dawd","wsadwad","56465");
		customerdetailspage.clickcontinue();
		overviewpage.clickFinish();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
}
