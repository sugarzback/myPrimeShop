package com.jbk.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.HomePage;
import com.jbk.utilities.TestBase;

public class HomePageTestCases extends TestBase {

	HomePage homepage;
	
	public HomePageTestCases()
	{
		super();
	}
	

	@BeforeMethod
	public void setUp() {
		homepage = new HomePage(null);
	}
	
	@Test(priority = 1)
	public void checkUsefulLinksSequenceTest() throws Exception {
		Assert.assertTrue(homepage.checkServices());
	}

}
