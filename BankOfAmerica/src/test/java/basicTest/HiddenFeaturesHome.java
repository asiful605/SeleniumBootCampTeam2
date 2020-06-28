package basicTest;

import basic.BOAHomeHiddenFeatures;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HiddenFeaturesHome extends WebAPI  {

    static BOAHomeHiddenFeatures bhf;
    public static void getInitElements() {
        bhf = PageFactory.initElements(driver, BOAHomeHiddenFeatures.class);
    }
    @Test
    public void testcheckingFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.checkingMenuIsDisplayed(), true);
    }
    @Test
    public void savingFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));

        //Assert.assertEquals(bhf.savingMenuIsDisplayed(), true);
    }
    @Test
    public void creditCardFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.CreditCardMenuIsDisplayed(), true);
    }
    @Test
    public void homeLoansFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.HomeLoanMenuIsDisplayed(), true);
    }
    @Test
    public void autoLoansFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.autoLoansMenuIsDisplayed(), true);
    }
    @Test
    public void investingFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.investingMenuIsDisplayed(), true);
    }
    @Test
    public void betterMoneyHabitsFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        Assert.assertEquals(bhf.betterMoneyHabitsMenuIsDisplayed(), true);
    }
    @Test
    public void smallBusinessTabFunctionality(String smallBusinessUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.smallBusinessPageTitle(smallBusinessUrl);
    }
    @Test
    public void wealthManagementTabFunctionality(String wealthManagementUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.wealthManagementPageTitle(wealthManagementUrl);
    }
    @Test
    public void businessNInstitutionTabFunctionality(String businessInstitutionUrl)  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.businessNInstitutionPageTitle(businessInstitutionUrl);
    }
    @Test
    public void securityTabFunctionality(String securityUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.securityPageTitle(securityUrl);
    }
    @Test
    public void aboutUsTabFunctionality(String aboutUsUrl)  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.aboutUsPageTitle(aboutUsUrl);
    }
    @Test
    public void EnEspañolTabFunctionality(String enEspanolUrl)  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.EnEspañolPageTitle(enEspanolUrl);
    }
    @Test
    public void contactUsTabFunctionality(String contactUsUrl) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.contactUsPageTitle(contactUsUrl);
    }
    @Test
    public void helpTabFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.helpTabPopUp();
    }
    @Test
    public void checkingFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.checkingClick();
    }
    @Test
    public void enEspanolClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.enEspanolClick();
    }
    @Test
    public void helpClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.helpClick();
    }
    @Test
    public void businessInstitutionClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.businessInstitutionClick();
    }
    @Test
    public void smallBusinessClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.contactUsClick();
    }
    @Test
    public void wealthManagementClickable(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        getInitElements();
        bhf.wealthManagementClick();
    }


}
