package homepage;

import WebElements.GeicoWebElements;
import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static WebElements.GeicoWebElements.*;
public class GEICOHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = popUpElement)
    WebElement popUp;
    @FindBy(how = How.XPATH, using = logInButton)
    WebElement logInTab;
    @FindBy(how = How.XPATH, using = AutoTab)
    WebElement AutoTabElement;
    @FindBy(how = How.CSS, using = checkBox)
    WebElement checkboxElement;
    @FindBy(how = How.CSS, using = insurance )
    WebElement userinsurance;
    @FindBy(how = How.XPATH, using = enterzipcode)
    WebElement userenterzipcode;
    @FindBy(how = How.XPATH, using = clicksearch)
    WebElement userclicksearch;
    @FindBy(how = How.XPATH, using = searchinfo)
    WebElement usersearchinfo;
    @FindBy(how = How.XPATH,using = moreproducts)
    WebElement usermoreproducts;
    @FindBy(how = How.LINK_TEXT,using =GeicoWebElements.trackaclaim)
     WebElement clicktrackaclaim;
    @FindBy(how=How.XPATH,using=clicklogo)
     WebElement clickonlogo;
    @FindBy (how=How.XPATH,using=GeicoWebElements.clickradioButton)
    WebElement clickradioButton;
    @FindBy (how=How.XPATH,using=GeicoWebElements.hoveronAccessYourPolicymenu)
    WebElement hoveronAccessYourPolicymenu;
    @FindBy(how=How.XPATH,using= GeicoWebElements.reportanaccident)
    WebElement reportanaccident;
    @FindBy(how=How.XPATH,using= GeicoWebElements.clickonmenu)
    WebElement clickonmenu;
    @FindBy(how=How.TAG_NAME,using=GeicoWebElements.clickonimage)
    WebElement clickonimage;
    @FindBy(how=How.XPATH,using=GeicoWebElements.Makeapayment)
    WebElement Makeapayment;
    @FindBy(how=How.XPATH,using=GeicoWebElements.clickcheckbox)
    WebElement clickcheckbox;
    @FindBy(how=How.XPATH,using=GeicoWebElements.clickonHomeowners)
    WebElement clickonHomeowners;
    @FindBy(how=How.XPATH,using=GeicoWebElements.clickAboutGEICOElement)
    WebElement clickAboutGEICOElement;
    @FindBy(how = How.XPATH, using =customerservice)
    WebElement customerserviceElement;
    @FindBy(how = How.XPATH, using =dropdownautotab)
    WebElement autotabElement;
    @FindBy(how = How.XPATH, using =hoveronvechileinsurance)
    WebElement hoveronvechileinsuranceElement;
    @FindBy(how = How.XPATH, using =validatetext)
    WebElement validatetextElement;


    // Handling Alert
        public void popUphandle() {
         driver.get(url);
        okAlert();
        }
    //cancel Alert
       public void cancelAlert(){
       Alert alert=driver.switchTo().alert();
       alert.dismiss();
        }

    //click  logInButton
    public void clickOnLogInButton() throws InterruptedException {
            sleepFor(2);
            logInTab.click();
    }
    //ScrollDownTheWebPage
    public void scrollDownTheWebPage() {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    //ClickOnAutoTab
    public void clickOnAutoTab() {
        System.out.println(driver.getTitle());
        AutoTabElement.click();
    }
    //CheckboxTab
     public void checkBoxTab() throws InterruptedException {
        AutoTabElement.click();
        checkboxElement.getAttribute("class");
        System.out.println(checkboxElement.getText());
        checkboxElement.click();
        boolean ischecked = checkboxElement.isSelected();
        System.out.println(" It is selected :" + ischecked);
    }
    //click on userinsurance
     public void userinsurance(){
        userinsurance.click();
        }
    //SetUserenterzipcode
    public void setUserenterzipcode(){
        userenterzipcode.sendKeys("11789");
    }
    //user search information
    public void searchInfo() throws InterruptedException {
        userclicksearch.click();
        usersearchinfo.sendKeys("quote");
    }
    //Click UserProducts
    public void setUsermoreproducts() throws InterruptedException {
    usermoreproducts .click();

    }
    //Click on trackclaim
     public  void trackaclaim() throws InterruptedException {
            clicktrackaclaim.click();
        }
    //click on logo
     public void ClickOnLogo(){
            clickonlogo.click();
        }
    //click on radioButton
    public void radioButton() {
            clickradioButton.click();
    }
    //mousehovering
    public void hoverOnAccessYourPolicy() throws InterruptedException {
    hoveronAccessYourPolicymenu.click();
        }
        //Report an accident
    public void reportanaccident() throws InterruptedException {
    reportanaccident.click();
    }
    //click on menu
    public void clickonmenu(){
            clickonmenu.click();
        }
    //click on Image
       public void clickonimageelement (){
            clickonimageelement();
       String title=driver.getTitle();
       System.out.println(title);
        }
    //click make a payment
      public void setMakeapayment(){
            Makeapayment.click();
        }
    //click on checkmark
     public void setClickcheckmark(){
     clickcheckbox.click();;
        }
    //click on Homeowners
    public void setClickonHomeowners() {
        clickonHomeowners.click();
    }
    //click on GEICOElement
    public void clickonGEICOElement(){
    clickAboutGEICOElement.click();
        }
        public void validatefooterItems(String expectedResult) {
        String actualresult = "customerserviceElement";
        Assert.assertEquals("Search Result not Displayed", expectedResult, actualresult);
    }
    public void userclickonDropButton() {
        selectOptionByVisibleText(autotabElement, "Identity Protection");
        }
     public void hoveronhoveronvechileinsurance(){
     hoveronvechileinsuranceElement.click();
        }
     public void validatetext(){
     validatetextElement.click();

     }


    }


























