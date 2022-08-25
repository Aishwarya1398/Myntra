package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class cartPage {

	//elements
	
	@FindBy(xpath="(//div[.='PLACE ORDER'])[2]")
	private WebElement placeOrderbtn;

	//getters
	
	public WebElement getPlaceOrderbtn() {
		return placeOrderbtn;
	}
}
