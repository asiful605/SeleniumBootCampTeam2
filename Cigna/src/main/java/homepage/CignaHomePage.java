package homepage;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;

import static homepage.WebElementsForCigna.*;

public class CignaHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = searchBoxElement)
    public WebElement searchBox;
    @FindBy(how = How.CSS, using = clickButtonelement)
    public WebElement clickButton;
    @FindBy(how = How.XPATH, using = logInButton)
    public WebElement mouseHoveringForCustomerlogIn;
    @FindBy(how = How.CSS, using = userNameTab)
    public WebElement Username;
    @FindBy(how = How.XPATH, using = PasswordElement)
    public WebElement EnterKeyWordForPassword;
    @FindBy(how = How.CSS, using = getTitleElement)
    public WebElement getTilte;
    @FindBy(how = How.CSS, using = contactonasTab)
    public WebElement hoveringOnContactanosTab;
    @FindBy(how = How.CSS, using = MedicareTab)
    public WebElement medicare;
    @FindBy(how = How.XPATH, using = clickOnButton)
    public WebElement clickOnOption1;
    @FindBy(how = How.CSS, using = medicaretab)
    public WebElement medicareelement;
    @FindBy(how = How.XPATH, using =  searchTab)
    public WebElement searchTabelement;


    public void enterKeyword() {
        typeByCss(searchBoxElement,"health insurance");
    }
    public void clickonButton() {
        clickByCSS(clickButtonelement);
    }
    public void theScrollDownWebPage() {
        scrollDownTheWebPage();
    }
    public void theScrollDownTillEnd() {
        scrollDownTillEnd();
    }
    public void goToCustomerLogInByMouseHovering() {
        mouseHoverByXpath(logInButton);
        String expected = "Ingresar:Empleador/agente";
        Assert.assertEquals("Ingresar:Empleador/agente", "Ingresar:Empleador/agente", "error");
    }
    public void enterKeyWordForLogIn() {
        typeByCss(userNameTab,"mohana@gmail.com");
    }
    public void setEnterKeyWordForPassword() {
        typeByXpath(PasswordElement,"12345");
    }
    public String getTilteOfcignaInternationalTab() {
        return getTilte.getText();
    }
    public void mouseHoverOnAquienesServimos() {
        mouseHoverByCSS(contactonasTab);
    }
    public void hoverOnMedicare() {
        mouseHoverByCSS( MedicareTab);
    }
    public void userClickOnOprion1() {
        hoverOnMedicare();
        mouseHoverByXpath(clickOnButton);
    }
    public void usermedicareelement() {
        clickByCSS(medicaretab);
    }
    public void validatetext(String expectedResult) {
        String actualResult = driver.getTitle();
        Assert.assertEquals("Search Result not Displayed",expectedResult,actualResult);
    }
    public void setSearchwebElement() {
        typeByCss(searchTab, "Help");
    }
    public void theBrokenLinks() throws IOException {
        brokenLink();
    }
}
