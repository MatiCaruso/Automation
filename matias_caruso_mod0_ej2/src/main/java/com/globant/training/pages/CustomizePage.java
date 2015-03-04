package com.globant.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CustomizePage {

	@FindBy(xpath="//div[@class='tripCustHeader container-simple']")
	private WebElement button;
	
	public void click(){
		button.findElement(By.tagName("input")).click();
			
	}
}
