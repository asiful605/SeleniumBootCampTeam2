package bankpage;


import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static bankpage.BankOfAmericaWebElements.*;

public class BankOfAmericaHomePage extends WebAPI {

    @FindBy (how = How.CSS, using = hoverElement)
    WebElement investingElement;

    @FindBy (how = How.CSS, using = checkingElement)
    WebElement checkingButton;

    @FindBy (how = How.CSS, using = savingsElement)
    WebElement savingsButton;

    @FindBy (how = How.CSS, using = creditCardsElement)
    WebElement creditCardsButton;

    @FindBy (how = How.CSS, using = homeLoansElement)
    WebElement homeLoansButton;

    @FindBy (how = How.CSS, using = autoLoansElement)
    WebElement autoLoansButton;






    public void hoverOnInvesting() {
        windowMaximize();
        mouseHoverByCSS( hoverElement);
    }
    public void clickOnChecking(){
        windowMaximize();
        checkingButton.click();
    }
    public void clickOnSavings(){
        windowMaximize();
        savingsButton.click();
    }
    public void clickOnCreditCards(){
        windowMaximize();
        creditCardsButton.click();
    }
    public void clickOnHomeLoans(){
        windowMaximize();
        homeLoansButton.click();
    }
    public void clickOnAutoLoans(){
        windowMaximize();
        autoLoansButton.click();
    }


}