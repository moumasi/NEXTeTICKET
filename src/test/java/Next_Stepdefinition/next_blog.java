package Next_Stepdefinition;

import Next_PageAction.next_HomePageAction;
import Next_PageAction.next_blogPageAction;
import Next_Utility.next_Base;
import cucumber.api.java.en.Then;

public class next_blog extends next_Base{
	
	 next_HomePageAction nextHomePageAction = new next_HomePageAction();
	 next_blogPageAction nextblogPageAction = new next_blogPageAction();
	 
	 @Then("^Verify Blog Link is display in home page header$")
	 public void verify_Blog_Link_is_display_in_home_page_header() throws Throwable {
		 nextHomePageAction.VerifyBlogLinkisdisplayinhomepageheader();
	 }

	 @Then("^Verify Blog Link text color is WHITE$")
	 public void verify_Blog_Link_text_color_is_WHITE() throws Throwable {
		 nextHomePageAction.VerifyBlogLinktextcolorisWHITE();
	 }

	 @Then("^Click on Blog link$")
	 public void click_on_Blog_link() throws Throwable {
		 nextHomePageAction.ClickonBloglink();
	 }

	 @Then("^Verify blog page is appear$")
	 public void verify_blog_page_is_appear() throws Throwable {
		 nextblogPageAction.Verifyblogpageisappear();
	 }



}
