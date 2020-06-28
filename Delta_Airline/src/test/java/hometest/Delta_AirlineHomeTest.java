package hometest;

import common.WebAPI;
import homepage.Delta_AirlineHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import reporting.TestLogger;



public class Delta_AirlineHomeTest extends WebAPI {

    static Delta_AirlineHomePage delta_airlineHomePage;

    public static void getInitElements() {
        delta_airlineHomePage = PageFactory.initElements(driver, Delta_AirlineHomePage.class);
    }
    @Test(priority = 1,enabled = true)
    public void testDeltaCarriersSearchPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.deltaCareersSearchPage();
    }

    @Test(priority = 2,enabled = true)
    public void testCheckNotifications() {
        getInitElements();
        delta_airlineHomePage.checkNotifications();
    }
    @Test(priority = 3,enabled = true)
    public void testCheckFlightStatus() {
        getInitElements();
        delta_airlineHomePage.checkFlightStatus();
    }
    @Test(priority = 4,enabled = true)
    public void testSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.searchButtonOptions();
    }
    @Test(priority = 5,enabled = true)
    public void testGetTextFromWebElements() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));        getInitElements();
        delta_airlineHomePage.getTextFromWebElements();
    }
    @Test(priority = 6,enabled = true)
    public void testUseMouseHover() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.useMouseHover();
    }
    @Test(priority = 7,enabled = true)
    public void testHandleAlertPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.handleAlertPage();
    }
    @Test(priority = 8,enabled=true)
    public void testUseCheckBoxButton() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.useCheckBoxButton();
    }

    @Test(priority = 9,enabled = true)
    public void testReadDeltaLogoImage() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.readDeltaLogoImage();
    }
    @Test(priority = 10,enabled = true)
    public void testTryToLogIn() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.tryToLogIn();
    }
    @Test(priority = 11,enabled = true)
    public void testHandleCalendarWithWebTable() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        delta_airlineHomePage.handleCalendarWithWebTable();
    }
}















