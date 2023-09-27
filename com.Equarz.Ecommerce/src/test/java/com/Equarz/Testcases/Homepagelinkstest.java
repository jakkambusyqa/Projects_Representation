package com.Equarz.Testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Pageobjects.Homepagelinks;
import com.Pageobjects.Login_Functionality;
import com.base.Testbase;

public class Homepagelinkstest extends Testbase {
	Homepagelinks HP;
	Login_Functionality lg;

	public Homepagelinkstest() {
		super();
	}

	@BeforeClass
	public void start() throws Throwable {
		Setup();
		lg = new Login_Functionality(driver);
		HP = new Homepagelinks(driver);
		lg.Verifylogin();
	}
	@BeforeMethod
	public void logo()
	{
		HP.logoclick();
	}

	@Test(priority = 1)
	public void featureproducttest() {
		HP.verifyfeatureproducts();
	}

	@Test(priority = 2)
	public void latestproductstest() {
		HP.verifylatestproducts();
	}

	@Test(priority = 3)
	public void BSTtest() {
		HP.verifyBST();
	}

	@Test(priority = 4)
	public void RTPtest() {
		HP.verifyRTP();
	}

	@Test(priority = 5)
	public void Profileinfotest() {
		HP.verifyProfileinfo();
	}

	@Test(priority = 6)
	public void trackordertest() {
		HP.verifytrackorder();
	}

	@Test(priority = 7)
	public void refundpolicytest() {
		HP.verifyrefundpolicy();
	}

	@Test(priority = 8)
	public void returnpolicytest() {
		HP.verifyreturnpolicy();
	}

	@Test(priority = 9)
	public void cancellationpolicytest() {
		HP.verifycancellationpolicy();
	}

	@Test(priority = 10)
	public void supporttickettest() {
		HP.verifysupportticket();
	}

	@Test(priority = 11)
	public void twittertest() {
		HP.verifytwitter();
	}

	@Test(priority = 12)
	public void linkedintest() {
		HP.verifylinkedin();
	}

	@Test(priority = 13)
	public void Googletest() {
		HP.verifyGoogle();
	}

	@Test(priority = 14)
	public void pintresttest() {
		HP.verifypintrest();
	}

	@Test(priority = 15)
	public void instatest() {
		HP.verifyinsta();
	}

	@Test(priority = 16)
	public void facebooktest() {
		HP.verifyfacebook();
	}

	@Test(priority = 17)
	public void termstest() {
		HP.verifyterms();
	}

	@Test(priority = 18)
	public void privacytest() {
		HP.verifyprivacy();
	}

	@Test(priority = 19)
	public void logotest() {
		HP.verifylogo();
	}

}
