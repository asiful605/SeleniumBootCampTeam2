package hometest;

import common.WebAPI;
import homepage.EbayHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EbayHomeTest extends WebAPI {

    static EbayHomePage ebayhomePage;

    public static void getInitElements() {
        ebayhomePage = PageFactory.initElements(driver, EbayHomePage.class);
    }
    @Test
    public void testuserCliconkdropButtonelement() {
        getInitElements();
        ebayhomePage.userClickdropButton();
    }
    @Test
    public void testuserscrollDownWebPage() {
        getInitElements();
        ebayhomePage.theScrollDownWebPage();
    }
    @Test
    public void testuserscrollDownTillEnd() {
        getInitElements();
        ebayhomePage.theScrollDownTillEnd() ;
    }
    @Test
    public void testuserSearchBox() {
        getInitElements();
        ebayhomePage.userSeachingBox();
    }
    @Test
    public void testuserclickOnSubmitButton() {
        getInitElements();
        ebayhomePage.userclickOnSubmitButton();
    }
    @Test
    public void testuserclickOnShoppingCart() {
        getInitElements();
        ebayhomePage.userclickOnShoppingCart();
    }
    @Test
    public void Tesfashion(){
        getInitElements();
        ebayhomePage.fashion();
    }
    @Test
    public void Teselectronics(){
        getInitElements();
        ebayhomePage.electronics();
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
    @Test
    public void Testcollectandarts(){
        getInitElements();
        ebayhomePage.collectandarts();
    }
    @Test
    public void Testtoys(){
        getInitElements();
        ebayhomePage.toys();
    }
}
