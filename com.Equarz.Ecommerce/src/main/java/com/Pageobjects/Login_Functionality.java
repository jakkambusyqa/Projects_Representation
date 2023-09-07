package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.hospiol.pageobjects.Homepage;

public class Login_Functionality extends Testbase {
	@FindBy(id="si-email")
	WebElement user;
	
	@FindBy(id="si-password")
	WebElement pass;
	
	@FindBy(xpath = "//button[text()='Sign in']")
	WebElement signin;
	
	public Login_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public Homepage Verifylogin() throws Throwable 
	{
		user.sendKeys(props.getProperty("username"));
		pass.sendKeys(props.getProperty("password"));
		Thread.sleep(15000);
		signin.click();
		
		return new Homepage();
	}

	

	
}
