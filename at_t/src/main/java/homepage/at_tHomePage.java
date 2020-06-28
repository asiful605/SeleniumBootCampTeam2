package homepage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static webelements.at_tWebelements.*;

   //first extend the WebAPI
   public class at_tHomePage extends WebAPI {
    // using Findbyannotation which is under selinium
    // must import Webelements
    @FindBy(how = How.CSS, using = searchbox )
    WebElement usersearchbox;
    @FindBy(how = How.CSS, using = clicksearchbutton )
    WebElement clickonsearchbutton;
    @FindBy(how = How.CSS, using = accountlogin)
    WebElement useraccountlogin;
    @FindBy(how = How.XPATH, using = clickimageiphone)
    WebElement webelementofiphoneimage;
    @FindBy(how = How.CSS, using = pricingoptions)
    WebElement webElementpricingoptions;
       @FindBy(how = How.XPATH,using = internet)
       WebElement clickinternet;
       @FindBy(how = How.XPATH,using = support)
       WebElement usesupport;
       @FindBy(how = How.XPATH, using = shopalloffers)
       WebElement useshopalloffers;
       @FindBy(how = How.XPATH, using = adressfield)
       WebElement enteradressfield;
       @FindBy(how = How.XPATH, using = zipcode)
       WebElement usezipcode;
       @FindBy(how = How.XPATH, using = aaddresscheckbox)
       WebElement checkBaddresscheckbox;
       @FindBy(how = How.XPATH, using = listclick)
       WebElement checklistclick;
       @FindBy(how = How.XPATH, using =submitdeals)
       WebElement checksubmitdeals;

       //initialize and import webelements
    // created a method for searchbox
    public void usersearchbox(){
        usersearchbox.sendKeys("AT&T deals");
    }public void searchclickbutton(){
        clickonsearchbutton.click();
    }
    //Scrolldownwebpage
    public void scrolldownwebpage(){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0, 2000)");

    }
    //ScrolltoEnd
    public void scrolltoend() throws InterruptedException {
        JavascriptExecutor scrollend = (JavascriptExecutor)driver;
        scrollend.executeScript("window.scrollTo(10, document.body.scrollHeight");
    //  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);

    }// accountlog in
    public void clickaccountlogin() {
        useraccountlogin.click();
    }
    //clickoniphoneimage
    public void clickoniphoneimage() {
        webelementofiphoneimage.click();
    }
    //iphonepricing option
    public void selectpricingoption(){
        driver.get("https://www.att.com/buy/phones/apple-iphone-11-64gb-purple.html?offerid=13700004");
        webElementpricingoptions.click();
        Select prcoption = new Select(driver.findElement(By.xpath(pricingoptions)));
        prcoption.selectByIndex(1);
    }
       public void clickSupport(){
           usesupport.click();
       }
       public void shopAllOfferClick() {
           clickinternet.click();
           useshopalloffers.click();
       }
       public void enteradressfield() throws InterruptedException {
           clickinternet.click();
           useshopalloffers.click();
           enteradressfield.sendKeys("452 main st");
           checklistclick.click();
           usezipcode.sendKeys("11789");
           checkBaddresscheckbox.isSelected();
           checksubmitdeals.click();
           Thread.sleep(5000);
       }
       public void aaddresscheckbox() throws InterruptedException {
           clickinternet.click();
           useshopalloffers.click();
           checkBaddresscheckbox.isSelected();
           Thread.sleep(5000);
       }


}
