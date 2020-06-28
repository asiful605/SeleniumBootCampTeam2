package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.Webelements.*;


public class GEICOHomePage extends WebAPI {

    @FindBy(how= How.XPATH,using=popUpElement)
    WebElement popUp;
    @FindBy(how = How.XPATH,using = logInWebElements)
    WebElement checkLogIn;
    @FindBy(how= How.XPATH,using=logInButton)
    WebElement checkLogInButton;
    @FindBy(how= How.XPATH,using=AutoTab )
    WebElement AutoTabElement;
    @FindBy(how= How.CSS,using=checkBox)
    WebElement checkBoxElement;
    @FindBy(how= How.XPATH,using=idWebElements)
    WebElement checkID;
    @FindBy(how= How.XPATH,using=passwordWebElement)
    WebElement checkPW;
    @FindBy(how= How.CSS,using=boatelement)
    WebElement boatWebelement;
    @FindBy(how= How.CSS,using=getBoatelement)
    WebElement getBoatwebelement;
    @FindBy(how= How.XPATH,using=checkZIP)
    WebElement getZIP;
    @FindBy(how = How.XPATH,using = checkQUOTE)
    WebElement getQUOTE;


   /*
   popUpHandeling
   */
    public void popUphandle(){
        driver.get(url);
        okAlert();}

    public void clickOnLogInButton() throws InterruptedException {
        sleepFor(2); ;
        checkLogInButton.click(); }

    /*
    do CheckBox
    passing data inside input field
     */
    public void doCheckBox(){
        getZIP.sendKeys("11373");
        getQUOTE.click();
    }

    /*
    scrollDownWebPage
     */
    public void scrollDownTheWebPage(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)"); }

    public void clickOnAutoTab(){
        System.out.println(driver.getTitle());
        AutoTabElement.click(); }

    public void doCheck(String id, String password) {
        windowMaximize();
        //checkID.sendKeys("pnt123@gmail.com");
        //checkID.click();
        //checkID.sendKeys("1234");
        //checkID.click();
        checkLogIn.click();

    }

     /*
     checkBox handeling
      */
    public void checkBoxTab() throws InterruptedException {
        sleepFor(2); ;
        AutoTabElement.click();
        checkBoxElement.getAttribute("class");
        System.out.println(checkBoxElement.getText());
        sleepFor(2);
        checkBoxElement.click();
        sleepFor(2);
        boolean ischecked= checkBoxElement.isSelected();
        System.out.println(" It is selected :" +  ischecked); }


    public void userclickonboatWebelement(){
        boatWebelement.click();
    }

    /*
     do validation WebElements
     */
    public void validateboatWebelement(){
        String expectedText=" Boat";
        String actualText=getBoatwebelement.getText();
        if( actualText.equals(expectedText) ){
            System.out.println(actualText);
        }else{
            System.out.println(actualText);
        }
    }
    /*
    validation by Text
     */
    public void setDoValidateText(String validateText){
        String actualResult = "AutoProperty";
        Assert.assertEquals("consoleLog(\"AutoProperty\");validation();",validateText,actualResult);
    }



}

























