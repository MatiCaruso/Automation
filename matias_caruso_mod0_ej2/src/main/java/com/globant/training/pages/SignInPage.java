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
//	@FindBy(xpath="//main[@type='submit' and @value='Sign in']")
//	private WebElement button;
	
	public void signIn(String mail,String pass){
		
		List<WebElement> form = main.findElements(ByAll.tagName("input"));
		System.out.println(form.size());
		int index =0;
		while(index <= form.size()){
			WebElement element = form.get(index);
			if("email".equals(element.getAttribute("type"))){
				element.sendKeys(mail);
				System.out.println("escribe mail");
			}
			if("password".equals(element.getAttribute("type"))){
				element.sendKeys(pass);
				System.out.println("escribe pass");
//				break;
			}
			if("submit".equals(element.getAttribute("type")) && "Sign in".equals(element.getAttribute("value"))){
				System.out.println("clikea boton");
				element.click();
				break;
			}
			index++;
		}
	
	}
}
