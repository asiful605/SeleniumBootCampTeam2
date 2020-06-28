package homepage;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;
import static homepage.Webelements.*;

public class GEICOHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = popUpElement)
    WebElement popUp;
    @FindBy(how = How.XPATH, using = logInButton)
    WebElement logInTab;
    @FindBy(how = How.XPATH, using = AutoTab)
    WebElement AutoTabElement;
    @FindBy(how = How.CSS, using = checkBox)
    WebElement checkBoxElement;
    @FindBy(how = How.CSS, using = boatelement)
    WebElement boatWebelement;
    @FindBy(how = How.CSS, using = getBoatelement)
    WebElement getBoatwebelement;
    @FindBy(how = How.CSS, using = getAutoTab)
    WebElement getAutoTabwebelement;
    @FindBy(how = How.CSS, using = loginTab)
    WebElement loginTabelement;


    public void popUphandle() {
       okAlert();
    }
    public void clickOnLogInButton() {
        implicitwait();
        clickByXpath(logInButton);
    }
    public void thescrollDownTheWebPage() {
        scrollDownTheWebPage();
    }
    public void clickOnAutoTab() {
        System.out.println(driver.getTitle());
        clickByXpath(AutoTab);
    }
    public void checkBoxTab() {
        clickByXpath(AutoTab);
        checkBoxElement.getAttribute("class");
        System.out.println(checkBoxElement.getText());
        clickByCSS(checkBox);
        boolean ischecked = checkBoxElement.isSelected();
        System.out.println(" It is selected :" + ischecked);
    }
    public void userclickonboatWebelement() {
        clickByCSS( boatelement);
    }
    public void validateboatWebelement() {
        String expectedText = " Boat";
        String actualText = getBoatwebelement.getText();
        if (actualText.equals(expectedText)) {
            System.out.println(actualText);
        } else {
            System.out.println(actualText);
        }
    }
    public void dropDownAutoTab(){
        selectOptionByIndex(getAutoTabwebelement,"4");
    }
    public void userloginTabelement(){
        clickByCSS( loginTab);
    }
}
