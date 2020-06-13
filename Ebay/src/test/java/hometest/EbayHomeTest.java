package hometest;

import common.WebAPI;
import homepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EbayHomeTest extends WebAPI {

    @Test
    public void ebaySearchItem() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.testingSearchBar();
    }

    @Test
    public void ebayEletronicTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.testingHeaderOnElectronic();
    }

    @Test
    public void ebayIconTest() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.dropDownTest();
    }

   // @Test
    public void ebayAddingItemToCart() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.addToCart();
    }

   // @Test
    public void ebayBuyOption() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.buyItemOption();
    }

    //search for a laptop
    @Test
    public void searchLaptop() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.lookForALaptop();
    }

    //SearchMultipleItems
//    @Test
//    public void SearchMultipleItems() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
//        HomePageEbay homePageEbay = PageFactory.initElements(driver, HomePageEbay.class);
//        homePageEbay.searchItems();
//    }
    @Test
    public void searchOnMotorPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.motorsPage();
    }
    @Test
    public void ebayTvAndAudioTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.tvAndAudioPage();
    }
    @Test
    public void userSiteSportPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.ebayHuntingPage();
    }
  //  @Test
    public void ebayHelpAndContact() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userHelpPage();
    }
    @Test
    public void ebayCatagoriesList(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userCatagories();
    }
    @Test
    public void ebayAddToCart(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userAddBookToCart();

    }
}