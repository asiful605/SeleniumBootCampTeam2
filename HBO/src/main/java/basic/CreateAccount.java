package basic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class CreateAccount extends HomePage {

    @FindBy(xpath = "///*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/div/a/span")
    public WebElement getHBO;
    @FindBy(xpath = "//*[@id=\"root\"]/main/section/div[2]/div/div/div[2]/div/div[1]/div[1]/div/div[1]/div/div/a/span")
    public WebElement startYourFreeTrial;
    @FindBy(xpath = "///*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[1]/input")
    public WebElement email;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[4]/div[1]/div[2]/input")
    public WebElement passWord;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[7]/div[1]/input")
    public WebElement firstName;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[9]/div[1]/input")
    public WebElement lastName;
    @FindBy(xpath = "///*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[11]/div[1]/input")
    public WebElement zipCode;
    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[2]/div[12]/div[1]/div")
    public WebElement agreeToTerms;
    @FindBy(xpath = "///*[@id=\"Viewport\"]/div[2]/div[2]/div[2]/div[2]/div/div[3]/div/div")
    public WebElement clickOnCreateAccount;

    public void clickGetHBO() { getHBO.click();

    TestLogger.log("GetHBO Opened");
    }
    public void getStartYourFreeTrial() { startYourFreeTrial.click();
        TestLogger.log("New Web Page Opened");}

    public void getEmail() {email.sendKeys("ev@gmail.com");
        TestLogger.log("Valid Email has been entered");}

    public void invalidEmail() {email.sendKeys("ajsnd@jansda.com");
        TestLogger.log("Invalid email has been entered");}

    public void getPassWord() { passWord.sendKeys("abcd#1234");
        TestLogger.log("Valid Password is entered");}

    public void invalidPassword(){passWord.sendKeys("abc123");
        TestLogger.log("Invalid password is entered");}

    public void getFirstName() { firstName.sendKeys("Shahana");
        TestLogger.log("First Name is entered");}

    public void emptyFirstName() {firstName.sendKeys("");
        TestLogger.log("No First Name is entered");}

    public void getLastName() { lastName.sendKeys("Sharmin");
        TestLogger.log("Last name is entered");}

    public void emptyLastName() {lastName.sendKeys("");
        TestLogger.log("No last name is entered");}

    public void getZipCode() { zipCode.sendKeys("11373");
        TestLogger.log("Zip code is entered");}

    public void getAgreeToTerms() { agreeToTerms.click();
        TestLogger.log("Agreed on terms");}

    public void getClickOnCreateAccount() { clickOnCreateAccount.click();
        TestLogger.log("Account is created after valid credentials are entered");}






















}
