package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Then;

public class next_HomeLink extends next_Base{
	
	 next_HomePageAction  nextHomePageAction = new  next_HomePageAction(); 
		 
	 @Then("^Verify Home Link is  displaying in home page header$")
	public void verify_Home_Link_is_displaying_in_home_page_header() throws Throwable {
		 nextHomePageAction.VerifyHomeLinkisdisplayinginhomepageheader();
	}
	
	 @Then("^Verify Home Link text  displaying in WHITE color$")
	 public void verify_Home_Link_text_displaying_in_WHITE_color() throws Throwable {
		  nextHomePageAction.VerifyHomeLinktextdisplayinginWHITEcolor();
	 }
	 @Then("^Click on Home link$")
	 public void click_on_Home_link() throws Throwable {
		 nextHomePageAction.ClickonHomelink();
	 }

	 @Then("^Verify  Home page is appear$")
	 public void verify_Home_page_is_appear() throws Throwable {
		 nextHomePageAction.VerifyHomepageisappear();
	 }






}
