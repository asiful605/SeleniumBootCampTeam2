package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ShopItems extends WebAPI {
    @FindBy(how = How.XPATH,using ="//span[@class='z1-tier1-text'][contains(text(),'Deals')]")
    WebElement deals;
    @FindBy(how=How.XPATH,using = "//a[contains(@class,'_20CgK _1hxmk')]//span[contains(@class,'')][contains(text(),'Phones')]")
    WebElement phones;
    @FindBy(how = How.XPATH,using = "//span[@class='gn-z2-Navstrip-Menutext show-unauth'][contains(text(),'Bring your own')]")
    WebElement findownPhone;
    @FindBy(how=How.XPATH,using = "//span[contains(text(),'Wireless deals')]")
    WebElement findAccessories;
    @FindBy(how=How.XPATH,using = "//span[contains(text(),'Wireless deals')]")
    WebElement wirelessDeals;
    @FindBy(how=How.XPATH,using = "//a[contains(text(),'Get started')]")
    WebElement getStarted;
    @FindBy(how=How.XPATH,using = "//*[@id='Combined-Shape']")
    WebElement closepopup;
    @FindBy(how=How.XPATH,using = "//a[@class='btn-arrow on-dark btn-large btn btn-primary _2NV38'][contains(text(),'Shop now')]")
    WebElement shopNow;
    @FindBy(how=How.XPATH,using = "//input[@id='sku9240434']")
    WebElement chooseColor;
    @FindBy(how = How.XPATH,using = "//*[@id=\"Capacity\"]/div/label[2]/div")
    WebElement chooseMemory;
    @FindBy(how=How.XPATH,using = "//*[@id=\"pricingTermsSelection\"]/div/label[2]/div")
    WebElement priceoption;
    @FindBy(how=How.XPATH,using = "//*[@id='pricing-options-button']")
    WebElement pickPlanFromDropDown;
    @FindBy(how=How.XPATH,using = "//*[@id='next-checkbox']")
    WebElement addPlan;
    @FindBy(how=How.XPATH,using = "//button[contains(@class,'btn btn-primary-2 false bg-functional-blue color-ui-white btn-large btn-full-width')]")
    WebElement clickContinue;
    @FindBy(how=How.XPATH,using = "//span[@class='z1-tier1-text'][contains(text(),'Wireless')]")
    WebElement usewireless;
    @FindBy(how=How.XPATH,using = "//*[@id=\"BENEFITS_PANEL3story\"]/div/span/a")
    WebElement shopphones;

    { driver.manage().window().maximize(); }

    public void wirelessection(){
        usewireless.click();
    }
    public void findDeals() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", deals);
    }
    public void findPhones() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", phones);
    }
    public void clickAccessories(){
        usewireless.click();
        findAccessories.click();
    }
    public void clickWirelessDeals() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", wirelessDeals);
    }
    public void clickCases(){
        getStarted.click();
        driver.navigate().back();
    }
    public void clickShopnow(){
        usewireless.click();
        shopNow.click();
    }
    public void clickColor(){
        usewireless.click();
        shopNow.click();
        chooseColor.click();
    }
    public void clickMemory(){
        usewireless.click();
        shopNow.click();
        chooseMemory.click();
    }
    public void selectpriceOption(){
        usewireless.click();
        shopphones.click();
        priceoption.click();
    }
}
