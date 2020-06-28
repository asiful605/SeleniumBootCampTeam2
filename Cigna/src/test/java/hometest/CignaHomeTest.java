package hometest;

import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CignaHomeTest extends WebAPI {

    static CignaHomePage cignaHomePage;//Reference variable/ object of CignaHomePage

    public static void getInitElements() {
        cignaHomePage = PageFactory.initElements(driver, CignaHomePage.class);
    }

    @Test(priority = 1)
    public void testsearchBox() throws InterruptedException {
        getInitElements();
    }

    @Test(priority = 2)
    public void testclickonlogo() {
        getInitElements();
    }

    @Test(priority = 3)
    public void testclickonSearchButton() {
        getInitElements();
    }

    @Test(priority = 4)
    public void testclickonFileAClaim() {
        driver.manage().window().maximize();
    }

    @Test(priority = 5)
    public void testhoveringoncustomerLogin() {
        getInitElements();
    }
}







