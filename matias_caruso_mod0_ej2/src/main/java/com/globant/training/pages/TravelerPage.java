package com.globant.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TravelerPage {

	@FindBy(name="models['travelersInput'].travelers[0].name.firstName")
	private WebElement fName;
	@FindBy(name="models['travelersInput'].travelers[0].name.lastName")
	private WebElement lName;
	@FindBy(xpath="//input[@type='tel']")
	private WebElement tel;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.gender.gender")
	private WebElement gender;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobMonth")
	private WebElement month;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobDay")
	private WebElement day;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobYear")
	private WebElement year;
	
	public void completeData(String firstName, String lastName, String tel){
		this.fName.sendKeys(firstName);
		this.lName.sendKeys(lastName);
		this.tel.sendKeys(tel);
		this.gender.click();
		this.gender.findElement(By.xpath("option[@value='1']")).click();
		this.month.click();
		this.month.findElement(By.xpath("option[@value='2']")).click();
		this.day.click();
		this.day.findElement(By.xpath("option[@value='6']")).click();
		this.year.click();
		this.year.findElement(By.xpath("option[@value='1975']")).click();
	}


}
