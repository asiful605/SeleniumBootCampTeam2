package homepage;


import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import java.util.List;
import static WebElements.Delta_airlineHomePageWebElements.*;
public class Delta_AirlineHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = handleCookiesWebElement) public WebElement handleCookies;
    @FindBy(how = How.LINK_TEXT, using = careersButtonWebElement) public WebElement careersButton;
    @FindBy(how = How.XPATH, using = searchDeltaCareersWebElement) public WebElement searchDeltaCareers;
    @FindBy(how = How.CSS, using = selectLocationWebElement) public WebElement selectLocation;
    @FindBy(how = How.CSS, using = notificationsButtonWebElement) public WebElement notificationsButton;
    @FindBy(how = How.XPATH, using = firstNotificationWebElement) public WebElement firstNotification;
    @FindBy(how = How.LINK_TEXT, using = flightStatusButtonWebElement) public WebElement flightStatusButton;
    @FindBy(how = How.ID, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.ID, using = searchButtonWebElement) public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchInputWebElement) public WebElement searchInput;
    @FindBy(how = How.CSS, using = keyWordInputWebElement) public WebElement keywordInput;
    @FindBy(how = How.CSS, using = suggestionWebElements) public List<WebElement> suggestion;
    @FindBy(how = How.ID, using = menuOptionWebElements) public WebElement menuOption;
    @FindBy(how = How.ID, using = mouseHoverWebElement) public WebElement mouseHover;
    @FindBy(how = How.XPATH, using = fbLogoWebElement) public WebElement fbLogo;
    @FindBy(how = How.XPATH, using = getAlertWebElement) public WebElement getAlert;
    @FindBy(how = How.XPATH, using = bookFlightWebElement) public WebElement bookFlight;
    @FindBy(how = How.XPATH, using = checkBoxWebElement) public WebElement checkBox;
    @FindBy(how = How.XPATH, using = deltaLogoWebElement) public WebElement deltaLogo;
    @FindBy(how = How.XPATH, using = homePageWebElement) public WebElement homePage;
    @FindBy(how = How.XPATH, using = checkbox2dWebElement )public WebElement checkBox2;
    @FindBy(how = How.XPATH, using = signInWebElement )public WebElement signIn;
    @FindBy(how = How.XPATH, using = userIdWebElement )public WebElement userId;
    @FindBy(how = How.XPATH, using = passwordWebElement )public WebElement password;
    @FindBy(how = How.ID, using = departureDateWebElement )public WebElement departureDate;
    @FindBy(how = How.ID, using = datePickerWebElement )public List <WebElement> datePicker;
    public void clickHandleCookies() { handleCookies.click(); }
    public void clickCareersButton() { careersButton.click(); }
    public void clickSearchDeltaCareers() { searchDeltaCareers.click(); }
    public void clickNotificationButton() { notificationsButton.click(); }
    public void clickFirstNotification() { firstNotification.click(); }
    public void clickFlightStatusButton() { flightStatusButton.click(); }
    public void enterKeyWord(String keyWord) { searchBox.sendKeys(keyWord); }
    public void clickSearchButton() { searchButton.click();}
    public void clickSearchInput() { searchInput.click(); }
    public void inputKeyWord(String keyword) { keywordInput.sendKeys(keyword);}
    public List<WebElement> useGetText() {
        List<WebElement> suggestion1 = suggestion;
        for (WebElement suggest : suggestion1) {
            System.out.println(suggest.getText()); }
        return suggestion1; }
    public void clickMenuOption() {
        menuOption.click();
    }
    public void clickFbLogo() { fbLogo.click(); }
    public void alert() { getAlert.click(); }
    public void selectBookFlight() { bookFlight.click(); }
    public void selectCheckBox() { checkBox.click(); }
    public void inspectDeltaLogo() { deltaLogo.click(); }
    public void verifyHomePage() {
        if (driver.getTitle().equals(homePage)) {
            System.out.println("We are back at Delta homepage");
        } else {
            System.out.println("We are NOT in Delta homepage");
        }
        driver.close(); }
    public void performMouseHover() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement travel = mouseHover;
        Thread.sleep(2000);
        action.moveToElement(travel).build().perform();
    }
    public void selectCheckBox2() { checkBox2.click(); }
    public void signIn() {signIn.click(); }
    public void enterUserId() {userId.sendKeys("1234567867"); }
    public void enterPassword() {password.sendKeys("test123"); }
    public void clickDepartureDay(){departureDate.click();}
    public void deltaCareersSearchPage() {
       clickHandleCookies();
        clickCareersButton();
        clickSearchDeltaCareers();}
    public void checkNotifications()  {
        clickHandleCookies();
        clickNotificationButton();
        clickFirstNotification();
    }
    public void checkFlightStatus() {
        clickHandleCookies();
        clickFlightStatusButton();
        enterKeyWord("1740");
        clickSearchButton();
    }
    public void searchButtonOptions() {
        clickHandleCookies();
        clickSearchInput();
        inputKeyWord("check-in");
    }
    public void getTextFromWebElements() { ;
        clickHandleCookies();
        useGetText();
    }
    public void useMouseHover() throws InterruptedException {
        clickHandleCookies();
        clickMenuOption();
        performMouseHover();
    }
    public void handleAlertPage() { ;
        clickHandleCookies();
        clickFbLogo();
        alert();
    }
    public void useCheckBoxButton() {
        clickHandleCookies();
        selectBookFlight();
        selectCheckBox();
    }
    public void readDeltaLogoImage() {
        clickHandleCookies();
        inspectDeltaLogo();
        verifyHomePage();
    }
    public void tryToLogIn(){
        clickHandleCookies();
       clickByXpath("//button[@class='login-btn btn btn-danger']");
       enterUserId();
       enterPassword();
       selectCheckBox2();
       signIn();
       Boolean  verifyTitle = driver.getTitle().equalsIgnoreCase("successfully login");
         Assert.assertFalse(verifyTitle);

        }
    public void handleCalendarWithWebTable(){
        clickDepartureDay();
        List<WebElement> allDates=datePicker;
        for(WebElement ele:allDates) {
            String date=ele.getText();
            if(date.equalsIgnoreCase("30")){
                ele.click();
                break;
            }
        }
    }

    }
