package Next_PageLocator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Next_Utility.next_Base;

public class next_HomePageLocator extends next_Base{
	
   public next_HomePageLocator() {
	   PageFactory.initElements(driver, this);
   }
   @FindBy(xpath = "//h2[text()='SUBSCRIBE TO NEWSLETTER']")
   public WebElement SubsInfo;
   
   @FindBy(id = "form-field-email")
   public WebElement Emailfield;
   
   @FindBy(xpath = "//span[text()='Send']")
   public WebElement SendButton;
   
   @FindBy(id = "form-field-email")
   public WebElement withEmail;
   
   @FindBy(xpath = "//span[text()='Send']")
   public WebElement Send;
   
   @FindBy(xpath = "//div[@class='elementor-message elementor-message-success']")
   public WebElement SuccessMSG;
   
   @FindBy(xpath = "//span[text()='Send']")
   public WebElement Send2;
   
   @FindBy(xpath = "//h2[text()='Want Something Extra?']")
   public WebElement Send3;
   
                          //Home LINK
   @FindBy(linkText = "Home")
   public WebElement link1;
   
  @FindBy(linkText = "Home")
   public WebElement textcolor;
   
   @FindBy(linkText = "Home")
   public WebElement pageappear;
   
   @FindBy(linkText = "About Us")
   public WebElement verifyhomepage;
   
                             //About Us LINK
   @FindBy(linkText = "About Us")
   public WebElement link2;
   
   @FindBy(linkText = "About Us")
   public WebElement linktext2;
   
   @FindBy(linkText = "About Us")
   public WebElement aboutpage;
   
                            //contact LINK
   @FindBy(linkText = "Contact")
   public WebElement link3;
   
   @FindBy(linkText = "Contact")
   public WebElement linktext3;
   
   @FindBy(linkText = "Contact")
   public WebElement contactpage;
   
                           //event LINK
   @FindBy(linkText = "Event")
   public WebElement link4;
   
   @FindBy(linkText = "Event")
   public WebElement linktext4;
   
   @FindBy(linkText = "Event")
   public WebElement eventpage;
   
   
                       //blog LINK
   @FindBy(linkText = "Blog")
   public WebElement link5;
   
   @FindBy(linkText = "Blog")
   public WebElement linktext5;
   
   @FindBy(linkText = "Blog")
   public WebElement Blogpage;
   
   
   
   
   
   
   
   
   
   
   
}
