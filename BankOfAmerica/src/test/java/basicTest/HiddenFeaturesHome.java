package basicTest;

import basic.BOAHomeHiddenFeatures;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HiddenFeaturesHome extends WebAPI {

    static BOAHomeHiddenFeatures bhf;
    public static void getInitElements() {
        bhf = PageFactory.initElements(driver, BOAHomeHiddenFeatures.class);
    }
    @Test
    public void testcheckingFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.checkingMenuIsDisplayed(), true);
    }
    @Test
    public void savingFunctionality() {
        Assert.assertEquals(bhf.savingMenuIsDisplayed(), true);
    }
    @Test
    public void creditCardFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.CreditCardMenuIsDisplayed(), true);
    }
    @Test
    public void homeLoansFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.HomeLoanMenuIsDisplayed(), true);
    }
    @Test
    public void autoLoansFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.autoLoansMenuIsDisplayed(), true);
    }
    @Test
    public void investingFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.investingMenuIsDisplayed(), true);
    }
    @Test
    public void betterMoneyHabitsFunctionality() {
        getInitElements();
        Assert.assertEquals(bhf.betterMoneyHabitsMenuIsDisplayed(), true);
    }
    @Test
    public void smallBusinessTabFunctionality(String smallBusinessUrl){
        getInitElements();
        bhf.smallBusinessPageTitle(smallBusinessUrl);
    }
    @Test
    public void wealthManagementTabFunctionality(String wealthManagementUrl){
        getInitElements();
        bhf.wealthManagementPageTitle(wealthManagementUrl);
    }
    @Test
    public void businessNInstitutionTabFunctionality(String businessInstitutionUrl){
        getInitElements();
        bhf.businessNInstitutionPageTitle(businessInstitutionUrl);
    }
    @Test
    public void securityTabFunctionality(String securityUrl){
        getInitElements();
        bhf.securityPageTitle(securityUrl);
    }
    @Test
    public void aboutUsTabFunctionality(String aboutUsUrl){
        getInitElements();
        bhf.aboutUsPageTitle(aboutUsUrl);
    }
    @Test
    public void EnEspañolTabFunctionality(String enEspanolUrl){
        getInitElements();
        bhf.EnEspañolPageTitle(enEspanolUrl);
    }
    @Test
    public void contactUsTabFunctionality(String contactUsUrl){
        getInitElements();
        bhf.contactUsPageTitle(contactUsUrl);
    }
    @Test
    public void helpTabFunctionality() throws InterruptedException {
        getInitElements();
        bhf.helpTabPopUp();
    }
    @Test
    public void checkingFunctionality() {
        getInitElements();
        bhf.checkingClick();
    }
    @Test
    public void enEspanolClickable(){
        getInitElements();
        bhf.enEspanolClick();
    }
    @Test
    public void helpClickable(){
        getInitElements();
        bhf.helpClick();
    }
    @Test
    public void businessInstitutionClickable(){
        getInitElements();
        bhf.businessInstitutionClick();
    }
    @Test
    public void smallBusinessClickable(){
        getInitElements();
        bhf.smallBusinessClick();
    }
    @Test
    public void securityClickable(){
        getInitElements();
        bhf.securityClick();
    }
    @Test
    public void contactUsClickable(){
        getInitElements();
        bhf.contactUsClick();
    }
    @Test
    public void wealthManagementClickable(){
        getInitElements();
        bhf.wealthManagementClick();
    }
}
