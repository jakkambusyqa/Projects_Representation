package com.Pageobjects;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Utils.Utils;
import com.base.Testbase;

public class Homepagelinks extends Testbase {
	Utils ut=new Utils();
	@FindBy(xpath = "//a[text()='Featured Products']")
	WebElement featureproducts;

	@FindBy(xpath = "//a[text()='Latest Products']")
	WebElement latestproducts;

	@FindBy(xpath = "//a[text()='Best Selling Products']")
	WebElement BST;

	@FindBy(xpath = "//a[text()='Top Rated Products']")
	WebElement RTP;

	@FindBy(xpath = "//a[text()='Profile Info']")
	WebElement Profileinfo;

	@FindBy(xpath = "//a[text()='Track Order']")
	WebElement trackorder;

	@FindBy(xpath = "//a[text()='Refund policy']")
	WebElement refundpolicy;

	@FindBy(xpath = "//a[text()='Return policy']")
	WebElement returnpolicy;

	@FindBy(xpath = "//a[text()='Cancellation policy']")
	WebElement cancellationpolicy;

	@FindBy(xpath = " //i[@class='fa fa-user-o m-2']")
	WebElement supportticket;

	@FindBy(xpath = " //a[@href='https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in']")
	WebElement twitter;

	@FindBy(xpath = " //a[@href='https://in.linkedin.com/']")
	WebElement linkedin;

	@FindBy(xpath = " //a[@href='https://www.marolix.com/']")
	WebElement Google;

	@FindBy(xpath = " //a[@href='https://www.pinterest.com/pinterest/']")
	WebElement pintrest;

	@FindBy(xpath = "//a[@href='https://www.instagram.com/?hl=en']")
	WebElement insta;

	@FindBy(xpath = " //a[@href='https://www.facebook.com/']")
	WebElement facebook;

	@FindBy(xpath = " //a[text()='Terms & Conditions']")
	WebElement terms;

	@FindBy(xpath = " //a[@href='http://e-quarz.com/privacy-policy']")
	WebElement privacy;

	@FindBy(xpath = " //a[@class='navbar-brand d-none d-sm-block mr-3 flex-shrink-0 __min-w-7rem']")
	WebElement logo;

	public Homepagelinks(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void verifyfeatureproducts() {
		featureproducts.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/products?data_from=featured&page=1");
	}

	public void verifylatestproducts() {
		
		latestproducts.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/products?data_from=latest&page=1");
	}

	public void verifytrackorder() {
		trackorder.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/track-order");
	}

	public void verifyRTP() {
		RTP.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/products?data_from=top-rated&page=1");

	}

	public void verifyProfileinfo() {
		Profileinfo.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/user-account");
	}

	public void verifyBST() {
		BST.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/products?data_from=best-selling&page=1");
	}

	public void verifyrefundpolicy() {
		
		refundpolicy.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/refund-policy");
	}

	public void verifyreturnpolicy() {
	
		returnpolicy.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/return-policy");
	}

	public void verifycancellationpolicy() {
		
		cancellationpolicy.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/cancellation-policy");
	}

	public void verifysupportticket() {
		
		supportticket.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/account-tickets");
	}

	public void verifytwitter() {
		String str = "";
		
		window1 = driver.getWindowHandle();
		twitter.click();
		ut.Windowhandless(window1);
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://twitter.com/i/flow/login?redirect_after_login=%2F%3Flang%3Den-in");
	}

	public void verifylinkedin() {
		String str = "";
		
		window1 = driver.getWindowHandle();
		linkedin.click();
		ut.Windowhandless(window1);
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://in.linkedin.com/");
	}

	public void verifyGoogle() {
		String str = "";
		
		window1 = driver.getWindowHandle();
		Google.click();
		ut.Windowhandless(window1);
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://www.marolix.com/");
	}

	public void verifypintrest() {
		String str = "";
		
		String window1 = driver.getWindowHandle();
		pintrest.click();
		ut.Windowhandless(window1);
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://www.pinterest.com/pinterest/");
	}

	public void verifyinsta() {
		String str = "";
		
		window1=driver.getWindowHandle();
		insta.click();
		ut.Windowhandless(window1);
		
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://www.instagram.com/?hl=en");
	}

	public void verifyfacebook() {
		String str = "";
		
		String window1 = driver.getWindowHandle();
		facebook.click();
		ut.Windowhandless(window1);
		str = driver.getCurrentUrl();
		driver.switchTo().window(window1);
		assertEquals(str, "https://www.facebook.com/");
	}

	public void verifyterms() {
		
		terms.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/terms");
	}

	public void verifyprivacy() {
		
		privacy.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/privacy-policy");
	}

	public void verifylogo() {
		logo.click();
		String str = driver.getCurrentUrl();
		assertEquals(str, "http://e-quarz.com/");
	}
	public void logoclick()
	{
		logo.click();
	}

}
