package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {
    //created vairable of at_thomepage
    static at_tHomePage mainhomepage;
    //webelement initialization

    //create page factory class ad driver and call the at_thomePage
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }

    //to count test case
    @Test(priority = 1)
    public void testusersearchbox() throws InterruptedException {
        getInitElements();
        mainhomepage.usersearchbox();
        Thread.sleep(5000);
    }
    @Test(priority = 2)
    public void testsearchclickbutton() throws InterruptedException {
        getInitElements();
        mainhomepage.usersearchbox();
        mainhomepage.searchclickbutton();
        Thread.sleep(3000);
    }
    @Test (priority = 3)
    public void testscrolldownwebpage() throws InterruptedException {
        getInitElements();
        mainhomepage.scrolldownwebpage();

    }
    @Test (priority = 4)
    public void testscrolltoend() throws InterruptedException {
        getInitElements();
        mainhomepage.scrolltoend();
    }

    @Test(priority = 5)
    public void testclickaccountlogin(){
        getInitElements();
        mainhomepage.clickaccountlogin();
    }

      @Test(priority = 6)
      public void testiphoneimage() throws InterruptedException {
        getInitElements();
          mainhomepage.clickoniphoneimage();
          Thread.sleep(3000);
    }
    @Test(priority = 7)// not working
    public void testpricingoption() throws InterruptedException {
          driver.get("https://www.att.com/buy/phones/apple-iphone-11-64gb-purple.html?offerid=13700004");
          getInitElements();
          mainhomepage.clickoniphoneimage();
          mainhomepage.selectpricingoption();
          Thread.sleep(3000);
    }
    @Test (priority = 8)
    public void supportClick() throws InterruptedException {
        getInitElements();
        mainhomepage.clickSupport();
        Thread.sleep(2000);
    }
    @Test (priority = 9)
    public void shopAllOffers() throws InterruptedException {
        getInitElements();
        mainhomepage.shopAllOfferClick();
    }
    @Test(priority = 10)
    public void enterAddress() throws InterruptedException {
        getInitElements();
        mainhomepage.enteradressfield();
    }
    @Test(priority = 11)
    public void checksubmitdeals() throws InterruptedException {
        getInitElements();
        mainhomepage.aaddresscheckbox();
    }







}
