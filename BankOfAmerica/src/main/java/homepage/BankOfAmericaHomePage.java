package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static webelements.BankOfAmericaWebElements.*;
public class BankOfAmericaHomePage extends WebAPI {

    @FindBy(how = How.ID, using = onlineIDWebElement) public WebElement onlineID;
    @FindBy(how = How.ID, using = passwordWebElement) public WebElement password;
    @FindBy(how = How.XPATH, using = signInWebElement) public WebElement signIn;
    @FindBy(how = How.XPATH, using = businessesInstitutionsWebElement) public WebElement businessesInstitutions;
    @FindBy(how = How.XPATH, using = resourcesWebElement) public WebElement resources;
    @FindBy(how = How.XPATH, using = smallBusinessWebElement) public WebElement smallBusiness;
    @FindBy(how = How.XPATH, using = wealth_ManagementWebElement) public WebElement wealth_Management;
    @FindBy(how = How.XPATH, using = footerWebElements) public List<WebElement> footer;
    @FindBy(how = How.XPATH, using = seeDealsWebElement) public WebElement seeDeals;
    @FindBy(how = How.XPATH, using = getTheAppWebElement) public WebElement getTheApp;
    @FindBy(how = How.CSS, using = selectDeviceWebElement) public WebElement selectDevice;
    @FindBy(how = How.LINK_TEXT, using = feedbackWebElement) public WebElement feedback;
    @FindBy(how = How.XPATH, using = selectBox1WebElement) public WebElement selectBox1;
    @FindBy(how = How.XPATH, using = sendFeedbackWebElement) public WebElement sendFeedBack;
    @FindBy(how = How.XPATH, using = closeButtonWebElement) public WebElement closeButton;
    @FindBy(how = How.LINK_TEXT, using = homeLoanWebElement) public WebElement homeLoan;
    @FindBy(how = How.XPATH, using = homeEquityWebElement) public WebElement homeEquity;
    @FindBy(how = How.ID, using = selectStateWebElement) public WebElement selectState;
    @FindBy(how = How.ID, using = submitWebElement) public WebElement submit;
    @FindBy(how = How.ID, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.CLASS_NAME, using = buttonWebElement) public WebElement button;

    public void deleteCookies() { driver.manage().deleteAllCookies(); }
    public void manageTimeWait() { driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS); }
    public void enterOnlineID() { onlineID.sendKeys("kenzy24"); }
    public void enterPassword() { password.sendKeys("12345"); }
    public void clickSighIn() { signIn.click(); }
    public void clickBusinessesInstitution() { businessesInstitutions.click(); }
    public void clickResources() { resources.click(); }
    public void useMouseHover() {
        mouseHoverByXpath("//a[@id='NAV_BUSINESS_ADVANTAGE']");
        mouseHoverByXpath("//a[@id='NAV_WEALTH_MANAGEMENT']");
        wealth_Management.click();
    }
    public List<WebElement> getFooter(List<WebElement>footer) {
       return footer;
    }
    public void clickSeeDeals() { seeDeals.click(); }
    public void clickGetTheApp() { getTheApp.click(); }
    public void devicesOption() { selectOptionByVisibleText(selectDevice,"iPad"); }
    public void clickFeedback() { feedback.click(); }
    public void clickSelectBox1() { selectBox1.click(); }
    public void clickSendFeedBack() { sendFeedBack.click(); }
    public void clickCloseButton() { closeButton.click();}
    public void clickHomeLoan() { homeLoan.click(); }
    public void clickHomeEquity() { homeEquity.click(); }
    public void clickSubmit() { submit.click(); }
    public void enterKeyWord() {searchBox.sendKeys("Account"); }
    public void clickButton() { button.click(); }
    public void exploreBusinessesInstitutionOption() {
        deleteCookies();
        clickBusinessesInstitution();
        clickResources();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS); }
    public void validationSearch1() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Featured Business and Banking Insights from Bank of America Merrill Lynch"); }
    public void performMouseHoverOnHeader() {
        deleteCookies();
        useMouseHover(); }
    public void signIN() {
        deleteCookies();
        enterOnlineID();
        enterPassword();
        clickSighIn(); }
    public void readFooter() {
        deleteCookies();
        getFooter(footer); }
    public void selectDevicesOption() {
        deleteCookies();
        clickSeeDeals();
        clickGetTheApp();
        devicesOption(); }
    public void getBrokenLink() {
        deleteCookies();
        findBrokenLink();
    }
    public void scrollHeight(){
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)"); }
    public void feedbackWithWindowHandle(){
        deleteCookies();
        clickFeedback();
        handleWindow();
        clickSelectBox1();
        clickSendFeedBack();
       manageTimeWait();
        clickCloseButton();
            }
    public void exploreHomeLoan(){
        deleteCookies();
        clickHomeLoan();
        manageTimeWait();
        clickHomeEquity();
        selectOptionByVisibleText(selectState,"Colorado");
        clickSubmit();
    }
    public void searchForBankingOption(){
        deleteCookies();
        enterKeyWord();
       clickButton();
    }
}








