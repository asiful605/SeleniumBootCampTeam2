package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {

    static at_tHomePage basicHomepage;
    public void getInitElements() {
        basicHomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }

    @Test(priority = 1)
    public void testhoveringOnMenuElement()  {
        getInitElements();
        basicHomepage.hoveringOnMenuElement();
    }
    @Test(priority = 2)
    public void testUserclickOnImageelement()  {
        getInitElements();
        basicHomepage.UserclickOnImageelement();
    }
    @Test(priority = 3)
    public void testUserhandleAlert() {
        getInitElements();
        basicHomepage.forHandleAlert();
    }
    @Test(priority = 4)
    public void testUserclickOnAccountTab() {
        getInitElements();
        basicHomepage.clickOnAccountTab();
    }
    @Test(priority = 5)
    public void testUseruserClickOndropButton() {
        getInitElements();
        basicHomepage.userClickOndropButton();
    }
    @Test(priority = 6)
    public void testclickondropButton() {
        getInitElements();
        basicHomepage.clickondropButton();
    }
    @Test(priority = 7)
    public void testuseuserIDElement(){
        getInitElements();
        basicHomepage.userIDElement();
    }
    @Test(priority = 8)
    public void testuserhoverOnHotelelement(){
        getInitElements();
       windowMaximize();
       basicHomepage. userhoverOnHotelelement();
    }
    @Test(priority = 9)
    public void testuservalidationtextElement(){
        getInitElements();
        windowMaximize();
    basicHomepage. uservalidationtextElement("Free returns, free activation, and waived upgrade fees make it easy to get a new smartphone.");

    }
    @Test(priority = 10)
    public void testuseruserclickonDropButton() {
        getInitElements();
        windowMaximize();
        basicHomepage.userclickonDropButton();
    }
}
