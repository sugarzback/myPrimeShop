package com.utility;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestBase {

	public static WebDriver driver;
	Properties prop;
	FileInputStream fis = null;
	
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver84.exe");
		driver = new ChromeDriver();
		driver.get("https://myshopprime.com/suhas.dhanorkar1/shop");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	String readAnyProperty(String propName) {
		String val = null;
		try {
			fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/" + "/Config.properties");
			prop = new Properties();
			prop.load(fis);

			val = prop.getProperty(propName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return val;
	}
}
