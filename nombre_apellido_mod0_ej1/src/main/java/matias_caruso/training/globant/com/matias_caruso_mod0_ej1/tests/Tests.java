package matias_caruso.training.globant.com.matias_caruso_mod0_ej1.tests;

import java.util.List;

import matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages.ContactPage;
import matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages.HomePage;
import matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages.OctoberPage;
import matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages.PostPage;
import matias_caruso.training.globant.com.matias_caruso_mod0_ej1.pages.SearchPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests {
	WebDriver driver;
	HomePage homePage;
	int asdad =1;
	@BeforeMethod
	public void before() {
		driver = new FirefoxDriver();
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.go(driver);
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}
	@Test
	public void testTitle() {
		String title = homePage.getTitle(driver);
		Assert.assertEquals(title,
				"Automation Training | Aprender a automatizar en un solo sitio");
		Reporter.log("carga de pagina principal");
	}

	@Test
	public void testSearch() {

		homePage.searchString("banana");
		SearchPage searchPage = PageFactory.initElements(driver,
				SearchPage.class);
		String searchBanana = searchPage.searchSomething();
		Assert.assertEquals(searchBanana.toString().contains("Nothing Found"),
				true);
		Reporter.log("busqueda sin resultado");

	}
	
	@Test
	public void date(){
		homePage.goToPost();
		PostPage postPage = PageFactory.initElements(driver, PostPage.class);
		Assert.assertEquals(homePage.getDay(),postPage.getDate());
	}

	@Test
	public void contact() {
		homePage.goToContact();
		ContactPage contactPage = PageFactory.initElements(driver,
				ContactPage.class);
		contactPage.form("Matias", "me@mail.com", "Automation",
				"primera prueba del message");
		Assert.assertEquals(contactPage.confirm(), true);

	}

	@Test
	public void validation() {
		homePage.goToContact();
		ContactPage contactPage = PageFactory.initElements(driver,
				ContactPage.class);
		contactPage.form("", "", "", "");
//		System.out.println(contactPage.validation());
		if (contactPage.validation()) {
			contactPage.form("Matias", "me@mail.com", "Automation",
					"validacion del error paso por aca");
		}
		Assert.assertEquals(contactPage.confirm(), true);

	}

	@Test
	public void calendar() {
		OctoberPage octoberPage = PageFactory.initElements(driver,
				OctoberPage.class);
		octoberPage.go(driver);
		WebElement fechaPost = driver.findElement(ByAll.tagName("a"));
		fechaPost.click();
		List<WebElement> posts = driver.findElements(ByAll.tagName("article"));
		int size = posts.size();
		System.out.println(size);
		Assert.assertEquals(size, 2);

	}
}
