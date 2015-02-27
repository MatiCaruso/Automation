package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OctoberPage {
	
	@FindBy(id="wp-calendar")
	private WebElement calendar;
	
	
	
	public void go(WebDriver driver){
		driver.get("http://10.28.148.127/wordpress/2013/10/");
	}
	
	public void getLinks(){
		System.out.println( this.calendar.getText());
	}
}
