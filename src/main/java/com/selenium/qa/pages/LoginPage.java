package com.selenium.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.selenium.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(id="email")
	WebElement emailTx;
	
	@FindBy(id="pass")
	WebElement passTx;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyPageTitle()
	{
		return driver.getTitle();
	}
	
	public HomePage verifyValidLogin(String un, String pwd)
	{
		emailTx.sendKeys(un);
		passTx.sendKeys(pwd);
		loginBtn.click();
		
		return new HomePage();
	}

}
