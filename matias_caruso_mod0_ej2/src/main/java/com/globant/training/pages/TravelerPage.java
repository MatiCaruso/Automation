package com.globant.training.pages;


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
	@FindBy(xpath="//div[@class='genderDateOfBirthInput']")
	private WebElement gender;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobMonth")
	private WebElement month;
	@FindBy(name="models['travelersInput'].travelers[0].tsaInfoInput.dateOfBirth.dobDay")
	private WebElement day;
	@FindBy(xpath="//option[@value='1975']")
	private WebElement year;
	@FindBy(name="models['bookingInput'].email.emailAddress")
	private WebElement mail;
	@FindBy(xpath="//div[@class='insDecline']")
	private WebElement button;
	@FindBy(name="_eventId_submit")
	private WebElement confirm;
	@FindBy(className="actionIcon")
	private WebElement buttonSignIn;
	@FindBy(name="models['userName'].userName")
	private WebElement mailSignIn;
	@FindBy(name="models['loginPasswordInput'].password")
	private WebElement passSignIn;
	@FindBy(name="_eventId_authenticate")
	private WebElement button02;
	
	public void signIn(String mail,String pass){
		this.buttonSignIn.click();
		this.mailSignIn.sendKeys(mail);
		this.passSignIn.sendKeys(pass);
		this.button02.click();
		this.button.click();
		this.confirm.click();
	}
	
	
	
	public boolean completeData(String firstName, String lastName, String tel, String mail){
		this.fName.sendKeys(firstName);
		this.lName.sendKeys(lastName);
		this.tel.sendKeys(tel);
		this.gender.findElement(By.tagName("div")).click();
		this.gender.findElement(By.xpath("//option[@value='M']")).click();
//		this.month.click();
		this.month.findElement(By.xpath("//option[@value='21']")).click();
//		this.day.click();
		this.day.findElement(By.xpath("//option[@value='6']")).click();
		this.year.click();
		this.mail.sendKeys(mail);
		this.button.findElement(By.tagName("div")).click();
		this.confirm.click();
		return true;
		
	}


}
