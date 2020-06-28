package hometest;

import common.WebAPI;
import homepage.CignaInternational;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CignaInternationalTest extends WebAPI {
    static CignaInternational mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, CignaInternational.class);
    }
    @Test(priority = 1)
    public void testCignaInter(){
        getInitElements();
        mainhomepage.CignaInter();
    }
    @Test(priority = 2)
    public void testIndividualPlans(){
        getInitElements();
        mainhomepage.indiviualPlan();
    }
    @Test(priority = 3)
    public void testHPC(){
        getInitElements();
        mainhomepage.mousehvrtoHPC();
    }
    @Test(priority = 4)
    public void testBrokers(){

        getInitElements();
        mainhomepage.brokers();
    }
    @Test(priority = 5)
    public void testHCP(){
        getInitElements();
        mainhomepage.HCP();
    }
    @Test(priority = 6)
    public void testJoinNow(){
        getInitElements();
        mainhomepage.JoinNow();
    }
    @Test(priority = 7)
    public void testradiobtns(){
        getInitElements();
        mainhomepage.setRadiobtn();
    }
}
