package hometest;

import common.WebAPI;
import homepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EbayHomeTest extends WebAPI {

    static EbayHomePage ebayHomePage;

    public static void getInitElements() {
      ebayHomePage = PageFactory.initElements(driver,EbayHomePage.class);
    }

    @Test(priority=1,enabled = true)
    public void testReadHeader(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
       getInitElements();
       ebayHomePage.readHeader();
    }
    @Test(priority=2,enabled =true)
    public void testReturnFeedback(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.returnFeedback();
    }
    @Test(priority=3,enabled =true)
    public void testItemListFromAllCategories() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.itemListForAllCategories();
    }
    @Test(priority=4,enabled = true)
    public void testSearchProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.searchProduct();
    }
     @Test(priority = 5,enabled=true)
     public void testSetStartSelling(){
         TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
         }.getClass().getEnclosingMethod().getName()));
         getInitElements();
         ebayHomePage.setStartSelling();
     }
    @Test(priority = 5,enabled=true)
    public void testElectronicOption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.electronicsOptions();
        ebayHomePage.validationSearch5();
    }
    @Test(priority=7,enabled =true)
    public void testValidateDailyDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.validateDailyDeals();
    }
    @Test(priority=8,enabled = true)
    public void testValidateSell(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.validateSell();
    }
    @Test(priority=9,enabled = true)
    public void testGetHeaderValue1(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.getHeadersValue1();
    }
    @Test(priority=10,enabled =true)
    public void testExploreMyEbay(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.exploreMyEbay();
    }
    @Test(priority=11,enabled =true)
    public void testGlobalImpactPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.globalImpactPage();
        ebayHomePage.validationSearch6();
    }
    @Test(priority=12,enabled =true)
    public void testFeedbackPoliciesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.feedbackPoliciesPage();
        ebayHomePage.validationSearch7();
    }
    @Test(priority=13,enabled =true)
    public void testRegisterForDevelopersPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.registerForDevelopersPage();
        ebayHomePage.validationSearch8();
    }

    @Test(priority=14,enabled =true)
    public void testEbayCommunityPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.ebayCommunityPage();
        ebayHomePage.validationSearch9();
    }
    @Test(priority=15,enabled =true)
    public void testConcertTicketsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        ebayHomePage.concertTickets();
        ebayHomePage.validationSearch11();
    }

}
