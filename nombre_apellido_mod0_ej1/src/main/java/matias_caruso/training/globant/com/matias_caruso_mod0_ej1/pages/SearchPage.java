package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
	
	@FindBy(id="post-0")
	private WebElement post;
	
	
//	public void go(WebDriver driver){
//		driver.get("http://10.28.148.127/wordpress/?s=Test&submit=Search");
//	}
	
	public String searchSomething(){
		return post.getText();
	}
}
