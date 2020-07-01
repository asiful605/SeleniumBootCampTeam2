package hometest;

import Homepage.HBOHomePage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

class HBOHomePageTest extends WebAPI {
    HBOHomePage hboHomePage;
    @BeforeMethod
    public void initializeElement () {
        hboHomePage= PageFactory.initElements(driver,HBOHomePage.class);
    }
    //Hbo general test cases on Homepage
    @Test
    public void clickSearchButton () { hboHomePage.clickOnSearchButton(); }

    @Test
    public void clickGetHBO() {hboHomePage.clickonGetHBO(); }
    @Test
    public void clickSignIn() {hboHomePage.clickOnSignIn();}
    @Test
    public void clickLogo () {hboHomePage.clickOnLogo();}
    @Test
    public void clickSearchlink(){hboHomePage.clicksearchlink();}
    @Test
    public void clickSeries(){hboHomePage.findSeries();}
    @Test
    public void clickMovie(){hboHomePage.findMovies();}
    @Test
    public void clickFreeEpisodes(){hboHomePage.getFreeEpisodes();}
//    @Test
//    public void clickGetSports(){hboHomePage.clickHBOToday();}
    @Test
    public void testFbPage(){hboHomePage.getFbPage();}
    @Test
    public void checkInstaPage(){hboHomePage.getInstaPage();}
    @Test
    public void viewTwitterPage(){hboHomePage.getTwitterPage();}
    @Test
    public void viewYoutubePage(){hboHomePage.navigateToYoutubePage();}
    }
