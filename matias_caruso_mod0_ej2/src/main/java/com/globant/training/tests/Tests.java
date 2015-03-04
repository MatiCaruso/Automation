package com.globant.training.tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.globant.training.pages.CustomizePage;
import com.globant.training.pages.FlyPage;
import com.globant.training.pages.HomePage;
import com.globant.training.pages.LogoutPage;
import com.globant.training.pages.ResultPage;
import com.globant.training.pages.SignInPage;
import com.globant.training.pages.TravelerPage;

public class Tests {
	WebDriver driver;
	HomePage homePage;
	
	public void pausa(int s) {
		 try {
		 	Thread.sleep(s*1000);
		 } catch (InterruptedException e) {
		 	
		 	e.printStackTrace();
		 }
		}
	public void wait(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void before() {
		driver = new FirefoxDriver();
		wait(driver);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.go(driver);
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}
	
//	@Test
//	public void signIn() {
//		homePage.signIn();
//		pausa(5);
//		wait(driver);
//		SignInPage signPage = PageFactory.initElements(driver, SignInPage.class);
//		wait(driver);
//		signPage.signIn("m.villarruel.test@gmail.com", "Automation");
//		
//		Assert.assertEquals(homePage.welcome(driver), true);
//		
//	}
//	
//	@Test
//	public void errorSignIn(){
//		homePage.signIn();
//		pausa(5);
//		wait(driver);
//		SignInPage signPage = PageFactory.initElements(driver, SignInPage.class);
//		signPage.signIn("banana@gmail.com", "Automation");
//		Assert.assertEquals(signPage.errorSignIn(),true);
//	}
//	
//	@Test
//	public void logout(){
//		homePage.signIn();
//		pausa(4);
//		wait(driver);
//		SignInPage signPage = PageFactory.initElements(driver, SignInPage.class);
//		wait(driver);
//		signPage.signIn("m.villarruel.test@gmail.com", "Automation");
//		wait(driver);
//		homePage.signout();
//		pausa(4);
//		LogoutPage logout= PageFactory.initElements(driver, LogoutPage.class);
//		Assert.assertEquals(logout.logout(),true);
//	}
	@Test
	public void search(){
		homePage.searchAir();
		wait(driver);
		homePage.setFromAndTo("LAS","LAX");
		wait(driver);
		homePage.dates();
		ResultPage resultPage = PageFactory.initElements(driver, ResultPage.class);
		pausa(4);
		wait(driver);
		Assert.assertEquals(resultPage.validation(),true);
		resultPage.searchList();
		pausa(3);
		wait(driver);
		Assert.assertEquals(resultPage.getFly(),true);
		pausa(3);
		wait(driver);
		FlyPage flyPage = PageFactory.initElements(driver, FlyPage.class);
		Assert.assertEquals(flyPage.validation(),true);
		flyPage.click();
		pausa(3);
		wait(driver);
		CustomizePage customizePage = PageFactory.initElements(driver, CustomizePage.class);
		customizePage.click();
		pausa(3);
		wait(driver);
		TravelerPage travelerPage =PageFactory.initElements(driver, TravelerPage.class);
		travelerPage.completeData("Banana", "Puyrredon", "123545353");
		
	}
}
