package BoAHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static webElements.WebElementsForBoA.*;

public class Login extends WebAPI {
    @FindBy(how = How.CSS, using = OnlineIDWebElements)
    public WebElement sendingID;
    @FindBy(how = How.CSS, using = passcodeWebElement)
    public WebElement passCodeId;
    @FindBy(how = How.CSS, using = saveOnlineIdWebElement)
    public WebElement clickOnCheckBox;

    public void enterKeyword() {
        sendingID.sendKeys("halena");
        sendingID.click();
        sendingID.isDisplayed();
        driver.navigate().back();
        System.out.println("It shows the title of boa :" + driver.getTitle());
    }
    public void enterPassword() throws InterruptedException {
        passCodeId.sendKeys("12345");
        System.out.println(passCodeId.getSize() + passCodeId.getAttribute("password") + passCodeId.getText());
        Thread.sleep(1000);
    }
    // Checking Box
    public void checkOnsaveOnlineIdBox() {
        sendingID.sendKeys("halena");
        passCodeId.sendKeys("12345");
        clickOnCheckBox.click();
        boolean ischecked = clickOnCheckBox.isSelected();
        System.out.println(" It is selected :" +  ischecked);
        boolean isDesplayedTheValue = clickOnCheckBox.isDisplayed();
        System.out.println("It is desplayed the value :" +  isDesplayedTheValue);
    }
}
