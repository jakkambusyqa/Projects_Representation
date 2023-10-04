package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Utils.Utils;
import com.base.Testbase;

public class Buynow extends Testbase {
	Actions ac = new Actions(driver);
	Utils ut = new Utils();
	String str = "2";

	@FindBy(xpath = "//span[text()='Electronics']")
	WebElement elec;

	@FindBy(xpath = "//span[text()='Mobile Accessoires']")
	WebElement elec2;

	@FindBy(xpath = "//a[text()='Cases And Covers']")
	WebElement elec3;

	@FindBy(xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64945be4d2044.png']")
	WebElement prodt;

	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement cart;

	@FindBy(xpath = "//i[@class='navbar-tool-icon czi-cart']")
	WebElement cartarrow;

	@FindBy(xpath = "//a[@href='http://e-quarz.com/checkout-details']")
	WebElement checkout;

	@FindBy(xpath = "//select[@class='form-control']")
	WebElement shipping;

	@FindBy(xpath = "//a[@class='btn btn--primary pull-right']")
	WebElement checkout2;

	@FindBy(id = "same_as_shipping_address")
	WebElement sameadress;

	@FindBy(xpath = "//span[text()='Proceed payment']")
	WebElement payment;

	@FindBy(xpath = "//h5[@class='font-black __text-20px']")
	WebElement orderplaced;

	@FindBy(xpath = "(//button[@class='btn btn-block click-if-alone'])[1]")
	WebElement COD;

	@FindBy(xpath = "//input[@placeholder='Search here ...']")
	WebElement searchbox;

	@FindBy(xpath = "//i[@class='czi-search text-white']")
	WebElement searchbutton;

	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']")
	WebElement prod;

	@FindBy(xpath = "//span[text()='Buy now']")
	WebElement Buynowbutton;

	public Buynow(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}

	public void cartBuynow() throws Exception {

		ac.moveToElement(elec).build().perform();
		ac.moveToElement(elec2).build().perform();
		elec3.click();
		prodt.click();
		cart.click();
		Thread.sleep(2000);
		ac.moveToElement(cartarrow).build().perform();
		checkout.click();
		ut.dropdown(shipping, str);
		Thread.sleep(2000);
		checkout2.click();
		sameadress.click();
		payment.click();
		Thread.sleep(3000);
		COD.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String msg = wait.until(ExpectedConditions.visibilityOf(orderplaced)).getText();
		assertEquals(msg, "Your order has been placed successfully! !");

	}

	public void Directbuynow() throws Exception {
		searchbox.sendKeys(props.getProperty("searchboxtext"));
		searchbutton.click();
		prod.click();
		Thread.sleep(3000);
		Buynowbutton.click();
		ut.dropdown(shipping, str);
		Thread.sleep(2000);
		checkout2.click();
		sameadress.click();
		payment.click();
		COD.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String msg = wait.until(ExpectedConditions.visibilityOf(orderplaced)).getText();
		assertEquals(msg, "Your order has been placed successfully! !");

	}

	public void Homecartbuynow() throws Exception {
		ac.moveToElement(cartarrow).build().perform();
		checkout.click();
		ut.dropdown(shipping, str);
		Thread.sleep(2000);
		checkout2.click();
		sameadress.click();
		payment.click();
		Thread.sleep(3000);
		COD.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String msg = wait.until(ExpectedConditions.visibilityOf(orderplaced)).getText();
		assertEquals(msg, "Your order has been placed successfully! !");

	}

}
