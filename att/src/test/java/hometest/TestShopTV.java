package hometest;

import common.WebAPI;
import homepage.ShopTV;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestShopTV extends WebAPI {
    static ShopTV homepage;
    public void getInitElements() {
        homepage = PageFactory.initElements(driver, ShopTV.class);
    }
    @Test
    public void TvTest(){
        getInitElements();
        homepage.tv();
    }
    @Test
    public void checkofferTest(){
        getInitElements();
        homepage.checkoffers();
    }



}
