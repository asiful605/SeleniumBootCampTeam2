package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.EbayWebElements.*;

public class EbayHomePage extends WebAPI {

    @FindBy (how = How.CSS, using = mugsElement)
    WebElement mugsButton;

    @FindBy (how = How.CSS, using = bikingGearElement)
    WebElement bikingGearButton;

    @FindBy (how = How.CSS, using = tradingCardsElement)
    WebElement tradingCardsButton;

    @FindBy (how = How.CSS, using = watchesElement)
    WebElement watchesButton;

    @FindBy (how = How.CSS, using = sneakersElement)
    WebElement sneakersButton;

    @FindBy (how = How.CSS, using = toolsElement)
    WebElement toolsButton;








    public void mugsButton(){
        windowMaximize();
        mugsButton.click();
    }
    public void bikingGearButton(){
        windowMaximize();
        bikingGearButton.click();
    }
    public void tradingCardsButton(){
        windowMaximize();
        tradingCardsButton.click();
    }
    public void watchesButton(){
        windowMaximize();
        watchesButton.click();
    }
    public void sneakersButton(){
        windowMaximize();
        sneakersButton.click();
    }
    public void toolsButton(){
        windowMaximize();
        toolsButton.click();
    }
}


