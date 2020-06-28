package hometest;

import common.WebAPI;
import homepage.InternetPurchase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestInternetPurchase extends WebAPI {

    static InternetPurchase mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, InternetPurchase.class);
    }

    @Test
    public void supportClick() throws InterruptedException {
        getInitElements();
        mainhomepage.clickSupport();
        Thread.sleep(2000);
    }
    @Test
    public void shopAllOffers() throws InterruptedException {
        getInitElements();
        mainhomepage.shopAllOfferClick();
    }
    @Test
    public void enterAddress() throws InterruptedException {
        getInitElements();
        mainhomepage.enteradressfield();
    }
    @Test
    public void submitdeals() throws InterruptedException {
        getInitElements();
        mainhomepage.Baddresscheckbox();
    }
}
