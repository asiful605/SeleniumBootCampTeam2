package basic;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AllFreeEpisodes extends WebAPI {
    @FindBy (xpath = "//a[contains(text(),'Free Episodes')]")
    public WebElement freeEpisodes;
    @FindBy(xpath = "//div[@class='bands/MainNavigation--middleBar']//a//img")
    public WebElement sopranos;
    @FindBy (xpath = "//div[contains(text(),'Perry Mason')]")
    public WebElement perryMason;
    @FindBy (xpath = "//button[@class='__player-playpause __player-pause']")
    public WebElement playPerryMason;
    @FindBy (xpath = "//div[contains(text(),'I May Destroy You')]")
    public WebElement iMayDestroyYou;
    @FindBy (xpath = "//div[@class='__player-placeholder-play-button']")
    public WebElement iMayDestroyYouPlay;
    @FindBy (xpath = "//div[contains(text(),'Real Sports with Bryant Gumbel')]")
    public WebElement realSportsWithBryantGumble;


    public WebElement getFreeEpisodes() {
        freeEpisodes.click();
        return freeEpisodes;
    }
    public WebElement getWatchSopranos() {
        sopranos.click();
        return sopranos;
    }

    public WebElement getPerryMason() {
        perryMason.click();
        return perryMason;
    }
    public WebElement getPlayPerryMason() {
        playPerryMason.click();
        return playPerryMason;
    }
    public WebElement getiMayDestroyYou(){
        iMayDestroyYou.click();
        return iMayDestroyYou;
    }
    public WebElement getiMayDestroyYouPlay(){
        iMayDestroyYouPlay.click();
        return iMayDestroyYouPlay;
    }
    public WebElement getrealSportsWithBryantGumble() {
        realSportsWithBryantGumble.click();
        return realSportsWithBryantGumble;
    }

    public List list(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(sopranos);
        webElements.add(perryMason);
        webElements.add(iMayDestroyYou);

        List<String > text = new ArrayList<>();
        for(int i = 0; i<webElements.size();i++){
            text.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText()); }
        return text;
    }

    public List expectedAllFreeEpisodes(){
        List<String> expectedShowsName = new ArrayList<>();
        expectedShowsName.add("Sopranos");
        expectedShowsName.add("Perry Mason");
        expectedShowsName.add("I May Destroy You");
        return expectedShowsName;
    }



}
