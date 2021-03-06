package com.jbk.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyOrdersRepository {
	
	//enter your mobile no
	@FindBy(xpath = "//h1[text()='Enter your Mobile Number']")
	public WebElement mobileNo;
		
	//enter 10 digit no
	@FindBy(xpath = "//input[@type='text']")
	public WebElement tenDigitNo;
	
	//send otp
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement sendOTP;
	
	//you have no orders
	@FindBy(xpath = "//p[text()='You have no orders']")
	public WebElement noOrders;
	
	//you have no orders
	@FindBy(xpath = "//img")
	public WebElement image;
}
