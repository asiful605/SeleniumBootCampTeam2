package testBoA;

import BoAHomePage.WealthManagementPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WealthManagementNavigation extends WebAPI {

    static WealthManagementPage wmp ;
    public static void getInitElements() {
        wmp   = PageFactory.initElements(driver, WealthManagementPage.class);
    }
    @BeforeMethod
    public void navigate() {
        driver.get("https://www.ml.com/wealthmanagement.html");
    }

    @Test //(enabled = false)
    public void privateBankPageTitleAssert() throws InterruptedException {
        getInitElements();
        Assert.assertEquals(wmp.privateBankPageTitle(), wmp.privateBankActualPageTitle());
    }
    @Test //(enabled = false)
    public void privateBankPageTitleFetch() throws InterruptedException {
        getInitElements();
        wmp.privateBankPageTitle();
    }
    @Test //(enabled = false)
    public void merrillPageTitleFetch() throws InterruptedException {
        getInitElements();
        wmp.merrillPageTitle();
    }

    @Test
    public void testUserenterKeyword() {
        getInitElements();
        wmp.enterKeyword();
    }
    //     Input Box
    @Test
    public void testUserenterPassword() throws InterruptedException {
        getInitElements();
        wmp.enterPassword();
    }
    // Checking Box
    @Test
    public void testUsercheckOnsaveOnlineIdBox() {
        getInitElements();
        wmp.checkOnsaveOnlineIdBox();
    }


    @Test //(enabled = false)
    public void merrillLearnMoreClickable() throws InterruptedException {
        getInitElements();
        wmp.merrillLearnMoreClick();
    }
    @Test //(enabled = false)
    public void privateBankClickable() throws InterruptedException {
        getInitElements();
        wmp.privateBankClick();
    }
    @Test// (enabled = false)
    public void merrilLearnMore2Clickable() throws InterruptedException {
        getInitElements();
        wmp.merrilLearnMore2Click();
    }
    @Test //(enabled = false)
    public void privateBank2Clickable() throws InterruptedException {
        getInitElements();
        wmp.privateBank2Click();
    }





}

