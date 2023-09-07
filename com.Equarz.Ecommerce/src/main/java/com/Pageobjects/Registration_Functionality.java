package com.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Testbase;
import com.hospiol.pageobjects.Homepage;

public class Registration_Functionality extends Testbase{
//	public String first="";
//	public String last="";
//	public String emailid="";
//	public String Phonenum="";
//	public String Password1="";
//	public String Confirmpassword="";
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstname;
	
	@FindBy(xpath = "//input[@name='l_name']")
	WebElement lastname;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement email;
	
	@FindBy(xpath = "//input[@name='phone']")
	WebElement phone;
	
	@FindBy(id = "si-password")
	WebElement pass;
	
	@FindBy(name = "con_password")
	WebElement con_pass;
	
	@FindBy(id = "inputCheckd")
	WebElement checkbox;
	
	@FindBy(id = "sign-up")
	WebElement signup;
	
	public Registration_Functionality(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public Homepage Regdetails(String first,String last,String emailid,
			String Phonenum,String Password1,String Confirmpassword) throws Throwable 
	{
		//System.out.println(first+last+emailid+Phonenum+Password1+Confirmpassword);
		firstname.sendKeys(first);
		lastname.sendKeys(last);
		email.sendKeys(emailid);
		phone.sendKeys(Phonenum);
		pass.sendKeys(Password1);
		con_pass.sendKeys(Confirmpassword);
		checkbox.click();
		//Thread.sleep(15000);
		signup.click();
		
		return new Homepage();
	}
	
	
	
	
	
	
	
	
	
	

}
