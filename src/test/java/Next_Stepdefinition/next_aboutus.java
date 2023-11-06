package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_PageAction.next_aboutusPageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Then;

public class next_aboutus extends next_Base{
	
	next_HomePageAction nextHomePageAction = new next_HomePageAction();
	next_aboutusPageAction nextaboutusPageAction = new next_aboutusPageAction();
	
	@Then("^Verify About Us Link is in home page header$")
	public void verify_About_Us_Link_is_in_home_page_header() throws Throwable {
		nextHomePageAction.VerifyAboutUsLinkisinhomepageheader();
	}
	@Then("^Verify aboutus link text color is WHITE$")
	public void verify_aboutus_link_text_color_is_WHITE() throws Throwable {
		nextHomePageAction.VerifyaboutuslinktextcolorisWHITE();
	}
	@Then("^Click on about us link$")
	public void click_on_about_us_link() throws Throwable {
		 nextHomePageAction.Clickonaboutuslink();
	}

	@Then("^Verify aboutus page is appear$")
	public void verify_aboutus_page_is_appear() throws Throwable {
		nextaboutusPageAction.Verifyaboutuspageisappear();
	}






}
