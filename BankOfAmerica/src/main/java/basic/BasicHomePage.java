package basic;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static webElements.WebElementsForBoA.At_tUrl;
import static webElements.WebElementsForBoA.DropButton;
import static webElements.WebElementsForBoA.DynamicheckBoxWebElement;
import static webElements.WebElementsForBoA.buttonWebelement;
import static webElements.WebElementsForBoA.cignaUrl;
import static webElements.WebElementsForBoA.clickelement;
import static webElements.WebElementsForBoA.openNowWebElement;
import static webElements.WebElementsForBoA.radioButtonWebElement;
import static webElements.WebElementsForBoA.seeOptionsWebElement;
import static webElements.WebElementsForBoA.url1;
import static webElements.WebElementsForBoA.url3;
import static webElements.WebElementsForBoA.*;
import static webElements.WebelementsForSmallBusinessVideo.CreditCardReward;
import static webElements.WebelementsForSmallBusinessVideo.accountManagementElement;
import static webElements.WebelementsForSmallBusinessVideo.bankingServicesTabElement;
import static webElements.WebelementsForSmallBusinessVideo.businessAdvantageRelationshipRewardTab;
import static webElements.WebelementsForSmallBusinessVideo.businessCardBasicsElement;
import static webElements.WebelementsForSmallBusinessVideo.cashManagementTabElement;
import static webElements.WebelementsForSmallBusinessVideo.creditTabElement;
import static webElements.WebelementsForSmallBusinessVideo.homeTabElement;
import static webElements.WebelementsForSmallBusinessVideo.mostPopularTabElement;
import static webElements.WebelementsForSmallBusinessVideo.payrollServicesTabElement;
import static webElements.WebelementsForSmallBusinessVideo.resourcesTabElement;
import static webElements.WebelementsForSmallBusinessVideo.retirementTabElement;

public class BasicHomePage extends WebAPI {
//import com.beust.jcommander.Parameters;
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
    public static WebElement ourVideosCanHelpYouRunWebElement;
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

    public void UserHoverOnSeeOptionsTab() throws InterruptedException {
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSeeOptionsTab).perform();
        Thread.sleep(2000);
    }
    public void userclickOnOpenNowTab() {
        driver.manage().window().maximize();
        String showsTitle = driver.getTitle();
        System.out.println("It will shows Title of :" + showsTitle);
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(clickOnOpenNowTab).perform();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    // Radio Button
    public void userclickOnRadiobutton() throws InterruptedException {
        driver.manage().window().maximize();
        driver.get(url1);
        Thread.sleep(3000);
        boolean radiobuttonDisplayed = clickOnRadiobutton.isDisplayed();
        if (clickOnRadiobutton.isSelected()) {
            System.out.println("selected");
        } else {
            System.out.println("not selected");
        }
        Thread.sleep(2000);
    }
    // Dynamic way to click on Check Box
    public void UsercanClickOnDynamicCheckBox() throws InterruptedException {
        driver.get(url1);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        // size() can get how many checkbox are exits in the webpage
        int count = driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).size();
        for (int i = 0; i < count; i++) {
            // get() use for index . It will be change by index number
            driver.findElements(By.cssSelector(DynamicheckBoxWebElement)).get(0);
            Thread.sleep(3000);
        }
    }
    public String payrollServicesExpectedPageTitle(String payrollServicesUrl){
        driver.manage().window().maximize();
        driver.navigate().to(payrollServicesUrl);
        return driver.getTitle();
    }
    public String payrollServicesPageTitle() {
        driver.manage().window().maximize();
        payrollServicesTabClick();
        return driver.getTitle();
    }
    //  Click on dropButton
    public void ClickOnDropButton() {
        String url = "https://promo.bankofamerica.com/hp-oaa2/";
        driver.get(url);
        driver.manage().window().maximize();
        DropButtonWebElement.click();
    }
    // Handeling Multiple Windows/Tabs
    public void switchWindow(int index) throws InterruptedException {
        driver.get(cignaUrl);
        driver.get(At_tUrl);
        driver.manage().window().maximize();
        Thread.sleep(3000);
        String windowId = null;
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iter = windows.iterator();
        for (int i = 1; i <= index; i++) {
            windowId = iter.next();
        }
        driver.switchTo().window(windowId);
        System.out.println("It will switch At_T window :" + driver.getTitle());
        Thread.sleep(2000);
        driver.close();
    }
    // click on Button
    public void clickOnButton() {
        driver.get(url3);
        driver.manage().window().maximize();
        buttonElement.click();
        Actions actions2 = new Actions(driver);
        actions2.moveToElement(clickOnElement).perform();
    }
    public String retirementExpectedPageTitle(String retirementUrl){
        driver.navigate().to(retirementUrl);
        return driver.getTitle();
    }
    public String onlineBankingServiceAgreementPageTitle() throws InterruptedException {
        driver.manage().window().maximize();
        onlineBankingServiceAgreementClick();
        handleNewTab(driver);
        Thread.sleep(8000);
        return driver.getTitle();
    }
    public String onlineBankingServiceAgreementActualTitle(String onlineBankingServiceAgreementUrl) throws InterruptedException {
        driver.navigate().to(onlineBankingServiceAgreementUrl);
        driver.manage().window().maximize();
        Thread.sleep(8000);
        return driver.getTitle();
    }
    public String signGoPaperLessPageTitle() {
        driver.manage().window().maximize();
        signGoPaperLessClick();
        return driver.getTitle();
    }
    public String signGoPaperLessActualTitle(String signInGoPaperlessUrl) {
        driver.navigate().to(signInGoPaperlessUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String getMostFromYourCheckingCreditPageTitle() {
        driver.manage().window().maximize();
        getMostFromYourCheckingCreditClick();
        return driver.getTitle();
    }
    public String getMostFromYourCheckingCreditActualTitle(String getMostFromYourCheckingCreditCardAccountsUrl) {
        driver.navigate().to(getMostFromYourCheckingCreditCardAccountsUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String meetBusinessAdvantage360PageTitle() {
        driver.manage().window().maximize();
        meetBusinessAdvantage360Click();
        return driver.getTitle();
    }
    public String meetBusinessAdvantage360ActualTitle(String meetBusinessAdvantage360Url) {
        driver.navigate().to(meetBusinessAdvantage360Url);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String needFinancingFindTheRightSolutionPageTitle() {
        driver.manage().window().maximize();
        needFinancingFindTheRightSolutionClick();
        return driver.getTitle();
    }
    public String needFinancingFindTheRightSolutionActualTitle(String needFinancingFindTheRightSolutionUrl) {
        driver.navigate().to(needFinancingFindTheRightSolutionUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String bestPracticesForProcessingPayrollPageTitle() {
        driver.manage().window().maximize();
        bestPracticesForProcessingPayrollClick();
        return driver.getTitle();
    }
    public String bestPracticesForProcessingPayrollActualTitle(String bestPracticesForProcessingPayrollUrl) {
        driver.navigate().to(bestPracticesForProcessingPayrollUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String ourVideosCanHelpYouRunPageTitle() {
        driver.manage().window().maximize();
        ourVideosCanHelpYouRunClick();
        return driver.getTitle();
    }
    public String ourVideosCanHelpYouRunActualTitle(String ourVideosCanHelpYouUrl) {
        driver.navigate().to(ourVideosCanHelpYouUrl);
        driver.manage().window().maximize();
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
        driver.manage().window().maximize();
        ourVideosCanHelpYouRunWebElement.click();
    }
    public void bestPracticesForProcessingPayrollClick() {
        driver.manage().window().maximize();
        bestPracticesForProcessingPayrollWebElement.click();
    }
    public void needFinancingFindTheRightSolutionClick() {
        driver.manage().window().maximize();
        needFinancingFindTheRightSolutionWebElement.click();
    }
    public void meetBusinessAdvantage360Click() {
        driver.manage().window().maximize();
        meetBusinessAdvantage360WebElement.click();
    }
    public void signGoPaperLessClick() {
        driver.manage().window().maximize();
        signGoPaperLessWebElement.click();
    }
    public void onlineBankingServiceAgreementClick() {
        driver.manage().window().maximize();
        onlineBankingServiceAgreementWebElement.click();
    }
    public void homeTabClick(){
        driver.manage().window().maximize();
        homeTabWebElement.click();
    }
    public void mostPopularTabClick(){
        driver.manage().window().maximize();
        mostPopularTabWebElement.click();
    }
    public void cashManagementTabClick() {
        driver.manage().window().maximize();
        cashManagementTabWebElement.click();
    }
    public void bankingServicesTabClick(){
        driver.manage().window().maximize();
        bankingServicesTabWebElement.click();
    }
    public void payrollServicesTabClick(){
        driver.manage().window().maximize();
        payrollServicesTabWebElement.click();
    }
    public String resourcesExpectedPageTitle(String resourcesUrl){
        driver.navigate().to(resourcesUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String resourcesPageTitle() {
        driver.manage().window().maximize();
        resourcesTabClick();
        return driver.getTitle();
    }
    public String bankingServicesExpectedPageTitle(String bankingServicesUrl){
        driver.navigate().to(bankingServicesUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String bankingServicesPageTitle() {
        driver.manage().window().maximize();
        bankingServicesTabClick();
        return driver.getTitle();
    }
    public String cashManagementPageTitle(String cashManagementUrl){
        driver.navigate().to(cashManagementUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String cashManagementPageTitle(){
        driver.manage().window().maximize();
        cashManagementTabClick();
        return driver.getTitle();
    }
    public String PopularExpectedPageTitle(String mostPopularVideoUrl){
        driver.navigate().to(mostPopularVideoUrl);
        driver.manage().window().maximize();
        return driver.getTitle();
    }
    public String mostPopularPageTitle() {
        driver.manage().window().maximize();
        mostPopularTabClick();
        return driver.getTitle();
    }
    public void resourcesTabClick(){
        driver.manage().window().maximize();
        resourcesTabWebElement.click();
    }
}
