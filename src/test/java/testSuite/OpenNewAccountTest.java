package testSuite;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.OpenNewAccountPage;
import util.GeneralUtil;

public class OpenNewAccountTest extends BaseTest {

    OpenNewAccountPage openNewAccountPage;
    public  OpenNewAccountTest(){
        super();
    }

    @BeforeMethod
    public void setup(){
        initialization();
        openNewAccountPage =new LoginPage().login(getUsername(),getPassword()).newAccountPageLink();
    }

    @Test
    public void accountCreateSucceed(){
        openNewAccountPage=openNewAccountPage.selectAccountType(0).selectAmount(0).clickOpenNewAccountButton();
        Assert.assertTrue(openNewAccountPage.hasAccountId());

    }


    @AfterMethod
    public void tearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }

}
