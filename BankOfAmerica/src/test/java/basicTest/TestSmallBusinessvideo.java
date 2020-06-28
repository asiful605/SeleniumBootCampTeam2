package basicTest;
import basic.SmallBusinessVideo;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestSmallBusinessvideo extends WebAPI {

        static SmallBusinessVideo  sbh;// Reference variable/object of CignaHomePage
        public static void getInitElements() {
            sbh = PageFactory.initElements(driver, SmallBusinessVideo.class);
        }
        @BeforeMethod
        public void navigate() {
            driver.get("https://promo.bankofamerica.com/small-business-videos/");
        }
        @Test //(enabled = false)
        //Checks if the 'business Advantage Rewards' tab takes the user to the expected page.
        public void businessAdvantageRelationshipRewardsPageAssertionCheck(String businessAdvantageRewardsUrl){
            getInitElements();
            Assert.assertEquals(sbh.businessAdvantageRelationshipRewardsPageTitle(), sbh.businessAdvantageRelationshipRewardsExpectedPageTitle(businessAdvantageRewardsUrl));
        }

        @Test //(enabled = false)
        //Checks if the 'banking Services' tab takes the user to the expected page.
        public void retirementPageAssertionCheck(String retirementUrl){
            getInitElements();
            Assert.assertEquals(sbh.retirementPageTitle(), sbh.retirementExpectedPageTitle(retirementUrl));
        }

        @Test //(enabled = false)
        //Checks if the 'banking Services' tab takes the user to the expected page.
        public void resourcesPageAssertionCheck(String resourcesUrl){
            getInitElements();
            Assert.assertEquals(sbh.resourcesPageTitle(), sbh.resourcesExpectedPageTitle(resourcesUrl));
        }

        @Test //(enabled = false)
        //Checks if the 'cash management' tab takes the user to the expected page.
        public void cashManagementPageAssertionCheck(String cashManagementUrl){
            getInitElements();
            Assert.assertEquals(sbh.cashManagementPageTitle(), sbh.cashManagementExpectedPageTitle(cashManagementUrl));
        }

        @Test //(enabled = false)
        //Checks if the 'Most Popular Video' tab takes the user to the expected page.
        public void mostPopularPageAssertionCheck(String mostPopularVideoUrl){
            getInitElements();
            Assert.assertEquals(sbh.mostPopularPageTitle(), sbh.mostPopularExpectedPageTitle(mostPopularVideoUrl));
        }

        @Test //(enabled = false)
        //Checks the 'payroll Services' page title
        public void retirementTitleCheck() {
            getInitElements();
            sbh.retirementPageTitle();
        }
        @Test //(enabled = false)
        //Checks the 'payroll Services' page title
        public void resourcesPageTitleCheck() {
            getInitElements();
            sbh.resourcesPageTitle();
        }
        @Test //(enabled = false)
        //Checks the 'payroll Services' page title
        public void payrollServicesPageTitleCheck() {
            getInitElements();
            sbh.payrollServicesPageTitle();
        }
        @Test //(enabled = false)
        //Checks the 'Most popular Tab' page title
        public void bankingServicesPageTitleCheck() {
            getInitElements();
            sbh.bankingServicesPageTitle();
        }

        @Test //(enabled = false)
        //Checks the 'Most popular Tab' page title
        public void cashManagementPageTitleCheck() {
            getInitElements();
            sbh.cashManagementPageTitle();
        }
        @Test //(enabled = false)
        //Checks the 'Most popular Tab' page title
        public void mostPopularPageTitleCheck() {
            getInitElements();
            sbh.mostPopularPageTitle();
        }

        @Test //(enabled = false)
        //Checks if the 'Most popular Tab' on the right is clickable
        public void mostPopularTabClickFunctionality() {
            getInitElements();
            sbh.mostPopularTabClick();
        }

        @Test //(enabled = false)
        //Checks if the 'cash Management Tab' on the right is clickable
        public void cashManagementTabClickFunctionality() {
            getInitElements();
            sbh.cashManagementTabClick();
        }

        @Test //(enabled = false)
        //Checks if the 'payroll Services Tab' on the right is clickable
        public void payrollServicesTabClickFunctionality() {
            getInitElements();
            sbh.payrollServicesTabClick();
        }

        @Test //(enabled = false)
        //Checks if the 'banking Services Tab' on the right is clickable
        public void bankingServicesTabClickFunctionality() {
            getInitElements();
            sbh.bankingServicesTabClick();
        }

        @Test //(enabled = false)
        //Checks if the 'resources Tab' on the right is clickable
        public void resourcesTabClickFunctionality() {
            getInitElements();
            sbh.resourcesTabClick();
        }
        @Test //(enabled = false)
        //Checks if the 'retirement' on the right is clickable
        public void retirementTabClickFunctionality() {
            getInitElements();
            sbh.retirementTabClick();
        }
        @Test //(enabled = false)
        //Checks if the 'Credit' on the right is clickable
        public void creditTabClickFunctionality() {
            getInitElements();
            sbh.creditTabClick();
        }
        @Test// (enabled = false)
        //Checks if the 'business Advantage Relationship Reward' on the right is clickable
        public void businessAdvantageRelationshipRewardTabClickFunctionality() {
            getInitElements();
            sbh.businessAdvantageRelationshipRewardTabClick();
        }
        @Test //(enabled = false)
        //Checks if the 'Home Tab' on the right is clickable
        public void homeTabClickFunctionality() {
            getInitElements();
            sbh.homeTabClick();
        }



















    }








