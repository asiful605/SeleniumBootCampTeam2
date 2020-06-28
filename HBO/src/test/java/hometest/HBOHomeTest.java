package hometest;

import common.WebAPI;
import homepage.HBOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HBOHomeTest extends WebAPI {

    static HBOHomePage homepage;//Referance variable/object of HBOHomePage
    public  static void getInitElement() {homepage= PageFactory.initElements(driver,HBOHomePage.class);
    }
   @Test(priority=1)
    public void setlogoElement() throws InterruptedException {
    getInitElement();
    homepage.setLogoElement();

    }
    @Test(priority=2)
    public void clickgetHBOElement() throws InterruptedException {
     getInitElement();
     homepage.clickgetHBOElement();

    }
     @Test (priority=3)
    public void clickMoviesElement(){
    getInitElement();
    homepage.clickMoviesElement();
    }
     @Test(priority=4)
     public void clickonsigninElements() throws InterruptedException {
     getInitElement();
     homepage.clickonsigninElements();

    }
     @Test(priority=5)
     public void scrrollDownTheWEbPage (){
     getInitElement();
     homepage.scrrollDownTheWEbPage();
    }
    @Test(priority=6)
    public void clickonSPECIALSElement(){
    getInitElement();
    homepage.clickonSPECIALSElement();
    }

    @Test(priority=7)
    public void clickonFREEEPISODESElement() {
        getInitElement();
    homepage.clickonFREEEPISODESElement();
    }

    @Test(priority=8)
    public void clickonHBOkidsElement(){
     getInitElement();
     homepage.clickonHBOkidsElement();
    }

    @Test(priority=9)
    public void testhoveringonSPORTS() throws InterruptedException {
    getInitElement();
    homepage.hoveringonSPORTS();
    }
    @Test(priority=10)
    public void testclickonHBOWatchElements(){
    getInitElement();
    homepage.clickonHBOWatchElements();
    }
    @Test(priority=11)
    public void hoveronImageElement(){
    getInitElement();
    homepage.hoveronImage();
    }





}
