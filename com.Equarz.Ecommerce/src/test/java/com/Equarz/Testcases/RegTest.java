package com.Equarz.Testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Registration_Functionality;
import com.Utils.Utils;
import com.base.Testbase;

public class RegTest extends Testbase {
	Registration_Functionality rf;
	
	public RegTest()
	{
		super();
	}
	@BeforeMethod
	public void initialization()
	{
		Setup();
		rf=new Registration_Functionality(driver);
	}
	@Test(priority = 1)
	public void Givenurl() 
	{
		String givenurl = driver.getCurrentUrl();
		Assert.assertEquals("http://e-quarz.com/customer/auth/sign-up", givenurl);
	}
	@Test(priority = 2,dataProvider = "setdata",dataProviderClass = Utils.class)
	public void Registration(String first,String last,String emailid,
			String Phonenum,String Password1,String Confirmpassword) throws Throwable
	{
		rf.Regdetails(first, last, emailid, Phonenum, Password1, Confirmpassword);
		
	}
	

}
