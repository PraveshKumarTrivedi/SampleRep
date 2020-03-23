package com.selenium.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.qa.base.TestBase;
import com.selenium.qa.pages.HomePage;
import com.selenium.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	
	LoginPage loginpage;
	HomePage homepage;
	
	public LoginPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setUp()
	{
		intialization();
		loginpage = new LoginPage();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title = loginpage.verifyPageTitle();
		Assert.assertEquals(title, "Facebook-log in or sign up");
	}
	
	@Test(priority=2)
	public void VerifyValidUserTest()
	{
		homepage = loginpage.verifyValidLogin(prop.getProperty("u-email"), prop.getProperty("u_pwd"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
