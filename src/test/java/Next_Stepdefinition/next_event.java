package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_PageAction.next_eventPageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Then;

public class next_event extends next_Base{
	
	 next_HomePageAction nextHomePageAction = new next_HomePageAction();
	 next_eventPageAction  nexteventPageAction = new  next_eventPageAction();
	 
	@Then("^Verify event Link is display in home page header$")
	public void verify_event_Link_is_display_in_home_page_header() throws Throwable {
		nextHomePageAction.VerifyeventLinkisdisplayinhomepageheader();
	}

	@Then("^Verify event Link text color is WHITE$")
	public void verify_event_Link_text_color_is_WHITE() throws Throwable {
		nextHomePageAction.VerifyeventLinktextcolorisWHITE();
	}

	@Then("^Click on event link$")
	public void click_on_event_link() throws Throwable {
		nextHomePageAction.Clickoneventlink();
	}

	@Then("^Verify event page is appear$")
	public void verify_event_page_is_appear() throws Throwable {
		nexteventPageAction.Verifyeventpageisappear();
	}



}
