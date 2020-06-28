package hometest;

import common.WebAPI;
import homepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayHomeTest extends WebAPI {

    static EbayHomePage eba;
    public static void getInitElements() {
        eba = PageFactory.initElements(driver, EbayHomePage.class);
    }


    @Test (priority=1)
    public void mugsButton(){
        getInitElements();
        eba.mugsButton();
    }
    @Test (priority=2)
    public void bikingGearButton(){
        getInitElements();
        eba.bikingGearButton();
    }
    @Test (priority=3)
    public void tradingCardsButton(){
        getInitElements();
        eba.tradingCardsButton();
    }
    @Test (priority=4)
    public void watchesButton(){
        getInitElements();
        eba.watchesButton();
    }
    @Test (priority=5)
    public void sneakersButton(){
        getInitElements();
        eba.sneakersButton();
    }
    @Test (priority=6)
    public void toolsButton(){
        getInitElements();
        eba.toolsButton();
    }

}