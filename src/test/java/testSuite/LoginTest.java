package testSuite;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import util.GeneralUtil;

public class LoginTest extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginPage=new LoginPage();
    }

    @Test
    public void loginShouldSucceed(){

        homePage = loginPage.login(getUsername(),getPassword());
        Assert.assertTrue(homePage.islogoutLink());

    }

    @AfterMethod
    public void tearDown(){
        GeneralUtil.waitForDomStable();
        driver.quit();
    }
}
