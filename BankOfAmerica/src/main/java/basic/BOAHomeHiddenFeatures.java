package basic;

import com.beust.jcommander.Parameters;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
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
        navigateTo(smallBusinessUrl);
        String smallBusinessPageTitle = driver.getTitle();
        navigateBack();
        clickByCSS(smallBusinessElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, smallBusinessPageTitle);
    }
    public void wealthManagementPageTitle (String wealthManagementUrl){
       navigateTo(wealthManagementUrl);
        String wealthManagementPageTitle = driver.getTitle();
        navigateBack();
        clickByCSS(wealthManagemetElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, wealthManagementPageTitle);
    }
    public void businessNInstitutionPageTitle (String businessInstitutionUrl){
       navigateTo(businessInstitutionUrl);
        String businessInstitutionPageTitle = driver.getTitle();
        navigateBack();
        clickByCSS(businessInstitutionElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, businessInstitutionPageTitle);
    }
    public void securityPageTitle (String securityUrl){
        navigateTo(securityUrl);
        String securityPageTitle = driver.getTitle();
        navigateBack();
        clickByID(securityElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, securityPageTitle);
    }
    public void aboutUsPageTitle (String aboutUsUrl){
        navigateTo(aboutUsUrl);
        String aboutUsPageTitle = driver.getTitle();
        navigateBack();
        clickByLinkText(aboutUsElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, aboutUsPageTitle);
    }
    public void EnEspañolPageTitle (String enEspanolUrl){
        navigateTo(enEspanolUrl);
        String EnEspañolPageTitle = driver.getTitle();
        navigateBack();
        clickByCSS(enEspanolElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, EnEspañolPageTitle);
    }
    public void contactUsPageTitle (String contactUsUrl){
        navigateTo(contactUsUrl);
        String contactUsPageTitle = driver.getTitle();
        navigateBack();
        clickByCSS(contactUsElement);
        String currentPageTitle = driver.getTitle();
        Assert.assertEquals(currentPageTitle, contactUsPageTitle);
    }
    public void helpTabPopUp() {
        clickByCSS(helpnElement);
        WebDriverWait wait = new WebDriverWait(driver, 6);
        isPopUpWindowDisplayed(driver,  locatorboa);
    }
    public void locationPageTitle(String locationsUrl) {
        navigateTo(locationsUrl);
        String locationsPageTitle=driver.getTitle();
        navigateBack();
        clickByLinkText(locationFooterElement);
        String currentPageTitle=driver.getTitle();
        Assert.assertEquals(currentPageTitle, locationsPageTitle);
    }
    public void contactUsFooterPageTitle(String contactUsUrl) {
        navigateTo(contactUsUrl);
        String contactUsFooterPageTitle=driver.getTitle();
        navigateBack();
        clickByLinkText(contactUsFooterElement);
        Assert.assertEquals(driver.getTitle(), contactUsFooterPageTitle);
    }
    public void helpFooterPageTitle(String helpUrl) {
        navigateTo(helpUrl);
        String actualPageTitle=driver.getTitle();
        navigateBack();
        clickByLinkText(helpFooterElement);
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }
    public void accessibleBankingFooterPageTitle(String accessibleBankingUrl)  {
       navigateTo(accessibleBankingUrl);
        String actualPageTitle=driver.getTitle();
        navigateBack();
        clickByXpath(accessibleBankingFooterElement);
        waitUntilVisible(By.xpath(accessibleBankingFooterElement));
        Assert.assertEquals(driver.getTitle(), actualPageTitle);
    }
    public void followFbClick (){
        clickByXpath(followFacebookElement);
    }
    public void followInstagramClick (){
        clickByID(followInstagramElement);
    }
    public void followLinkedInClick(){
        clickByID(followLinkedinElement);
    }
    public void followPinterestClick (){
        clickByID(followPinterestElement);
    }
    public void followTwitterClick (){
        clickByXpath(followTwitterElement);
    }
    public void followYouTubeClick (){
        clickByID(followYoutubeElement);
    }
    public void feedBackFooterClick (){
      clickByXpath(feedbackFooterElement);
    }
    public void searchBarPopUp(){
        clickByXpath(helpSearchBarElement);
        boolean result=isPopUpWindowDisplayed(driver, ".search-container");
        Assert.assertEquals(result, true);
    }
    public void searchBarSuggestionWindow(String searchBarValue){
        typeOnElement("#nav-search-query", searchBarValue);
        clickOnElement(".submit");
        isPopUpWindowDisplayed(driver, ".search-container");
    }
    public void searchBarResultCheck(String searchBarValue2) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        clickByXpath(helpSearchBarElement);
        typeOnInputBox("#nav-search-query", searchBarValue2);
        waitUntilVisible(By.className("results-heading"));
        clickByXpath("//a[@name='Search Module - Search Results - Result 2']");
        System.out.println(searchBarValue2);
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.getTitle().toLowerCase().contains(searchBarValue2.toLowerCase()));
    }
    public void viewAllSearchPageFromSearchPopUp(String searchBarValue, String searchPageUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        clickByXpath(helpSearchBarElement);
        typeOnInputBox("#nav-search-query", searchBarValue);
        waitUntilVisible(By.className("results-heading"));
        clickByXpath(viewAllSearchElement);
        Assert.assertEquals(getCurrentPageUrl(), searchPageUrl);
    }
    public void enEspanolClick(){
        clickByCSS(enEspanolElement);
    }
    public void helpClick(){
        clickByCSS(helpnElement);
    }
    public void businessInstitutionClick(){
       clickByCSS( businessInstitutionElement);
    }
    public void smallBusinessClick(){
        clickByCSS(smallBusinessElement);
    }
    public void securityClick(){
        clickByID(securityElement);
    }
    public void contactUsClick(){
        clickByCSS(contactUsElement);
    }
    public void wealthManagementClick(){
        clickByCSS(wealthManagemetElement);
    }
    public void checkingClick(){
        clickByID(checkingElement);
    }
    public void savingClick(){
        clickByID(savingElement);
    }
    public void creditCardClick(){
        clickByID(creditCardsElement);
    }
    public void homeLoansClick(){
        clickByLinkText(homeLoansElement);
    }
    public void autoLoanClick(){
        clickByCSS(autoLoansElement);
    }
    public void investingClick(){
        clickByCSS(investingElement);
    }
    public void betterMoneyHabitsClick(){
        clickByLinkText(betterMoneyHabitsElement);
    }
    public  boolean checkingMenuIsDisplayed(){
        clickByID(checkingElement);
        waitUntilVisible(By.cssSelector(checkingHiddenMenuElement));
        boolean checkigDisplay = checkingHiddenMenuWebElement.isDisplayed();
        return checkigDisplay;
    }
    public  boolean savingMenuIsDisplayed(){
        clickByID(savingElement);
        waitUntilVisible(By.cssSelector(savingHiddenMenuElement));
        boolean savingDisplay = savingHiddenMenuWebElement.isDisplayed();
        return savingDisplay;
    }
    public  boolean CreditCardMenuIsDisplayed(){
        clickByID(creditCardsElement);
        waitUntilVisible(By.cssSelector(creditCardsHiddenMenuElement));
        boolean creditCardDisplay = creditCardsHiddenMenuWebElement.isDisplayed();
        return creditCardDisplay;
    }
    public  boolean HomeLoanMenuIsDisplayed(){
        clickByLinkText(homeLoansElement);
        waitUntilVisible(By.cssSelector(homeLoansHiddenMenuElement ));
        boolean HomeLoanDisplay = homeLoansHiddenMenuWebElement.isDisplayed();
        return HomeLoanDisplay;
    }
    public  boolean autoLoansMenuIsDisplayed(){
        clickByCSS(autoLoansElement);
        waitUntilVisible(By.cssSelector(autoLoansHiddenMenuElement));
        boolean autoLoansDisplay = autoLoansHiddenMenuWebElement.isDisplayed();
        return autoLoansDisplay;
    }
    public  boolean investingMenuIsDisplayed(){
        clickByCSS(investingElement);
        waitUntilVisible(By.cssSelector(investingHiddenMenuElement));
        boolean investingDisplay = investingHiddenMenuWebElement.isDisplayed();
        return investingDisplay;
    }
    public  boolean betterMoneyHabitsMenuIsDisplayed(){
        clickByLinkText(betterMoneyHabitsElement);
        waitUntilVisible(By.cssSelector(betterMoneyHabitsHiddenMenuElement ));
        boolean betterMoneyHabitsDisplay = betterMoneyHabitsHiddenMenuWebElement.isDisplayed();
        return betterMoneyHabitsDisplay;
    }
    public void helpSearchBarClick(){
        clickByXpath(helpSearchBarElement);
    }
}
