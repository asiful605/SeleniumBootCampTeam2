package basic;

import com.beust.jcommander.Parameters;
import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import static webElements.WebElementsForBoA.*;
import static webElements.WebelementsForSmallBusinessVideo.homeTabElement;
import static webElements.WebelementsForSmallBusinessVideo.mostPopularTabElement;

public class BasicHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = seeOptionsWebElement)
    public WebElement hoverOnSeeOptionsTab;
    @FindBy(how = How.CSS, using = openNowWebElement)
    WebElement clickOnOpenNowTab;
    @FindBy(how = How.XPATH, using = radioButtonWebElement)
    WebElement clickOnRadiobutton;
    @FindBy(how = How.CSS, using = DynamicheckBoxWebElement)
    WebElement DynamicClickOnCheckBox;
    @FindBy(how = How.CSS, using = DropButton)
    WebElement DropButtonWebElement;
    @FindBy(how = How.XPATH, using = buttonWebelement)
    WebElement buttonElement;
    @FindBy(how = How.CSS, using = clickelement)
    WebElement clickOnElement;
    @FindBy(how = How.CSS, using =openCheckingAcElement)
    public static WebElement openCheckingAcWebElement;
    @FindBy(how=How.XPATH, using=getMostFromYourCheckingCreditCardElement )
    public static WebElement getMostFromYourCheckingCreditCardWebElement;
    @FindBy(how=How.XPATH, using=ourVideosCanHelpYouRunElement)
    WebElement ourVideosCanHelpYouRunWebElement;
    @FindBy(how=How.XPATH, using=bestPracticesForProcessingPayrollElement)
    public static WebElement bestPracticesForProcessingPayrollWebElement;
    @FindBy(how=How.XPATH, using=needFinancingFindTheRightSolutionElement)
    public static WebElement needFinancingFindTheRightSolutionWebElement;
    @FindBy(how=How.CSS, using=meetBusinessAdvantage360Element)
    public static WebElement meetBusinessAdvantage360WebElement;
    @FindBy(how=How.XPATH, using=signGoPaperLessElement)
    public static WebElement signGoPaperLessWebElement;
    @FindBy(how=How.ID, using= onlineBankingServiceAgreementElement)
    public static WebElement onlineBankingServiceAgreementWebElement;
    @FindBy(id=homeTabElement)
    WebElement homeTabWebElement;
    @FindBy (id=mostPopularTabElement)
    WebElement mostPopularTabWebElement;
    @FindBy (id=cashManagementTabElement)
    WebElement cashManagementTabWebElement;
    @FindBy (id=bankingServicesTabElement)
    WebElement bankingServicesTabWebElement;
    @FindBy (id=payrollServicesTabElement)
    WebElement payrollServicesTabWebElement;
    @FindBy (id=resourcesTabElement)
    WebElement resourcesTabWebElement;
    @FindBy (id=retirementTabElement)
    WebElement retirementTabWebElement;
    @FindBy (id=creditTabElement)
    WebElement creditTabWebElement;
    @FindBy (id=businessAdvantageRelationshipRewardTab)
    WebElement businessAdvantageRelationshipRewardTabWebElement;
    @FindBy (css=businessCardBasicsElement)
    WebElement businessCardBasicsWebElement;
    @FindBy (id=accountManagementElement)
    WebElement accountManagementWebElement;
    @FindBy (id= CreditCardReward)
    WebElement creditCardRewards;


    public void UserHoverOnSeeOptionsTab() {
        mouseHoverByCSS(seeOptionsWebElement);
    }
    public void userclickOnOpenNowTab() {
        String showsTitle = driver.getTitle();
        System.out.println("It will shows Title of :" + showsTitle);
        mouseHoverByCSS(openNowWebElement);
    }
    public void userclickOnRadiobutton() {
        boolean radiobuttonDisplayed = clickOnRadiobutton.isDisplayed();
        if (clickOnRadiobutton.isSelected()) {
            System.out.println("selected");
        } else {
            System.out.println("not selected");
        }
    }
    public void UsercanClickOnDynamicCheckBox() {
        int count = driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).size();
        for (int i = 0; i < count; i++) {
            driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).get(0);
        }
    }
    public String payrollServicesPageTitle() {
        payrollServicesTabClick();
        return driver.getTitle();
    }
    public void switchWindow(int index){
        navigateTo("https://www.cigna.com/");
        navigateTo("https://www.att.com/");
        String windowId = null;
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        for (int i = 1; i <= index; i++) {
            windowId = iter.next();
        }
        driver.switchTo().window(windowId);
        System.out.println("It will switch At_T window :" + driver.getTitle());
        driver.close();
    }
    public void clickOnButton() {
        navigateTo("https://www.bofaml.com/content/boaml/en_us/home.html") ;
        clickByXpath(buttonWebelement);
        mouseHoverByCSS(clickelement);
    }
    public String retirementExpectedPageTitle(String url){
       navigateTo(url);
        return driver.getTitle();
    }
    public String onlineBankingServiceAgreementPageTitle() {
        onlineBankingServiceAgreementClick();
        handleNewTab(driver);
        return driver.getTitle();
    }
    public String onlineBankingServiceAgreementActualTitle(String onlineBankingServiceAgreementUrl)  {
        navigateTo(onlineBankingServiceAgreementUrl);
        return driver.getTitle();
    }
    public String signGoPaperLessPageTitle() {
        signGoPaperLessClick();
        return driver.getTitle();
    }
    public String signGoPaperLessActualTitle(String signInGoPaperlessUrl) {
        navigateTo(signInGoPaperlessUrl);
        return driver.getTitle();
    }
    public String getMostFromYourCheckingCreditPageTitle() {
        getMostFromYourCheckingCreditClick();
        return driver.getTitle();
    }
    public String getMostFromYourCheckingCreditActualTitle(String getMostFromYourCheckingCreditCardAccountsUrl) {
        navigateTo(getMostFromYourCheckingCreditCardAccountsUrl);
        return driver.getTitle();
    }
    public String meetBusinessAdvantage360PageTitle() {
        meetBusinessAdvantage360Click();
        return driver.getTitle();
    }
    public String meetBusinessAdvantage360ActualTitle(String meetBusinessAdvantage360Url) {
        navigateTo(meetBusinessAdvantage360Url);
        return driver.getTitle();
    }
    public String needFinancingFindTheRightSolutionPageTitle() {
        needFinancingFindTheRightSolutionClick();
        return driver.getTitle();
    }
    public String needFinancingFindTheRightSolutionActualTitle(String needFinancingFindTheRightSolutionUrl) {
       navigateTo(needFinancingFindTheRightSolutionUrl);
        return driver.getTitle();
    }
    public String bestPracticesForProcessingPayrollPageTitle() {
        bestPracticesForProcessingPayrollClick();
        return driver.getTitle();
    }
    public String bestPracticesForProcessingPayrollActualTitle(String bestPracticesForProcessingPayrollUrl) {
        navigateTo(bestPracticesForProcessingPayrollUrl);
        return driver.getTitle();
    }
    public String ourVideosCanHelpYouRunPageTitle() {
        ourVideosCanHelpYouRunClick();
        return driver.getTitle();
    }
    public String ourVideosCanHelpYouRunActualTitle(String ourVideosCanHelpYouUrl) {
       navigateTo(ourVideosCanHelpYouUrl);
        return driver.getTitle();
    }
    public void openCheckingClick() {
        openCheckingAcWebElement.click();
    }
    public void getMostFromYourCheckingCreditClick() {
        waitUntilVisible(By.xpath("//a[@id='bmhDefaultGetMostFromAccounts' and @class='slide-content ']"));
        getMostFromYourCheckingCreditCardWebElement.click();
    }
    public void ourVideosCanHelpYouRunClick() {
        clickByXpath(ourVideosCanHelpYouRunElement);
    }
    public void bestPracticesForProcessingPayrollClick() {
        clickByXpath(bestPracticesForProcessingPayrollElement);
    }
    public void needFinancingFindTheRightSolutionClick() {
        clickByXpath(needFinancingFindTheRightSolutionElement);
    }
    public void meetBusinessAdvantage360Click() {
        clickByCSS(meetBusinessAdvantage360Element);
    }
    public void signGoPaperLessClick() {
        clickByXpath(signGoPaperLessElement);
    }
    public void onlineBankingServiceAgreementClick() {
        clickByID(onlineBankingServiceAgreementElement);
    }
    public void homeTabClick(){
        clickByID(homeTabElement);
    }
    public void mostPopularTabClick(){
        clickByID(mostPopularTabElement);
    }
    public void cashManagementTabClick() {
        clickByID(cashManagementTabElement);
    }
    public void bankingServicesTabClick(){
        clickByID(bankingServicesTabElement);
    }
    public void payrollServicesTabClick(){
        clickByID(payrollServicesTabElement);
    }
    public String resourcesExpectedPageTitle(String resourcesUrl){
        navigateTo(resourcesUrl);
        return driver.getTitle();
    }
    public String resourcesPageTitle() {
        resourcesTabClick();
        return driver.getTitle();
    }
    public String bankingServicesExpectedPageTitle(String bankingServicesUrl){
        navigateTo(bankingServicesUrl);
        return driver.getTitle();
    }
    public String bankingServicesPageTitle() {
        bankingServicesTabClick();
        return driver.getTitle();
    }
    public String cashManagementPageTitle(String cashManagementUrl){
        navigateTo(cashManagementUrl);
        return driver.getTitle();
    }
    public String cashManagementPageTitle(){
        cashManagementTabClick();
        return driver.getTitle();
    }
    public String PopularExpectedPageTitle(String mostPopularVideoUrl){
        navigateTo(mostPopularVideoUrl);
        return driver.getTitle();
    }
    public String mostPopularPageTitle() {
        mostPopularTabClick();
        return driver.getTitle();
    }
    public void resourcesTabClick(){
        clickByID(resourcesTabElement);
    }
    public void ClickOnDropButton() {
        navigateTo("https://promo.bankofamerica.com/hp-oaa2/");
        navigateTo("https://www.merrill.com/");
        clickByCSS(DropButton);
    }
}








