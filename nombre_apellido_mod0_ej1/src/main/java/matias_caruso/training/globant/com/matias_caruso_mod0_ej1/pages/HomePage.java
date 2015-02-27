package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage {

	@FindBy(id="site-title")
	private WebElement title;
	@FindBy(id="s")
	private WebElement search;
	@FindBy(xpath="//time[@class='entry-date']")
	private WebElement date;
	@FindBy(xpath="//a[@href='http://10.28.148.127/wordpress/it-is-used-for/']")
	private WebElement post01;
	@FindBy(xpath="//a[@href='http://10.28.148.127/wordpress/sample-page/']")
	private WebElement contact;
	
	
	public void go(WebDriver driver){
		driver.get("http://10.28.148.127/wordpress/");
	}
	
	public String getTitle(WebDriver driver){
		return driver.getTitle();
	}
	
	public void searchString(String search){
		this.search.sendKeys(search);
		this.search.submit();
	}
	public void goToPost(){
		this.post01.click();
	}
	
	public void goToContact(){
		this.contact.click();
	}
	public String getDay(){
		return this.date.getText();
	}
	
}
