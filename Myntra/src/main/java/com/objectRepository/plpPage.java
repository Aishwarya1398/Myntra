package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class plpPage {

	//elements
	
	@FindBy(xpath = "//input[@type='radio' and @value='women,men women']")
	private WebElement womenRadiobtn;
	
	@FindBy(xpath = "//label[@class='sort-label ']//*[@value='popularity']")
	private WebElement popularityDropdown;

	@FindBy(xpath = "//img[@alt='Mitera Purple Woven Design Kanjeevaram Silk Saree' and @title='Mitera Purple Woven Design Kanjeevaram Silk Saree']")
	private WebElement prod1;

	@FindBy(xpath = "//*[.='ADD TO BAG']")
	private WebElement addCartbtn;
	
	@FindBy(xpath = "//img[@class='img-responsive' and @title='Fastrack Unisex Grey Analogue Watch 38024PP24']")
	private WebElement prodWatch;
	
	@FindBy(xpath = "//span[.='WISHLIST']")
	private WebElement wishBtn;
	
	//getters
	
	public WebElement getWishBtn() {
		return wishBtn;
	}

	public WebElement getProdWatch() {
		return prodWatch;
	}

	public WebElement getWomenRadiobtn() {
		return womenRadiobtn;
	}

	public WebElement getPopularityDropdown() {
		return popularityDropdown;
	}

	public WebElement getProd1() {
		return prod1;
	}

	public WebElement getAddCartbtn() {
		return addCartbtn;
	}
}
