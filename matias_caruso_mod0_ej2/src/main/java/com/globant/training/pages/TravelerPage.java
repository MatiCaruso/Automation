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
	@FindBy(xpath="//option[@value='M']")
	private WebElement gender;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobMonth")
	private WebElement month;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobDay")
	private WebElement day;
	@FindBy(xpath="//option[@value='1975']")
	private WebElement year;
	@FindBy(name="models['bookingInput'].email.emailAddress")
	private WebElement mail;
	@FindBy(name="models['addInsurance'].insProductGroupContentRequired[0].selectedProductIndex")
	private WebElement button;
	@FindBy(name="_eventId_submit")
	private WebElement confirm;
	
	public boolean completeData(String firstName, String lastName, String tel, String mail){
		this.fName.sendKeys(firstName);
		this.lName.sendKeys(lastName);
		this.tel.sendKeys(tel);
		this.gender.click();
		this.month.click();
		this.month.findElement(By.xpath("//option[@value='21']")).click();
		this.day.click();
		this.day.findElement(By.xpath("//option[@value='6']")).click();
		this.year.click();
		this.mail.sendKeys(mail);
		this.button.click();
		this.confirm.click();
		return true;
		
	}


}
