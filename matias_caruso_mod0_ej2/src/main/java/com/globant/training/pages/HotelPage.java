package com.globant.training.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelPage {
	@FindBy(className="flightOriginDestText")
	private WebElement validateFrom;
	@FindBy(className="headerContent")
	private WebElement validateHeader;
	@FindBy(className="bidirectionalSort")
	private WebElement validateSort;
	@FindBy(className="location")
	private WebElement validateLocation;
	@FindBy(className="mapLink")
	private WebElement validationMap;
	@FindBy(className="rating")
	private WebElement hotelStars;
	@FindBy(className="pkgHotelOverview")
	private List<WebElement> stars;
	@FindBy(xpath="//span[@class='actionIcon']")
	private WebElement button;
	@FindBy(className="content")
	private WebElement list;
	@FindBy(xpath="//div[@data-component='linkAsButton']")
	private WebElement confirmHotel;
	
	public boolean validation01(){
		
		if("From".equals(validateFrom.getText())){
			return true;
		}
		return false;
	}
	public boolean validation02(){
		if("Build your package:".equals(validateHeader.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation03(){
		if("Sort by:".equals(validateSort.findElement(By.tagName("h2")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation04(){
		if("Areas".equals(validateLocation.findElement(By.tagName("h3")).getText())){
			return true;
		}
		return false;
	}
	public boolean validation05(){
		if("View on map".equals(validationMap.getText())){
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
	
	public void getStars(){
		hotelStars.findElements(By.className("link")).get(2).click();
		button.click();
		list.findElements(By.className("link")).get(3).click();
	}
	public boolean validaStars(){
		int index = 0;
		int max = stars.size();
		boolean val=false;
		while(index < max){
			if (stars.get(index).findElement(By.xpath("//img[@data-context='stars-5']")).isDisplayed()
				|| stars.get(index).findElement(By.xpath("//img[@data-context='stars-4']")).isDisplayed())
			{
				val =true;
			}else{		
				return false;
			}
			index++;
		}
		return val;
	}
	public void selectHotel(){
		confirmHotel.findElements(By.xpath("//a[@data-context='selectButton']")).get(0).click();
		
	}

}
