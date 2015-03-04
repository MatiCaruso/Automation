package com.globant.training.pages;

import java.util.List;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ByAll;

public class HomePage {
		
	@FindBy(id="headerStandard")
	private WebElement header;
	@FindBy(className="welcomeText")
	private WebElement welcome;
	@FindBy(className="signOutLink")
	private WebElement signout;
	@FindBy(className="needsclick")
	private WebElement searchAir;
	@FindBy(xpath="//input[@name='ar.rt.leaveSlice.orig.key']")
	private WebElement from;
	@FindBy(xpath="//input[@name='ar.rt.leaveSlice.dest.key']")
	private WebElement to;
	@FindBy(xpath="//input[@name='ar.rt.leaveSlice.date']")
	private WebElement leaveDate;
	@FindBy(xpath="//input[@name='ar.rt.returnSlice.date']")
	private WebElement returnDate;
	@FindBy(xpath="//span[@data-dateindex='5']")
	private WebElement leave;
	@FindBy(xpath="//span[@data-dateindex='30']")
	private WebElement returnDay;
	@FindBy(xpath="//input[@value='Search Flights' and @name='search']")
	private WebElement button;
	
	public void go(WebDriver driver) {
		driver.get("http://www.cheaptickets.com/");
	}

	public void signIn() {
		
		List<WebElement> lista = header.findElements(ByAll.className("link"));
		
		int i=0;
		while (i < lista.size()){
			
			if ("Sign in".equals(lista.get(i).getText())){
				lista.get(i).click();
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

	public void signout() {
		signout.findElement(By.tagName("a")).click();
	}

	public void searchAir() {
		searchAir.click();
	}

	public void setFromAndTo(String from, String to) {
		this.from.sendKeys(from);
		this.to.sendKeys(to);
	}

	public void dates() {

		leaveDate.click();
		leave.click();
		returnDate.click();
		returnDay.click();
		button.click();
	}

}
