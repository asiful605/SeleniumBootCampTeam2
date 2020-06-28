package flightspageTest;

import common.WebAPI;
import flightspage.TripAdvisorFlightspage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TripAdvisorFlightspageTest extends WebAPI {

    static TripAdvisorFlightspage trp;
    public static void getInitElements() {
       trp = PageFactory.initElements(driver, TripAdvisorFlightspage.class);
    }

    @Test(priority=1)
    public void testuserPostelement()  {
        getInitElements();
        implicitWait();
        trp.userPostelement();


}
    @Test(priority = 2)
    public void testuserAlertselement() throws InterruptedException{
        driver.manage().window().maximize();
        getInitElements();
        trp.userAlertselement();
        Thread.sleep(3000);
}
    @Test(priority = 3)
    public void testuserTripselement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userTripselement();
        Thread.sleep(3000);
    }
    @Test(priority = 4)
    public void testuserHotelselement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userHotelselement();
        Thread.sleep(3000);
    }
    @Test(priority = 5)
    public void testuserThingsToDoelement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userThingsToDoelement();
        Thread.sleep(3000);
    }
    @Test(priority = 6)
    public void testuserRestaurantselement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userRestaurantselement();
        Thread.sleep(3000);
    }
    @Test(priority = 7)
    public void testuserWriteAReviewelement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userWriteAReviewelement();
        Thread.sleep(3000);
    }
    @Test(priority = 8)
    public void testuserTravelForumselement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userTravelForumselement();
        Thread.sleep(3000);
    }
    @Test(priority = 9)
    public void testuserInsuranceelement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userInsuranceelement();
        Thread.sleep(3000);
    }
    @Test(priority = 10)
    public void testuserMoreelement() throws InterruptedException {
        driver.manage().window().maximize();
        getInitElements();
        trp.userMoreelement();
        Thread.sleep(3000);
    }
    @Test(priority=11)
    public void TestUserHoverOnSignOnTab() throws InterruptedException {
        getInitElements();
        trp.UserHoverOnSignOnTab();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test(priority=12)
    public void TestUserClickOnDropButton() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.UserClickOnDropButton();
        Thread.sleep(3000);
    }
    @Test(priority=13)
    public void TestUserClickbuyAGiftCard() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.UserClickbuyAGiftCard();
        Thread.sleep(3000);
    }
    @Test(priority=14)
    public void bookAVirtualExperience() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.bookAVirtualExperience();
        Thread.sleep(3000);
    }
    @Test(priority=15)
    public void topRestaurants() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.topRestaurants();
        Thread.sleep(3000);
    }
    @Test(priority=16)
    public void nationalParks() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.nationalParks();
        Thread.sleep(3000);
    }
    @Test(priority=16)
    public void washingtonDC() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.washingtonDC();
        Thread.sleep(3000);
    }
    @Test(priority=17)
    public void nantucketMA() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.nantucketMA();
        Thread.sleep(3000);
    }
    @Test(priority=18)
    public void atlanticcityNJ() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.atlanticcityNJ();
        Thread.sleep(3000);
    }
    @Test(priority=19)
    public void arlingtonVA() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.arlingtonVA();
        Thread.sleep(3000);
    }
    @Test(priority=20)
    public void kentCT() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.kentCT();
        Thread.sleep(3000);
    }
    @Test(priority=21)
    public void deweybeachDE() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.deweybeachDE();
        Thread.sleep(3000);
    }
    @Test(priority=22)
    public void rehobothbeachDE() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.rehobothbeachDE();
        Thread.sleep(3000);
    }
    @Test(priority=23)
    public void edgartownMA() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.edgartownMA();
        Thread.sleep(3000);
    }
    @Test(priority=24)
    public void hyannisMA() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.hyannisMA();
        Thread.sleep(3000);
    }
    @Test(priority=25)
    public void newyorkcityNY() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.newyorkcityNY();
        Thread.sleep(3000);
    }
    @Test(priority=26)
    public void singapore() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.singapore();
        Thread.sleep(3000);
    }
    @Test(priority=27)
    public void romeItaly() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.romeItaly();
        Thread.sleep(3000);
    }
    @Test(priority=28)
    public void parisFrance() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.parisFrance();
        Thread.sleep(3000);
    }
    @Test(priority=28)
    public void barcelonaSpain() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.barcelonaSpain();
        Thread.sleep(3000);
    }
    @Test(priority=29)
    public void tokyoJapan() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.tokyoJapan();
        Thread.sleep(3000);
    }
    @Test(priority=30)
    public void londonUK() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.londonUK();
        Thread.sleep(3000);
    }
    @Test(priority=31)
    public void careers() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.careers();
        Thread.sleep(3000);
    }
    @Test(priority=32)
    public void seethewinners() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.seethewinners();
        Thread.sleep(3000);
    }
    @Test(priority=33)
    public void investorRelations() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.investorRelations();
        Thread.sleep(3000);
    }
    @Test(priority=34)
    public void join() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.join();
        Thread.sleep(3000);
    }
    @Test(priority=35)
    public void insurance() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.insurance();
        Thread.sleep(3000);
    }
    @Test(priority=36)
    public void blog() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.blog();
        Thread.sleep(3000);
    }
    @Test(priority=37)
    public void owners() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.owners();
        Thread.sleep(3000);
    }
    @Test(priority=38)
    public void advertiseWithUs() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.advertiseWithUs();
        Thread.sleep(3000);
    }
    @Test(priority=39)
    public void iphoneApp() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.iphoneApp();
        Thread.sleep(3000);
    }
    @Test(priority=40)
    public void androidApp() throws InterruptedException {
        getInitElements();
        driver.manage().window().maximize();
        trp.androidApp();
        Thread.sleep(3000);
    }


















}
