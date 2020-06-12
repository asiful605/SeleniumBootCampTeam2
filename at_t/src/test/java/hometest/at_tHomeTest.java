package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {
    //created vairable of at_thomepage
    static at_tHomePage mainhomepage;
    //webelement initialization

    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }
//     to count test case
    @Test(priority = 1)
    public void testusersearchbox() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.usersearchbox();
        Thread.sleep(5000);
    }

    @Test (priority = 2)
    public void testscroll() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolldownwebpage();
        Thread.sleep(5000);
    }
    @Test (priority = 3)
    public void testscrolltoend() throws InterruptedException {
        driver.get("https://www.att.com/");
        driver.manage().window().maximize();
        getInitElements();
        mainhomepage.scrolltoend();
    }

}
