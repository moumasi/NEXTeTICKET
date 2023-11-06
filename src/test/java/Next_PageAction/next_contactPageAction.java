package Next_PageAction;

import org.testng.Assert;

import Next_PageLocator.next_contactPageLocator;
import Next_Utility.next_Base;
import Next_Utility.next_utiliti;

public class next_contactPageAction extends next_Base{
	
	next_contactPageLocator nextcontactPageLocator = new next_contactPageLocator();
	
	public void  Verifycontactpageisappear() {
		 boolean successcontactpage = nextcontactPageLocator.verifycontact.isDisplayed();
		 Assert.assertTrue(successcontactpage);
		 next_utiliti.takeMyScreenshot(driver,"Contact page");
	}
}
