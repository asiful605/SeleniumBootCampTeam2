package homepage;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;



public class BankOfAmericaHomePageTest extends WebAPI {

    static BankOfAmericaHomePage bankOfAmericaHomePage;

    public static void getInitElements() {
        bankOfAmericaHomePage = PageFactory.initElements(driver, BankOfAmericaHomePage.class);
    }
    @Test( priority = 1, enabled = true)
    public void testExploreBusinessesInstitutionOption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.exploreBusinessesInstitutionOption();
        bankOfAmericaHomePage.validationSearch1();
    }
    @Test( priority = 2, enabled=true)
    public void testPerformMouseHoverOnHeader(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.performMouseHoverOnHeader();
    }
    @Test( priority = 3, enabled = true)
    public void testSignIn(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.signIN();
    }
    @Test( priority = 4,enabled=true)
    public void testReadFooter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.readFooter();
    }
    @Test(priority = 5,enabled=true)
    public void testSelectDevicesOption() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.selectDevicesOption();
    }
    @Test(priority = 6, enabled=true)
    public void testGetBrokenUrl()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.getBrokenLink();
    }
    @Test(priority = 7,enabled = true)
    public void testScrollHeight(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.scrollHeight();
    }
    @Test(priority = 8, enabled =true)
    public void testFeedbackWithWindowHandle(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.feedbackWithWindowHandle();
    }
    @Test(priority = 9,enabled = true)
    public void testExploreHomeLoan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.exploreHomeLoan();
    }
    @Test(priority = 10,enabled=true)
    public void testSearchForBankingOption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bankOfAmericaHomePage.searchForBankingOption();
    }
}








