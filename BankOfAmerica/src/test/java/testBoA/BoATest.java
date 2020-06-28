package testBoA;

import BoAHomePage.LogIn;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class BoATest extends WebAPI {
    static LogIn logIn;
    public static void getInitElements() {
        logIn = PageFactory.initElements(driver, LogIn.class);
    }

    @Test
    public void testUserenterKeyword() {
        getInitElements();
        logIn.enterKeyword();
    }
    @Test
    public void testUserenterPassword() throws InterruptedException {
        getInitElements();
        logIn.enterPassword();
    }
    @Test
    public void testUsercheckOnsaveOnlineIdBox() {
        getInitElements();
        logIn.checkOnsaveOnlineIdBox();
    }
    @Test
    public void testUseruserSignin() {
        getInitElements();
        logIn.userSignin();
    }
    @Test
    public void testUservalidationSigninelement() {
        logIn.userSignin();
        logIn. uservalidationSigninelement("Sign In");
    }
    @Test
    public void testuseracNumberelement() {
        getInitElements();
        logIn.useracNumberelement();
    }
    @Test
    public void testuservalidatetextelement() {
        logIn.useracNumberelement();
        logIn.uservalidatetextelement("To view your Online ID or create a new Passcode, we need your SSN or TIN for identification.");
    }
    @Test
    public void testuserSSNnumberelement() {
        getInitElements();
        logIn.userSSNnumberelement();
    }
    @Test
    public void testtheBrokenLinks() throws IOException, IOException {
        getInitElements();
        logIn.theBrokenLinks();
    }
}
