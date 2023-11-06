package Next_PageLocator;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Next_Utility.next_Base;

public class next_aboutusPageLocator extends next_Base{
	
   public next_aboutusPageLocator() {
	   PageFactory.initElements(driver, this);
   }

   @FindBy(linkText = "Home")
   public WebElement verifyaboutus;
}
