package MyntraTestCases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericlib.Base;
import com.genericlib.Utility;
import com.objectRepository.homePage;
import com.objectRepository.loginPage;

public class Myntra2Test extends Base {
	homePage hp;
	loginPage lp;
	Utility util;
	
	@Test
	public void Myntra2TC() throws InterruptedException {
		hp=PageFactory.initElements(driver, homePage.class);
		util=PageFactory.initElements(driver, Utility.class);
		lp=PageFactory.initElements(driver, loginPage.class);
		
		
		util.mouseAction(driver, hp.getProfileIcon());
		Thread.sleep(3000);
		hp.getSignbtn().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		lp.getMobileNumTf().sendKeys("8660189198");
		Thread.sleep(3000);
		lp.getContinuebtn().click();
		Reporter.log("Enter the OTP", true);
		Thread.sleep(30000);
		lp.getContinuebtn().click();
		Thread.sleep(60000);
		Reporter.log("TestCase 2 is success", true);
		
//		WebElement UN=hp.getUsername();
//		String Name=UN.getText();
//		System.out.println("Validating UserName = "+Name);
		
//		lp.getLogWithMailBtn().click();
//		Thread.sleep(3000);
//		lp.getMailTF().sendKeys("aishwaryacs13@gmail.com");
//		Thread.sleep(3000);
//		lp.getPssswdTf().sendKeys("AIshu13@98");
//		Thread.sleep(3000);
//		lp.getLoginBtn().click();
//		Thread.sleep(3000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		util.mouseAction(driver, hp.getProfileBtn2());
//		//util.mouseAction(driver, hp.homep());
//		Thread.sleep(5000);
//		//hp.getLogoutbtn().click();
//		Reporter.log("Successfully Logout", true);
//		Thread.sleep(3000);

		
	}
}
