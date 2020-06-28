package basicTest;

import basic.BOAHomeHiddenFeatures;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

    public class HiddenFeaturesHome extends WebAPI {

        static BOAHomeHiddenFeatures bhf;// Reference variable/object of CignaHomePage
        public static void getInitElements() {
            bhf = PageFactory.initElements(driver, BOAHomeHiddenFeatures.class);
        }
        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the checking tab.
        public void testcheckingFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.checkingMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the saving tab.
        public void savingFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));

            Assert.assertEquals(bhf.savingMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the Credit Card tab.
        public void creditCardFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.CreditCardMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the Home Loans tab.
        public void homeLoansFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.HomeLoanMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the Auto Loans tab.
        public void autoLoansFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.autoLoansMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the Investing Loans tab.
        public void investingFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.investingMenuIsDisplayed(), true);
        }

        @Test//(enabled=false)
        //checks if the hidden menu appears on clicking the Better Money Habits tab.
        public void betterMoneyHabitsFunctionality() {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
            }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            Assert.assertEquals(bhf.betterMoneyHabitsMenuIsDisplayed(), true);
        }



        @Test//( enabled=false )
//This test checks weather the 'Small Business' element takes the user to the small business page
        public void smallBusinessTabFunctionality(String smallBusinessUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.smallBusinessPageTitle(smallBusinessUrl);
        }


        @Test //( enabled=false )
//This test checks weather the 'Wealth Management' element takes the user to the wealth management page
        public void wealthManagementTabFunctionality(String wealthManagementUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.wealthManagementPageTitle(wealthManagementUrl);
        }

        @Test// ( enabled=false )
//This test checks weather the 'Business and Institution' element takes the user to the business and institution page
        public void businessNInstitutionTabFunctionality(String businessInstitutionUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.businessNInstitutionPageTitle(businessInstitutionUrl);
        }

        @Test //( enabled=false )
//This test checks weather the 'Security' element takes the user to the security page
        public void securityTabFunctionality(String securityUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.securityPageTitle(securityUrl);
        }

        @Test //( enabled=false )
        //This test checks weather the 'About Us' element takes the user to the about us page
        public void aboutUsTabFunctionality(String aboutUsUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.aboutUsPageTitle(aboutUsUrl);
        }

        @Test //( enabled=false )
        //This test checks weather the 'En español' element takes the user to the spanish page
        public void EnEspañolTabFunctionality(String enEspanolUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.EnEspañolPageTitle(enEspanolUrl);
        }

        @Test //( enabled=false )
        //This test checks weather the 'Contact Us' element takes the user to the contact us page
        public void contactUsTabFunctionality(String contactUsUrl) throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.contactUsPageTitle(contactUsUrl);
        }
        @Test //( enabled=false )
        //Checks if the pop-up window for state selection appears on clicking the help element
        public void helpTabFunctionality() throws InterruptedException {
            TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            getInitElements();
            bhf.helpTabPopUp();
        }
        @Test //( enabled=false )
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
