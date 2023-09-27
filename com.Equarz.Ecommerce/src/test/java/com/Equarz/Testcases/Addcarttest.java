package com.Equarz.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.AddToCart;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class Addcarttest extends Testbase {
	Login_Functionality lg;
	AddToCart Add;
	public Addcarttest()
	{
		super();
	}
	@BeforeMethod
	public void Initialisation() throws Throwable
	{
		Setup();
		lg=new Login_Functionality(driver);
		lg.Verifylogin();
		Add=new AddToCart(driver);
		
	}
	
	@Test(priority = 1)
	public void Categorytest() throws Throwable
	{
		Add.category();
	}
	@Test(priority = 2)
	public void Bannertest()
	{
		Add.Banner();
	}
	@Test(priority = 3)
	public void footerbanner()
	{
		Add.footban();
	}
	@Test(priority = 4)
	public void Product_dealofday() throws Throwable
	{
		Add.dealday();
	}
	@Test(priority = 5)
	public void Hompageproduct()
	{
		Add.Homepage_product();
	}
	@Test(priority = 6)
	public void Searchbox_toCart() throws Throwable
	{
		Add.Searchprod();
	}
	@Test(priority = 7)
	public void wishlist_product()
	{
		Add.VerifyWishlist();
	}
	
	@AfterMethod
	public void Teardown()
	{
	
		driver.close();
	}

}
