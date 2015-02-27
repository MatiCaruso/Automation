package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PostPage {
	
	@FindBy(xpath="//time[@class='entry-date']")
	private WebElement date;
		
	public void go(WebDriver driver){
		driver.get("http://10.28.148.127/wordpress/it-is-used-for/");
	}
	
	public String getDate(){
		return this.date.getText();
	}
}
