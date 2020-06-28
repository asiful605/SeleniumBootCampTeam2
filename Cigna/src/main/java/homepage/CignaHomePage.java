package homepage;

import WebElements.CignaWebElements;
import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CignaHomePage extends WebAPI {
    @FindBy(how = How.CSS, using = CignaWebElements.searchBoxElement)
    public WebElement searchBox;
    @FindBy(how=How.XPATH,using = CignaWebElements.clickonLogo)
    public WebElement clickonlogo;
    @FindBy(how=How.CSS,using =CignaWebElements.searchButton )
    public WebElement clicksearchButton;
    @FindBy(how=How.XPATH,using=CignaWebElements.FileAClaim)
    public WebElement FileAclaim;
    @FindBy(how=How.XPATH,using=CignaWebElements.loginButton)
    public WebElement mouseHoveringForCustomerlogin;

    //Helper Method
    //Input Box
    public void enterKeyword() {
        searchBox.sendKeys("health insurance");
    }
    //Input Box
    public void setClickonlogo() {
        clickonlogo.click();
    }
    //Input Box
    public  void setclickonsearchButton(){
        clicksearchButton.click();
        }
        //Input Box
     public void setclickFileAclaim(){
        setclickFileAclaim();
     }
     //mouseHovering
    public void hoveringoncustomerLogin(){
        Actions actions = new Actions(driver);
        actions.moveToElement(mouseHoveringForCustomerlogin).build().perform();
    }





    }



