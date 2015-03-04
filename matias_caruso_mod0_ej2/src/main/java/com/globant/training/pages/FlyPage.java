package com.globant.training.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlyPage {
	
	@FindBy(xpath="//span[@class='item airportCode ']")
	private List<WebElement> airportFrom;

	@FindBy(xpath="//input[@value='Continue']")
	private WebElement button;
	
	
	
	
	public boolean validation(){
		boolean val01=false;
		boolean val02=false;
		if("Las Vegas McCarran Intl Airport (LAS)".equals(airportFrom.get(0).getText())){
			val01= true;
		}
		if("Los Angeles Airport, El Segundo (LAX)".equals(airportFrom.get(1).getText())){
			val02= true;
		}
		if(val01 && val02){
			return true;
		}
		return false;
	}
	public void click(){
		button.click();
	}
	
	
}
