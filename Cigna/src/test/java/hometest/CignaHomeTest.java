package hometest;

import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class CignaHomeTest extends WebAPI {


    static CignaHomePage cignaHomePage;
    public static void getInitElements() {
        cignaHomePage = PageFactory.initElements(driver,CignaHomePage.class);
    }

    @Test(priority=1,enabled=true)
    public void testExploreInternationalOption() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.exploreInternationalOption();
        cignaHomePage.validateSearch1();
    }
    @Test(priority=2,enabled=true)
    public void testReadHeader() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.readHeader();
        cignaHomePage.validateHeader();
    }
    @Test(priority=3,enabled=true)
    public void testGetInsurancePlanInfo(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.getInsurancePlanInfo();
        cignaHomePage.validateSearch2();
    }
    @Test(priority=4,enabled=true)
    public void testMedicalCredential() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.medicalCredential();
        cignaHomePage.validateSearch3();
    }
    @Test(priority=5,enabled=true)
    public void testSearchCompanyNames() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.searchCompanyNames();
        cignaHomePage.validateSearch4();
    }
    @Test(priority=6,enabled=true)
    public void testExploreMembersResources() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.exploreMemberResources();
        cignaHomePage.validateSearch5();
    }
    @Test(priority=7,enabled=true)
    public void testPharmacyOption() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.pharmacyOption();
        cignaHomePage.validateSearch6();
    }
    @Test(priority=8,enabled=true)
    public void testTryToLogin()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.tryToLogIn();
        //cignaHomePage.validateSearch7();
    }
    @Test(priority=9,enabled=true)
    public void testSearchForms()  {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
       }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.searchForms();
        cignaHomePage.validateSearch8();
    }
    @Test(priority=10,enabled = true)
    public void testMouseHover() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.mouseHover();

    }
    @Test(priority=11,enabled = true)
    public void testExploreGlossary() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.exploreGlossary();
        cignaHomePage.validateSearch9();
    }
    @Test(priority=12,enabled =true)
    public void testGetAutismInfo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.getAutismINfo();
        cignaHomePage.validateSearch10();
    }
    @Test(priority=13,enabled = true)
    public void testPrintBrokenLinks() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.printBrokenLinks();
    }
    @Test(priority=14,enabled = true)
    public void testGetReferralsInfo() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.getReferralsInfo();
        cignaHomePage.validateSearch11();
    }
    @Test(priority=15,enabled = true)
    public void testCignaInTheNews() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        cignaHomePage.cignaInTheNews();
        cignaHomePage.validateSearch12();
    }







}
