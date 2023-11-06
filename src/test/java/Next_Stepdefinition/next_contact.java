package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_PageAction.next_contactPageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Then;

public class next_contact extends next_Base{
	
	next_HomePageAction nextHomePageAction = new next_HomePageAction();
	next_contactPageAction nextcontactPageAction = new next_contactPageAction();
	
     @Then("^Verify contact Link is display in home page header$")
      public void verify_contact_Link_is_display_in_home_page_header() throws Throwable {
	        nextHomePageAction.VerifycontactLinkisdisplayinhomepageheader();
}

     @Then("^Verify contact Link text display in WHITE color$")
      public void verify_contact_Link_text_display_in_WHITE_color() throws Throwable {
	       nextHomePageAction.VerifycontactLinktextdisplayinWHITEcolor();
}

      @Then("^Click on contact link$")
      public void click_on_contact_link() throws Throwable {
	      nextHomePageAction.Clickoncontactlink();
}

    @Then("^Verify contact page is appear$")
     public void verify_contact_page_is_appear() throws Throwable {
	      nextcontactPageAction.Verifycontactpageisappear();
}



}
