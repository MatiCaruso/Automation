package com.globant.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogoutPage {

	@FindBy(id="preMain")
	private WebElement main;
	
	
	public boolean logout(){
		
		System.out.println(main.findElement(By.tagName("h1")).getText());

		if("You are now signed out".equals(main.getText())){
			return true;
		}
		return false;
	}
}
