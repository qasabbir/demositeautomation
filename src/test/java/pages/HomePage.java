package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.GeneralUtil;

public class HomePage extends BaseTest {

    @FindBy(css = "a[href$='logout.htm']")
    WebElement logoutLink;

    @FindBy(css = "a[href$='openaccount.htm']")
    WebElement openAccountLink;

   public HomePage(){
       PageFactory.initElements(driver,this);
   }

   public boolean islogoutLink(){
       return logoutLink.isDisplayed();
   }

   public OpenNewAccountPage newAccountPageLink(){

       GeneralUtil.waitForDomStable();
       openAccountLink.isDisplayed();
       openAccountLink.click();
       return new OpenNewAccountPage();
   }


}
