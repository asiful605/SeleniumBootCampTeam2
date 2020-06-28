package hometest;

import bankpage.BankOfAmericaHomePage;
import common.WebAPI;


import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class BankOfAmericaHomeTest extends WebAPI {

    static BankOfAmericaHomePage boa;
    public static void getInitElements() {
        boa = PageFactory.initElements(driver, BankOfAmericaHomePage.class);
    }


    @Test (priority=1)
    public void testHoverOnInvesting()  {
        getInitElements();
        boa.hoverOnInvesting();
    }
    @Test (priority=2)
    public void testClickOnChecking(){
        getInitElements();
        boa.clickOnChecking();
    }
    @Test (priority=3)
    public void testClickOnSavings(){
        getInitElements();
        boa.clickOnSavings();
    }
    @Test (priority=4)
    public void testClickOnCreditCards(){
        getInitElements();
        boa.clickOnCreditCards();
    }
    @Test (priority=5)
    public void testClickOnHomeLoans(){
        getInitElements();
        boa.clickOnHomeLoans();
    }
    @Test (priority=6)
    public void testClickOnAutoLoans(){
        getInitElements();
        boa.clickOnHomeLoans();
    }



}
