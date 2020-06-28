package hometest;

import common.WebAPI;
import homepage.Delta_AirlineHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Delta_AirlineHomeTest extends WebAPI {


    static Delta_AirlineHomePage delta_airlineHomePage;

    public static void getInitElements() {
        delta_airlineHomePage = PageFactory.initElements(driver, Delta_AirlineHomePage.class);
    }
    @Test(priority = 1)
    public void testDeltaCarriersSearchPage() throws InterruptedException {
        getInitElements();
        delta_airlineHomePage.deltaCarriersSearchPage();
    }
    @Test(priority = 2)
    public void testCheckNotifications() throws InterruptedException {
        getInitElements();
        delta_airlineHomePage.checkNotifications();
    }
    @Test(priority = 3)
    public void testCheckFlightStatus() throws InterruptedException {
        getInitElements();
        delta_airlineHomePage.checkFlightStatus();
    }
    @Test(priority = 4)
    public void testSearchButton() throws InterruptedException {
        getInitElements();
        delta_airlineHomePage.searchButtonOptions();
    }
    @Test(priority =5 )
    public void testScrollDown() throws InterruptedException {
        getInitElements();
        delta_airlineHomePage.scrollDown();
    }
    @Test(priority = 6)
    public void testGetTextFromWebElements(){
        getInitElements();
        delta_airlineHomePage.getTextFromWebElements();
    }


      @Test(priority = 7)
    public void testUseMouseHover() throws InterruptedException {
         getInitElements();
         delta_airlineHomePage.useMouseHover();

      }






}


















