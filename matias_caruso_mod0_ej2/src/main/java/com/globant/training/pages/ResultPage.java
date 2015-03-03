package com.globant.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {

	@FindBy(xpath="//div[@data-context='airFilters']")
	private WebElement validateRefine;
	@FindBy(xpath="//div[@data-context='airLowestPrice']")
	private WebElement validateLowest;
	
	public boolean validacion01(){
		if("Refine Results".equals(validateRefine.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validacion02(){
		
		if("CHEAPEST PRICE".equals(validateLowest.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
}
