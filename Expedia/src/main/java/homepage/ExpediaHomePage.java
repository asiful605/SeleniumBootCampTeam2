package homepage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static WebElements.ExpediaHomePageWebElements.*;

public class ExpediaHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = "//div[contains(text(),'English')]")
    WebElement languageButton;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Support')]")
    WebElement supportButton;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'Trips')]")
    WebElement tripsButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Stays')]")
    WebElement staysButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Flights')]")
    WebElement flightsButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cars')]")
    WebElement carsButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Packages')]")
    WebElement packagesButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Things to do')]")
    WebElement thingstodoButton;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Cruises')]")
    WebElement cruisesButton;
    @FindBy(how = How.XPATH, using = "//div[contains(text(),'More travel')]")
    WebElement moretravelButton;


    public void clickLanguageButton() throws InterruptedException {
        languageButton.click();
        //Thread.sleep(500);
    }

    public void clickSupportButton() throws InterruptedException {
        supportButton.click();
        //Thread.sleep(500);
    }

    public void clickTripsButton() throws InterruptedException {
        tripsButton.click();
    }

    public void clickStaysButton() throws InterruptedException {
        staysButton.click();
    }

    public void clickFlightsButton() throws InterruptedException {
        flightsButton.click();
    }

    public void clickCarsButton() throws InterruptedException {
        carsButton.click();
    }

    public void clickPackagesButton() throws InterruptedException {
        packagesButton.click();
    }

    public void clickThingsToDoButton() throws InterruptedException {
        thingstodoButton.click();
    }

    public void clickCruisesButton() throws InterruptedException {
        cruisesButton.click();
    }

    public void clickMoreTravelButton() throws InterruptedException {
        moretravelButton.click();
    }
}





