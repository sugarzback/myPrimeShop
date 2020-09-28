package com.jbk.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfileRepository {

	// enter your name
	@FindBy(xpath = "//p[text()='Enter your Name']")
	public WebElement enterYourName;

	// about shop
	@FindBy(xpath = "//span[text()='About Shop']")
	public WebElement aboutShop;

	// whatsapp
	@FindBy(xpath = "//span[text()='Whatsapp']")
	public WebElement whatsapp;

	// link of website
	@FindBy(xpath = "//input[@value='https://myshopprime.com/suhas.dhanorkar1/shop']")
	public WebElement link;

	// manage address
	@FindBy(xpath = "//span[text()='Manage Address']")
	public WebElement manageAddress;

	// add new address
	@FindBy(xpath = "//button[@type='button']")
	public WebElement addNewAddress;

	// add delivery address
	@FindBy(xpath = "//button[@type='button']")
	public WebElement delivery;
}
