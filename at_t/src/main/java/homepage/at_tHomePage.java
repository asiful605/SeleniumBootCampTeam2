package homepage;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static homepage.AllWebElements.*;

public class at_tHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = hoverOnMenu)
    WebElement MenuElement;
    @FindBy(how = How.XPATH, using = InternetElement)
    WebElement netElement;
    @FindBy(how = How.XPATH, using = ExploretElement)
    WebElement ExploreNetElement;
    @FindBy(how = How.CSS, using = imageElement)
    WebElement clickOnImageelement;
    @FindBy(how = How.CSS, using = popUpElement)
    WebElement PopUpWebElement;
    @FindBy(how = How.CSS, using = accountElement)
    WebElement accountWebElement;
    @FindBy(how = How.CSS, using = clickOnDropButton)
    WebElement dropButtonWebElement;
    @FindBy(how = How.XPATH, using = dropButton)
    WebElement dropButtonwebElement;
    @FindBy(how = How.CSS, using = accountSign)
    WebElement accountsignwebElement;
    @FindBy(how = How.CSS, using = accountTab)
    WebElement accountTabwebElement;
    @FindBy(how = How.XPATH, using = userID)
    WebElement userIDwebElement;
    @FindBy(how = How.XPATH, using = hoverOnHotel)
    WebElement hoverOnHotelelement;
    @FindBy(how = How.CLASS_NAME, using = validationtext)
    WebElement validationtextElement;
    @FindBy(how = How.XPATH, using = accounttab)
    public WebElement accounttabelement;

    public void hoveringOnMenuElement() {
        mouseHoverByCSS(hoverOnMenu);
    }
    public void UserclickOnImageelement() {
        navigateTo("https://www.att.com/deals/");
        clickByCSS(imageElement);
        getTitle();
    }
    public void forHandleAlert() {
        windowMaximize();
        navigateTo("https://www.att.com/prepaid/");
        okAlert();
    }
    public void clickOnAccountTab() {
        windowMaximize();
        clickByCSS(accountElement);
    }
    public void userClickOndropButton() {
        try {
            navigateTo("https://www.att.com/buy/phones/apple-iphone-se-2020-256gb-white.html?offerid=13700010");
            selectOptionByIndex(dropButtonWebElement, "0");
        } catch (Exception e) {
            System.out.println(" Not going to select anything");
        }
        System.out.println("It will Shows Current title:" + driver.getTitle());
        driver.close();
    }
    public void userclickonDropButton() {
        selectOptionByVisibleText(accounttabelement, "Manage profile");
    }
    public void clickondropButton() {
        navigateTo("https://www.att.com/");
        windowMaximize();
        selectOptionByIndex(dropButtonwebElement, "1");
    }
    public void userHoverOnAccount() {
        mouseHoverByCSS(accountSign);
    }
    public void userIDElement(){
        windowMaximize();
        typeByCssNEnter( userID, "tanjina");
    }
    public void userhoverOnHotelelement() {
        mouseHoverByXpath(hoverOnHotel);
    }
    public void uservalidationtextElement(String expected) {
        try {
            String actualResult = validationtextElement.getText();
            Assert.assertEquals(" Result not Displayed", expected, actualResult);
        } catch (Exception e) {
        }
    }
}




















