package com.Equarz.Testcases;


	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	import com.Pageobjects.AddToCart;
	import com.Pageobjects.Login_Functionality;
import com.Pageobjects.Wishlist;
import com.base.Testbase;

	public class Wishlisttest extends Testbase {
		Login_Functionality lg;
		Wishlist wish;
		public Wishlisttest()
		{
			super();
		}
		@BeforeMethod
		public void Initialisation() throws Throwable
		{
			Setup();
			lg=new Login_Functionality(driver);
			lg.Verifylogin();
			wish=new Wishlist(driver);
			
		}
		
		@Test(priority = 1)
		public void Categorytest() throws Throwable
		{
			wish.categorywishlist();
		}
		@Test(priority = 2)
		public void Bannertest() throws Throwable
		{
			wish.Bannerwishlist();
		}
		@Test(priority = 3)
		public void footerbanner() throws Throwable
		{
			wish.footbanwishlist();
		}
		@Test(priority = 4)
		public void Product_dealofday() throws Throwable
		{
			wish.dealdaywishlist();
		}
		@Test(priority = 5)
		public void Hompageproduct() throws Throwable
		{
			wish.Homepage_product_wishlist();
		}
		@Test(priority = 6)
		public void Searchbox_towishlist() throws Throwable
		{
			wish.Searchprodwishlist();
		}
		@Test
		public void removeWishlist() throws Throwable
		{
			wish.remove();
		}
//
//		@AfterMethod
//		public void Teardown()
//		{
//		
//			driver.close();
//		}

	}



