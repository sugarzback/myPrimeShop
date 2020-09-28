package com.jbk.utilities;

import org.openqa.selenium.WebElement;

public class ActionUtility {
	public void click(WebElement element)
	{
		element.click();
	}
	public void enterText(WebElement element, String value)
	{
		element.sendKeys(value);
	}
//drag and down
	//select
	//window handle
}
