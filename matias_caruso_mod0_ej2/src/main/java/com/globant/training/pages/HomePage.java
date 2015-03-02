package com.globant.training.pages;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ByAll;


public class HomePage {

	
	@FindBy(id="headerStandard")
	private WebElement header;
	
//	@FindBy(className="signInLink socialLogin")
//	private WebElement button;
			
	@FindBy(className="welcomeText")
	private WebElement welcome;

	public void go(WebDriver driver) {
		driver.get("http://www.cheaptickets.com/");
	}

	public void signIn() {
		
		List<WebElement> lista = header.findElements(ByAll.className("link"));
		
		int i=0;
		while (i <= lista.size()){
			
			if ("Sign in".equals(lista.get(i).getText())){
				lista.get(i).click();
				System.out.println("click");
				break;
			}
			i++;
		}
		

	}

	public boolean welcome(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		if (welcome.isDisplayed()) {
			return true;
		} else {
			return false;
		}
	}
}
