package com.globant.training.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelConfirmation {
	@FindBy(className="pkgResults-pkgResultsSelectedCard-headerMod ")
	private WebElement head;
	@FindBy(className="productType")
	private WebElement product;
	@FindBy(xpath="//div[@class='pkgResultSetHeader pagination']")
	private WebElement choose;
	@FindBy(xpath="//div[@data-context='airFilters']")
	private WebElement results;
	@FindBy(className="bidirectionalSort")
	private WebElement Sort;
	
	
	public boolean validation01(){
		if("Currently selected hotel and flight package".equals(head.getText())){
			return true;
		}
		return false;
	}
	public boolean validation02(){
		if("Hotel + Flight".equals(product.getText())){
			return true;
		}
		return false;
	}
	public boolean validation03(){
		if("Choose a flight for your package".equals(choose.findElement(By.tagName("h3")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation04(){
		if("Refine Results".equals(results.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation05(){
		if("Sort by:".equals(Sort.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation(){
		if(validation01()&&validation02()&&validation03()&&validation04()&&validation05()){
			return true;			
		}else{
			return false;
		}
	}
}
