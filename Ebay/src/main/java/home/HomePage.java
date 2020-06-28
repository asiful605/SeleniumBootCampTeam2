package home;


import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static webElements.WebElementsOfEbay.*;

public class HomePage extends WebAPI {

    @FindBy(how = How.CSS, using = dropbutton)
    WebElement dropButtonelement;
    @FindBy(how = How.CSS, using = searchBox)
    WebElement searchBoxelement;
    @FindBy(how = How.CSS, using = submitButton)
    WebElement submitButtonelement;
    @FindBy(how = How.CSS, using = ShoppingCart)
    WebElement ShoppingCartelement;
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

    public void userSeachingBox() {
        windowMaximize();
        typeByCss(searchElement,"shoes");
    }
    public void clickOnSearchingbutton() {
        clickByCSS(searchButton);
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
        clickByCSS(imageelement);
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
        scrollDownTillEnd();
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
    public void userclickOnSubmitButton() {
        clickByCSS(submitButton);
    }
    public void userclickOnShoppingCart() {
        clickByCSS(ShoppingCart);
    }
    public void userClickOnDropButtonElement()  {
        selectOptionByIndex(DropButtonElement,"6");
    }
}
