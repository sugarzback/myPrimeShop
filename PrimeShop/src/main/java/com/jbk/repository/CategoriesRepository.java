package com.jbk.repository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesRepository {

	//header- shop by category
	@FindBy(xpath = "//h3[text()='Shop by Category']")
	public WebElement header;
		
	//women category
	@FindBy(xpath = "//div[@id='accordion__heading-raa-0']")
	public WebElement women;
	
	//men category
	@FindBy(xpath = "//div[@id='accordion__heading-raa-5']")
	public WebElement men;
	
	//baby and kids category
	@FindBy(xpath = "//div[@id='accordion__heading-raa-10']")
	public WebElement kids;
		
	//home and living
	@FindBy(xpath = "//div[@id='accordion__heading-raa-12']")
	public WebElement home;
	
	//sarees
	@FindBy(xpath = "//a[@href='/suhas.dhanorkar1/list/women-ethnic-wear-sarees']")
	//div[text()='Western Wear']//preceding::div[@class='AccordionLastLevel']
	public WebElement sarees;
		
}
