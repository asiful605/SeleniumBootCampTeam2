package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static webelements.CignaWebElements.*;

public class CignaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = cignaInternationalWebElement) public WebElement cignaInternational;
    @FindBy(how = How.XPATH, using = individualPlanWebElement) public WebElement individualPlan;
    @FindBy(how = How.XPATH, using = silverWebElement) public WebElement silver;
    @FindBy(how = How.XPATH, using = headerWebElements) public List<WebElement> header;
    @FindBy(how = How.LINK_TEXT, using = individualFamilyWebElement) public WebElement individualFamily;
    @FindBy(how = How.LINK_TEXT, using = healthInsuranceWebElement) public WebElement healthInsurance;
    @FindBy(how = How.LINK_TEXT, using = customerServiceWebElement) public WebElement customerService;
    @FindBy(how = How.XPATH, using = healthCareProviderWebElement) public WebElement healthCareProvider;
    @FindBy(how = How.XPATH, using = credentialWebElement) public WebElement credential;
    @FindBy(how = How.XPATH, using = medicalCredentialWebElement) public WebElement medicalCredential;
    @FindBy(how = How.XPATH, using = BrokersAndEmployersWebElement) public WebElement brokerAndEmployers;
    @FindBy(how = How.XPATH, using = whyCignaWebElement) public WebElement whyCigna;
    @FindBy(how = How.LINK_TEXT, using = costImprovementWebElement) public WebElement costAndImprovement;
    @FindBy(how = How.XPATH, using = companyNamesWebElement) public WebElement companyNames;
    @FindBy(how = How.LINK_TEXT, using = memberSourcesWebElement) public WebElement memberResources;
    @FindBy(how = How.LINK_TEXT, using = mobileAppsWebElement) public WebElement mobileApps;
    @FindBy(how = How.XPATH, using = pharmacyWebElement) public WebElement pharmacy;
    @FindBy(how = How.XPATH, using = drugListWebElement) public WebElement drugList;
    @FindBy(how = How.LINK_TEXT, using = LogInWebElement) public WebElement logIn;
    @FindBy(how = How.XPATH, using = userNameWebElement) public WebElement userName;
    @FindBy(how = How.XPATH, using = passwordWebElement) public WebElement password;
    @FindBy(how = How.CSS, using = logInButtonWebElement) public WebElement logInButton;
    @FindBy(how = How.LINK_TEXT, using = findFormsWebElement) public WebElement findForm;
    @FindBy(how = How.XPATH, using = dentalFormWebElement) public WebElement dentalForm;
    @FindBy(how = How.XPATH, using = glossaryWebElement) public WebElement glossary;
    @FindBy(how = How.XPATH, using = categoryWebElement) public WebElement category;
    @FindBy(how = How.XPATH, using = radioButtonWebElement) public WebElement radioButton;
    @FindBy(how = How.XPATH, using = healthWellnessWebElement) public WebElement healthWellness;
    @FindBy(how = How.XPATH, using = autismInfoWebElement) public WebElement autism;
    @FindBy(how = How.XPATH, using = coverageAndClaimWebElement) public WebElement coverageAndClaim;
    @FindBy(how = How.LINK_TEXT, using = referralsWebElement) public WebElement referrals;
    @FindBy(how = How.XPATH, using = aboutUsWebElement) public WebElement aboutUs;
    @FindBy(how = How.XPATH, using = newsRoomWebElement) public WebElement newsRoom;
    @FindBy(how = How.XPATH, using = newsAndViewsWebElement) public WebElement newsAndViews;

    public void clickCignaInternational() { cignaInternational.click(); }
    public void clickIndividualPlan() { individualPlan.click(); }
    public void clickSliver() { silver.click(); }
    public List<WebElement> getHeader() {
        List<WebElement> headerName = header;
        for (WebElement head : header) {
            System.out.println(head.getText());
        }
        return headerName;
    }
    public void individualFamilyPlan() {
        individualFamily.click();
    }
    public void healthInsurancePlan() {
        healthInsurance.click();
    }
    public void customerService() {
        customerService.click();
    }
    public void healthCareProvider() {
        healthCareProvider.click();
    }
    public void getCredential() {
        credential.click();
    }
    public void getMedicalCredential() {
        medicalCredential.click();
    }
    public void goToEmployerAndBroker() {
        brokerAndEmployers.click();
    }
    public void whyCigna() {
        whyCigna.click();
    }
    public void goToCostAndImprovement() {
        costAndImprovement.click();
    }
    public void getCompanyNames() {
        companyNames.click();
    }
    public void clickMemberResources() {
        memberResources.click();
    }
    public void clickMobileApps() {
        mobileApps.click();
    }
    public void clickPharmacy() {
        pharmacy.click();
    }
    public void clickDrugList() { drugList.click(); }
    public void clickLogIn() {
        WebElement element = logIn;
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", element);
    }
    public void enterUseName() { userName.sendKeys("testing1"); }
    public void enterPassword() {
        password.sendKeys("12345");
    }
    public void clickLogInButton() {
        logInButton.click();
    }
    public void goToFindForm() {
        findForm.click();
    }
    public void clickDentalForm() {
        dentalForm.click();
    }
    public void selectGlossary() { glossary.click();}
    public void clickCategory() { category.click();}
    public void checkRadioButton() { radioButton.click();}
    public void selectHealthWellness() {healthWellness.click();}
    public void clickAutism() {autism.click();}
    public void selectCoverageAndClaim() {coverageAndClaim.click();}
    public void clickReferrals() {referrals.click();}
    public void selectAboutUS() {aboutUs.click();}
    public void clickNewsRoom() {newsRoom.click();}
    public void selectNewsAndViews() {newsAndViews.click();}

    public void exploreInternationalOption()  {
        clickCignaInternational();
        clickIndividualPlan();
        clickSliver();
    }
    public void validateSearch1() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "International Medical Insurance Plans for Individuals | Cigna", "title not displayed");
    }
    public void readHeader() {
        getHeader();
    }
    public void validateHeader() {
        boolean actualResult = true;
        Assert.assertEquals(true, true);
    }
    public void getInsurancePlanInfo()  {
        individualFamilyPlan();
        healthInsurancePlan();
        customerService();
    }
    public void validateSearch2() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Contact Us | Customer Service | Cigna");
    }
    public void medicalCredential()  {
        healthCareProvider();;
        getCredential();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
        getMedicalCredential();
    }
    public void validateSearch3() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Cigna Medical Network Credentialing | Cigna");
    }
    public void searchCompanyNames() {
        goToEmployerAndBroker();
        whyCigna();
        goToCostAndImprovement();
        getCompanyNames();
    }
    public void validateSearch4() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Cigna Company Names and Other Disclosures");
    }
    public void exploreMemberResources() {
        clickMemberResources();
        clickMobileApps();
    }
    public void validateSearch5() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Manage Your Health with Cigna Mobile Apps | Cigna");
    }
    public void pharmacyOption() {
        healthCareProvider();
        clickPharmacy();
        clickDrugList();
        driver.navigate().back();
    }
    public void validateSearch6() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Health Care Providers | Cigna");
    }
    public void tryToLogIn(){
        clickLogIn();
        handleWindow();
        enterUseName();
        enterPassword();
        clickLogInButton();
        Boolean  verifyTitle = driver.getTitle().equalsIgnoreCase("successfully login");
        Assert.assertFalse(verifyTitle);
    }
    public void searchForms() {
        goToFindForm();
        clickDentalForm();
    }
    public void validateSearch8() {
        String actualResult = driver.getTitle();
        Assert.assertEquals(actualResult, "Health Insurance & Medical Forms for Customers | Cigna");
    }
    public void mouseHover() {
        Actions action = new Actions(driver);
        WebElement header1 = individualFamily;
        action.moveToElement(header1).build().perform();
        WebElement header2 = brokerAndEmployers;
        action.moveToElement(header2).build().perform();
        WebElement header3 = healthCareProvider;
        action.moveToElement(header3).build().perform();
        header3.click();
    }
    public void exploreGlossary() {
        selectGlossary();
        mouseHoverByXpath("//a[@id='category-tab']");
        clickCategory();
        checkRadioButton();
    }
    public void validateSearch9() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.cigna.com/glossary#category_3");
    }
    public void getAutismINfo() {
        selectHealthWellness();
        mouseHoverByXpath("//div[@id='featured-topic-ABC']//div[1]//a[1]");
       clickAutism();
    }
    public void validateSearch10() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.cigna.com/individuals-families/health-wellness/topic-autism/");
    }
   public void printBrokenLinks(){
        findBrokenLink();}
    public void getReferralsInfo() {
        healthCareProvider();
        selectCoverageAndClaim();
        clickReferrals();
    }
    public void validateSearch11() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.cigna.com/health-care-providers/coverage-and-claims/referrals/");
    }
    public void cignaInTheNews() {
        selectAboutUS();
        clickNewsRoom();
        selectNewsAndViews();
    }
    public void validateSearch12() {
        String actualResult = driver.getCurrentUrl();
        Assert.assertEquals(actualResult, "https://www.cigna.com/about-us/newsroom/news-and-views/");
    }





}













