package com.testcases;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomepageTestCase {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='sc-hXRMBi gQpBgO']")
	public List<WebElement> services;
	
	
	@Test
	public void homepage()throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver84.exe");
		driver = new ChromeDriver();
		driver.get("https://myshopprime.com/suhas.dhanorkar1/shop");
		//driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']//preceding::button")).click();	
		Thread.sleep(3000);
		/*WebElement btn=*/driver.findElement(By.xpath("//p[contains(text(),'Shop')]//following::button")).click();
		/*JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("argument[0].click();", btn);*/
	}
	
	@Test
	public void checkServices() throws InterruptedException
	{
		ArrayList<String> alExpected = new ArrayList<String>();
		System.out.println("Expected list:" +alExpected);
		
		ArrayList<String> actList = new ArrayList<String>();
		for (WebElement element : services)
		actList.add(element.getText());
	}
}
