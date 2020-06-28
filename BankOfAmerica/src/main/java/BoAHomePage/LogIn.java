package BoAHomePage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.io.IOException;

import static webElements.WebElementsForBoA.*;

public class LogIn extends WebAPI {
    @FindBy(how = How.CSS, using = OnlineIDWebElements)
    public WebElement sendingID;
    @FindBy(how = How.CSS, using = passcodeWebElement)
    public WebElement passCodeId;
    @FindBy(how = How.CSS, using = saveOnlineIdWebElement)
    public WebElement clickOnCheckBox;
    @FindBy(how = How.CSS, using = signinbutton)
    public WebElement clickOnsigninbutton;
    @FindBy(how = How.CSS, using = validationSignin)
    public WebElement validationSigninelement;
    @FindBy(how = How.XPATH, using = radiobutton)
    public WebElement radiobuttonelement;
    @FindBy(how = How.XPATH, using = acNumber)
    public WebElement acNumberelement;
    @FindBy(how = How.CSS, using = validatetext)
    public WebElement validatetextelement;
    @FindBy(how = How.XPATH, using = SSNnumber)
    public WebElement SSNnumberelement;

    public void enterKeyword() {
        typeByCss(OnlineIDWebElements, "shahana");
        clickByCSS(OnlineIDWebElements);
        sendingID.isDisplayed();
        navigateBack();
        System.out.println("It shows the title of boa :" + driver.getTitle());
    }

    public void enterPassword() {
        typeByCss(passcodeWebElement, "12345");
        System.out.println(passCodeId.getSize() + passCodeId.getAttribute("password") + passCodeId.getText());
        implicitwait();
    }
    public void checkOnsaveOnlineIdBox() {
        typeByCss(OnlineIDWebElements, "shahana");
        typeByCss(passcodeWebElement, "12345");
        clickByCSS(saveOnlineIdWebElement);
        boolean ischecked = clickOnCheckBox.isSelected();
        System.out.println(" It is selected :" +  ischecked);
        boolean isDesplayedTheValue = clickOnCheckBox.isDisplayed();
        System.out.println("It is desplayed the value :" +  isDesplayedTheValue);
    }
    public void userSignin(){
        clickByCSS(signinbutton);
    }
    public void uservalidationSigninelement(String expectedResult){
        try{
            String actual= getTextByCss( validationSignin);
            Assert.assertEquals("actual",expectedResult,"nothing");
        }catch(Exception e){
        }
    }
    public void useracNumberelement(){
        navigateTo("https://secure.bankofamerica.com/auth/forgot/reset-entry/?reason=MSGSFR01");
        typeByCss(acNumber, "789345");
    }
    public void uservalidatetextelement(String expected){
        try{
            navigateTo("https://secure.bankofamerica.com/auth/forgot/reset-entry/?reason=MSGSFR01");
            String actual= getTextByCss( validatetext);
            Assert.assertEquals("actual",expected ,"nothing");
        }catch(Exception e){
        }
    }
    public void userSSNnumberelement(){
        navigateTo("https://secure.bankofamerica.com/auth/forgot/reset-entry/?reason=MSGSFR01");
        typeByCss(SSNnumber, "234567");
    }
    public void theBrokenLinks() throws IOException {
        brokenLink();
    }



}