package hometest;

import common.WebAPI;
import homepage.AmazonHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class AmazonHomeTest extends WebAPI {
   static AmazonHomePage amazonHomePage;
    public static void getInitElements(){
       amazonHomePage = PageFactory.initElements(driver,AmazonHomePage.class);
    }
    @Test
    public void userSearch () throws  InterruptedException {
        getInitElements();
        amazonHomePage.setSearchBar();
    }
}
