package com.globant.training.tests;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.globant.training.pages.HomePage;
import com.globant.training.pages.SignInPage;

public class Tests {
	WebDriver driver;
	HomePage homePage;
	
	
	@BeforeMethod
	public void before() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		homePage = PageFactory.initElements(driver, HomePage.class);
		homePage.go(driver);
	}
	
	@AfterMethod
	public void after(){
		driver.quit();
	}
	
//	@Test
//	public void signIn() {
//		homePage.signIn();
//		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
//		SignInPage signPage = PageFactory.initElements(driver, SignInPage.class);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		signPage.signIn("m.villarruel.test@gmail.com", "Automation");
//		
//		Assert.assertEquals(homePage.welcome(driver), true);
//		
//	}
	
	@Test
	public void errorSignIn(){
		homePage.signIn();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		SignInPage signPage = PageFactory.initElements(driver, SignInPage.class);
		
		signPage.signIn("banana@gmail.com", "Automation");
		Assert.assertEquals(signPage.errorSignIn(),true);
		
		
	}
	
}
