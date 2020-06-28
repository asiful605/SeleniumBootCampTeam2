package basicTest;


import basic.BasicHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.util.concurrent.TimeUnit;

public class BasicHomePageTest extends WebAPI {
    static BasicHomePage basicHomePage;
    public static void getInitElements() {
        basicHomePage = PageFactory.initElements(driver, BasicHomePage.class);
    }
    @Test
    public void ClickOnFunctionality() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.ourVideosCanHelpYouRunClick();
    }
    @Test
    public void TestUserHoverOnSeeOptionsTab()  {
        getInitElements();
        basicHomePage.UserHoverOnSeeOptionsTab();
    }
    @Test
    public void testUserclickOnOpenNowTab() {
        getInitElements();
        basicHomePage.userclickOnOpenNowTab();
    }
    @Test
    public void testuserclickOnRadiobutton() {
        getInitElements();
        basicHomePage.userclickOnRadiobutton();
    }
    @Test
    public void testUsercanClickOnDynamicCheckBox() {
        getInitElements();
        basicHomePage.UsercanClickOnDynamicCheckBox();
    }
    @Test
    public void cashManagementCheck() {
        getInitElements();
        basicHomePage .cashManagementPageTitle();
    }
    @Test
    public void mostPopularCheck() {
        getInitElements();
        basicHomePage .mostPopularPageTitle();
    }
    @Test
    public void mostPopularTabClick() {
        getInitElements();
        basicHomePage .mostPopularTabClick();
    }
    @Test
    public void onlineBankingServiceAgreementPageTitleFunctionality() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        BasicHomePage basicHomePage=PageFactory.initElements(driver,  BasicHomePage.class);
        basicHomePage.onlineBankingServiceAgreementPageTitle();
    }
    @Test
    public void testUserClickOnDropButton() {
        getInitElements();
        basicHomePage.ClickOnDropButton();
    }
    @Test
    public void testUserCanSwitchWindow() throws InterruptedException {
        getInitElements();
        basicHomePage.switchWindow(1);
    }
    @Test(priority = 10)
    public void testUserclickOnButton() {
        getInitElements();
        basicHomePage.clickOnButton();
    }
    @Test
    public void navigate() {
        driver.get("https://www.bankofamerica.com/smallbusiness/");
    }
    @Test
    public void signGoPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
       getInitElements();
        basicHomePage.signGoPaperLessPageTitle();
    }
    @Test
    public void CheckingCreditPageTitle() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.getMostFromYourCheckingCreditPageTitle();
    }
    @Test
    public void BusinessAdvantage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.meetBusinessAdvantage360PageTitle();
    }
    @Test
    public void needFinancing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.needFinancingFindTheRightSolutionPageTitle();
    }
    @Test
    public void bestPracticesForProcessing() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.bestPracticesForProcessingPayrollPageTitle();
    }
    @Test
    public void ourVideosCanHelpYouRunPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.ourVideosCanHelpYouRunPageTitle();
    }
    @Test
    public void onlineBankingService() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.onlineBankingServiceAgreementClick();
    }
    @Test
    public void signGoPaperLessClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.signGoPaperLessClick();
    }
    @Test
    public void ProcessingPayrollClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.bestPracticesForProcessingPayrollClick();
    }
    @Test
    public void ClickONFunctionalityTab() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.ourVideosCanHelpYouRunClick();
    }
    @Test
    public void AccountClick() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        basicHomePage.openCheckingClick();
    }
    @Test
    public void PageAssertionCheck(String resourcesUrl){
        getInitElements();
        Assert.assertEquals(basicHomePage .resourcesPageTitle(), basicHomePage .resourcesExpectedPageTitle(resourcesUrl));
    }
    @Test
    public void navigateurl() {
        driver.get("https://www.bankofamerica.com/smallbusiness/");
    }
    @Test
    public void clickOnButton() {
        getInitElements();
        basicHomePage.clickOnButton();
    }

}

