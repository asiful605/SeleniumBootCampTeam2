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
import static webelements.at_tWebelements.*;

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

    public void usersearchbox(){
        usersearchbox.sendKeys("AT&T deals");
    }
    public void searchclickbutton() {
        usersearchbox.sendKeys("S20 ultra");
        Enter();
    }
    public void scrolldownwebpage(){
        //
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0, 2000)");
    }
    public void scrolltoend() {
        JavascriptExecutor scrollend = (JavascriptExecutor)driver;
        scrollend.executeScript("window.scrollTo(10, document.body.scrollHeight");
        implicitwait();
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
        implicitwait();
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
