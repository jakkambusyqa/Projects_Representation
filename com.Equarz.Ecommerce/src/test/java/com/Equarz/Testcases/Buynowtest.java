package com.Equarz.Testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Buynow;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class Buynowtest extends Testbase{
	Login_Functionality lf;
	Buynow bn;
	public Buynowtest()
	{
		super();
	}
	@BeforeMethod
	public void signin() throws Throwable
	{
		Setup();
		lf=new Login_Functionality(driver);
		bn=new Buynow(driver);
		lf.Verifylogin();
	}
	@Test
	public void cartBuynowtest() throws Throwable
	{
		bn.cartBuynow();
	}
	@Test
	public void Directbuynowtest() throws Throwable
	{
		bn.Directbuynow();
	}
	@Test
	public void Homecartbuynowtest() throws Throwable
	{
		bn.Homecartbuynow();
	}
	

}
