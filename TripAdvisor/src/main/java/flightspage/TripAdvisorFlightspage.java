package flightspage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

import static flightspage.TripAdvisorWebelements.*;

public class TripAdvisorFlightspage  extends WebAPI {
    @FindBy(how = How.CSS, using = clickonPost)
    WebElement postElement;

    @FindBy(how = How.XPATH, using = clickonAlerts)
    WebElement alertsElement;

    @FindBy(how = How.XPATH, using = clickonTrips)
    WebElement tripsElement;

    @FindBy(how = How.XPATH, using = clickonHotels)
    WebElement hotelsElement;

    @FindBy(how = How.XPATH, using = clickthingsToDo)
    WebElement ThingsToDoElement;

    @FindBy(how = How.XPATH, using = clickrestaurants)
    WebElement restaurantsElement;

    @FindBy(how = How.XPATH, using = clickWriteAReview)
    WebElement WriteAReviewElement;

    @FindBy(how = How.XPATH, using = clickTravelForums)
    WebElement TravelForumsElement;

    @FindBy(how = How.XPATH, using = clickInsurance)
    WebElement InsuranceElement;

    @FindBy(how = How.XPATH, using = clickMore)
    WebElement MoreElement;

    @FindBy(how = How.XPATH, using = seeSignInWebElement)
    public WebElement hoverOnSignInTab;

    @FindBy(how = How.XPATH, using = dropButton)
    public WebElement dropButtonelement;

    @FindBy(how = How.XPATH, using = clickbuyAGiftCard)
    public WebElement buyAGiftCardelement;

    @FindBy(how = How.XPATH, using = clickbookAVirtualExperience)
    public WebElement bookAVirtualExperienceelement;

    @FindBy(how = How.XPATH, using = clicktopRestaurants)
    public WebElement topRestaurantselement;

    @FindBy(how = How.XPATH, using = nationalParks)
    public WebElement nationalParkselement;

    @FindBy(how = How.XPATH, using = washingtonDC)
    public WebElement washingtonDCelement;

    @FindBy(how = How.XPATH, using = nantucketMA)
    public WebElement nantucketMAelement;

    @FindBy(how = How.XPATH, using = atlanticcityNJ)
    public WebElement atlanticcityNJelement;

    @FindBy(how = How.XPATH, using = arlingtonVA)
    public WebElement arlingtonVAelement;

    @FindBy(how = How.XPATH, using = kentCT)
    public WebElement kentCTelement;

    @FindBy(how = How.XPATH, using = deweybeachDE)
    public WebElement deweybeachDEelement;

    @FindBy(how = How.XPATH, using = rehobothbeachDE)
    public WebElement rehobothbeachDEelement;

    @FindBy(how = How.XPATH, using = edgartownMA)
    public WebElement edgartownMAelement;

    @FindBy(how = How.XPATH, using = hyannisMA)
    public WebElement hyannisMAelement;

    @FindBy(how = How.XPATH, using = newyorkcityNY)
    public WebElement newyorkcityNYelement;

    @FindBy(how = How.XPATH, using = singapore)
    public WebElement singaporeelement;

    @FindBy(how = How.XPATH, using = romeItaly)
    public WebElement romeItalyelement;

    @FindBy(how = How.XPATH, using = parisFrance)
    public WebElement parisFranceelement;

    @FindBy(how = How.XPATH, using = barcelonaSpain)
    public WebElement barcelonaSpainelement;

    @FindBy(how = How.XPATH, using = tokyoJapan)
    public WebElement tokyoJapanelement;

    @FindBy(how = How.XPATH, using = londonUK)
    public WebElement londonUKelement;

    @FindBy(how = How.XPATH, using = careers)
    public WebElement careerselement;

    @FindBy(how = How.XPATH, using = seethewinners)
    public WebElement seethewinnerselement;

    @FindBy(how = How.XPATH, using = investorRelations)
    public WebElement investorRelationselement;

    @FindBy(how = How.XPATH, using = join)
    public WebElement joinelement;

    @FindBy(how = How.XPATH, using = insurance)
    public WebElement insuranceelement;

    @FindBy(how = How.XPATH, using = blog)
    public WebElement blogelement;

    @FindBy(how = How.XPATH, using = owners)
    public WebElement ownerselement;

    @FindBy(how = How.XPATH, using = advertiseWithUs)
    public WebElement advertiseWithUselement;

    @FindBy(how = How.XPATH, using = iphoneApp)
    public WebElement iphoneAppelement;

    @FindBy(how = How.XPATH, using = androidApp)
    public WebElement androidAppelement;










    public void userPostelement() {
        driver.get(url);
        windowMaximize();
        postElement.click();
       implicitWait();
    }
    public void userAlertselement() throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        alertsElement.click();
        Thread.sleep(3000);
    }
    public void userTripselement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        tripsElement.click();
        Thread.sleep(3000);
    }
    public void userHotelselement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        hotelsElement.click();
        Thread.sleep(3000);
    }
    public void userThingsToDoelement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        ThingsToDoElement.click();
        Thread.sleep(3000);
    }
    public void userRestaurantselement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        restaurantsElement.click();
        Thread.sleep(3000);
    }
    public void userWriteAReviewelement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        WriteAReviewElement.click();
        Thread.sleep(3000);
    }
    public void userTravelForumselement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        TravelForumsElement.click();
        Thread.sleep(3000);
    }
    public void userInsuranceelement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        InsuranceElement.click();
        Thread.sleep(3000);
    }
    public void userMoreelement()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        MoreElement.click();
        Thread.sleep(3000);
    }
    public void UserHoverOnSignOnTab() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSignInTab).perform();
        Thread.sleep(2000);
    }
    public void UserClickOnDropButton() throws InterruptedException {
        Select select = new Select(dropButtonelement);
        select.selectByVisibleText("Brasil");
        Thread.sleep(2000);
    }
    public void UserClickbuyAGiftCard()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        buyAGiftCardelement.click();
        Thread.sleep(3000);
    }
    public void bookAVirtualExperience()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        bookAVirtualExperienceelement.click();
        Thread.sleep(3000);
    }
    public void topRestaurants()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        topRestaurantselement.click();
        Thread.sleep(3000);
    }
    public void nationalParks()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        nationalParkselement.click();
        Thread.sleep(3000);
    }
    public void washingtonDC()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        washingtonDCelement.click();
        Thread.sleep(3000);
    }
    public void nantucketMA()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        nantucketMAelement.click();
        Thread.sleep(3000);
    }
    public void atlanticcityNJ()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        atlanticcityNJelement.click();
        Thread.sleep(3000);
    }
    public void arlingtonVA()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        arlingtonVAelement.click();
        Thread.sleep(3000);
    }
    public void kentCT()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        kentCTelement.click();
        Thread.sleep(3000);
    }
    public void deweybeachDE()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        deweybeachDEelement.click();
        Thread.sleep(3000);
    }
    public void rehobothbeachDE()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        rehobothbeachDEelement.click();
        Thread.sleep(3000);
    }
    public void edgartownMA()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        edgartownMAelement.click();
        Thread.sleep(3000);
    }
    public void hyannisMA()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        hyannisMAelement.click();
        Thread.sleep(3000);
    }
    public void newyorkcityNY()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        newyorkcityNYelement.click();
        Thread.sleep(3000);
    }
    public void singapore()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        singaporeelement.click();
        Thread.sleep(3000);
    }
    public void romeItaly()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        romeItalyelement.click();
        Thread.sleep(3000);
    }
    public void parisFrance()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        parisFranceelement.click();
        Thread.sleep(3000);
    }
    public void barcelonaSpain()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        barcelonaSpainelement.click();
        Thread.sleep(3000);
    }
    public void tokyoJapan()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        tokyoJapanelement.click();
        Thread.sleep(3000);
    }
    public void londonUK()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        londonUKelement.click();
        Thread.sleep(3000);
    }
    public void careers()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        careerselement.click();
        Thread.sleep(3000);
    }
    public void seethewinners()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        seethewinnerselement.click();
        Thread.sleep(3000);
    }
    public void investorRelations()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        investorRelationselement.click();
        Thread.sleep(3000);
    }
    public void join()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        joinelement.click();
        Thread.sleep(3000);
    }
    public void insurance()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        insuranceelement.click();
        Thread.sleep(3000);
    }
    public void blog()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        blogelement.click();
        Thread.sleep(3000);
    }
    public void owners()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        ownerselement.click();
        Thread.sleep(3000);
    }
    public void advertiseWithUs()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        advertiseWithUselement.click();
        Thread.sleep(3000);
    }
    public void iphoneApp()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        iphoneAppelement.click();
        Thread.sleep(3000);
    }
    public void androidApp()  throws InterruptedException {
        driver.get(url);
        driver.manage().window().maximize();
        androidAppelement.click();
        Thread.sleep(3000);
    }


























//    //Case 2 Elements
//    @FindBy(xpath = clickMoreButton)
//    public WebElement webclickMoreButton;
//
//    @FindBy (xpath = clickFlightsButton)
//    public WebElement webclickFlightsButton;
//
//    //-----------------------------------------------------------------------
//    //Case 3 Elements
//    @FindBy (xpath = clickEllipsMenuButton)
//    public WebElement webclickEllipsMenuButton;
//
//    //-----------------------------------------------------------------------
//    //Case 4 Elements
//    @FindBy (xpath = clickFrombox)
//    public WebElement webclickFrombox;
//
//    @FindBy (xpath = clickToWhereBox)
//    public WebElement webclickToWhereBox;
//
//    //-----------------------------------------------------------------------
//    //Case 5 Elements
//    @FindBy (xpath = clickCalendarbox)
//    public WebElement webclickCalendarbox;
//
//    @FindBy (xpath = clickRightswipe)
//    public WebElement webclickRightswipe;
//
//    @FindBy (xpath = click18July)
//    public WebElement webclick18July;
//
//    @FindBy (xpath = click15August)
//    public WebElement webclick15August;
//
//    @FindBy (xpath = clickClassBox)
//    public WebElement webclickClassBox;
//
//    @FindBy (xpath = clickEconomyButton)
//    public WebElement webclickEconomyButton;
//
//    @FindBy (xpath = clickFirstClass)
//    public WebElement webclickFirstClass;
//
//    @FindBy (xpath = clickCloseButton)
//    public WebElement webclickCloseButton;
//
//    //-----------------------------------------------------------------------
//    //case 7 elements
//    @FindBy (xpath = clickPreferNonstopButton)
//    public WebElement webclickPreferNonstopButton;
//
//    @FindBy (xpath = clickNearbyAirportsButton)
//    public WebElement webclickNearbyAirportsButton;
//
//    //-----------------------------------------------------------------------
//    //case 8 elements
//    @FindBy (xpath = clickEmailBar)
//    public WebElement webclickEmailBar;
//
//    //-----------------------------------------------------------------------
//    //case 9 elements
//    @FindBy (xpath = clickCurrencyBox)
//    public WebElement webclickCurrencyBox;
//
//    //-----------------------------------------------------------------------
//    //case 10 elements
//    @FindBy (xpath = clickCountryBox)
//    public WebElement webclickCountryBox;
//
//    //-----------------------------------------------------------------------
//    //case 11 elements
//    @FindBy (xpath = clickGreenSearch)
//    public WebElement webclickGreenSearch;
//
//    //-----------------------------------------------------------------------
//    //case 12 elements
//    @FindBy (xpath = clickSortByBox)
//    public WebElement webclickSortByBox;
//
//    @FindBy (xpath = clickBestValue)
//    public WebElement webclickBestValue;
//
//    //-----------------------------------------------------------------------
//    //case 13 elements
//    @FindBy (xpath = clickViewDealsButton)
//    public WebElement webclickViewDealsButton;
//
//    @FindBy (xpath = clickDownArrow)
//    public WebElement webclickDownArrow;
//
//    @FindBy (xpath = clickAirlineView)
//    public WebElement webclickAirlineView;
//
//    @FindBy (xpath = clickXtoClose)
//    public WebElement webclickXtoClose;
//
//    //-----------------------------------------------------------------------
//    //case 14 elements
//    @FindBy (xpath = clickAlaskaAirlines )
//    public WebElement webclickAlaskaAirlines ;
//
//    @FindBy (xpath = clickAmericanAirlines)
//    public WebElement webclickAmericanAirlines;
//
//    //-----------------------------------------------------------------------
//    //case 15 elements
//    @FindBy (xpath = clickWifi)
//    public WebElement webclickWifi;
//
//    @FindBy (xpath = clickPowerAvailable)
//    public WebElement webclickPowerAvailable;
//
//    //-----------------------------------------------------------------------
//    //case 16 elements
//    @FindBy (xpath = clickOneWay)
//    public WebElement webclickOneWay;
//
//    @FindBy (xpath = clickTravelers)
//    public WebElement webcclickTravelers;
//
//    @FindBy (xpath = clickFirstClassButton)
//    public WebElement webclickFirstClassButton;
//
//    @FindBy (xpath = clickCloseButton2)
//    public WebElement webclickCloseButton2;
//
//    @FindBy (xpath = clickSearch)
//    public WebElement webclickSearch;
//
//    //-----------------------------------------------------------------------
//    //case 17 elements
//    @FindBy (xpath = clickMultiCity)
//    public WebElement webclickMultiCity;
//
//    @FindBy (xpath = clickSecondFromBox)
//    public WebElement webclickSecondFromBox;
//
//    @FindBy (xpath = clickSecondToTox)
//    public WebElement webclickSecondToTox;
//
//    @FindBy (xpath = clickDepart)
//    public WebElement webclickDepart;
//
//    @FindBy (xpath = click30August)
//    public WebElement webclick30August;
//
//    @FindBy (xpath = clickSearchButton)
//    public WebElement webclickSearchButton;
//
//    //-----------------------------------------------------------------------
//    //case 18 elements
//
//
//    //-----------------------------------------------------------------------
//    //case 19 elements
//
//
//    //-----------------------------------------------------------------------
//    //case 20 elements
//
//
//    //-----------------------------------------------------------------------
//
////    DataReader dataReader = new DataReader();
//
//    /**
//     * >>>Test Case 1 - Go to Home Page<<<
//     * Open Chrome Browser
//     * Type Url >>https://www.tripadvisor.com/<<
//     * Wait until home page is landing
//     * Get Home Page Title
//     */
////    public void goToHomePage() {
////
////    }
////    public void validateHomePage() throws IOException {
////        String actualTitle = getCurrentPageTitle();
////        System.out.println("Page Title:"+actualTitle);
////
////        String [] expectedHomePageTitleArray = dataReader.fileReaderStringXSSF(System.getProperty("user.dir")+
////                "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx","Homepage Title");
////        String expectedHomePageTitle = expectedHomePageTitleArray [0];
////        System.out.println("Expected Page Title: "+expectedHomePageTitle);
////
////        Assert.assertEquals(actualTitle,expectedHomePageTitle,"Homepage Title Does not match");
////    }
//
//    /**
//     * >>>Test Case 2 - Go to Flights page <<<
//     * Click >>More<< button on header
//     * Expand it
//     * Validate 9 Category are there
//     * Click Flights button
//     * Wait until home page is landing
//     * Get Title
//     */
//    public int getMoreCategories() {
//        webclickMoreButton.click();
//        List<WebElement> moreCategories = webclickMoreButton.findElements(By.xpath(clickMoreButton));
//        int moreCtegoryList = moreCategories.size();
//        return moreCtegoryList;
//    }
//
////    public void validateCategoryList() throws IOException {
////        int [] expectedMenuArrayCount = dataReader.fileReaderIntegerHSSF(System.getProperty("user.dir")+
////                        "//src/main/resources/TripAdvisor_FlightsPage_ExpectedElements.xlsx",
////                "MoreCategory List");
////        int expectedCategoryList = expectedMenuArrayCount[0];
////
////
////        Assert.assertEquals(getMoreCategories(),expectedCategoryList,"List size does not match");
////    }
//
////    public void goToFlightsPage() {
////        webclickFlightsButton.click();
////        String actualTitle = getCurrentPageTitle();
////        System.out.println("Page Title:"+actualTitle);
////    }
//
//    /**
//     * >>>Test Case 3 - Drop Down Menu<<<
//     * Click ellipsis button
//     * Validate 5 Category are visible
//     */
////    public int getEllipsMenu() {
////        mouseHover(webclickEllipsMenuButton);
////        List<WebElement> ellipsMenuList = webclickEllipsMenuButton.findElements(By.xpath(clickEllipsMenuButton));
////        int ellipsMenuSize = ellipsMenuList.size();
////        return ellipsMenuSize;
////
////    }
//    public void validateEllipsMenu() {
//        Assert.assertEquals(getEllipsMenu(),5,"List Size does not match");
//    }
//
//    /**
//     * >>>Test Case 4 - Round Trip<<<
//     * Click From box
//     * Type New York City (NYC)
//     * Click To Where Box
//     * Type Los Angeles (LAX)
//     */
//    public void roundTripBox() {
//        webclickFrombox.sendKeys("New York City (NYC)");
//        webclickToWhereBox.sendKeys("Los Angeles (LAX)");
//
//    }
//    /**
//     * >>>Test Case 5 - Calendar Box<<<
//     * Click Calendar box
//     * Click right swipe
//     * Click 18 July
//     * Click 15 August
//     */
//    public void goToCalendarBox() {
//        webclickCalendarbox.click();
//        webclickRightswipe.click();
//        webclick18July.click();
//        webclick15August.click();
//    }
//    /**
//     * >>>Test Case 6 - Check class type<<<
//     * Click Class box
//     * Expand it
//     * Click Economy button
//     * Validate 4 type of class
//     * Click First Class
//     * Click Close
//     */
//    public int getClasType() {
//        webclickClassBox.click();
//        webclickEconomyButton.click();
//        List <WebElement> classTypeList = webclickEconomyButton.findElements(By.xpath(clickEconomyButton));
//        int classTypeListSize = classTypeList.size();
//        webclickFirstClass.click();
//        webclickCloseButton.click();
//        return classTypeListSize;
//    }
//    public void validateClassTypelist() {
//        Assert.assertEquals(getClasType(),4,"List Size does not match");
//    }
//
//    /**
//     * >>>Test Case 7 - Extra options<<<
//     * Click >>Prefer nonstop<< button
//     * Click >>Include nearby airports<< button
//     */
//    public void chooseExtraFlightOptions() {
//        webclickPreferNonstopButton.click();
//        webclickNearbyAirportsButton.click();
//    }
//
//    /**
//     * >>>Test Case 8 - Price Alert<<<
//     * Click Email Bar
//     * Type >>pnttest@gmail.com<<
//     */
//    public void priceAlert() {
//        webclickEmailBar.sendKeys("pnttest@gmail.com");
//    }
//
//    /**
//     * >>>Test Case 9 - Currency box<<<
//     * Click Currency box
//     * Validate 8 currency type are displayed
//     */
//    public int getCurrencyBox() {
//        webclickCurrencyBox.click();
//        List<WebElement> currencyBoxList = webclickCurrencyBox.findElements(By.xpath(clickCurrencyBox));
//        int currencyBoxListSize = currencyBoxList.size();
//        return currencyBoxListSize;
//    }
//    public void validateCurrencyBox() {
//        Assert.assertEquals(getCurrencyBox(),9,"List Size does not match");
//    }
//
//    /**
//     * >>>Test Case 10 - Country box<<<
//     * Click Country box
//     * Validate how many country names are there
//     */
//    public void getCountryBox() {
//        webclickCountryBox.click();
//        List<WebElement> countryBox = webclickCountryBox.findElements(By.xpath(clickCountryBox));
//        System.out.println(countryBox);
//    }
//
//    /**
//     * >>>Test Case 11 - Do flight search<<<
//     * Click green search bar on the right side of the header
//     */
//    public void doFlightSearch() {
//        webclickGreenSearch.click();
//    }
//
//    /**
//     * >>>Test Case 12 - Check Sort By Box<<<
//     * Click Sort By Box
//     * Validate 11 Elements are visible
//     * Click Best Value
//     */
//
//    public int getCheckSortByBox() {
//        webclickSortByBox.click();
//        List<WebElement> sortByBoxList = webclickSortByBox.findElements(By.xpath(clickSortByBox));
//        int sortByBoxSize = sortByBoxList.size();
//        return sortByBoxSize;
//    }
//    public void validateCheckSortBybox() {
//        Assert.assertEquals(getCheckSortByBox(),11,"List Size Does not match");
//        webclickBestValue.click();
//    }
//
//    /**
//     * >>>Test Case 13 - Check Deals Box<<<
//     * Click View Deals button
//     * Scroll down
//     * Click Down Arrow expand more info
//     * Click Airline view arrow
//     * Click X to close window
//     */
//    public void validateCheckDealsBox() {
//        webclickViewDealsButton.click();
//        webclickDownArrow.click();
//        webclickAirlineView.click();
//        webclickXtoClose.click();
//    }
//
//    /**
//     * >>>Test Case 14 - Airlines Options<<<
//     * Click Alaska Airlines
//     * Click American Airlines
//     */
//    public void validateAirlineOptions() {
//        webclickAlaskaAirlines.click();
//        webclickAmericanAirlines.click();
//    }
//
//    /**
//     * >>>Test Case 15 - Click Amenities<<<
//     * Click Wifi
//     * Click Power available
//     */
//    public void validateAmenitiesBox() {
//        webclickWifi.click();
//        webclickPowerAvailable.click();
//    }
//
//    /**
//     * >>>Test Case 16 - Choose one way option<<<
//     * Click one-way
//     * Click Travelers
//     * Click First Class
//     * Click close button to close tab
//     * Click Search
//     */
//    public void validateOneWayOption() {
//        webclickOneWay.click();
//        webcclickTravelers.click();
//        webclickFirstClassButton.click();
//        webclickCloseButton2.click();
//        webclickSearch.click();
//    }
//
//    /**
//     * >>>Test Case 17 - Choose Multi City<<<
//     * Click Multi City
//     * Click SecondFrom box
//     * Type >>Los Angeles (LAX)<<
//     * Click Second >>To<< box
//     * Type San Francisco (SFO)
//     * Click Depart
//     * Click 30 August
//     * Click Search
//     */


    }

