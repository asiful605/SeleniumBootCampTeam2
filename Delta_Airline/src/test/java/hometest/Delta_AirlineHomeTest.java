package hometest;

import common.WebAPI;
import homepage.Delta_AirlineHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

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
    @Test
    public void testuserlogin(){
        getInitElements();
        delta_airlineHomePage.userlogin();
    }
    @Test
    public void testuserinputboxelement(){
        getInitElements();
        delta_airlineHomePage.userlogin();
        delta_airlineHomePage.userinputboxelement();
    }
    @Test
    public void testuserinputpasswordelement(){
        getInitElements();
        delta_airlineHomePage.userlogin();
        delta_airlineHomePage.userinputpasswordelement();
    }
    @Test
    public void testusercheckboxelement(){
        getInitElements();
        delta_airlineHomePage.userlogin();
        delta_airlineHomePage.usercheckboxelement();
    }
    @Test
    public void testvalidationLogin() {
            getInitElements();
            delta_airlineHomePage.userlogin();
            delta_airlineHomePage.validateLogin("   Log In  ");
    }
    @Test
  public void testuseruserhoverSkyMileswebelement(){
        getInitElements();
        delta_airlineHomePage.userhoverSkyMileswebelement();
    }
    @Test
    public void testuserdropon1passengerTabwebelement(){
        getInitElements();
        delta_airlineHomePage.userdropon1passengerTabwebelement();
    }
    @Test
    public void testuserrefundableFareswebelement(){
        getInitElements();
        delta_airlineHomePage. userrefundableFareswebelement();
    }
    @Test
    public void testuserusercheckonmydatesareflexiblewebelement(){
        getInitElements();
        delta_airlineHomePage.  usercheckonmydatesareflexiblewebelement();
    }
    @Test
    public void testuservalidatehomepagewebelement(){

            getInitElements();
            delta_airlineHomePage. uservalidatehomepagewebelement("SEARCH OPTIONS") ;
    }
}


















