package web;

import basic.HomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TestHome extends WebAPI {

    HomePage hp ;
    @BeforeMethod
    public void initializeElement () {
        hp= PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void clickSearchButton () { hp.clickOnSearchButton(); }
    @Test
    public void clickGetHBO() {hp.clickonGetHBO(); }
    @Test
    public void clickSignIn() {hp.clickOnSignIn();}
    @Test
    public void clickLogo () {hp.clickOnLogo();}
    @Test
    public void clickSearchlink(){hp.clicksearchlink();}
    @Test
    public void searchItems(){hp.sendInput();}
    @Test
    public void clickSeries(){hp.findSeries();}
    @Test
    public void clickMovie(){hp.findMovies();}
    @Test
    public void clickFreeEpisodes(){hp.getFreeEpisodes();}
    @Test
    public void clickGetItToday(){hp.clickHBOToday();}
    @Test
    public void goToNextSlide(){hp.clickNextSlide();}
    @Test
    public void testFbPage(){hp.getFbPage();}
    @Test
    public void checkInstaPage(){hp.getInstaPage();}
    @Test
    public void viewTwitterPage(){hp.getTwitterPage();}
    @Test
    public void viewYoutubePage(){hp.navigateToYoutubePage();}
    @Test
    public void webElementName(){
        List actual = hp.webElementList();
        List expected = hp.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }



















}
