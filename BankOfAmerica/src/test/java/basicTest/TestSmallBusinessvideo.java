package basicTest;

import basic.BOAHomeHiddenFeatures;
import basic.SmallBusinessVideo;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSmallBusinessvideo extends WebAPI {

    static SmallBusinessVideo  sbh;
    public static void getInitElements() {
        sbh = PageFactory.initElements(driver, SmallBusinessVideo.class);
    }
    @BeforeMethod
    public void navigate() {
        driver.get("https://promo.bankofamerica.com/small-business-videos/");
    }
    @Test
    public void businessAdvantageRelationshipRewardsPageAssertionCheck(String businessAdvantageRewardsUrl){
       getInitElements();
        Assert.assertEquals(sbh.businessAdvantageRelationshipRewardsPageTitle(), sbh.businessAdvantageRelationshipRewardsExpectedPageTitle(businessAdvantageRewardsUrl));
    }
    @Test
    public void retirementPageAssertionCheck(String retirementUrl){
        getInitElements();
        Assert.assertEquals(sbh.retirementPageTitle(), sbh.retirementExpectedPageTitle(retirementUrl));
    }
    @Test
    public void resourcesPageAssertionCheck(String resourcesUrl){
        getInitElements();
        Assert.assertEquals(sbh.resourcesPageTitle(), sbh.resourcesExpectedPageTitle(resourcesUrl));
    }
    @Test
    public void cashManagementPageAssertionCheck(String cashManagementUrl){
        getInitElements();
        Assert.assertEquals(sbh.cashManagementPageTitle(), sbh.cashManagementExpectedPageTitle(cashManagementUrl));
    }
    @Test
    public void mostPopularPageAssertionCheck(String mostPopularVideoUrl){
        getInitElements();
        Assert.assertEquals(sbh.mostPopularPageTitle(), sbh.mostPopularExpectedPageTitle(mostPopularVideoUrl));
    }
    @Test
    public void retirementTitleCheck() {
        getInitElements();
        sbh.retirementPageTitle();
    }
    @Test
    public void resourcesPageTitleCheck() {
        getInitElements();
        sbh.resourcesPageTitle();
    }
    @Test
    public void payrollServicesPageTitleCheck() {
        getInitElements();
        sbh.payrollServicesPageTitle();
    }
    @Test
    public void bankingServicesPageTitleCheck() {
        getInitElements();
        sbh.bankingServicesPageTitle();
    }
    @Test
    public void cashManagementPageTitleCheck() {
        getInitElements();
        sbh.cashManagementPageTitle();
    }
    @Test
    public void mostPopularPageTitleCheck() {
        getInitElements();
        sbh.mostPopularPageTitle();
    }
    @Test
    public void mostPopularTabClickFunctionality() {
        getInitElements();
        sbh.mostPopularTabClick();
    }
    @Test
    public void cashManagementTabClickFunctionality() {
        getInitElements();
        sbh.cashManagementTabClick();
    }
    @Test
    public void payrollServicesTabClickFunctionality() {
        getInitElements();
        sbh.payrollServicesTabClick();
    }
    @Test
    public void bankingServicesTabClickFunctionality() {
        getInitElements();
        sbh.bankingServicesTabClick();
    }
    @Test
    public void resourcesTabClickFunctionality() {
        getInitElements();
        sbh.resourcesTabClick();
    }
    @Test
    public void retirementTabClickFunctionality() {
        getInitElements();
        sbh.retirementTabClick();
    }
    @Test
    public void creditTabClickFunctionality() {
        getInitElements();
        sbh.creditTabClick();
    }
    @Test
    public void businessAdvantageRelationshipRewardTabClickFunctionality() {
        getInitElements();
        sbh.businessAdvantageRelationshipRewardTabClick();
    }
    @Test
    public void homeTabClickFunctionality() {
        getInitElements();
        sbh.homeTabClick();
    }
}
