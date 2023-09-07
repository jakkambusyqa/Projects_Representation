package com.Equarz.Testcases;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Login_Functionality;
import com.base.Testbase;



public class LoginTest extends Testbase {
	
	Login_Functionality lf;
	
	public LoginTest()
	{
		super();
	}
	
	@BeforeMethod
	public void Initi()
	{
		Setup();
		lf=new Login_Functionality(driver);
	}
//	@Test(priority = 1)
//	public void Givenurl() 
//	{
//		String givenurl = driver.getCurrentUrl();
//		Assert.assertEquals("http://e-quarz.com/customer/auth/login", givenurl);
//	}
	
	@Test (priority = 1)
	public void validatelogin() throws Throwable
	{
		lf.Verifylogin();
		String url=driver.getCurrentUrl();
		assertEquals(url, "http://e-quarz.com/");
	}



}
