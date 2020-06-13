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



    // to count test case
    @Test(priority = 1)
    public void testusersearchbox() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.usersearchbox();
        Thread.sleep(5000);
    }
//
    @Test(priority = 2)
    public void testsearchclickbutton() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.usersearchbox();
        mainhomepage.searchclickbutton();
        Thread.sleep(3000);
    }
//
      @Test (priority = 3)
      public void testscroll() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolldownwebpage();
        Thread.sleep(5000);
    }
      @Test (priority = 4)
      public void testscrolltoend() throws InterruptedException {
        driver.get("https://www.att.com/");
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolltoend();
    }
//
      @Test(priority = 5)
      public void testclickaccountlogin(){
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.clickaccountlogin();
    }

      @Test(priority = 6)
      public void testiphoneimage() throws InterruptedException {
          driver.manage().window().maximize();
          getInitElements();
          mainhomepage.clickoniphoneimage();
          Thread.sleep(3000);

      }

      @Test(priority = 7)// not working
      public void testpricingoption() throws InterruptedException {
          driver.get("https://www.att.com/buy/phones/apple-iphone-11-64gb-purple.html?offerid=13700004");
          driver.manage().window().maximize();
          getInitElements();
//          mainhomepage.clickoniphoneimage();
          mainhomepage.selectpricingoption();
          Thread.sleep(3000);

     }
     @Test(priority = 8)
     public void testhoveringOnMenuElement() throws InterruptedException {
     getInitElements();
     mainhomepage.hoveringOnMenuElement();
     Thread.sleep(3000);
     }

     @Test(priority = 9)
     public void testUserclickOnImageelement(){ getInitElements();
     mainhomepage.UserclickOnImageelement();
     }

     //handle PopUp Window

      @Test(priority = 10)
      public void testUserhandleAlert(){
      getInitElements();
      mainhomepage.handleAlert();
      }

}
