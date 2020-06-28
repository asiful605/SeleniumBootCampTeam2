package hometest;

import common.WebAPI;
import home.HomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class EbayHomeTest extends WebAPI {
    static HomePage ebayhomePage;

    public static void getInitElements() {
        ebayhomePage = PageFactory.initElements(driver, HomePage.class);
    }
    @Test(priority = 1)
    public void testuserCliconkdropButtonelement() {
        getInitElements();
        ebayhomePage.userClickdropButton();
    }
    @Test(priority = 2)
    public void testuserscrollDownWebPage() {
        getInitElements();
        ebayhomePage.theScrollDownWebPage();
    }
    @Test(priority = 3)
    public void testuserscrollDownTillEnd() {
        getInitElements();
        ebayhomePage.theScrollDownTillEnd() ;
    }
    @Test(priority = 4)
    public void testuserSearchBox() {
        getInitElements();
        ebayhomePage.userSeachingBox();
    }
    @Test(priority = 5)
    public void testuserclickOnSubmitButton() {
        getInitElements();
        ebayhomePage.userclickOnSubmitButton();
    }
    @Test(priority = 6)
    public void testuserclickOnShoppingCart() {
        getInitElements();
        ebayhomePage.userclickOnShoppingCart();
    }
    @Test
    public void testusersearchproductvalidation() {
        getInitElements();
        ebayhomePage.userSeachingBox();
        ebayhomePage.clickOnSearchingbutton();
        ebayhomePage.validateSearchProduct();
    }
    @Test
    public void testuservalidateimageElement() {
        getInitElements();
        ebayhomePage.userclickonimageWebelement();
        ebayhomePage.validateimageElement();
    }
}
