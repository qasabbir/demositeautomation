package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseTest {

    @FindBy(css = "a[href$='logout.htm']")
    WebElement logoutLink;

   public HomePage(){
       PageFactory.initElements(driver,this);
   }

   public boolean islogoutLink(){
       return logoutLink.isDisplayed();
   }

}
