package com.globant.training.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.pagefactory.ByAll;

public class SignInPage {
	

	
	@FindBy(id="main")
	private WebElement main;
	@FindBy(className="control textInput textInput-large textInput-full passwordField")
	private WebElement pass;
	
	
	public void signIn(String mail,String pass){
		
		List<WebElement> form = main.findElements(ByAll.tagName("input"));
		System.out.println(form.size());
		int index =0;
		while(index <= form.size()){
			WebElement element = form.get(index);
			if("email".equals(element.getAttribute("type"))){
				element.sendKeys(mail);
//				System.out.println("completa mail");
			}
			if("password".equals(element.getAttribute("type"))){
				element.sendKeys(pass);
//				System.out.println("completa pass");
			}
			if("submit".equals(element.getAttribute("type")) && "Sign in".equals(element.getAttribute("value"))){
//				System.out.println("clikea boton");
				element.click();
				break;
			}
			index++;
		}
	
	}
	
	public boolean errorSignIn(){
		List<WebElement> form = main.findElements(ByAll.tagName("span"));
		System.out.println(form.size());
		int index =0;
		while(index <= form.size()){
			WebElement element = form.get(index);
			System.out.println(index);
			if("Error:".equals(element.getText())){
				System.out.println("Error");
				return true;
			}
			index++;
		}
		return false;

	}
	
	
}
