package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;
import static webelements.GEICOWebElements.*;
public class GEICOHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = logInTadWebElement) public WebElement logIn;
    @FindBy(how = How.ID, using = userIdWebElement) public WebElement userId;
    @FindBy(how = How.ID, using = passwordWebElement) public WebElement password;
    @FindBy(how = How.XPATH, using = logInButtonWebElement) public WebElement logInButton;
    @FindBy(how = How.XPATH, using = cookieWebElement) public WebElement cookieClose;
    @FindBy(how = How.XPATH, using = locationWebElement) public WebElement location;
    @FindBy(how = How.XPATH, using = zipCodeWebElement) public WebElement zipCode;
    @FindBy(how = How.XPATH, using = updateButtonWebElement) public WebElement updateButton;
    @FindBy(how = How.XPATH, using = startHereWebElement) public WebElement startHere;
    @FindBy(how = How.XPATH, using = policyNumberWebElement) public WebElement policyNumber;
    @FindBy(how = How.XPATH, using = birthDayWebElement) public WebElement birthDay;
    @FindBy(how = How.XPATH, using = zipWebElement) public WebElement zip;
    @FindBy(how = How.XPATH, using = continueWebElement) public WebElement continueButton;
    @FindBy(how = How.XPATH, using = searchTabWebElement) public WebElement searchTab;
    @FindBy(how = How.XPATH, using = searchBoxWebElement) public WebElement searchBox;
    @FindBy(how = How.XPATH, using = searchButtonWebElement) public WebElement searchButton;

    public void closeCookie() {cookieClose.click();}
    public void clickLogIn() {
        logIn.click();
    }
    public void clickLogInButton() {
        logInButton.click();
    }
    public void selectLocation() { location.click(); }
    public void enterZipCode() { zipCode.sendKeys("22191"); }
    public void clickUpdate() { updateButton.click(); }
    public void clickStartHere() {startHere.click(); }
    public void continueButton() {continueButton.click(); }
    public void searchTab() {searchTab.click(); }
    public void searchBox(String keyword) {searchBox.sendKeys("keyword"); }
    public void searchButton() {searchButton.click(); }

    public void logIn(String id,String pass){
      closeCookie();
      clickLogIn();
      userId.sendKeys(id);
      password.sendKeys(pass);
      clickLogInButton();
    }
    public void updateLocation() {
        selectLocation();
        enterZipCode();
        clickUpdate();
    }
   public void registerToGeico(String pNumber,String Bday, String zCode){
        closeCookie();
        clickStartHere();
        policyNumber.sendKeys(pNumber);
        birthDay.sendKeys(Bday);
        zip.sendKeys(zCode);
        continueButton();
   }
   public void searchOptionInGeicoUsingDatabase(String keyword){
        searchTab();
        searchBox(keyword);
        searchButton();
   }

}