package basic;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AllFreeEpisodes extends WebAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[1]/div/a")
    public WebElement freeEpisodes;

    @FindBy(xpath = "/html/body/main/div[2]/div/div/div[1]/div[1]/div[1]/div[2]/h1/a")
    public WebElement sopranos;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSopranos;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[1]/div/a/img")
    public WebElement theIceBox;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playIceBox;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[3]/section/div/div/div[2]/div/div/div/div[5]/div/div/div/form/input")
    public WebElement inputEmail;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement pressPlay;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement westWorld;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playWestWorld;

    @FindBy (xpath = "/html/body/main/div[4]/div/div/div[1]/div[2]/div[2]/div/div[3]/div/a/img")
    public WebElement barry;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playBarry;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[2]/section/div/div/div/div[1]/div/a/img")
    public WebElement sally4Ever;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSally4Ever;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[2]/div/a/img")
    public WebElement podSaveAmerica;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playPodSaveAmerica;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[3]/div/a/img")
    public WebElement sharpObjects;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSharpObjects;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[4]/div/a/img")
    public WebElement animals;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playAnimals;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[5]/div/a/img")
    public WebElement srAvila;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playSrAvila;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[6]/div/a/img")
    public WebElement veep;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playVeep;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[7]/div/a/img")
    public WebElement hereAndNow;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playHereAndNow;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[8]/div/a/img")
    public WebElement theNightOf;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playTheNightOf;

    @FindBy (xpath = "/html/body/main/div[7]/div/div/div[1]/div[2]/div[1]/section/div/div/div/div[9]/div/a/img")
    public WebElement room104;

    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement playRoom104;

    public WebElement getFreeEpisodes() {
        freeEpisodes.click();
        return freeEpisodes;
    }
    public WebElement getWatchSopranos() {
        sopranos.click();
        return sopranos;
    }
    public WebElement getPlaySopranos() {
        playSopranos.click();
        return playSopranos;
    }
    public WebElement getTheIceBox() {
        theIceBox.click();
        return theIceBox;
    }
    public WebElement getPlayIceBox() {
        playIceBox.click();
        return playIceBox;
    }
    public WebElement getInputEmail(){
        inputEmail.sendKeys("roktimrobin@gmail.com");
        return inputEmail;
    }
    public WebElement getPressPlay(){
        pressPlay.click();
        return pressPlay;
    }
    public WebElement getWestWorld() {
        westWorld.click();
        return westWorld;
    }
    public WebElement getPlayWestWorld() {
        playWestWorld.click();
        return playWestWorld;
    }
    public WebElement getBarry() {
        barry.click();
        return barry;
    }
    public WebElement getPlayBarry() {
        playBarry.click();
        return playBarry;
    }
    public WebElement getSally4Ever() {
        sally4Ever.click();
        return sally4Ever;
    }
    public WebElement getPlaySally4Ever() {
        playSally4Ever.click();
        return playSally4Ever;
    }
    public WebElement getPodSaveAmerica() {
        podSaveAmerica.click();
        return podSaveAmerica;
    }
    public WebElement getPlayPodSaveAmerica() {
        playPodSaveAmerica.click();
        return playPodSaveAmerica;
    }
    public WebElement getSharpObjects() {
        sharpObjects.click();
        return sharpObjects;
    }
    public WebElement getPlaySharpObjects() {
        playSharpObjects.click();
        return playSharpObjects;
    }
    public WebElement getAnimals() {
        getAnimals().click();
        return animals;
    }
    public WebElement getPlayAnimals() {
        playAnimals.click();
        return playAnimals;
    }
    public WebElement getSrAvila() {
        srAvila.click();
        return srAvila;
    }
    public WebElement getPlaySrAvila() {
        playSrAvila.click();
        return playSrAvila;
    }
    public WebElement getVeep() {
        veep.click();
        return veep;
    }
    public WebElement getPlayVeep() {
        playVeep.click();
        return playVeep;
    }
    public WebElement getHereAndNow() {
        hereAndNow.click();
        return hereAndNow;
    }
    public WebElement getPlayHereAndNow() {
        playHereAndNow.click();
        return playHereAndNow;
    }
    public WebElement getTheNightOf() {
        theNightOf.click();
        return theNightOf;
    }
    public WebElement getPlayTheNightOf() {
        playTheNightOf.click();
        return playTheNightOf;
    }
    public WebElement getRoom104() {
        room104.click();
        return room104;
    }
    public WebElement getPlayRoom104() {
        playRoom104.click();
        return playRoom104;
    }
    public List list(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(sopranos);
        webElements.add(theIceBox);
        webElements.add(westWorld);
        webElements.add(barry);
        webElements.add(sally4Ever);
        webElements.add(podSaveAmerica);
        webElements.add(sharpObjects);
        webElements.add(animals);
        webElements.add(srAvila);
        webElements.add(veep);
        webElements.add(hereAndNow);
        webElements.add(theNightOf);
        webElements.add(room104);

        List<String > text = new ArrayList<>();
        for(int i = 0; i<webElements.size();i++){
            text.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText());
        }
        return text;
    }
    public List expectedAllFreeEpisodes(){
        List<String> expectedShowsName = new ArrayList<>();
        expectedShowsName.add("Sopranos");
        expectedShowsName.add("The IceBox");
        expectedShowsName.add("WestWorld");
        expectedShowsName.add("Barry");
        expectedShowsName.add("Sally4Ever");
        expectedShowsName.add("Pod Save America");
        expectedShowsName.add("Sharp Objects");
        expectedShowsName.add("Animals");
        expectedShowsName.add("Sr.Avila");
        expectedShowsName.add("Veep");
        expectedShowsName.add("Here and Now");
        expectedShowsName.add("The Night Of");
        expectedShowsName.add("Room 104");
        return expectedShowsName;
    }















}
