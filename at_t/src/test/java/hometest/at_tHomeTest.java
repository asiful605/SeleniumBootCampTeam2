package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class at_tHomeTest extends WebAPI {

    static at_tHomePage at_tHomePage;

    public static void getInitElements() {
       at_tHomePage = PageFactory.initElements(driver, at_tHomePage.class);
    }

    @Test(priority = 1,enabled = true)
    public void TestReadHeader(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.readHeader();
    }
    @Test(priority = 2,enabled =true)
    public void TestInternet_TvPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.internet_tvDealsPage();
        at_tHomePage.validateDeals();
    }
    @Test(priority = 3,enabled = true)
    public void TestSingInSupport(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.signInForSupport();
    }
    @Test(priority = 4,enabled = true)
    public void TestGetPrepaidPhonePlan(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.getPrepaidPhonePlan();
        at_tHomePage.validatePhonePlan();
    }
    @Test(priority = 5,enabled = true)
    public void TestWirelessDeals(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.wirelessDeals();
        at_tHomePage.validateWirelessDeals();
    }
    @Test(priority = 6,enabled = true)
    public void TestPrintLinksText(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.printLinksText();
    }
    @Test(priority = 7,enabled =true)
    public void TestExploreTvOptions(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.exploreTvOptions();
        at_tHomePage.validateTvOptions();
    }
    @Test(priority = 8,enabled =true)
    public void TestGiveFeedback(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.giveFeedBack();
    }
    @Test(priority = 9,enabled = true)
    public void TestShopAppleWtchesOption(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.shopAppleWatchesOption();
        at_tHomePage.validateAppleWatches();
    }
    @Test(priority = 10,enabled = true)
    public void TestExploreSmartHome(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
       at_tHomePage.explorePrepaidDeals();
       at_tHomePage.validatePrepaidDeals();
    }
    @Test(priority = 11,enabled = true)
    public void TestAccessoriesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.accessoriesInWireless();
        at_tHomePage.validateAccessoriesPage();
    }
    @Test(priority = 12,enabled = true)
    public void TestSportPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.sportPage();
        at_tHomePage.validateSportPage();
    }
    @Test(priority = 13,enabled = true)
    public void TestInternetPlanPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.InternetPlanPage();
        at_tHomePage.validateInternetPlanPage();
    }
    @Test(priority =14,enabled = true)
    public void TestWifiTechnologiesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.wifiTechnologiesPage();
        at_tHomePage.validateWifiTechnologiesPage();
    }
    @Test(priority =15,enabled = true)
    public void TestMoveServicesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        at_tHomePage.moveServicesPage();
        at_tHomePage.validateMoveServicesPage();
    }
    @Test(priority =15,enabled = true)
    public void TestGetTooltipText() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
       getInitElements();
       at_tHomePage.getTooltipText();
    }
}
