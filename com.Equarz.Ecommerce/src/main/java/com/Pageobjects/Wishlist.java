package com.Pageobjects;



	import static org.testng.Assert.assertEquals;

	import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.openqa.selenium.support.ui.ExpectedCondition;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	import com.base.Testbase;

	public class Wishlist extends Testbase {
		Actions ac=new Actions(driver);
		int i,j,k;
		
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
		  
		
		@FindBy(xpath="//button[@class='btn __text-18px text-danger'] ")
		WebElement Wishlistbutton;
		
		@FindBy(xpath = "//span[@class='countWishlist']")
		WebElement wishcount;
		
		@FindBy(xpath = "//div[@class='card __card __card-mobile-340 mb-3']")
		List<WebElement> wishlistset;
		
		


		
		
		public Wishlist(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
	    public homepage categorywishlist() throws Throwable 
	    {
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
	    	ac.moveToElement(Homecategory).build().perform();
	    	Thread.sleep(2000);
	    	ac.moveToElement(Kitchensub).build().perform();
	    	Waterbottles.click();
	    	Bottle.click();
	    	Wishlistbutton.click();
	    	Thread.sleep(3000);
		    String str1=wishcount.getText();
		    j=Integer.parseInt(str1);
			assertEquals(j,i);
	    	return new homepage();
	    }
	    public homepage Bannerwishlist() throws Throwable 
	    {
	    	
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
	    	Slide.click();  	
	    	wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	    	wait.until(ExpectedConditions.elementToBeClickable(banner));
	    	banner.click();
	    	Phant.click();
	    	Wishlistbutton.click();
	    	Thread.sleep(3000);
			   String str1=wishcount.getText();
		    	j=Integer.parseInt(str1);
			   assertEquals(j,i);
	    	
	    	return new homepage();
	    }
	    public homepage footbanwishlist() throws Throwable {
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
	    	
		   footban.click();
		   Jeans.click();
		   Wishlistbutton.click();
		   Thread.sleep(3000);
		   String str1=wishcount.getText();
	    	j=Integer.parseInt(str1);
		   assertEquals(j,i);
		   
		 	return new homepage();
			
		}
	    public homepage dealdaywishlist () throws Throwable{
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
			
			   dealbuy.click();
			   Wishlistbutton.click();
			 	Thread.sleep(3000);
				   String str1=wishcount.getText();
			    	j=Integer.parseInt(str1);
				   assertEquals(j,i);
				   return new homepage();
	    
	    }
	    public homepage Homepage_product_wishlist () throws Throwable {
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
			homepageproduct.click();
			Wishlistbutton.click();
			Thread.sleep(3000);
			   String str1=wishcount.getText();
		    	j=Integer.parseInt(str1);
			   assertEquals(j,i);
		 	return new homepage();
			
		}
	    public  homepage Searchprodwishlist () throws Exception {
	    	String str=wishcount.getText();
	    	i=Integer.parseInt(str);
	    	i=i+1;
			searchbox.sendKeys(props.getProperty("searchboxtext"));
			searchbutton.click();
			Searchproduct.click();
			Thread.sleep(3000);
			Wishlistbutton.click();
			Thread.sleep(3000);
			   String str1=wishcount.getText();
		    	j=Integer.parseInt(str1);
			   assertEquals(j,i);
		 	return new homepage();
	    }
       public homepage remove() throws Throwable
       {
    	   footban.click();
		   Jeans.click();
		   Wishlistbutton.click();
		   Thread.sleep(3000);
		   String str=wishcount.getText();
	    	k=Integer.parseInt(str);
	    	k=k-1;
		   wishlist.click();
		   int wishlistcount=wishlistset.size();
		   String beforeXpathprod ="//div[@class='card __card __card-mobile-340 mb-3'][";
			  String afterXpathprod  = "]";
			  String beforeXpathremove ="(//i[@class='czi-close-circle'])[";
			  String afterXpathremove = "]";
			  
			  for(i=1;i<=wishlistcount;i++)
			  {
				  String ActualXpath= beforeXpathprod + i + afterXpathprod;
				  WebElement element= driver.findElement(By.xpath(ActualXpath));

				  
				  if(element.getText().contains(props.getProperty("prod")))
				  {
					  String actualremove=beforeXpathremove+i+afterXpathremove;
					   WebElement remove=driver.findElement(By.xpath(actualremove));
					   remove.click();
					   Thread.sleep(2000);
					   driver.navigate().refresh();
				  }
				  
       }
			  String str1=wishcount.getText();
		    	j=Integer.parseInt(str1);
			   assertEquals(j,k);
			  
		   
		 
		 
		   return new homepage();
       }
	    
		}
		





