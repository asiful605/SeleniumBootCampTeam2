package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import static webelements.at_tWebelements.*;

public class at_tHomePage extends WebAPI {

    @FindBy(how = How.CSS,using = searchbox)
    WebElement usersearchbox;
    @FindBy(how = How. CSS, using = accountlogin)
    WebElement useraccountlogin;
    @FindBy(how = How.CSS,using = clicksearchbutton)
    WebElement clickonsearchbutton;
    @FindBy(how = How.XPATH,using = clickimageiphone)
    WebElement webelementofiphoneimage;
    @FindBy(how = How.CSS,using = pricingoptions)
    WebElement webElementpricingoptions;

    public void setUsersearchbox(){
        driver.get(url);
        usersearchbox.sendKeys("AT&T deals");
    }
    public void searchclickbutton(){
        clickonsearchbutton.click();

    }
    public void clickaccountlogin() throws InterruptedException {
        useraccountlogin.click();
        Thread.sleep(3000);
    }

   public void clickiphoneimage(){
       webelementofiphoneimage.click();


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
// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);

    }
    public void selectpricingoptions(){
        Select prcoption = new Select(webElementpricingoptions);
        prcoption.selectByIndex(1);

    }











}
