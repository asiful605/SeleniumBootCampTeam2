package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.webelements.*;

public class EbayHomePage extends WebAPI {

    @FindBy(how = How.CSS, using = dropbutton)
    WebElement dropButtonelement;
    @FindBy(how= How.XPATH, using=  collectandarts)
    public WebElement hovercollectandarts;
    @FindBy(how = How.CSS, using = searchBox)
    WebElement searchBoxelement;
    @FindBy(how = How.CSS, using = submitButton)
    WebElement submitButtonelement;
    @FindBy(how = How.CSS, using = ShoppingCart)
    WebElement ShoppingCartelement;
    @FindBy(how= How.XPATH, using= toys)
    public WebElement hovertoys;
    @FindBy(how = How.CSS, using = dropButtonOfElement)
    WebElement DropButtonElement;
    @FindBy(how = How.CSS, using = searchElement)
    WebElement searchProductElement;
    @FindBy(how = How.CSS, using = searchButton)
    WebElement searchButtonElement;
    @FindBy(how = How.CSS, using = shoesgetText)
    WebElement shoesgetTextElement;
    @FindBy(how = How.CSS, using = imageelement)
    WebElement imageWebelement;
    @FindBy(how = How.CSS, using = imageGetText)
    WebElement imageGetTextWebelement;
    @FindBy(how= How.XPATH, using=  fashion)
    public WebElement hoverfashion;
    @FindBy(how= How.XPATH, using=  electronics)
    public WebElement hoverelectronics;

    public void userSeachingBox() {
        windowMaximize();
        typeByCss(searchElement,"shoes");
    }
    public void clickOnSearchingbutton() {
        searchButtonElement.click();
    }
    public void validateSearchProduct() {
        String expectedText = "shoes";
        String actualText = shoesgetTextElement.getText();
        if (actualText.equals(expectedText)) {
            System.out.println("the actual results are same : " + actualText);
        } else {
            System.out.println("the actual results are not  same : " + actualText);
        }
    }
    public void userclickonimageWebelement() {
        imageWebelement.click();
    }
    public void validateimageElement() {
        String expectedText = "Shop, sell, or donate to make a social impact ";
        String actualText = imageGetTextWebelement.getText();
        if (actualText.equals(expectedText)) {
            System.out.println("the actual results are same : " + actualText);
        } else {
            System.out.println("the actual results are not  same : " + actualText);
        }
    }
    public void userClickdropButton() {
        try {
            driver.get(url);
            selectOptionByIndex(DropButtonElement,"0");
        } catch (Exception e) {
            System.out.println(" Not going to select anything");
        }
        driver.close();
    }
    public void theScrollDownWebPage() {
        scrollDownTheWebPage();
    }
    public void theScrollDownTillEnd()  {
        theScrollDownTillEnd();
    }
    public void fashion(){
        mouseHover(hoverfashion);
    }
    public void userSearchBox() {
        try {
            windowMaximize();
            typeByCss(searchBox,"Bookshelf");
            System.out.println(driver.getTitle() + searchBoxelement.getText());
        } catch (Exception e) {
            System.out.println("It shows nothing");
        }
    }
    public void collectandarts(){
        mouseHover(hovercollectandarts);
    }
    public void userclickOnSubmitButton() {
        submitButtonelement.click();
        //clickByCSS(submitButton);

    }
    public void userclickOnShoppingCart() {
        ShoppingCartelement.click();
        //clickByCSS(ShoppingCart);
    }
    public void electronics(){
        mouseHover(hoverelectronics);
    }
    public void userClickOnDropButtonElement()  {
        selectOptionByIndex(DropButtonElement,"6");
    }
    public void toys(){
        mouseHover(hovertoys);
    }
}
