package homepage;
import WebElements.EbayWebElements;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class EbayHomePage extends WebAPI {

    @FindBy(how= How.XPATH,using= EbayWebElements.DailyDeals)
     WebElement DailyDeals;
    @FindBy(how=How.XPATH,using=EbayWebElements.ShoppingCart)
     WebElement shoppingCart;
    @FindBy(how=How.XPATH,using=EbayWebElements.HelpandContact)
     WebElement helpandContact;
    @FindBy(how=How.LINK_TEXT,using=EbayWebElements.Fashion)
     WebElement Fashion;
    @FindBy(how=How.XPATH,using=EbayWebElements.searchBox)
     WebElement searchBox;
    @FindBy(how=How.XPATH,using=EbayWebElements.shopbyCategory)
     WebElement shopbyCategory;
    @FindBy(how=How.XPATH,using=EbayWebElements.Electronics)
     WebElement Electronics;
    @FindBy(how=How.XPATH,using=EbayWebElements.brandoutlet)
     WebElement brandoutlet;
    @FindBy(how=How.LINK_TEXT,using=EbayWebElements.SportingGoods)
     WebElement SportingGoods;
    @FindBy(how=How.XPATH,using=EbayWebElements.watchlist)
     WebElement watchlist;
    @FindBy(how=How.LINK_TEXT,using=EbayWebElements.Motors)
     WebElement Motors;
    @FindBy(how=How.XPATH,using=EbayWebElements.allcategories)
     WebElement allcategories;
    @FindBy(how=How.XPATH,using =EbayWebElements.ebaysells )
    WebElement ebaysells;
    @FindBy(how=How.LINK_TEXT,using=EbayWebElements.Music)
    WebElement Music;
    @FindBy(how=How.ID,using =EbayWebElements.hoveringonlogo )
     WebElement hoveringonlogo;
    @FindBy(how=How.ID,using =EbayWebElements.hoveronshopbycategory )
    WebElement hoveronshopbycategory;
    @FindBy(how=How.ID,using =EbayWebElements.searchBox )
    WebElement searcboxhelement;
    @FindBy(how=How.ID,using =EbayWebElements.dropdownelement )
    WebElement dropdownelement;




    //set up methods:
    public void clickDailyDeals(){
    DailyDeals.click();
    }
    public void clickShoppingCart(){
     shoppingCart.click();
    }
    public void clickHelpandContact(){
     helpandContact.click();
    }
    public void clickFashion(){
     Fashion.click();
    }
    public void clicksearchBox(){
     searchBox.click();
    }
    public void clickshopbyCategory(){
    shopbyCategory.click();
    }
    public void clickElectronics() {
        Electronics.click();
    }
    public void clickbrandoutlet(){
        brandoutlet.click();
    }
    public void  clickSportingGoods(){
        SportingGoods.click();
    }
    public void clickwatchlist(){
    watchlist.click();
    }
    public void clickMotors(){
        Motors.click();
    }
    public void clickallcategories(){
        allcategories.click();
    }
    public void clickebaysells(){
        ebaysells.click();
    }
    public void clickMusic(){
        Music.click();
    }
    public void scrollDownTheWebPage() {
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeAsyncScript("window.scrollBy(0,1000");
    }
    public void hoveringonlogo() throws InterruptedException {
        Actions actions = new Actions(driver);
    }
    public void hoveronshopbycategory(){
        Actions action=new Actions(driver);
    }
    public void clicksearchbox() {
    searcboxhelement.sendKeys("hand soap");
    }
    public void selecthealthandbeautyDropDown() {
        selectOptionByVisibleText(dropdownelement, "health and beauty");
        driver.getTitle();

    }

}
