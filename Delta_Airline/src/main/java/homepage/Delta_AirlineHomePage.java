package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static WebElements.Delta_airlineHomePageWebElements.*;

public class Delta_AirlineHomePage extends WebAPI {

    @FindBy(how=How.CSS, using=  login)
    public  WebElement  loginelement;
    @FindBy(how=How.XPATH, using=  inputbox)
    public  WebElement  inputboxelement;
    @FindBy(how=How.XPATH, using=  inputpassword)
    public  WebElement  inputpasswordelement;
    @FindBy(how=How.CSS, using=  checkbox)
    public  WebElement  checkboxelement;
    @FindBy(how=How.CLASS_NAME, using= validationelement)
    public  WebElement validationelementwebelement;
    @FindBy(how=How.CSS, using= hoverSkyMiles)
    public  WebElement hoverSkyMileswebelement;
    @FindBy(how=How.CSS, using= dropon1passengerTab)
    public  WebElement dropon1passengerTabwebelement;
    @FindBy(how=How.XPATH, using= refundableFares)
    public  WebElement refundableFareswebelement;
    @FindBy(how=How.XPATH, using= checkonmydatesareflexible)
    public  WebElement checkonmydatesareflexiblewebelement;
    @FindBy(how=How.CLASS_NAME, using= validatehomepage)
    public  WebElement validatehomepagewebelement;
    @FindBy(how = How.XPATH, using = handleCookiesWebElement)
    WebElement handleCookies;
    @FindBy(how = How.LINK_TEXT,using = carriersButtonWebElement)
    public WebElement carriesButton;
    @FindBy(how = How.XPATH, using = searchDeltaCarriersWebElement)
    public WebElement searchDeltaCarries;
    @FindBy(how = How.XPATH, using = notificationsButtonWebElement)
    public WebElement notificationsButton;
    @FindBy(how=How.XPATH,using = firstNotificationWebElement)
    WebElement firstNotification;
    @FindBy(how=How.LINK_TEXT, using= flightStatusButtonWebElement)
    public WebElement flightStatusButton;
    @FindBy(how=How.ID, using= searchBoxWebElement)
    public WebElement searchBox;
    @FindBy(how= How.ID, using= searchButtonWebElement)
    public WebElement searchButton;
    @FindBy(how=How.XPATH, using= searchInputWebElement)
    public WebElement searchInput;
    @FindBy(how=How.CSS, using= keyWordInputWebElement)
    public  WebElement keywordInput;


    public void userlogin(){
        clickByCSS(login);
        implicitwait();
    }
    public void userinputboxelement(){
        typeByXpath(inputbox,"Mira");
    }
    public void userinputpasswordelement(){
        typeByXpath(inputpassword,"1234");
    }
    public void usercheckboxelement(){
        checkBoxSelectedByCSS(checkbox);
    }
    public void validateLogin(String expectedResult) {
        try {
            String actualResult = validationelementwebelement.getText();
            Assert.assertEquals(actualResult, expectedResult, "showing nothing");
        } catch (Exception e ) {

        }
    }
    public void userhoverSkyMileswebelement(){
        windowMaximize();
        mouseHoverByCSS("#headSectab2");
    }
    public void userdropon1passengerTabwebelement(){
        selectOptionByVisibleText(dropon1passengerTabwebelement,"2 Passengers");
    }
    public void userrefundableFareswebelement() {
        windowMaximize();
        checkBoxSelectedByXpath(refundableFares);
        implicitwait();
    }
    public void usercheckonmydatesareflexiblewebelement() {
        checkBoxSelectedByXpath(checkonmydatesareflexible);
    }
    public void uservalidatehomepagewebelement(String expectedResult) {
        try{
            String actualresult=validatehomepagewebelement.getText();
            Assert.assertEquals("actualresult",expectedResult,"showing nothing");
        }catch(Exception e){

        }
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
    public void clickHandleCookies() {
        clickByXpath(handleCookiesWebElement);
       }
    public void clickCarriesButton() {
        clickByLinkText(carriersButtonWebElement);
    }
    public void clickSearchDeltaCarries() {
        clickByXpath(searchDeltaCarriersWebElement);
    }
    public void clickNotificationButton() {
        clickByXpath(notificationsButtonWebElement);
       }
    public void clickFirstNotification() {
        clickByXpath(firstNotificationWebElement);
    }
    public void clickFlightStatusButton() {
        clickByLinkText(flightStatusButtonWebElement);
    }
    public void enterKeyWord(String keyWord) {
        typeByID(searchBoxWebElement, keyWord);
    }
    public void clickSearchButton() {
        clickByID(searchButtonWebElement);
    }
    public void clickSearchInput() {
        clickByXpath(searchInputWebElement);
    }
    public void inputKeyWord(String keyword) {
        typeByCss(keyWordInputWebElement,keyword);
    }
    public void deltaCarriersSearchPage() {
        clickHandleCookies();
        clickCarriesButton();
        clickSearchDeltaCarries();
    }
}









