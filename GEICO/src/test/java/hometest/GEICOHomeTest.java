package hometest;

import common.WebAPI;
import homepage.GEICOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class GEICOHomeTest extends WebAPI {

    static GEICOHomePage geicoHomePage;
    public static void getInitElements() {
        geicoHomePage = PageFactory.initElements(driver, GEICOHomePage.class);
    }

    @Test(priority = 1)
    public void testPopUpwindow()  {
        getInitElements();
        geicoHomePage.popUphandle();
    }
    @Test(priority = 2)
    public void testclickOnLogInButton() {
        getInitElements();
        geicoHomePage.clickOnLogInButton();
    }
    @Test(priority = 3)
    public void testScrollDownTheWebPage() {
        getInitElements();
        geicoHomePage.thescrollDownTheWebPage();
    }
    @Test(priority = 4)
    public void testclickOnAutoTab() {
        getInitElements();
        geicoHomePage.clickOnAutoTab();
    }
    @Test(priority = 5)
    public void testclickOncheckBoxTab()  {
        getInitElements();
        geicoHomePage.checkBoxTab();
    }
    @Test(priority = 6)
    public void testuserclickonboatWebelement() {
        getInitElements();
        geicoHomePage.userclickonboatWebelement();
    }
    @Test(priority = 7)
    public void testuservalidateboatWebelement() {
        getInitElements();
        geicoHomePage.validateboatWebelement();
    }
    @Test(priority = 4)
    public void testdropDownAutoTab(){
        getInitElements();
        geicoHomePage.dropDownAutoTab();
    }
    @Test(priority = 4)
    public void testuserloginTabelement(){
        getInitElements();
        geicoHomePage.userloginTabelement();
    }
}
