package hometest;

import common.WebAPI;
import homepage.CignaHomePage;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CignaHomeTest extends WebAPI {

    static CignaHomePage cig;

    public static void getInitElements() {
        cig = PageFactory.initElements(driver, CignaHomePage.class);

    }

    @Test(priority = 1)
    public void testFindADoctorButton() {
        getInitElements();
        cig.findADoctor();
    }

    @Test(priority = 2)
    public void testLoginButton() {
        getInitElements();
        cig.logIn();
    }

    @Test(priority = 3)
    public void testHealthCareProvidersButton() {
        getInitElements();
        cig.healthCareProviders();
    }

    @Test(priority = 4)
    public void testDentalInsurancePlansButton() {
        getInitElements();
        cig.dentalInsurancePlans();
    }

    @Test(priority = 5)
    public void testMedicarePlanButton() {
        getInitElements();
        cig.medicarePlan();
    }

    @Test(priority = 6)
    public void testInternationalHealthInsuranceButton(){
        getInitElements();
        cig.internationalHealthInsurance();
    }


}

