package homepage;

import common.WebAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

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
    @FindBy(how= How.CSS,using = hoverOnMenu)
    WebElement MenuElement;
    @FindBy(how=How.XPATH,using=InternetElement)
    WebElement netElement;
    @FindBy(how=How.XPATH,using=ExploretElement)
    WebElement ExploreNetElement;
    @FindBy(how=How.CSS,using=imageElement)
    WebElement clickOnImageelement;
    @FindBy(how=How.CSS,using=popUpElement)
    WebElement PopUpWebElement;
    @FindBy(how=How.CSS,using=accountElement)
    WebElement accountWebElement;
    @FindBy(how=How.CSS,using=clickOnDropButton)
    WebElement dropButtonWebElement;



    //initialize and import webelements


    // created a method for searchbox
    public void usersearchbox(){
       driver.get(url);
        usersearchbox.sendKeys("AT&T deals");
    }
    public void searchclickbutton(){
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

    }
    // accountlog in
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

    // get subMenu item from MenuTab By mouse hovering

    public void hoveringOnMenuElement() throws InterruptedException {

        driver.get(url);
        driver.manage().window().maximize();
        Actions actions =new Actions(driver);
        actions.moveToElement(MenuElement).perform();
        actions.moveToElement(netElement).click().perform();
        Thread.sleep(3000);
        actions.moveToElement(ExploreNetElement).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Click on Image
    public void UserclickOnImageelement(){
        driver.get(forDealsUrl);
        clickOnImageelement.click();
        String title= driver.getTitle();
        System.out.println(title);
     // For validating
        Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }

    // Web Based PopUp
    public void handleAlert(){
        driver.get(prepaidUrl);
        driver.manage().window().maximize();
        Alert alt =driver.switchTo().alert();
        alt.accept();
    }


}
