package web;

import basic.SportsPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSports extends SportsPage {
    SportsPage sp;
    @BeforeMethod
    public void initializeElement(){ sp= PageFactory.initElements(driver, SportsPage.class); }

    @Test
    public void enterSportsHomePage(){
        sp.enterSportsPage();
    }
    @Test
    public void playTheShop() {
        sp.watchTheShop();
    }
    @Test
    public void watchTheFight(){
        sp.watchCaneloVsGolovkin();
    }
    @Test
    public void readTheFightGamePage(){
        sp.enterFightGame();
    }
    @Test
    public void playTheDeadliestSports(){
        sp.watchDeadliestSport();
    }
    @Test
    public void slaveNoMore(){
        sp.readAboutSlaves();
    }
}
