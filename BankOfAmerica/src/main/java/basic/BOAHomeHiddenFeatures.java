package basic;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import reporting.TestLogger;

import static webElements.WebElementsForBoA.*;

public class BOAHomeHiddenFeatures extends WebAPI {
    @FindBy(how = How.ID, using =checkingElement)
    public static WebElement checkingWebElement;

    @FindBy(how = How.CSS, using =checkingHiddenMenuElement)
    public static WebElement checkingHiddenMenuWebElement;

    @FindBy(how = How.ID, using = savingElement)
    public static WebElement savingWebElement;

    @FindBy(how = How.CSS, using =savingHiddenMenuElement)
    public static WebElement savingHiddenMenuWebElement;

    @FindBy(how = How.ID, using =creditCardsElement)
    public static WebElement creditCardsWebElement;

    @FindBy(how = How.CSS, using =creditCardsHiddenMenuElement)
    public static WebElement creditCardsHiddenMenuWebElement;

    @FindBy(how = How.LINK_TEXT, using =homeLoansElement)
    public static WebElement homeLoansWebElement;

    @FindBy(how = How.CSS, using =homeLoansHiddenMenuElement )
    public static WebElement homeLoansHiddenMenuWebElement;

    @FindBy(how = How.CSS, using =autoLoansElement)
    public static WebElement autoLoansWebElement;

    @FindBy(how = How.CSS, using =autoLoansHiddenMenuElement)
    public static WebElement autoLoansHiddenMenuWebElement;

    @FindBy(how = How.CSS, using =investingElement)
    public static WebElement investingWebElement;

    @FindBy(how = How.CSS, using =investingHiddenMenuElement)
    public static WebElement investingHiddenMenuWebElement;

    @FindBy(how = How.LINK_TEXT, using = betterMoneyHabitsElement)
    public static WebElement betterMoneyHabitsWebElement;

    @FindBy(how = How.CSS, using =betterMoneyHabitsHiddenMenuElement )
    public static WebElement betterMoneyHabitsHiddenMenuWebElement;
    @FindBy(how = How.ID, using = personalElement)
    public static WebElement personalWebElement;

    @FindBy(how = How.CSS, using =  smallBusinessElement)
    public static WebElement smallBusinessWebElement;

    @FindBy(how = How.CSS, using = wealthManagemetElement)
    public static WebElement wealthManagemetWebElement;

    @FindBy(how = How.CSS, using =  businessInstitutionElement)
    public static WebElement businessInstitutionWebElement;

    @FindBy(how = How.ID, using = securityElement )
    public static WebElement securityWebElement;

    @FindBy(how = How.LINK_TEXT, using =  aboutUsElement)
    public static WebElement aboutUsWebElement;

    @FindBy(how = How.CSS, using = enEspanolElement)
    public static WebElement enEspanolWebElement;

    @FindBy(how = How.CSS, using = contactUsElement)
    public static WebElement contactUsWebElement;

    @FindBy(how = How.CSS, using =helpnElement)
    public static WebElement helpnWebElement;

    @FindBy(how = How.XPATH, using = helpSearchBarElement)
    public static WebElement helpSearchBarWebElement;

    @FindBy(how = How.CSS, using = helpSearchButtonElement)
    public static WebElement helpSearchButtonWebElement;

    @FindBy(how = How.XPATH, using =  viewAllSearchElement)
    public static WebElement viewAllSearchWebElement;

    @FindBy(how = How.CSS, using = popUpHelpSuggestionsElement)
    public static WebElement popUpHelpSuggestionsWebElement;

    @FindBy(how = How.CSS, using = feedbackElement)
    public static WebElement feedbackWebElement;

    @FindBy(how = How.LINK_TEXT, using =locationFooterElement)
    public static WebElement locationFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using =contactUsFooterElement)
    public static WebElement contactUsFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using =helpFooterElement)
    public static WebElement helpFooterWebElement;

    @FindBy(how = How.XPATH, using =accessibleBankingFooterElement)
    public static WebElement accessibleBankingFooterWebElement;

    @FindBy(how = How.ID, using =carrearsFooterElement)
    public static WebElement carrearsFooterWebElement;

    @FindBy(how = How.ID, using =privacySecurityFooterElement)
    public static WebElement privacySecurityFooterWebElement;

    @FindBy(how = How.CSS, using =mcafeeFooterElement)
    public static WebElement mcafeeFooterWebElement;

    @FindBy(how = How.ID, using = sitemapFooterElement)
    public static WebElement sitemapFooterWebElement;

    @FindBy(how = How.LINK_TEXT, using =advertisingPracticeFooterElement)
    public static WebElement advertisingPracticeFooterWebElement;

    @FindBy(how = How.XPATH, using = feedbackFooterElement)
    public static WebElement feedbackFooterWebElement;

    @FindBy(how = How.CSS, using =nlineBankingLinkrElement)
    public static WebElement onlineBankingLinkrWebElement;

    @FindBy(how = How.XPATH, using =followFacebookElement)
    public static WebElement followFacebookWebElement;

    @FindBy(how = How.ID, using =followInstagramElement)
    public static WebElement followInstagramWebElement;

    @FindBy(how = How.ID, using =followLinkedinElement)
    public static WebElement followLinkedinWebElement;

    @FindBy(how = How.ID, using = followPinterestElement)
    public static WebElement followPinterestWebElement;

    @FindBy(how = How.XPATH, using =followTwitterElement)
    public static WebElement followTwitterWebElement;

    @FindBy(how = How.ID, using =followYoutubeElement)
    public static WebElement followYoutubeWebElement;

    @FindBy(how = How.CSS, using =equalHousingElement)
    public static WebElement equalHousingWebElement;



    public void smallBusinessPageTitle (String smallBusinessUrl){
        driver.navigate().to(smallBusinessUrl);
        driver.manage().window().maximize();
        String smallBusinessPageTitle = driver.getTitle();
        navigateBack();
        smallBusinessWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, smallBusinessPageTitle);
    }


    public void wealthManagementPageTitle (String wealthManagementUrl){
        driver.navigate().to(wealthManagementUrl);
        driver.manage().window().maximize();
        String wealthManagementPageTitle = driver.getTitle();
        navigateBack();
        wealthManagemetWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, wealthManagementPageTitle);
    }

    public void businessNInstitutionPageTitle (String businessInstitutionUrl){
        driver.navigate().to(businessInstitutionUrl);
        driver.manage().window().maximize();
        String businessInstitutionPageTitle = driver.getTitle();
        navigateBack();
        businessInstitutionWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, businessInstitutionPageTitle);
    }


    public void securityPageTitle (String securityUrl){
        driver.navigate().to(securityUrl);
        driver.manage().window().maximize();
        String securityPageTitle = driver.getTitle();
        navigateBack();
        securityWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, securityPageTitle);
    }

    public void aboutUsPageTitle (String aboutUsUrl){
        driver.navigate().to(aboutUsUrl);
        driver.manage().window().maximize();
        String aboutUsPageTitle = driver.getTitle();
        navigateBack();
        aboutUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, aboutUsPageTitle);
    }

    public void EnEspañolPageTitle (String enEspanolUrl){
        driver.navigate().to(enEspanolUrl);
        driver.manage().window().maximize();
        String EnEspañolPageTitle = driver.getTitle();
        navigateBack();
        enEspanolWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, EnEspañolPageTitle);
    }

    public void contactUsPageTitle (String contactUsUrl){
        driver.navigate().to(contactUsUrl);
        driver.manage().window().maximize();
        String contactUsPageTitle = driver.getTitle();
        navigateBack();
        contactUsWebElement.click();
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, contactUsPageTitle);
    }
    public void helpTabPopUp() throws InterruptedException {
        driver.manage().window().maximize();
        helpnWebElement.click();
        WebDriverWait wait = new WebDriverWait(driver, 6);
        Thread.sleep(6000);
        isPopUpWindowDisplayed(driver,  locatorboa);
    }
    public void locationPageTitle(String locationsUrl) {
        driver.navigate().to(locationsUrl);
        String locationsPageTitle=driver.getTitle();
        navigateBack();
        locationFooterWebElement.click();
        String currentPageTitle=driver.getTitle();
        Assert.assertEquals(currentPageTitle, locationsPageTitle);
    }
    public void contactUsFooterPageTitle(String contactUsUrl) {
        driver.navigate().to(contactUsUrl);
        driver.manage().window().maximize();
        String contactUsFooterPageTitle=driver.getTitle();
        navigateBack();
        contactUsFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), contactUsFooterPageTitle);
    }
    public void helpFooterPageTitle(String helpUrl) {
        driver.navigate().to(helpUrl);
        driver.manage().window().maximize();
        String actualPageTitle=driver.getTitle();
        navigateBack();
        helpFooterWebElement.click();
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }
    public void accessibleBankingFooterPageTitle(String accessibleBankingUrl) throws InterruptedException {
        driver.navigate().to(accessibleBankingUrl);
        driver.manage().window().maximize();
        String actualPageTitle=driver.getTitle();
        navigateBack();
        sleepFor(3);
        accessibleBankingFooterWebElement.click();
        waitUntilVisible(By.xpath(accessibleBankingFooterElement));
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }
    public void followFbClick (){
        followFacebookWebElement.click();
    }
    public void followInstagramClick (){
        followInstagramWebElement.click();
    }
    public void followLinkedInClick(){
        followLinkedinWebElement.click();
    }
    public void followPinterestClick (){
        followPinterestWebElement.click();
    }
    public void followTwitterClick (){
        followTwitterWebElement.click();
    }
    public void followYouTubeClick (){
        followYoutubeWebElement.click();
    }

    public void feedBackFooterClick (){
        driver.manage().window().maximize();
        feedbackFooterWebElement.click();
    }
    public void searchBarPopUp() throws InterruptedException {
        driver.manage().window().maximize();
        helpSearchBarWebElement.click();
        // Thread.sleep(5000);
        boolean result=isPopUpWindowDisplayed(driver, ".search-container");
        Assert.assertEquals(result, true);
    }
    public void searchBarSuggestionWindow(String searchBarValue){
        driver.manage().window().maximize();
        typeOnElement("#nav-search-query", searchBarValue);
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
    public void searchBarResultCheck(String searchBarValue2) throws InterruptedException {
        driver.manage().window().maximize();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue2);
        sleepFor(3);
        waitUntilVisible(By.className("results-heading"));
        clickByXpath("//a[@name='Search Module - Search Results - Result 2']");
        System.out.println(searchBarValue2);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(searchBarValue2.toLowerCase()));
    }
    public void viewAllSearchPageFromSearchPopUp(String searchBarValue, String searchPageUrl) {
        driver.manage().window().maximize();
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        helpSearchBarWebElement.click();
        typeOnInputBox("#nav-search-query", searchBarValue);
        waitUntilVisible(By.className("results-heading"));
        viewAllSearchWebElement.click();
        Assert.assertEquals(getCurrentPageUrl(), searchPageUrl);
    }
    public void enEspanolClick(){
        driver.manage().window().maximize();
        enEspanolWebElement.click();
    }
    public void helpClick(){
        driver.manage().window().maximize();
        helpnWebElement.click();
    }
    public void businessInstitutionClick(){
        driver.manage().window().maximize();
        businessInstitutionWebElement.click();
    }
    public void smallBusinessClick(){
        driver.manage().window().maximize();
        smallBusinessWebElement.click();
    }
    public void securityClick(){
        driver.manage().window().maximize();
        securityWebElement.click();
    }
    public void contactUsClick(){
        driver.manage().window().maximize();
        contactUsWebElement.click();
    }
    public void wealthManagementClick(){
        driver.manage().window().maximize();
        wealthManagemetWebElement.click();
    }
    public void checkingClick(){
        driver.manage().window().maximize();
        checkingWebElement.click();
    }
    public void savingClick(){
        driver.manage().window().maximize();
        savingWebElement.click();
    }
    public void creditCardClick(){
        driver.manage().window().maximize();
        creditCardsWebElement.click();
    }
    public void homeLoansClick(){
        driver.manage().window().maximize();
        homeLoansWebElement.click();
    }
    public void autoLoanClick(){
        driver.manage().window().maximize();
        autoLoansWebElement.click();
    }
    public void investingClick(){
        driver.manage().window().maximize();
        investingWebElement.click();
    }
    public void betterMoneyHabitsClick(){
        driver.manage().window().maximize();
        betterMoneyHabitsWebElement.click();
    }

    public  boolean checkingMenuIsDisplayed(){
        driver.manage().window().maximize();
        checkingWebElement.click();
        waitUntilVisible(By.cssSelector(checkingHiddenMenuElement));
        boolean checkigDisplay = checkingHiddenMenuWebElement.isDisplayed();
        return checkigDisplay;
    }
    public  boolean savingMenuIsDisplayed(){
        driver.manage().window().maximize();
        savingWebElement.click();
        waitUntilVisible(By.cssSelector(savingHiddenMenuElement));
        boolean savingDisplay = savingHiddenMenuWebElement.isDisplayed();
        return savingDisplay;
    }
    public  boolean CreditCardMenuIsDisplayed(){
        driver.manage().window().maximize();
        creditCardsWebElement.click();
        waitUntilVisible(By.cssSelector(creditCardsHiddenMenuElement));
        boolean creditCardDisplay = creditCardsHiddenMenuWebElement.isDisplayed();
        return creditCardDisplay;
    }
    public  boolean HomeLoanMenuIsDisplayed(){
        driver.manage().window().maximize();
        homeLoansWebElement.click();
        waitUntilVisible(By.cssSelector(homeLoansHiddenMenuElement ));
        boolean HomeLoanDisplay = homeLoansHiddenMenuWebElement.isDisplayed();
        return HomeLoanDisplay;
    }
    public  boolean autoLoansMenuIsDisplayed(){
        driver.manage().window().maximize();
        autoLoansWebElement.click();
        waitUntilVisible(By.cssSelector(autoLoansHiddenMenuElement));
        boolean autoLoansDisplay = autoLoansHiddenMenuWebElement.isDisplayed();
        return autoLoansDisplay;
    }
    public  boolean investingMenuIsDisplayed(){
        driver.manage().window().maximize();
        investingWebElement.click();
        waitUntilVisible(By.cssSelector(investingHiddenMenuElement));
        boolean investingDisplay = investingHiddenMenuWebElement.isDisplayed();
        return investingDisplay;
    }
    public  boolean betterMoneyHabitsMenuIsDisplayed(){
        driver.manage().window().maximize();
        betterMoneyHabitsWebElement.click();
        waitUntilVisible(By.cssSelector(betterMoneyHabitsHiddenMenuElement ));
        boolean betterMoneyHabitsDisplay = betterMoneyHabitsHiddenMenuWebElement.isDisplayed();
        return betterMoneyHabitsDisplay;
    }
    public void helpSearchBarClick(){
        helpSearchBarWebElement.click();
    }
}
