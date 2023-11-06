package Next_PageAction;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import Next_PageLocator.next_HomePageLocator;
import Next_Utility.next_Base;
import Next_Utility.next_utiliti;

public class next_HomePageAction extends next_Base{
	
	next_HomePageLocator nextHomePageLocator = new next_HomePageLocator();

	public void ScrolldownpageuntilSUBSCRIBEtoNEWSLETTER() {
		((JavascriptExecutor)driver).executeScript("scroll(0,61000)");
		
	}
	public void VerifySUBSCRIBEtoNEWSLETTERisavailableinhomepagefooter() throws Exception {
		boolean InfoVisiable = nextHomePageLocator.SubsInfo.isDisplayed();
		Assert.assertTrue(InfoVisiable);
		next_utiliti.takeMyScreenshot(driver, "Newsletter");
	}
	public void VerifyEmailfieldisaddedundertheSUBSCRIBEtoNEWSLETTER() throws Exception {
		boolean VerifyEmailfield = nextHomePageLocator.Emailfield.isDisplayed();
		Assert.assertTrue(VerifyEmailfield);
		next_utiliti.takeMyScreenshot(driver, "Emailfield");
	}
	public void  VerifySendButtonisaddedundertheSUBSCRIBEtoNEWSLETTER() throws Exception {
		boolean sendButtonVerify = nextHomePageLocator.SendButton.isDisplayed();
		Assert.assertTrue(sendButtonVerify);
		next_utiliti.takeMyScreenshot(driver,"sendbutton");
	}
	public void Typevalidemailandclicksendbutton(String w) {
		 nextHomePageLocator.withEmail.sendKeys(w);
		 nextHomePageLocator.Send.click();
	}
	public void Verifysuccessmessageisappearwhensentwithemail() throws Exception {
		 boolean verifySuccess = nextHomePageLocator.SuccessMSG.isDisplayed();
		 Assert.assertTrue(verifySuccess);
		 Thread.sleep(2000);
		 next_utiliti.takeMyScreenshot(driver, "success message");
	}
	public void Leaveblankemailfieldandclicksendbutton() {
		nextHomePageLocator.Send2.click();
	}
	public void  Verifyerrormessageisappearwhensentwithoutemail() throws Exception {
		
		boolean errorMSG = nextHomePageLocator.Send3.isDisplayed();
		Assert.assertTrue(errorMSG);
		Thread.sleep(2000);
		 next_utiliti.takeMyScreenshot(driver, "error ,message");
	}
	
	                          //Home LINK
	public void VerifyHomeLinkisdisplayinginhomepageheader() {
		boolean verifyhomelink = nextHomePageLocator.link1.isDisplayed();
		Assert.assertTrue(verifyhomelink);
		next_utiliti.takeMyScreenshot(driver, "Home link");
	}
	
	public void VerifyHomeLinktextdisplayinginWHITEcolor() {
		boolean verifycolor = nextHomePageLocator.textcolor.isDisplayed();
		Assert.assertTrue(verifycolor);
		next_utiliti.takeMyScreenshot(driver, "Home link text color");
	}
	public void ClickonHomelink() {
		nextHomePageLocator.pageappear.click();
	}
	public void VerifyHomepageisappear() {
		boolean verifypage = nextHomePageLocator.verifyhomepage.isDisplayed();
		Assert.assertTrue(verifypage);
		next_utiliti.takeMyScreenshot(driver, "Home page");
	}
	
	              //About Us LINK
	public void  VerifyAboutUsLinkisinhomepageheader() {
		boolean verifyaboutlink = nextHomePageLocator.link2.isDisplayed();
		Assert.assertTrue(verifyaboutlink);
		next_utiliti.takeMyScreenshot(driver, "about us Link");
	}
	public void VerifyaboutuslinktextcolorisWHITE() {
		boolean verifylinktext = nextHomePageLocator.linktext2.isDisplayed();
		Assert.assertTrue(verifylinktext);
		next_utiliti.takeMyScreenshot(driver, "About us text color");
	}
	public void Clickonaboutuslink() {
		nextHomePageLocator.aboutpage.click();
	}
	
	
	                   //Contact LINK
	public void VerifycontactLinkisdisplayinhomepageheader() {
		boolean verifycontactlink = nextHomePageLocator.link3.isDisplayed();
		Assert.assertTrue(verifycontactlink);
	}
	public void VerifycontactLinktextdisplayinWHITEcolor() {
		boolean verifylinktext3 = nextHomePageLocator.linktext3.isDisplayed();
		Assert.assertTrue(verifylinktext3);
	}
	public void  Clickoncontactlink() {
		nextHomePageLocator.contactpage.click();
	}
	
	
	                 //Event LINK
	public void VerifyeventLinkisdisplayinhomepageheader() {
		boolean verifyeventLink = nextHomePageLocator.link4.isDisplayed();
		Assert.assertTrue(verifyeventLink);
	}
	public void VerifyeventLinktextcolorisWHITE() {
		boolean verifylinktext4 = nextHomePageLocator.linktext4.isDisplayed();
		Assert.assertTrue(verifylinktext4);
	}
	public void Clickoneventlink() {
		nextHomePageLocator.eventpage.click();
	}
	
	
	                    //Blog LINK
	public void  VerifyBlogLinkisdisplayinhomepageheader() {
		boolean verifyblogLink = nextHomePageLocator.link5.isDisplayed();
		Assert.assertTrue(verifyblogLink);
	}
	public void  VerifyBlogLinktextcolorisWHITE() {
		boolean verifylinktext5 = nextHomePageLocator.linktext5.isDisplayed();
		Assert.assertTrue(verifylinktext5);
	}
	public void ClickonBloglink() {
		nextHomePageLocator.Blogpage.click();
	}



	
	
	
	
}
