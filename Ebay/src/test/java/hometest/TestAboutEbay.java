package hometest;

import common.WebAPI;
import homepage2.AboutEbayPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestAboutEbay extends WebAPI {
    AboutEbayPage aboutEbayPage;


    @Test
    public void companyInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
        aboutEbayPage.EbayCompany();
    }
    @Test
    public void ebayNewsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
        aboutEbayPage.ebayNews();
    }
    @Test
    public void userInvestorPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
        aboutEbayPage.ebayInvestor();
    }
    @Test
    public  void GlobalPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
        aboutEbayPage.ebayGlobal();
    }
   // @Test
    public void GovRelations(){
    TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
    }.getClass().getEnclosingMethod().getName()));
    AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
    aboutEbayPage.ebayGovRelations();
}
    @Test
    public  void Policy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        AboutEbayPage aboutEbayPage = PageFactory.initElements(driver, AboutEbayPage.class);
        aboutEbayPage.ebayPolicyPage();

    }
}
