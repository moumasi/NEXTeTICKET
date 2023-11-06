package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class next_SubNews extends next_Base{
	
	next_HomePageAction nextHomePageAction = new next_HomePageAction();
	
	@Given("^Open <\"([^\"]*)\"> NWEXTeTICKET$")
	public void open_NWEXTeTICKET(String url) throws Throwable {
		nextLaunchurl(url);
	}

	@Then("^Scrolldown page until SUBSCRIBE to NEWSLETTER$")
	public void scrolldown_page_until_SUBSCRIBE_to_NEWSLETTER() throws Throwable {
		nextHomePageAction.ScrolldownpageuntilSUBSCRIBEtoNEWSLETTER();
	 
	}

	@Then("^Verify SUBSCRIBE to NEWSLETTER is available in home page footer$")
	public void verify_SUBSCRIBE_to_NEWSLETTER_is_available_in_home_page_footer() throws Throwable {
		nextHomePageAction.VerifySUBSCRIBEtoNEWSLETTERisavailableinhomepagefooter();
	}

	@Then("^Verify Email field is added under the SUBSCRIBE to NEWSLETTER$")
	public void verify_Email_field_is_added_under_the_SUBSCRIBE_to_NEWSLETTER() throws Throwable {
		nextHomePageAction.VerifyEmailfieldisaddedundertheSUBSCRIBEtoNEWSLETTER();
	}

	@Then("^Verify Send Button is added under the SUBSCRIBE to NEWSLETTER$")
	public void verify_Send_Button_is_added_under_the_SUBSCRIBE_to_NEWSLETTER() throws Throwable {
		nextHomePageAction.VerifySendButtonisaddedundertheSUBSCRIBEtoNEWSLETTER();
	}

	@Then("^Type valid email and click send button$")
	public void type_valid_email_and_click_send_button() throws Throwable {
		nextHomePageAction.Typevalidemailandclicksendbutton(nextPro.getProperty("nextEmail"));
		
	}

	@Then("^Verify success message is appear when sent with email$")
	public void verify_success_message_is_appear_when_sent_with_email() throws Throwable {
		nextHomePageAction.Verifysuccessmessageisappearwhensentwithemail();
	}

	@Then("^Leave blank email field and click send button$")
	public void leave_blank_email_field_and_click_send_button() throws Throwable {
		nextHomePageAction.Leaveblankemailfieldandclicksendbutton();
	}

	@Then("^Verify error message is appear when sent without email$")
	public void verify_error_message_is_appear_when_sent_without_email() throws Throwable {
		nextHomePageAction.Verifyerrormessageisappearwhensentwithoutemail();
	}



}
