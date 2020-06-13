package homepage;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static WebElements.Delta_airlineHomePageWebElements.*;

public class Delta_AirlineHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = handleCookiesWebElement) public WebElement handleCookies;
    @FindBy(how = How.LINK_TEXT, using = carriersButtonWebElement) public WebElement carriesButton;
    @FindBy(how = How.XPATH, using = searchDeltaCarriersWebElement) public WebElement searchDeltaCarries;
    @FindBy(how = How.CSS, using = selectLocationWebElement) public WebElement selectLocation;
    @FindBy(how = How.CSS, using = notificationsButtonWebElement) public WebElement notificationsButton;
    @FindBy(how = How.XPATH, using = firstNotificationWebElement) public WebElement firstNotification;
    @FindBy(how = How.LINK_TEXT, using = flightStatusButtonWebElement) public WebElement flightStatusButton;
    @FindBy(how = How.ID, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.ID, using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchInputWebElement) public WebElement searchInput;
    @FindBy(how = How.CSS, using = keyWordInputWebElement) public WebElement keywordInput;
    @FindBy(how = How.CSS, using = suggestionWebElements) public List<WebElement> suggestion;
    @FindBy(how=How.LINK_TEXT, using= menuOptionWebElements) public WebElement menuOption;
    @FindBy(how=How.ID, using= mouseHoverWebElement) public WebElement mouseHover;
    @FindBy(how=How.XPATH, using= fbLogoWebElement) public WebElement fbLogo;
    @FindBy(how=How.XPATH, using= getAlertWebElement) public WebElement getAlert;
    @FindBy(how=How.XPATH, using= bookFlightWebElement) public WebElement bookFlight;
    @FindBy(how=How.XPATH, using= checkBoxWebElement) public WebElement checkBox;
    @FindBy(how=How.XPATH, using= deltaLogoWebElement) public WebElement deltaLogo;
    @FindBy(how=How.XPATH, using= homePageWebElement) public WebElement homePage;

    public void clickHandleCookies() { handleCookies.click();}
    public void clickCarriesButton() {
        carriesButton.click();
    }
    public void clickSearchDeltaCarries() {
        searchDeltaCarries.click();
    }
    public void clickNotificationButton() {
        notificationsButton.click();
    }
    public void clickFirstNotification() {
        firstNotification.click();
    }
    public void clickFlightStatusButton() {
        flightStatusButton.click();
    }
    public void enterKeyWord(String keyWord) {
        searchBox.sendKeys(keyWord);
    }
    public void clickSearchButton() { searchButton.click(); }
    public void clickSearchInput() { searchInput.click(); }
    public void inputKeyWord(String keyword) { keywordInput.sendKeys(keyword); }
    public List<WebElement> useGetText() {
        List<WebElement> suggestion1 = suggestion;
        for (WebElement suggest : suggestion1) {
            System.out.println(suggest.getText());
        }
        return suggestion1;
    }
    public void clickMenuOption(){menuOption.click();}
    public void clickFbLogo(){fbLogo.click();}
    public void alert(){getAlert.click();}
    public void selectBookFlight(){bookFlight.click();}
    public void selectCheckBox(){ checkBox.click();}
    public void inspectDeltaLogo(){ deltaLogo.click();}
    public void verifyHomePage(){
        if (driver.getTitle().equals(homePage)) {
            System.out.println("We are back at Delta homepage");
        } else {
            System.out.println("We are NOT in Delta homepage");
        }
        driver.close();
    }
    public void performMouseHover() throws InterruptedException {
        Actions action= new Actions(driver);
        WebElement travel= mouseHover;
        Thread.sleep(2000);
        action.moveToElement(travel).build().perform();
    }
    public void deltaCarriersSearchPage() throws InterruptedException {
        clickHandleCookies();
        clickCarriesButton();
        sleepFor(2);
        clickSearchDeltaCarries();
    }
    public void checkNotifications() throws InterruptedException {
        clickHandleCookies();
        clickNotificationButton();
        sleepFor(2);
        clickFirstNotification();
    }
    public void checkFlightStatus() throws InterruptedException {
        clickHandleCookies();
        clickFlightStatusButton();
        sleepFor(2);
        enterKeyWord("1740");
        sleepFor(2);
        clickSearchButton();
    }
    public void searchButtonOptions() throws InterruptedException {
        clickHandleCookies();
        clickSearchInput();
        sleepFor(2);
        inputKeyWord("check-in");
    }
    public void scrollDown() throws InterruptedException {
        clickHandleCookies();
        sleepFor(2);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeAsyncScript("scroll(0,2000)");
    }
    public void getTextFromWebElements() {
        clickHandleCookies();
        useGetText();
    }
    public void useMouseHover() throws InterruptedException {
        clickHandleCookies();
        clickMenuOption();
        sleepFor(2);
        performMouseHover();
    }
    public void handleAlertPage(){
        clickHandleCookies();
        driver.manage().deleteAllCookies();
        clickFbLogo();
        alert();
    }
    public void useCheckBoxButton(){
        clickHandleCookies();
        selectBookFlight();
        selectCheckBox();
    }
    public void readDeltaLogoImage(){
        clickHandleCookies();
        inspectDeltaLogo();
        verifyHomePage();
    }

}