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
	@FindBy(xpath="//li[@data-context='home100Tab']")
	private WebElement home;
	@FindBy(xpath="//div[@class='matchingResults']")
	private WebElement machingResults;
	@FindBy(xpath="//div[@data-context='selectedSortLink-AIR_PRICE-ascending']")
	private WebElement list;
	@FindBy(xpath="//a[@data-wt-ti='airSort-Departure time-ascending']")
	private WebElement selectList;
	@FindBy(xpath="//div[@data-context='airResults']")
	private WebElement resultList;
	@FindBy(xpath="//a[@class='buttonLink link']")
	private List<WebElement> buttons;
	
	
	
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
		
		if("Home".equals(home.getText())){
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
	public boolean getFly() {
		boolean val01=false;
		boolean val02=false;
		boolean val03=false;
		boolean val04=false;
		boolean val05=false;
		List<WebElement> flyList= resultList.findElements(By.tagName("div")).get(1).findElements(By.className("primary"));
		WebElement fly = flyList.get(0);
//		int index=0;
//		while(index <= fly.findElements(By.tagName("span")).size()){
//			System.out.println("index "+index+" "+fly.findElements(By.tagName("span")).get(index).getText());
//			index++;
//		}
		if("Flight details".equals(fly.findElements(By.tagName("span")).get(0).getText())){
			val01=true;
		}
		if("Leave".equals(fly.findElements(By.tagName("span")).get(5).getText())){
			val02=true;
		}
		if("Las Vegas".equals(fly.findElements(By.tagName("span")).get(7).getText())){
			val03=true;
		}
		if("Los Angeles".equals(fly.findElements(By.tagName("span")).get(10).getText())){
			val04=true;
		}
		if("Return".equals(fly.findElements(By.tagName("span")).get(18).getText())){
			val05=true;
		}
		
		if(val01&&val02&&val03&&val04&&val05){
			//resultList.findElements(By.tagName("div")).get(1).findElements(By.className("secondary")).get(0).findElement(By.className("buttonLink link")).click();
//			int index=0;
//			while(index <= fly.findElements(By.tagName("span")).size()){
//				System.out.println("index "+index+" "+buttons.get(index).getText());
//				index++;
//			}
			buttons.get(1).click();
			return true;
		}
		return false;
	}
	
	
	
}
