package hometest;

import common.WebAPI;
import homepage.ExpediaHomePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import static homepage.Webelements.url;

public class ExpediaHomeTest extends WebAPI {

    static ExpediaHomePage HomePage;// Reference variable/object of CignaHomePage

    public static void getInitElements(){
        HomePage= PageFactory.initElements(driver, ExpediaHomePage.class);
    }

//@Test(priority  =1)
//  public void testuserclickOnButton() {
//        getInitElements();
//    HomePage.userclickOnButton();
//}

// @Test(priority  =2)
//    public void testclickonAccountTab(){
//       getInitElements();
//       HomePage.clickonAccountTab();
//    }

    @Test(priority  =3)
    public void testclickonclickOnCheckBox() throws InterruptedException {
        getInitElements();
        HomePage.clickOnCheckBox();
        Thread.sleep(3000);
    }
//@Test(priority  =4)
//    public void testclickOnimageelement(){
//       getInitElements();
//       HomePage.clickOnimageelement();
//    }

//@Test(priority  =5)
//    public void scrollDownTheWebPage() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
//    }


//    @Test(priority  =6)
//    public void testscrollDownTillEnd() {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,1000)");
//    }

//
//    @Test(priority  =6)
//   public void testclickOncheckBox() throws InterruptedException{
//     getInitElements();
//     HomePage.clickOncheckBox();
//    }




}
