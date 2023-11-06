package Next_PageAction;


import org.testng.Assert;

import Next_PageLocator.next_aboutusPageLocator;
import Next_Utility.next_Base;
import Next_Utility.next_utiliti;

public class next_aboutusPageAction extends next_Base{
	
	next_aboutusPageLocator nextaboutusPageLocator = new next_aboutusPageLocator();
	
	public void  Verifyaboutuspageisappear() {
		boolean successaboutuspage = nextaboutusPageLocator.verifyaboutus.isDisplayed();
		Assert.assertTrue(successaboutuspage);
		 next_utiliti.takeMyScreenshot(driver, "About Us page");
	}
}
