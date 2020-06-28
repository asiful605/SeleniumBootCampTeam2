package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.tvWebelements.*;

public class ShopTV extends WebAPI {

    @FindBy(how = How.XPATH,using = tv)
    WebElement clicktv;
    @FindBy(how = How.XPATH,using = shopalloffers)
    WebElement useshopalloffers;
    @FindBy(how = How.XPATH,using = comChnlLineup)
    WebElement usecomChnlLineup;
    @FindBy(how = How.XPATH,using = hdonly)
    WebElement usehdonly;

    { driver.manage().window().maximize();}

    public void tv(){
        clicktv.click();
    }
    public void checkoffers(){
        clicktv.click();
        navigateTo("https://www.att.com/channels/att-tv/");
    }
}
