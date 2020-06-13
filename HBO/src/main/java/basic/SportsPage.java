package basic;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;


public class SportsPage extends WebAPI {
    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a")
    public WebElement sports;

    @FindBy (xpath = "//div[@class='components/CardText--title']")
    public WebElement theShop;
    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playTheShop;

    @FindBy (xpath = "/html/body/main/div[2]/div/div/div[1]/section/div/div/div/div[2]/a/div[1]/img")
    public WebElement realSports;
    @FindBy (linkText = "HBO Boxing")
    public WebElement hboBoxing;
    @FindBy (xpath = "/html/body/main/div[3]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/a/img")
    public WebElement caneloVsGolovkin;
    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playFight1;

    @FindBy (xpath = "//img[@alt='The Fight Game with Jim Lampley']")
    public WebElement theFightGame;

    @FindBy (xpath = "/html/body/main/div[10]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/div[2]/a/span/span/span")
    public WebElement deadliestSports;

    @FindBy (xpath = "/html/body/main/div[9]/div/div/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/a/span/span/span")
    public  WebElement slavesNoMore;

    public void enterSportsPage (){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();}

    public void watchTheShop() {
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();
        theShop.click();
        playTheShop.click();
    }
    public void watchCaneloVsGolovkin(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();
        realSports.click();
        hboBoxing.click();
        caneloVsGolovkin.click();
        playFight1.click();
    }
    public void enterFightGame(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();
        realSports.click();
        theFightGame.click();
    }
    public void watchDeadliestSport (){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();
        realSports.click();
        deadliestSports.click();
    }
    public void readAboutSlaves(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        sports.click();
        realSports.click();
        slavesNoMore.click();
    }
}
