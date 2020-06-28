package hometest;


import common.WebAPI;
import homepage.HBOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class HBOHomePageTest extends WebAPI {



    static HBOHomePage hboHomePage;

    public static void getInitElements() {
        hboHomePage = PageFactory.initElements(driver,HBOHomePage.class);
    }
    @Test(priority=1,enabled = true)
    public void testSignInToHBO(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
       hboHomePage.signInToHBO();
    }
    @Test(priority=2,enabled = true)
    public void testReadHeader(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.readHeader();
    }
    @Test(priority=3,enabled =true)
    public void testDocumentariesPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.documentariesPage();
        hboHomePage.validateDocPage();
    }
    @Test(priority=4,enabled = true)
    public void testAllSeries(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.allSeriesPage();
        hboHomePage.validateAllSeriesPage();
    }
    @Test(priority=5,enabled = true)
    public void testAllSpecialsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
       hboHomePage.allSpecialsPage();
       hboHomePage.validateAllSpecialsPage();
    }
    @Test(priority=6,enabled = true)
    public void testKidsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
       hboHomePage.kidsPage();
       hboHomePage.validateKidsPage();
    }
    @Test(priority=7,enabled = true)
    public void testAllSportsPage(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.sportsPage();
        hboHomePage.validateSportsPage();
    }
    @Test(priority=8,enabled = true)
    public void testReadFooter(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.readFooter();
    }
    @Test(priority=9,enabled = true)
    public void testValidateAboutTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.validateAboutTab();
    }
    @Test(priority=9,enabled = true)
    public void testCheckFB(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        hboHomePage.checkFB();
        hboHomePage.validateFbTab();
    }

}
