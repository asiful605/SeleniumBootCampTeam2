package basic;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webElements.WebElementsForBoA.seeOptionsWebElement;
import static webElements.WebelementsForSmallBusinessVideo.*;

public class SmallBusinessVideo extends WebAPI {

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
    @FindBy(how = How.CSS, using =inputbox)
    public WebElement inputboxElement;
    @FindBy(how = How.CSS, using = inputSearchbox)
    public WebElement inputSearchboxWebelement;
    @FindBy(how = How.CSS, using = buttonelement)
    public WebElement buttonelementWebelement;
    @FindBy(how = How.CSS, using =checkingtab)
    public WebElement checkingtabelement;
    public String businessAdvantageRelationshipRewardsExpectedPageTitle(String businessAdvantageRewardsUrl){
       navigateTo(businessAdvantageRewardsUrl);
        return driver.getTitle();
    }
    public String businessAdvantageRelationshipRewardsPageTitle() {
        businessAdvantageRelationshipRewardTabClick();
        return driver.getTitle();
    }
    public String retirementExpectedPageTitle(String retirementUrl){
        navigateTo(retirementUrl);
        return driver.getTitle();
    }
    public String retirementPageTitle() {
        retirementTabClick();
        return driver.getTitle();
    }
    public String resourcesExpectedPageTitle(String resourcesUrl){
        navigateTo(resourcesUrl);
        return driver.getTitle();
    }
    public String resourcesPageTitle() {
        resourcesTabClick();
        return driver.getTitle();
    }
    public String payrollServicesExpectedPageTitle(String payrollServicesUrl){
        navigateTo(payrollServicesUrl);
        return driver.getTitle();
    }
    public String payrollServicesPageTitle() {
        payrollServicesTabClick();
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
    public String cashManagementExpectedPageTitle(String cashManagementUrl){
        navigateTo(cashManagementUrl);
        return driver.getTitle();
    }
    public String cashManagementPageTitle(){
        cashManagementTabClick();
        return driver.getTitle();
    }
    public String mostPopularExpectedPageTitle(String mostPopularVideoUrl){
        navigateTo(mostPopularVideoUrl);
        return driver.getTitle();
    }
    public String mostPopularPageTitle() {
        mostPopularTabClick();
        return driver.getTitle();
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
    public void resourcesTabClick(){
        clickByID(resourcesTabElement);
    }
    public void retirementTabClick(){
        clickByID(retirementTabElement);
    }
    public void creditTabClick(){
        clickByID(creditTabElement);
    }
    public void businessAdvantageRelationshipRewardTabClick(){
        clickByID(businessAdvantageRelationshipRewardTab);
        businessAdvantageRelationshipRewardTabWebElement.click(); }
    public void businessCardBasicsTabClick(){
        businessCardBasicsWebElement.click();
    }
    public void accountManagementTabClick(){
        accountManagementWebElement.click();
    }
    public void creditCardRewardsTabClick(){
        creditCardRewards.click();
    }
    public void userinputboxElement(){
        inputboxElement .click();
    }
    public void userinputSearchboxWebelement(){
        inputSearchboxWebelement.sendKeys("help");
    }
    public void userbuttonelementWebelement(){
        buttonelementWebelement .click();
    }
    public void usercheckingtabelement(){
          windowMaximize();
         checkingtabelement .click();
    }
}
