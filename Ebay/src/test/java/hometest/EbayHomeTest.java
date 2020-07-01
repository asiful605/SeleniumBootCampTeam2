package hometest;

import common.WebAPI;
import Homepage.EbayHomePage;
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
    public void ebayCatagoriesList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userCatagories();
    }

    @Test
    public void ebayAddToCart() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userAddBookToCart();
    }

    @Test
    public void userLocates() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userLocateItem();
    }

    @Test
    public void userClickEbayInfo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.EbayInfo();
    }
//    @Test
//    public void UserAddPhoneToCart() throws InterruptedException {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
//        ebayHomePage.EbayCartIcon();

    //    }
    @Test
    public void userClickFashion() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.clickFashion();
    }

    @Test
    public void userSearchBarTest() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.EbayMultiSearch();
    }

    @Test
    public void userCatagoryList() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.ebayShoppingCatagory();
    }

    @Test
    public void UserSearchProduct() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.SearchItem();
    }

    @Test
    public void UserEbayDiverse() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.ebayDiversityPage();
    }

    @Test
    public void UserFindTv() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.identify();
    }

    @Test
    public void ebayDeals() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
        ebayHomePage.userDailyDeals();
    }

//    @Test(priority = 5, enabled = true)
//    public void testElectronicOption() {
//        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
//        }.getClass().getEnclosingMethod().getName()));
//        EbayHomePage ebayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
////        getInitElements();
//        ebayHomePage.electronics();
//        ebayHomePage.validationSearch5();
//    }
//    @DataProvider
//    public static Object[][] getData() throws IOException, IOException {
//        DataReader reader= new DataReader();
//        Object[][] Data = reader.fileReader3("itemslists");
//        return Data;
//    }
//    @Test(dataProvider="getData",enabled = true)
//    public void TestItems(String Items){
//        getInitElements();
//        mainhomepage.searchItemsFromXlsx(Items);
//    }


    }







