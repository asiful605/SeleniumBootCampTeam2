package basic;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ExpediaBasicHomePage extends WebAPI {

    //@FindBy(how = How.LINK_TEXT,using = carriersButtonWebElement) public WebElement carriesButton;
   // @FindBy(how = How.XPATH,using = searchSupportupportWebElement )
    public WebElement hoverOnSupportTab;


    //MouseHovering
    public void UserHoverOnSupportTab(){
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverOnSupportTab).perform();
    }







}
