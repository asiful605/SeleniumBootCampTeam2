package hometest;
import common.WebAPI;
import homepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
public class EbayHomeTest extends WebAPI {

    static EbayHomePage EbayHomePage;// Reference variable/object of EbayHomePage
    public static void getInitElements() {
        EbayHomePage = PageFactory.initElements(driver, EbayHomePage.class);
    }
    @Test(priority=1)
    public void testclickDailyDeals() {
    driver.manage().window().fullscreen();
    getInitElements();
    EbayHomePage.clickDailyDeals();
    }
    @Test(priority=2)
    public void testclickShoppingCart(){
     getInitElements();
     EbayHomePage.clickShoppingCart();
    }
    @Test(priority=4)
    public void clickHelpandContact(){
    getInitElements();
    EbayHomePage.clickHelpandContact();
   }
    @Test(priority=5)
   public void clickFashion(){
    getInitElements();
    EbayHomePage.clickFashion();
    }
    @Test(priority=6)
    public void clicksearchBox() {
       getInitElements();
        EbayHomePage.clicksearchBox();
    }
    @Test(priority=7)
    public void clickshopbyCategory(){
     getInitElements();
     EbayHomePage.clickshopbyCategory();

    }
    @Test(priority=8)
    public void clickElectronics(){
    getInitElements();
    EbayHomePage.clickElectronics();
   }
    @Test(priority=9)
    public void clickbrandoutlet() {
    getInitElements();
    EbayHomePage.clickbrandoutlet();
    }
    @Test(priority=10)
    public void clickSportingGoods(){
    getInitElements();
    EbayHomePage.clickSportingGoods();
    }
    @Test(priority=11)
    public void clickwatchlist() {
    getInitElements();
    EbayHomePage.clickwatchlist();
    }
    @Test(priority=12)
    public void clickebaymotors(){
    getInitElements();
    EbayHomePage.clickMotors();
    }
    @Test(priority=13)
    public void clickallcategories(){
    getInitElements();
    EbayHomePage.clickallcategories();
    }
    @Test(priority=14)
    public void clickebaysells(){
    getInitElements();
    EbayHomePage.clickebaysells();
    }
    @Test(priority=15)
     public void clickMusic() {
     getInitElements();
     EbayHomePage.clickMusic();
    }
   @Test(priority=16)
    public void testscrollDownTheWebPage() throws InterruptedException {
    getInitElements();
    EbayHomePage.scrollDownTheWebPage();
    }
    @Test(priority=17)
    public void testhoveringonlogo() throws InterruptedException {
    getInitElements();
    EbayHomePage.hoveringonlogo();
    }
    @Test(priority=18)
    public void testhoveronshopbycategory(){
    getInitElements();
    EbayHomePage.hoveronshopbycategory();

    }
    @Test(priority=19)
    public void testsearchbox(){
    getInitElements();
    EbayHomePage.clicksearchBox();
    }
    @Test(priority=20)
    public void testselecthealthandbeautyDropDown(){
    getInitElements();
    EbayHomePage.selecthealthandbeautyDropDown();

    }





}
