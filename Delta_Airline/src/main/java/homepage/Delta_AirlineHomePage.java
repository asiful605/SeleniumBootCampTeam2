package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static WebElements.Delta_airlineHomePageWebElements.*;

public class Delta_AirlineHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = handleCookiesWebElement) public WebElement handleCookies;
    @FindBy(how = How.LINK_TEXT,using = carriersButtonWebElement) public WebElement carriesButton;
    @FindBy(how = How.XPATH, using = searchDeltaCarriersWebElement) public WebElement searchDeltaCarries;
    @FindBy(how = How.XPATH, using = notificationsButtonWebElement) public WebElement notificationsButton;
    @FindBy(how=How.XPATH,using = firstNotificationWebElement) public WebElement firstNotification;
    @FindBy(how=How.LINK_TEXT, using= flightStatusButtonWebElement) public WebElement flightStatusButton;
    @FindBy(how=How.ID, using= searchBoxWebElement) public WebElement searchBox;
    @FindBy(how= How.ID, using= searchButtonWebElement) public WebElement searchButton;
    @FindBy(how=How.XPATH, using= searchInputWebElement) public WebElement searchInput;
    @FindBy(how=How.CSS, using= keyWordInputWebElement) public  WebElement keywordInput;




    public void clickHandleCookies() {handleCookies.click(); }

    public void clickCarriesButton() {
        carriesButton.click();
    }
    public void clickSearchDeltaCarries() {
        searchDeltaCarries.click();
    }
    public void clickNotificationButton(){ notificationsButton.click();}
    public void clickFirstNotification(){ firstNotification.click();}
    public void clickFlightStatusButton(){ flightStatusButton.click();}
    public void enterKeyWord(String keyWord){searchBox.sendKeys(keyWord);}
    public void clickSearchButton(){ searchButton.click();}
    public void clickSearchInput(){ searchInput.click();}
    public void inputKeyWord(String keyword){ keywordInput.sendKeys(keyword);}

    public void deltaCarriersSearchPage() {
        clickHandleCookies();
        clickCarriesButton();
        clickSearchDeltaCarries();
    }

    public void checkNotifications(){
        clickHandleCookies();
        clickNotificationButton();
        clickFirstNotification();
    }


   public void checkFlightStatus(){
       clickHandleCookies();
       clickFlightStatusButton();
       enterKeyWord("1740");
       clickSearchButton();
   }

   public void searchButtonOptions(){
       clickHandleCookies();
       clickSearchInput();
       inputKeyWord("check-in");

   }
    public void searchInputButton(){
        clickHandleCookies();
        clickSearchInput();
    }











}





