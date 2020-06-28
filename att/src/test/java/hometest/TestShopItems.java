package hometest;

import common.WebAPI;
import homepage.ShopItems;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestShopItems extends WebAPI {

    static ShopItems mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, ShopItems.class);
    }

    @Test
    public void testShopNow(){
        getInitElements();
        mainhomepage.clickShopnow();
    }
    @Test
    public void testColor() throws InterruptedException {
        getInitElements();
        mainhomepage.clickColor();
        Thread.sleep(100);
    }
    @Test
    public void testMemory() throws InterruptedException {
        getInitElements();
        mainhomepage.clickMemory();
        Thread.sleep(100);
    }
    @Test
    public void testwirelesssec(){
        getInitElements();
        mainhomepage.wirelessection();
    }
    @Test
    public void tests20PO(){
        getInitElements();
        mainhomepage.selectpriceOption();
    }
    @Test
    public void testfindPhones(){
        getInitElements();
        mainhomepage.findPhones();
    }
    @Test
    public void testclickAccessories(){
        getInitElements();
        mainhomepage.clickAccessories();
    }
    @Test
    public void testclickWirelessDeals(){
        getInitElements();
        mainhomepage.clickWirelessDeals();
    }
    @Test
    public void testclickCases(){
        getInitElements();
        mainhomepage.clickCases();
    }
    @Test
    public void testfindDeals(){
        getInitElements();
        mainhomepage.findDeals();
    }
}
