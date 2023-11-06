package Next_PageAction;

import org.testng.Assert;

import Next_PageLocator.next_blogPageLocator;
import Next_Utility.next_Base;
import Next_Utility.next_utiliti;

public class next_blogPageAction extends next_Base{
	
	next_blogPageLocator nextblogPageLocator = new next_blogPageLocator();
	
	public void Verifyblogpageisappear() {
		boolean successblogpage = nextblogPageLocator.verifyblog.isDisplayed();
		Assert.assertTrue(successblogpage);
		next_utiliti.takeMyScreenshot(driver,"Blog Page");
	}

}
