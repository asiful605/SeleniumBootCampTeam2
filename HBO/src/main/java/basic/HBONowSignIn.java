package basic;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HBONowSignIn extends WebAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signInTab;
    @FindBy (xpath = "//span[@class='components/BasicButton--children']")
    public WebElement hboNowLogo;
    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[4]/div/div[7]/div/div[2]")
    public WebElement hboNowSignInTab;
    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[3]/div/input")
    public WebElement enterEmailAddress;
    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[5]/div[1]/input")
    public WebElement enterPassword;
    @FindBy (xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[6]/div")
    public WebElement clickOnSignIn;
    public WebElement getSignInTab() {
        signInTab.click();
        return signInTab;
    }
    public WebElement getHboNowLogo() {
        hboNowLogo.click();
        return hboNowLogo;
    }
    public WebElement getHboNowSignInTab() {
        hboNowSignInTab.click();
        return hboNowSignInTab;
    }
    public WebElement getEnterEmailAddress(String email) {
        enterEmailAddress.sendKeys("email",email);
        return enterEmailAddress;
    }
    public WebElement getEnterPassword(String password) {
        enterPassword.sendKeys("password",password);
        return enterPassword;
    }
    public WebElement getClickOnSignIn() {
        clickOnSignIn.click();
        return clickOnSignIn;
    }
    public void errorMessage() {
        String actualText = driver.findElement(By.xpath("//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span/span")).getText();
        String expectedText = "The email address or password is incorrect. Please try again.";
        Assert.assertEquals(actualText,expectedText);
    }


}
