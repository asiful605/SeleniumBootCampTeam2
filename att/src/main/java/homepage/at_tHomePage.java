package homepage;

import common.WebAPI;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static webelements.at_tWebelements.*;

//import javax.swing.*;

public class at_tHomePage extends WebAPI {
    @FindBy(how = How.CSS, using = searchbox) WebElement usersearchbox;
    @FindBy(how = How.XPATH, using = clicksearchbutton) WebElement clickonsearchbutton;
    @FindBy(how = How.CSS, using = accountlogin) WebElement useraccountlogin;
    @FindBy(how = How.XPATH, using = clickimageiphone) WebElement webelementofiphoneimage;
    @FindBy(how = How.CSS, using = pricingoptions) WebElement webElementpricingoptions;
    @FindBy(how = How.CSS,using = hoverOnMenu) WebElement MenuElement;
    @FindBy(how = How.XPATH,using = InternetElement) WebElement netElement;
    @FindBy(how = How.XPATH,using = ExploretElement) WebElement ExploreNetElement;
    @FindBy(how = How.CSS,using = imageElement) WebElement clickOnImageelement;
    @FindBy(how = How.CSS,using = popUpElement) WebElement PopUpWebElement;
    @FindBy(how = How.CSS,using = accountElement) WebElement accountWebElement;
    @FindBy(how = How.CSS,using = clickOnDropButton) WebElement dropButtonWebElement;
    @FindBy(how = How.XPATH, using = dealsupdate) WebElement getDealsUpdate;
    @FindBy(how = How.XPATH, using = signmeup) WebElement userSignmeUp;
    @FindBy(how = How.XPATH, using = upgrade) WebElement checkUpgrade;
    @FindBy(how = How.XPATH, using = menuoption) WebElement checkmenuoption;
    @FindBy(how = How.XPATH, using = shopiphone) WebElement useshopiphone;
    @FindBy(how = How.XPATH, using = Bundles) WebElement useBundles;
    @FindBy(how = How.XPATH, using = Business) WebElement useBusiness;
    @FindBy(how = How.XPATH, using = tv) WebElement usetv;
    @FindBy(how = How.XPATH, using = forDealsUrl) WebElement useforDealsUrl;
    @FindBy(how = How.XPATH, using = prepaidUrl) WebElement useprepaidUrl;

    public static void findBrokenLink() {
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Total links are " + links.size());
        for (int i = 0; i < links.size(); i++) {
            WebElement ele = links.get(i);
            String url = ele.getAttribute("href");
            verifyLinkActive(url);
        }
    }
    public static void verifyLinkActive(String linkUrl) {
        try {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(3000);
            httpURLConnect.connect();
            if (httpURLConnect.getResponseCode() == 200) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
            }
            if (httpURLConnect.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
                System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage() + " - " + HttpURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
        }
    }
    { driver.manage().window().maximize(); }
    public static void Enter() {
        Actions drpdown = new Actions(driver);
        drpdown.sendKeys(Keys.ENTER).perform();
    }
    public void usersearchbox(){
        usersearchbox.sendKeys("AT&T deals");
    }
    public void searchclickbutton() {
        usersearchbox.sendKeys("S20 ultra");
        Enter();
    }
    public void scrolldownwebpage(){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0, 2000)");
    }
    public void scrolltoend() throws InterruptedException {
        JavascriptExecutor scrollend = (JavascriptExecutor)driver;
        scrollend.executeScript("window.scrollTo(10, document.body.scrollHeight");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    public void clickaccountlogin() {
        useraccountlogin.click();
    }
    public void clickoniphoneimage() {
        webelementofiphoneimage.click();
    }
    public void selectpricingoption(){
        useshopiphone.click();
        webElementpricingoptions.click();
        Select prcoption = new Select(driver.findElement(By.xpath(pricingoptions)));
        prcoption.selectByIndex(1);
    }
    public void hoveringOnMenuElement() {
        Actions actions =new Actions(driver);
        actions.moveToElement(MenuElement).perform();
        actions.moveToElement(netElement).click().perform();
        actions.moveToElement(ExploreNetElement).click();
    }
    public void UserclickOnImageelement(){
        useforDealsUrl.click();
        clickOnImageelement.click();
        String title= driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(driver.getTitle(),driver.getTitle());
    }
    public void handleAlert(){
        useprepaidUrl.click();
        Alert alt =driver.switchTo().alert();
        alt.accept();
    }
    public void userDealsUpdate() throws InterruptedException {
        getDealsUpdate.sendKeys("asiful6288@yahoo.com");
        userSignmeUp.click();
    }
    public void checkUpgrade(){
        checkUpgrade.click();
    }
    public void menuOption(){
        checkmenuoption.click();
        Select option = new Select(driver.findElement(By.xpath(menuoption)));
        option.selectByIndex(1);
    }
    public void usebundle(){
        useBundles.click();
    }
    public void UseBusiness(){
        useBusiness.click();
    }
    public void useTV(){
       usetv.click();
    }
    public void getBrokenLink() {
        findBrokenLink();
    }
    public void enterKeyWord(String keyword){
    }
    public void searchItemsFromXlsx(String Items){
        usersearchbox.sendKeys(Items);
    }

    public void searchtemsFromDB(String keyword){
        enterKeyWord(keyword);
        Enter();
    }
}
