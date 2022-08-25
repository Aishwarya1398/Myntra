package MyntraTestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericlib.Base;
import com.genericlib.Utility;
import com.objectRepository.homePage;
import com.objectRepository.plpPage;

public class Myntra3Test extends Base{
	homePage hp;
	plpPage pp;
	//Utility util;
	
	@Test
	public void Myntra3TC() throws InterruptedException {
		hp=PageFactory.initElements(driver, homePage.class);
		pp=PageFactory.initElements(driver, plpPage.class);
		
		//util=PageFactory.initElements(driver, Utility.class);
		
		hp.getSearchTF().sendKeys("Women watches");
		Thread.sleep(3000);
		hp.getSrchProd().click();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		pp.getProdWatch().click();
		Thread.sleep(3000);
		pp.getWishBtn();
		Thread.sleep(9000);
		Reporter.log("TestCase 3 is success", true);
		
	}
	
}
