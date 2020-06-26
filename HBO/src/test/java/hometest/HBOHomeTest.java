package hometest;


import common.WebAPI;
import homepage2.HBOHomePage;
import org.testng.annotations.Test;

public class HBOHomeTest extends WebAPI {
    HBOHomePage hboHomePage ;
//    @BeforeMethod
//    public void initializeElement () {
//        hp= PageFactory.initElements(driver,HomePage.class);
//    }
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
    //    @Test
//    public void searchItems(){hp.sendInput();}
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
