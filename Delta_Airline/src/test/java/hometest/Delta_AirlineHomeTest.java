package hometest;

import common.WebAPI;
import Homepage.Delta_AirlineHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Delta_AirlineHomeTest extends WebAPI {


    static Delta_AirlineHomePage delta_airlineHomePage;

    public static void getInitElements() {
        delta_airlineHomePage = PageFactory.initElements(driver, Delta_AirlineHomePage.class);

    }

    @Test
    public void testDeltaCarriersSearchPage() {

        getInitElements();
        delta_airlineHomePage.deltaCarriersSearchPage();
    }
    @Test
    public void testCheckNotifications(){
        getInitElements();
        delta_airlineHomePage.checkNotifications();
    }
    @Test
    public void testCheckFlightStatus(){
        getInitElements();
        delta_airlineHomePage.checkFlightStatus();

    }
    @Test
    public void testSearchButton(){
        getInitElements();
        delta_airlineHomePage.searchButtonOptions();

    }














}


















