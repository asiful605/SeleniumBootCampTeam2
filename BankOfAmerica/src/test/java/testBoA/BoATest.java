package testBoA;

import BoAHomePage.Login;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//import common.WebAPI;

public class BoATest extends WebAPI {
    static Login logIn;
    public static void getInitElements() {
        logIn = PageFactory.initElements(driver, Login.class);
    }

    // Input Box
    @Test
    public void testUserenterKeyword() {
        getInitElements();
        logIn.enterKeyword();
    }
    //     Input Box
    @Test
    public void testUserenterPassword() throws InterruptedException {
        getInitElements();
        logIn.enterPassword();
    }
    // Checking Box
    @Test
    public void testUsercheckOnsaveOnlineIdBox() {
        getInitElements();
        logIn.checkOnsaveOnlineIdBox();
    }
}

