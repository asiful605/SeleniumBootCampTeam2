package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static webelements.HBOHomePageWebElements.*;

public class HBOPages extends WebAPI {
    @FindBy(how = How.XPATH,using = searchcareers)
    public WebElement usersearchcareers;
    @FindBy(how = How.CSS,using = searchboxforcareers)
    public WebElement usersearchboxforcareers;
    @FindBy(how = How.XPATH,using = searchcastandcrew)
    public WebElement usersearchcastandcrew;
    @FindBy(how=How.XPATH,using = searchboxelement)
    public WebElement usersearchboxelement;
    @FindBy(how = How.XPATH,using = gethbo)
    public WebElement usergethbo;
    @FindBy(how = How.XPATH,using = selectdropdownbutton)
    public WebElement clickdropdownbutton;
    @FindBy(how = How.XPATH,using = clickImageelement)
    public WebElement userclickonimage;
    @FindBy(how = How.XPATH,using = clickOnSearchButton)
    public WebElement userclickOnSearchButton;
    @FindBy(how = How.XPATH,using = chooseImage)
    public WebElement userchooseImage;
    @FindBy(how = How.XPATH,using = dropDownWebElements)
    public WebElement getUserdropDownWebElements;
    @FindBy(how = How.XPATH,using = findingSpecials)
    public WebElement getuserfindingSpecials;
    @FindBy(how = How.XPATH,using = findingramyYoussefFeelings)
    public WebElement getfindingramyYoussefFeelings;

    public void usersearcareers() {
        driver.get("url");
        driver.manage().window().maximize();
        usersearchcareers.click();
    }
    public void usersearchcastandcrew() {
        driver.manage().window().maximize();
        usersearchcastandcrew.click();
    }
    public void usersearchboxelement(){
        usersearchboxelement.sendKeys("The Newsroom");
        usersearchboxelement.getAttribute("The Newsroom");
        driver.manage().timeouts().implicitlyWait( 10 , TimeUnit.SECONDS);
        usersearchboxelement.click();
    }
    public void setUsergethbo(){
        usergethbo.click();
        usergethbo.getAttribute("Looking for HBO Max");
        driver.manage().timeouts().implicitlyWait( 10 , TimeUnit.SECONDS);
        usergethbo.click();

    }
    public void setClickdropdownbutton() {
        driver.getCurrentUrl();
        driver.manage().window().maximize();
        Select select = new Select(clickdropdownbutton);
        select.selectByIndex(2);
        Thread.getDefaultUncaughtExceptionHandler();
        //Wait wait = new FluentWait()
    }
    public void scrollDownWebPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
    }
    public void scrollDownToEnd() throws InterruptedException {
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }

    public void setUserclickonimage() throws InterruptedException {
        driver.get("https://www.hbo.com/insecure/insecuritea-podcast");
        userclickonimage.click();
        Thread.sleep(2000);
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }
    public void setClickSearchButton(){
        driver.get(url1);
        driver.manage().window().maximize();
        userclickOnSearchButton.isSelected();
        System.out.println(driver.getTitle());
    }
    public void setUserchooseImage(){
        driver.get(url2);
        driver.manage().window().maximize();
        userchooseImage.click();
        System.out.println(driver.getTitle());
    }
    public void userdropDownWebElements() throws InterruptedException {
        try{
            driver.get(url2);
            Select select = new Select(getUserdropDownWebElements);
            Thread.sleep(2000);
            select.selectByIndex(1);
            Thread.sleep(2000);
        }catch (Exception e){
            System.out.println("Not going to select anything");
        }
        System.out.println("It will show Current title : " + driver.getTitle());
        driver.navigate().to(url);
    }
    public void userfindingSpecials(){
        driver.get(url);
        driver.manage().window().maximize();
        getuserfindingSpecials.click();
    }
    public void userfindingramyYoussefFeelings(){
        driver.get(url);
        driver.manage().window().maximize();
        getuserfindingSpecials.click();
        getfindingramyYoussefFeelings.click();
        Thread.getDefaultUncaughtExceptionHandler();
    }








}
