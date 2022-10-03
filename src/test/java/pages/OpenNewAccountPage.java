package pages;

import base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.GeneralUtil;

public class OpenNewAccountPage extends BaseTest {

   @FindBy(id = "type")
    WebElement typeEl;

   @FindBy(id = "fromAccountId")
   WebElement accountId;

   @FindBy(css = "input.button")
   WebElement btn;

   @FindBy(id = "newAccountId")
   WebElement newAccountIdEl;

    public OpenNewAccountPage(){
        PageFactory.initElements(driver,this);

    }

    public OpenNewAccountPage selectAccountType(int index){
        GeneralUtil.waitForDomStable();
        new Select(typeEl).selectByIndex(index);
        return this;
    }
    public OpenNewAccountPage selectAccountType(String value){
        GeneralUtil.waitForDomStable();
        new Select(typeEl).selectByValue(value);
        return this;
    }

    public OpenNewAccountPage selectAmount(int index){
        GeneralUtil.waitForDomStable();
        new Select(accountId).selectByIndex(index);

        return this;
    }
    public OpenNewAccountPage selectAmount(String value){
        GeneralUtil.waitForDomStable();
        new Select(accountId).selectByValue(value);

        return this;
    }

    public boolean hasAccountId(){
        return newAccountIdEl.isDisplayed();
    }

    public OpenNewAccountPage clickOpenNewAccountButton(){
        GeneralUtil.waitForDomStable();
        btn.isDisplayed();
        btn.click();

        return this;
    }

}
