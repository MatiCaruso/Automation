package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ByAll;

public class ContactPage {

	@FindBy(id="cntctfrm_contact_name")
	private WebElement name;
	@FindBy(id="cntctfrm_contact_email")
	private WebElement mail;
	@FindBy(id="cntctfrm_contact_subject")
	private WebElement subject;
	@FindBy(id="cntctfrm_contact_message")
	private WebElement message;
	@FindBy(xpath = "//input[@type='submit' and @value='Submit']")
	private WebElement button;
	@FindBy(id="cntctfrm_thanks")
	private WebElement thanks;
	@FindBy(xpath="//*[@id='cntctfrm_contact_form']/div[1]")
	private WebElement Error;
	
	public void form(String name, String mail, String subject,String message){
		this.name.sendKeys(name);
		this.mail.sendKeys(mail);
		this.subject.sendKeys(subject);
		this.message.sendKeys(message);
		button.submit();
	}
	
	public boolean confirm(){
		return this.thanks.getText().contains("Thank you for contacting us");
	}
	public boolean validation(){
		return this.Error.getText().contains("Please make corrections below and try again");
	}
}
