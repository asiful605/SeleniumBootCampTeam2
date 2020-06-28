package hometest;

import common.WebAPI;
import homepage.HBOPages;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HBOPagesTest extends WebAPI {
    static HBOPages hboPages;
    public static void getInitElements(){hboPages= PageFactory.initElements(driver,HBOPages.class);
    }
    @Test(priority = 1)
    public void testusersearcareers() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        hboPages.usersearchcareers.click();
        Thread.sleep(3000);
    }
   @Test(priority = 2)
    public void testusersearchcastandcrew() throws InterruptedException {
       driver.manage().window().maximize();
       getInitElements();
       hboPages.usersearchcastandcrew.click();
       Thread.sleep(3000);
   }
   @Test(priority = 3)
    public void testusersearchboxelement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        hboPages.usersearchboxelement.click();
        Thread.sleep(2000);
   }
    @Test(priority = 4)
    public void testusergethbo(){
        driver.manage().window().maximize();
        getInitElements();
        hboPages.usergethbo.click();
        Thread.getDefaultUncaughtExceptionHandler();
    }

     @Test(priority = 5)
    public void testclickdropdownbutton() {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.clickdropdownbutton.click();
         Thread.getDefaultUncaughtExceptionHandler();
     }
     @Test(priority = 6)
    public void testuserclickonimage() throws InterruptedException {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.userclickonimage.click();
         Thread.sleep(2000);
     }
     @Test(priority = 7)
     public void testuserclickOnSearchButton() throws InterruptedException {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.userclickOnSearchButton.isSelected();
         Thread.sleep(2000);
     }
     @Test(priority = 8)
    public void testuserchooseImage(){
         driver.manage().window().maximize();
         getInitElements();
         hboPages.userchooseImage.click();
         Thread.getDefaultUncaughtExceptionHandler();
     }
     @Test(priority = 9)
     public void testuserdropDownWebElements() throws InterruptedException {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.getUserdropDownWebElements.click();
         Thread.sleep(2000);
     }
     @Test(priority = 10)
     public void testgetuserfindingSpecials() throws InterruptedException {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.getuserfindingSpecials.click();
         Thread.sleep(2000);
     }
     @Test(priority = 11)
     public void testgetfindingramyYoussefFeelings(){
         driver.manage().window().maximize();
         getInitElements();
         hboPages.getfindingramyYoussefFeelings.click();
         Thread.getDefaultUncaughtExceptionHandler();
     }
     @Test(priority =12)
     public void scrollDownToEnd() throws InterruptedException {
         driver.manage().window().maximize();
         getInitElements();
         hboPages.scrollDownToEnd();
     }
    @Test(priority =13)
    public void scrollDownWebPage() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        hboPages.scrollDownToEnd();


    }

}
