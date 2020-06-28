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
import static WebElements.BOAHomeElements.*;
import static WebElements.WebelementsForSmallBusinessVideo.At_tUrl;

    public class BasicHomePage extends WebAPI {

        @FindBy(how = How.CSS, using = "seeOptionsWebElement")
        public WebElement hoverOnSeeOptionsTab;
        @FindBy(how = How.CSS, using = "openNowWebElement")
        WebElement clickOnOpenNowTab;
        @FindBy(how = How.XPATH, using = "radioButtonWebElement")
        WebElement clickOnRadiobutton;
        @FindBy(how = How.CSS, using = "DynamicheckBoxWebElement")
        WebElement DynamicClickOnCheckBox;
        @FindBy(how = How.CSS, using = "DropButton")
        WebElement DropButtonWebElement;
        @FindBy(how = How.XPATH, using = "buttonWebelement")
        WebElement buttonElement;
        @FindBy(how = How.CSS, using = "clickelement")
        WebElement clickOnElement;
        @FindBy(how = How.CSS, using = "openCheckingAcElement")
        public static WebElement openCheckingAcWebElement;
        @FindBy(how=How.XPATH, using= "getMostFromYourCheckingCreditCardElement")
        public static WebElement getMostFromYourCheckingCreditCardWebElement;
        @FindBy(how=How.XPATH, using= "ourVideosCanHelpYouRunElement")
        public static WebElement ourVideosCanHelpYouRunWebElement;
        @FindBy(how=How.XPATH, using= "bestPracticesForProcessingPayrollElement")
        public static WebElement bestPracticesForProcessingPayrollWebElement;
        @FindBy(how=How.XPATH, using= "needFinancingFindTheRightSolutionElement")
        public static WebElement needFinancingFindTheRightSolutionWebElement;
        @FindBy(how=How.CSS, using= "meetBusinessAdvantage360Element")
        public static WebElement meetBusinessAdvantage360WebElement;
        @FindBy(how=How.XPATH, using= "signGoPaperLessElement")
        public static WebElement signGoPaperLessWebElement;
        @FindBy(how=How.ID, using= "onlineBankingServiceAgreementElement")
        public static WebElement onlineBankingServiceAgreementWebElement;
        @FindBy(id= "homeTabElement")
        WebElement homeTabWebElement;
        @FindBy (id= "mostPopularTabElement")
        WebElement mostPopularTabWebElement;
        @FindBy (id= "cashManagementTabElement")
        WebElement cashManagementTabWebElement;
        @FindBy (id= "bankingServicesTabElement")
        WebElement bankingServicesTabWebElement;
        @FindBy (id= "payrollServicesTabElement")
        WebElement payrollServicesTabWebElement;
        @FindBy (id= "resourcesTabElement")
        WebElement resourcesTabWebElement;
        @FindBy (id= "retirementTabElement")
        WebElement retirementTabWebElement;
        @FindBy (id= "creditTabElement")
        WebElement creditTabWebElement;
        @FindBy (id= "businessAdvantageRelationshipRewardTab")
        WebElement businessAdvantageRelationshipRewardTabWebElement;
        @FindBy (css= "businessCardBasicsElement")
        WebElement businessCardBasicsWebElement;
        @FindBy (id= "accountManagementElement")
        WebElement accountManagementWebElement;
        @FindBy (id= "CreditCardReward")
        WebElement creditCardRewards;



        public void UserHoverOnSeeOptionsTab() throws InterruptedException {
            Actions actions = new Actions(driver);
            actions.moveToElement(hoverOnSeeOptionsTab).perform();
            Thread.sleep(2000);
        }
        public void userclickOnOpenNowTab() {
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
            driver.navigate().to(payrollServicesUrl);
            return driver.getTitle();
        }
        public String payrollServicesPageTitle() {
            payrollServicesTabClick();
            return driver.getTitle();
        }
        //  Click on dropButton
        public void ClickOnDropButton() {
            String url = "https://promo.bankofamerica.com/hp-oaa2/";
            driver.get(url);
            DropButtonWebElement.click();
        }
        // Handeling Multiple Windows/Tabs
        public void switchWindow(int index) throws InterruptedException {
            driver.get(cignaUrl);
            driver.get(At_tUrl);
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
            buttonElement.click();
            Actions actions2 = new Actions(driver);
            actions2.moveToElement(clickOnElement).perform();
        }
        public String retirementExpectedPageTitle(String retirementUrl){
            driver.navigate().to(retirementUrl);
            return driver.getTitle();
        }

        public String onlineBankingServiceAgreementPageTitle() throws InterruptedException {
            onlineBankingServiceAgreementClick();
            handleNewTab(driver);
            Thread.sleep(8000);
            return driver.getTitle();
        }
        public String onlineBankingServiceAgreementActualTitle(String onlineBankingServiceAgreementUrl) throws InterruptedException {
            driver.navigate().to(onlineBankingServiceAgreementUrl);
            Thread.sleep(8000);
            return driver.getTitle();
        }

        public String signGoPaperLessPageTitle() {
            signGoPaperLessClick();
            return driver.getTitle();
        }


        public String signGoPaperLessActualTitle(String signInGoPaperlessUrl) {
            driver.navigate().to(signInGoPaperlessUrl);
            return driver.getTitle();
        }

        public String getMostFromYourCheckingCreditPageTitle() {
            getMostFromYourCheckingCreditClick();
            return driver.getTitle();
        }


        public String getMostFromYourCheckingCreditActualTitle(String getMostFromYourCheckingCreditCardAccountsUrl) {
            driver.navigate().to(getMostFromYourCheckingCreditCardAccountsUrl);
            return driver.getTitle();
        }

        public String meetBusinessAdvantage360PageTitle() {
            meetBusinessAdvantage360Click();
            return driver.getTitle();
        }


        public String meetBusinessAdvantage360ActualTitle(String meetBusinessAdvantage360Url) {
            driver.navigate().to(meetBusinessAdvantage360Url);
            return driver.getTitle();
        }

        public String needFinancingFindTheRightSolutionPageTitle() {
            needFinancingFindTheRightSolutionClick();
            return driver.getTitle();
        }


        public String needFinancingFindTheRightSolutionActualTitle(String needFinancingFindTheRightSolutionUrl) {
            driver.navigate().to(needFinancingFindTheRightSolutionUrl);
            return driver.getTitle();
        }

        public String bestPracticesForProcessingPayrollPageTitle() {
            bestPracticesForProcessingPayrollClick();
            return driver.getTitle();
        }


        public String bestPracticesForProcessingPayrollActualTitle(String bestPracticesForProcessingPayrollUrl) {
            driver.navigate().to(bestPracticesForProcessingPayrollUrl);
            return driver.getTitle();
        }

        public String ourVideosCanHelpYouRunPageTitle() {
            ourVideosCanHelpYouRunClick();
            return driver.getTitle();
        }


        public String ourVideosCanHelpYouRunActualTitle(String ourVideosCanHelpYouUrl) {
            driver.navigate().to(ourVideosCanHelpYouUrl);
            return driver.getTitle();
        }

        public void openCheckingClick() {
            openCheckingAcWebElement.click();
        }

        public void getMostFromYourCheckingCreditClick() {
 //           waitUntilVisible(By.xpath("//a[@id='bmhDefaultGetMostFromAccounts' and @class='slide-content ']"));
            getMostFromYourCheckingCreditCardWebElement.click();
        }

        public void ourVideosCanHelpYouRunClick() {
            ourVideosCanHelpYouRunWebElement.click();
        }

        public void bestPracticesForProcessingPayrollClick() {
            bestPracticesForProcessingPayrollWebElement.click();
        }

        public void needFinancingFindTheRightSolutionClick() {
            needFinancingFindTheRightSolutionWebElement.click();
        }

        public void meetBusinessAdvantage360Click() {
            meetBusinessAdvantage360WebElement.click();
        }

        public void signGoPaperLessClick() {
            signGoPaperLessWebElement.click();
        }

        public void onlineBankingServiceAgreementClick() {

            onlineBankingServiceAgreementWebElement.click();
        }



        public void homeTabClick(){
            homeTabWebElement.click();
        }
        public void mostPopularTabClick(){
            mostPopularTabWebElement.click();
        }
        public void cashManagementTabClick()
        {
            cashManagementTabWebElement.click();
        }
        public void bankingServicesTabClick(){
            bankingServicesTabWebElement.click();
        }
        public void payrollServicesTabClick(){
            payrollServicesTabWebElement.click();
        }

        public String resourcesExpectedPageTitle(String resourcesUrl){
            driver.navigate().to(resourcesUrl);
            return driver.getTitle();
        }
        public String resourcesPageTitle() {
            resourcesTabClick();
            return driver.getTitle();
        }

        public String bankingServicesExpectedPageTitle(String bankingServicesUrl){
            driver.navigate().to(bankingServicesUrl);
            return driver.getTitle();
        }
        public String bankingServicesPageTitle() {
            bankingServicesTabClick();
            return driver.getTitle();
        }

        public String cashManagementPageTitle(String cashManagementUrl){
            driver.navigate().to(cashManagementUrl);
            return driver.getTitle();
        }
        public String cashManagementPageTitle(){
            cashManagementTabClick();
            return driver.getTitle();
        }

        public String PopularExpectedPageTitle(String mostPopularVideoUrl){
            driver.navigate().to(mostPopularVideoUrl);
            return driver.getTitle();
        }
        public String mostPopularPageTitle() {
            mostPopularTabClick();
            return driver.getTitle();
        }
        public void resourcesTabClick(){
            resourcesTabWebElement.click();
        }
    }


























