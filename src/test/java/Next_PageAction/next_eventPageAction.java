package Next_PageAction;

import org.testng.Assert;

import Next_PageLocator.next_eventPageLocator;
import Next_Utility.next_Base;
import Next_Utility.next_utiliti;

public class next_eventPageAction extends next_Base{
	
	 next_eventPageLocator  nexteventPageLocator = new  next_eventPageLocator();

	 public void Verifyeventpageisappear() {
		 boolean successeventpage = nexteventPageLocator.verifyevent.isDisplayed();
		 Assert.assertTrue(successeventpage);
		 next_utiliti.takeMyScreenshot(driver,"Event Page");
	 }

	 
}
