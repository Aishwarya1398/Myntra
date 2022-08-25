package MyntraTestCases;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.genericlib.Base;
import com.genericlib.Utility;
import com.objectRepository.cartPage;
import com.objectRepository.homePage;
import com.objectRepository.plpPage;

public class Myntra1Test extends Base {

	homePage hp;
	plpPage pp;
	cartPage cp;
	
	
	Utility util=new Utility();
	
	@Test
	public void ScenarioTestCases() throws InterruptedException {
		hp=PageFactory.initElements(driver, homePage.class);
		pp=PageFactory.initElements(driver, plpPage.class);
		cp=PageFactory.initElements(driver, cartPage.class);
		
		util.mouseAction(driver, hp.getWomenbtn());
		Thread.sleep(3000);
		hp.getSareebtn().click();
		Thread.sleep(3000);
		pp.getProd1().click();
		Reporter.log("Prod success", true);
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		String parent=driver.getWindowHandle();

		Set<String> s=driver.getWindowHandles();

		// Now iterate using Iterator
				Iterator<String> I1= s.iterator();

				while(I1.hasNext())
				{

				String child_window=I1.next();


				if(!parent.equals(child_window))
				{
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());
				}
				}
				driver.navigate().refresh();
				Thread.sleep(3000);
				pp.getAddCartbtn().click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				hp.getBagIcon().click();
				Thread.sleep(3000);
				//driver.navigate().refresh();
				JavascriptExecutor jse= (JavascriptExecutor)driver;
				//scroll down
				jse.executeScript("window.scrollBy(0, 250);");
				Thread.sleep(3000);
				
				//double click
				Actions act=new Actions(driver);
				WebElement ele = cp.getPlaceOrderbtn();
				act.doubleClick(ele).perform();
				
				Thread.sleep(3000);
				Reporter.log("placeorder button success", true);
				Thread.sleep(3000);
				Reporter.log("TestCase 1 is success", true);
	}

}

