package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {

    static at_tHomePage att;
    public static void getInitElements() {
        att = PageFactory.initElements(driver, at_tHomePage.class);
    }


    @Test (priority=1)
   public void testHoverOnBusiness()  {
        getInitElements();
        att.hoverOnBusiness();
   }

   @Test (priority=2)
    public void testDropDown(){
        getInitElements();
        att.userDropDown();
   }
   @Test (priority=3)
    public void testDealsButton(){
        getInitElements();
        att.userDealsButton();
   }
    @Test (priority=4)
    public void testWirelessButton(){
        getInitElements();
        att.userWirelessButton();
    }
    @Test (priority=5)
    public void testInternetButton(){
        getInitElements();
        att.userInternetButton();
    }
    @Test (priority=6)
    public void testBundlesButton(){
        getInitElements();
        att.userBundlesButton();
    }


}
