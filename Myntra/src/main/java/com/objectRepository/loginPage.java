package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class loginPage  {

	//elements
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement mobileNumTf;
	
	@FindBy(xpath = "//div[.='CONTINUE']")
	private WebElement continuebtn;
	
	@FindBy(xpath = "//button[@id='fbLoginButton' and @class='btn default   block socialLoginButton firstButton']")
	private WebElement logWithMailBtn;
	
	@FindBy(xpath = "//input[@type='text']")
	private WebElement mailTF;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pssswdTf;
	
	@FindBy(xpath = "//button[.='LOGIN']")
	private WebElement loginBtn;
	

	//getters
	
	public WebElement getLogWithMailBtn() {
		return logWithMailBtn;
	}

	public WebElement getMailTF() {
		return mailTF;
	}

	public WebElement getPssswdTf() {
		return pssswdTf;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getMobileNumTf() {
		return mobileNumTf;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}
	
	//actions
//	public void loginCred() throws InterruptedException {
//		
//		mobileNumTf.sendKeys("9567207629");
//		Thread.sleep(7000);
//		
//		//continuebtn.click();
//		
//	}
	
}
