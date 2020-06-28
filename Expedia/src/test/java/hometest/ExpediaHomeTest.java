package hometest;

import common.WebAPI;
import homepage.ExpediaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ExpediaHomeTest extends WebAPI {


    static ExpediaHomePage expediaHomePage;

    public static void getInitElements() {
        expediaHomePage = PageFactory.initElements(driver, ExpediaHomePage.class);

    }
    @Test
    public void testClickLanguage() throws InterruptedException {
        driver.manage().window().maximize();

        getInitElements();
        expediaHomePage.clickLanguageButton();
    }

    @Test
    public void testClickSupport() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickSupportButton();
    }

    @Test
    public void testClickTrips() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickTripsButton();

    }

    @Test
    public void testClickStays() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickStaysButton();

    }

    @Test
    public void testClickFlights() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickFlightsButton();

    }

    @Test
    public void testClickCars() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickCarsButton();

    }

    @Test
    public void testClickPackages() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickPackagesButton();

    }

    @Test
    public void testClickThingsToDo() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickThingsToDoButton();

    }

    @Test
    public void testClickCruisesButton() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickCruisesButton();

    }

    @Test
    public void testClickMoreTravelButton() throws InterruptedException {
        getInitElements();
        expediaHomePage.clickMoreTravelButton();


    }

}
