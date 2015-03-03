package com.globant.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage {

	@FindBy(xpath="//div[@data-context='airFilters']")
	private WebElement validateRefine;
	@FindBy(xpath="//div[@data-context='airLowestPrice']")
	private WebElement validateLowest;
	@FindBy(xpath="//div[@class='bidirectionalSort']")
	private WebElement sortBy;
	@FindBy(xpath="//span[@class='departLocation']")
	private WebElement depart;
	@FindBy(xpath="//div[@class='matchingResults']")
	private WebElement machingResults;
	@FindBy(xpath="//div[@class='actionExpand titleBar hideFromNonJS trigger']")
	private WebElement list;
	@FindBy(xpath="//a[@data-wt-ti='airSort-Departure time-ascending']")
	private WebElement selectList;
	@FindBy(xpath="//div[@class='airResultsCard optimizedCard']")
	private List<WebElement> resultList;
	
	public boolean validacion01(){
		if("Refine Results".equals(validateRefine.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validacion02(){
		
		if("CHEAPEST PRICE".equals(validateLowest.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validacion03(){
		if("Sort by:".equals(sortBy.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validacion04(){
		if("Las Vegas, NV".equals(depart.getText())){
			return true;
		}
		return false;
	}
	public boolean validacion05(){
		
		if((machingResults.findElement(By.tagName("h2")).isDisplayed())){
			return true;
		}
		return false;
	}
	public boolean validation(){
		if(validacion01()&&validacion02()&&validacion03()&&validacion04()&&validacion05()){
			return true;			
		}else{
			return false;
		}
	}
	public void searchList(){
		list.click();
		selectList.click();
	}
	public void getFly() {
		System.out.println(resultList.get(0).getText());
		
	}
	
	
	
}
