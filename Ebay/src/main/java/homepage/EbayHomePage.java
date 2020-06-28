package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static webelements.EbayWebElements.*;

public class EbayHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = headerWebElements) public List<WebElement> header;
    @FindBy(how = How.XPATH, using = feedBackWebElement) public WebElement feedback;
    @FindBy(how = How.ID, using = selectBox3WebElement) public WebElement selectBox3;
    @FindBy(how = How.XPATH, using = sendButtonWebElement) public WebElement sendButton;
    @FindBy(how = How.XPATH, using = allCategoriesWebElement) public WebElement allCategories;
    @FindBy(how = How.XPATH, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CSS, using = buttonWebElement) public WebElement button;
    @FindBy(how = How.XPATH, using = poolSelectionWebElement) public WebElement poolSelection;
    @FindBy(how = How.LINK_TEXT, using = addToCardWebElement) public WebElement addToCard;
    @FindBy(how = How.XPATH, using = dailyDealsWebElement) public WebElement dailyDeals;
    @FindBy(how = How.XPATH, using = sellWebElement) public WebElement sell;
    @FindBy(how = How.XPATH, using = homeWebElement) public WebElement home;
    @FindBy(how = How.XPATH, using = savedWebElement) public WebElement saved;
    @FindBy(how = How.XPATH, using = fashionWebElement) public WebElement fashion;
    @FindBy(how = How.XPATH, using = dealsWebElement) public WebElement deals;
    @FindBy(how = How.XPATH, using = motorsWebElement) public WebElement motors;
    @FindBy(how = How.XPATH, using = startSellingWebElement) public WebElement startSelling;
    @FindBy(how = How.XPATH, using = sellingBoxWebElement) public WebElement sellingBox;
    @FindBy(how = How.XPATH,using = shopAllCategoriesWebElement) public WebElement shopAllCategories;
    @FindBy(how = How.XPATH,using = electronicsWebElement) public WebElement electronics;
    @FindBy(how = How.XPATH ,using =homeSurveillanceWebElement) public WebElement homeSurveillance ;
    @FindBy(how = How.XPATH, using = myEbayWebElement) public WebElement myEbay;
    @FindBy(how = How.XPATH, using = recentlyViewedWebElement) public WebElement recentlyViewed;
    @FindBy(how = How.XPATH, using = investorWebElement) public WebElement investor;
    @FindBy(how = How.XPATH, using = globalImpactWebElement) public WebElement globalImpact;
    @FindBy(how = How.XPATH, using = policiesWebElement) public WebElement policies;
    @FindBy(how = How.XPATH, using = feedbackPoliciesWebElement) public WebElement feedbackPolicies;
    @FindBy(how = How.XPATH, using = developersWebElement) public WebElement developers;
    @FindBy(how = How.XPATH, using = registerWebElement) public WebElement register;
    @FindBy(how = How.XPATH, using = ebayCommunityWebElement) public WebElement ebayCommunity;
    @FindBy(how = How.XPATH, using = aboutTheCommunityWebElement) public WebElement aboutTheCommunity;
    @FindBy(how = How.XPATH, using = musicWebElement) public WebElement musics;
    @FindBy(how = How.LINK_TEXT, using = concertsWebElement) public WebElement concert;

    public void manageTimeWait() { driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS); }
    public void deleteCookies() { driver.manage().deleteAllCookies();}
    public List<WebElement> getHeader() {
        List<WebElement> headerName = header;
        for (WebElement head : headerName) {
            System.out.println(head.getText());
        }
        return headerName;
    }
    public void selectFeedback() { feedback.click(); }
    public void checkAnswerBox() { selectBox3.click(); }
    public void clickSend() { sendButton.click(); }
    public List<WebElement> getAllCategoriesItem() {
        Select select = new Select(allCategories);
        List<WebElement> options = select.getOptions();
        int ListSize = options.size();
        for (int i = 0; i < ListSize; i++) {
            String Value = select.getOptions().get(i).getText();
            System.out.println(Value);
            select.selectByIndex(i);
        }
        return options;
    }
    public void enterSearch() { searchBox.sendKeys(" kids swimming pool"); }
    public void clickSearchTab() { button.click(); }
    public void selectYourProduct() { poolSelection.click(); }
    public void setAddToCard() { addToCard.click(); }
    public void clickDailyDeals() { dailyDeals.click(); }
    public void clickStartSelling() { startSelling.click(); }
    public void enterKeyword() { sellingBox.sendKeys("kids swimming set, size3"); }
    public void MyEbay() {myEbay.click(); }
    public void getDailyDEalPageTitle() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        manageTimeWait();
        Assert.assertEquals(actualTitle, "Daily Deals on eBay | Best deals and Free Shipping");
    }
    public void clickSell() { sell.click(); }
    public void selectGlobalImpact() { globalImpact.click(); }
    public void clickInvestor() { investor.click(); }
    public void selectPolicies() {policies.click(); }
    public void clickPoliciesFeedback() {feedbackPolicies.click(); }
    public void selectDevelopers() {developers.click(); }
    public void clickRegister() {register.click(); }
    public void selectEbayCommunity() {ebayCommunity.click(); }
    public void clickAboutCommunity() {aboutTheCommunity.click(); }
    public void selectMusic() {musics.click(); }
    public void clickConcert() {concert.click(); }
    public void getSellPageTitle() {
        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
        Assert.assertEquals(actualTitle, "Selling on eBay | Electronics, Fashion, Home & Garden | eBay");
    }
    public void setShopAllCategories(){shopAllCategories.click();}
    public void readHeader() {
        deleteCookies();
        getHeader();
    }
    public void returnFeedback() {
        deleteCookies();
        selectFeedback();
        checkAnswerBox();
        clickSend();
    }
    public void itemListForAllCategories(){
        deleteCookies();
        getAllCategoriesItem();
    }
    public void searchProduct() {
        deleteCookies();
        enterSearch();
        clickSearchTab();
        selectYourProduct();
        setAddToCard();
    }
    public void validateDailyDeals() {
        deleteCookies();
        clickDailyDeals();
        getDailyDEalPageTitle();
    }
    public void validateSell() {
        deleteCookies();
        clickSell();
        getSellPageTitle();
    }
    public List getHeadersValue1() {
        List<WebElement> headerList1 = new ArrayList<>();
        headerList1.add(home);
        headerList1.add(saved);
        headerList1.add(fashion);
        headerList1.add(deals);
        headerList1.add(motors);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < headerList1.size(); i++) {
            list.add(headerList1.get(i).getText());
        }
        System.out.println(list);
        return list;
    }
    public void setStartSelling() {
        deleteCookies();
        clickStartSelling();
        enterKeyword();
    }
    public void electronicsOptions(){
        deleteCookies();
        setShopAllCategories();
        mouseHoverByXpath("//*[@id=\"gh-sbc\"]/tbody/tr/td[1]/h3[2]/a");
        electronics.click();
        mouseHoverByXpath("//a[contains(text(),'Home Surveillance')]");
        homeSurveillance.click();
    }
   public void validationSearch5(){
        String actualResult=driver.getTitle();
        Assert.assertEquals(actualResult,"Home Surveillance Systems for sale | In Stock | eBay");
   }
    public void exploreMyEbay() {
        deleteCookies();
        mouseHoverByXpath("//a[@class='gh-eb-li-a'][contains(text(),'My eBay')]");
        mouseHoverByXpath("//a[contains(text(),'Recently Viewed')]");
        recentlyViewed.click();
    }
    public void globalImpactPage(){
        selectGlobalImpact();
        mouseHoverByXpath("//*[@id=\"main-nav-menu\"]/nav/ul/li[6]/a");
        clickInvestor();
    }
    public void validationSearch6(){
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,"https://investors.ebayinc.com/overview/default.aspx");
    }
    public void feedbackPoliciesPage(){
        selectPolicies();;
       clickPoliciesFeedback();
    }
    public void validationSearch7(){
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,"https://www.ebay.com/help/policies/default/ebays-rules-policies?id=4205");
    }
    public void registerForDevelopersPage(){
        selectDevelopers();
        clickRegister();
    }
    public void validationSearch8(){
        String actualResult=driver.getCurrentUrl();
        Assert.assertEquals(actualResult,"https://developer.ebay.com/signin?tab=register");
    }
    public void ebayCommunityPage(){
        selectEbayCommunity();
        clickAboutCommunity();
    }
    public void validationSearch9() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, ":https://community.ebay.com/t5/About-the-Community/About-Community/m-p/26164272?nobounce=");
    }
    public void concertTickets(){
       selectMusic();
       clickConcert();
    }
    public void validationSearch11() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.ebay.com/b/Concert-Tickets/173634/bn_1865448");
    }









}












