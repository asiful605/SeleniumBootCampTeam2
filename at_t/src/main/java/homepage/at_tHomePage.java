package homepage;

import common.WebAPI;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.AttWebelements.*;

public class at_tHomePage extends WebAPI {

    @FindBy (how = How.CSS, using = hoverElement)
    WebElement businessElement;

    @FindBy (how = How.CSS, using = dropDownElement)
    WebElement dropDown;

    @FindBy (how = How.CSS, using = dealsButtonElement)
    WebElement dealsButton;

    @FindBy (how = How.CSS, using = wirelessButtonElement)
    WebElement wirelessButton;

    @FindBy (how= How.CSS, using = internetButtonElement)
    WebElement internetButton;

    @FindBy (how= How.CSS, using = bundlesButtonElement)
    WebElement bundlesButton;






    public void hoverOnBusiness() {
        windowMaximize();
        mouseHoverByCSS( hoverElement);
    }
    public void userDropDown(){
        windowMaximize();
        selectOptionByVisibleText(dropDown, "Manage profile");
    }
    public void userDealsButton(){
        windowMaximize();
        dealsButton.click();
    }
    public void userWirelessButton(){
        windowMaximize();
        wirelessButton.click();
    }
    public void userInternetButton(){
        windowMaximize();
        internetButton.click();
    }
    public void userBundlesButton(){
        windowMaximize();
        bundlesButton.click();
    }


}
