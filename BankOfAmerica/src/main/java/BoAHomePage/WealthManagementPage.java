package BoAHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webElements.WebElementsForBoA.OnlineIDWebElements;
import static webElements.WebElementsForBoA.passcodeWebElement;
import static webElements.WebElementsForBoA.saveOnlineIdWebElement;
import static webElements.WebelementsForSmallBusinessVideo.merrilLearnMore2Element;
import static webElements.WebelementsForSmallBusinessVideo.merrilLearnMoreElement;
import static webElements.WebelementsForSmallBusinessVideo.privateBankElement;
import static webElements.WebelementsForSmallBusinessVideo.url;
import static webElements.WebelementsForSmallBusinessVideo.*;

public class WealthManagementPage extends WebAPI {

    @FindBy(xpath =  merrilLearnMoreElement)
    WebElement merrilLearnMoreWebElement;
    @FindBy (xpath = privateBankElement)
    WebElement privateBankWebElement;
    @FindBy(xpath = merrilLearnMore2Element)
    WebElement merrilLearnMore2WebElement;
    @FindBy(xpath =  privateBank2Element)
    WebElement privateBank2WebElement;
    @FindBy(how = How.CSS, using = OnlineIDWebElements)
    public WebElement sendingID;
    @FindBy(how = How.CSS, using = passcodeWebElement)
    public WebElement passCodeId;
    @FindBy(how = How.CSS, using = saveOnlineIdWebElement)
    public WebElement clickOnCheckBox;

    public void merrillLearnMoreClick() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMoreWebElement.click();
    }
    public void privateBankClick() throws InterruptedException {
        Thread.sleep(3500);
        privateBankWebElement.click();
    }
    public void merrilLearnMore2Click() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMore2WebElement.click();
    }
    public void privateBank2Click() throws InterruptedException {
        Thread.sleep(3500);
        privateBank2WebElement.click();
    }
    public void merrillPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        merrilLearnMoreWebElement.click();
        driver.getTitle();
    }
    public String privateBankPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        privateBankWebElement.click();
        return driver.getTitle();
    }
    public String  privateBankActualPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        driver.navigate().to(url);
        return  driver.getTitle();
    }
    public String  merrillActualPageTitle() throws InterruptedException {
        Thread.sleep(3500);
        driver.navigate().to(url);
        return  driver.getTitle();
    }
    public void enterKeyword() {
        sendingID.sendKeys("halena");
        sendingID.click();
    }
    public void enterPassword() throws InterruptedException {
        passCodeId.sendKeys("12345");
        Thread.sleep(1000);
    }

    public void checkOnsaveOnlineIdBox() {
        sendingID.sendKeys("jaman");
        passCodeId.sendKeys("245345");
        clickOnCheckBox.click();
    }
}

