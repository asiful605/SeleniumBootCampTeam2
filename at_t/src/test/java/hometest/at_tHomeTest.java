package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {
    static at_tHomePage mainhomepage;

    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }

    @Test(priority = 1)
    public void testusersearchbox() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.setUsersearchbox();
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    public void testsearchclickbutton() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.setUsersearchbox();
        mainhomepage.searchclickbutton();
        Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void testiphoneimage() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.clickiphoneimage();
        Thread.sleep(2000);
    }


    @Test(priority = 3)
    public void testscroll() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolldownwebpage();
        Thread.sleep(5000);
    }

    @Test(priority = 4)
    public void testscrolltoend() throws InterruptedException {
        driver.get("https://www.att.com/");
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolltoend();
    }

    @Test(priority = 6)
    public void testclickaccountlogin() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.clickaccountlogin();
    }
   @Test(priority = 7)
   public void testpricingoption() throws InterruptedException {
   driver.manage().window().maximize();
   getInitElements();
   //mainhomepage.clickoniphoneimage();
   //mainhomepage.selectpricingoption();
   Thread.sleep(3000);



    }
}
