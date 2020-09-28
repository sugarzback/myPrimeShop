package com.jbk.repository;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageRepository {
	
	//image
	@FindBy(xpath = "//a/img")
	public WebElement image;
	
	//title = suhas Dhanorkar's shop
	@FindBy(xpath="//p[contains(text(),'Suhas')]")
	public WebElement title;
	
	//services - free delivery, cash on delivery, easy returns, customer support
	@FindBy(xpath= "//img[@src='https://d1ixo36kppfedg.cloudfront.net/faceview/shop-default2-lg300x300.png']")
	public WebElement logo;
		
	//All products name
	@FindBy(xpath="//h3[text()='— All Products —']")
	public WebElement allProducts;
	
	//add to cart
	@FindBy(xpath ="//div[@class='sc-hXRMBi gQpBgO']")
	public List<WebElement> services;
	
	@FindBy(xpath="//button[@type='button']")
	public List<WebElement> buttons;
	
	
}
