package com.Pageobjects;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.Testbase;

public class AddToCart extends Testbase {
	Actions ac=new Actions(driver);
	
	@FindBy(xpath = "//span[text()='Home & Kitchen']")
	WebElement Homecategory;
	
	@FindBy(xpath = "//span[text()='Kitchen storage & Containers']")
	WebElement Kitchensub;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/products?id=370&data_from=category&page=1']")
	WebElement Waterbottles;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/signoraware-aqua-glow-borosilicate-glass-water-bottle-set-of-1-black-550ml21mm-cleNbI']")
	WebElement Bottle;
	
	@FindBy(xpath = "//span[text()='Add to cart']")
	WebElement addcart;
	
	@FindBy(xpath = "//button[@class='close __close']")
	WebElement close;
	
	@FindBy(xpath = "//li[@data-slide-to='2']")
	WebElement Slide;
	
	@FindBy(xpath = "//img[@src='http://e-quarz.com/storage/app/public/banner/2023-07-21-64ba5d58940f6.png']")
	WebElement banner;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/urbano-fashion-mens-cotton-slim-fit-casual-chinos-trousers-stretch-OUgakW']")
	WebElement Phant;
	
	@FindBy(xpath = "//div[@class='toast toast-success']")
	WebElement success;
	
	@FindBy(xpath = " //img[@class='d-block footer_banner_img __inline-63'] ")
	WebElement footban;
	
	@FindBy(xpath = "//a[@href='http://e-quarz.com/product/aeropostale-womens-slim-fit-jeans-cqB0pU']")
	WebElement Jeans;
	
	@FindBy(xpath = "//button[@class='buy_btn']")
	WebElement dealbuy;
	
	@FindBy (xpath = "//img[@src='http://e-quarz.com/storage/app/public/product/thumbnail/2023-06-22-64944736cf441.png']")
	WebElement homepageproduct;
	
	@FindBy(xpath ="//input[@placeholder='Search here ...']")
	WebElement searchbox;
	
	@FindBy(xpath="//i[@class='czi-search text-white']")
	WebElement searchbutton;
	
	@FindBy(name  = "//a[@href='http://e-quarz.com/product/hp-247-g8-laptop-amd-athlon-p-3045b-hd-14-inches355cm-hd-8gb-ram-ddr4-1tb-hddwindows-11-home-w11-sl-one-year-warranty-bl']//*")
	WebElement Searchproduct;
	
	@FindBy(xpath = "//i[@class='navbar-tool-icon czi-heart']" )
	  WebElement wishlist;
	  
	@FindBy (xpath ="//a[@href='http://e-quarz.com/product/rts-2-pack-mini-usb-c-type-c-adapter-plug-type-c-female-to-usb-a-male-charger-charging-cable-adapter-converter-compatibl']")
	  WebElement wishlistproduct;
	


	
	
	public AddToCart(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
    public homepage category() throws Throwable 
    {
    	
    	
    	ac.moveToElement(Homecategory).build().perform();
    	Thread.sleep(2000);
    	ac.moveToElement(Kitchensub).build().perform();
    	Waterbottles.click();
    	Bottle.click();
    	addcart.click();
    	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
    	assertEquals("Successfully added!", msg);
    	return new homepage();
    }
    public homepage Banner() 
    {
    	
    	
    	Slide.click();  	
    	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
    	wait.until(ExpectedConditions.elementToBeClickable(banner));
    	banner.click();
    	Phant.click();
    	addcart.click();
    	String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
    	assertEquals("Successfully added!", msg);
    	
    	return new homepage();
    }
    public homepage footban() {
		
	   footban.click();
	   Jeans.click();
	   addcart.click();
	   wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
	 	return new homepage();
		
	}
    public homepage dealday () throws InterruptedException {
		
		
		   dealbuy.click();
		   addcart.click();
		   wait= new WebDriverWait(driver, Duration.ofSeconds(15));
			 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
		 	assertEquals("Successfully added!", msg);
		 	return new homepage();
    
    }
    public homepage Homepage_product () {
		
		homepageproduct.click();
		addcart.click();
		wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
	 	return new homepage();
		
	}
    public  homepage Searchprod () throws Exception {
		
		searchbox.sendKeys(props.getProperty("searchboxtext"));
		searchbutton.click();
		Searchproduct.clear();
		Thread.sleep(3000);
		addcart.click();
		 wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
	 	return new homepage();
    }
    public homepage VerifyWishlist() {
		
		wishlist.click();
		wishlistproduct.click();
		addcart.click();
		 wait= new WebDriverWait(driver, Duration.ofSeconds(15));
		 String msg=wait.until(ExpectedConditions.visibilityOf(success)).getText();
	 	assertEquals("Successfully added!", msg);
	 	return new homepage();
	}
    
	}
	


