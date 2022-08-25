package com.genericlib;

import java.io.File;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;


public class Utility extends Base{

static Select select ;
	
	
	public static void takeScreenShot(WebDriver driver, ITestResult result) {
		String methodname= result.getMethod().getMethodName();
		System.out.println(methodname);
		
		Date d = new Date();
		String[] d1=d.toString().split(" ");
		String date=d1[2];
		String month=d1[1];
		String year=d1[5];
		String time=d1[3];
		String t=time.replace(":", "-");
		
		TakesScreenshot image = (TakesScreenshot)Base.staticdriver;
		File src= image.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\User\\Documents\\Automation1\\Myntra\\ScreenShot\\"+methodname+"_"+date+"_"+month+"_"+year+"_"+t+".PNG");
		System.out.println("Screenshot taken");
		try {
			FileUtils.copyFile(src, dest);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	//Actions class
	public void mouseAction(WebDriver driver, WebElement ele)
	{
		Actions act= new Actions(driver);
		act.moveToElement(ele).perform();
		
	}
	
	//  This method is used to perform dropdown
	//Select class initialization
	
	public static void initialiseSelect(WebElement element) 
	{
		select =new Select(element);
	}
	
	public static void dropDownHandlebyVisibleText(String visibletext) {
		select.selectByVisibleText(visibletext);

	}
	
	public static void dropDownHandlebyValue(String visiblevalue) {
		select.selectByValue(visiblevalue);
	}
	
	public static void dropDownHandlebyVisibleIndex(int index)
	{
		select.selectByIndex(index);

	}
	
	
	}


