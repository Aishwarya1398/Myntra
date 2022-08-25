package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.genericlib.Base;

public class homePage extends Base{

	//Elements
		@FindBy(xpath= "//a[@class='desktop-main' and @data-group='women']")
		private WebElement womenbtn;
		
		@FindBy(xpath = "//a[.='Sarees']")
		private WebElement sareebtn;
		
		@FindBy(xpath = "//*[.='Bag']")
		private WebElement BagIcon;
		
		@FindBy(xpath = "//span[.='Profile']")
		private WebElement profileIcon;
		
		@FindBy(xpath = "//a[.='login / Signup']")
		private WebElement signbtn;
		
		@FindBy(xpath = "//div[@class='desktop-accInfoSection' and .=' Logout ']")
		private WebElement logoutbtn;

		@FindBy(xpath = "//span[@class='desktop-userTitle' and .='Profile']")
		private WebElement profileBtn2;
		
		@FindBy(xpath = "//input[@placeholder='Search for products, brands and more' and @class='desktop-searchBar']")
		private WebElement searchTF;
		
		@FindBy(xpath = "//li[.='Women Watches Fastrack']")
		private WebElement srchProd;
		
		@FindBy(xpath = "//div[@class='desktop-infoTitle']")
		private WebElement Username;
		
		
		//getters

		public WebElement getUsername() {
			return Username;
		}

		public WebElement getProfileBtn2() {
			return profileBtn2;
		}

		public WebElement getSearchTF() {
			return searchTF;
		}

		public WebElement getSrchProd() {
			return srchProd;
		}

		public WebElement getLogoutbtn() {
			return logoutbtn;
		}
		
		public WebElement getWomenbtn() {
			return womenbtn;
		}

		public WebElement getSareebtn() {
			return sareebtn;
		}

		public WebElement getBagIcon() {
			return BagIcon;
		}
		
		public WebElement getProfileIcon() {
			return profileIcon;
		}

		public WebElement getSignbtn() {
			return signbtn;
		}
		
		
}
