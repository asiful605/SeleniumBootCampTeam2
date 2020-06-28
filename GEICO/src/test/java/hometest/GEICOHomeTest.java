package hometest;
import common.WebAPI;
import homepage.GEICOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class GEICOHomeTest extends WebAPI {
    static GEICOHomePage geicoHomePage;// Reference variable/object of geicoHomePage

    public static void getInitElements() {
        geicoHomePage = PageFactory.initElements(driver, GEICOHomePage.class);
    }
    //PopUp Handling
    @Test(priority = 1)
    public void testhandleAlert()  {
        getInitElements();
        geicoHomePage.okAlert();
    }
    @Test(priority = 2)
    public void testcancelAlert(){
    getInitElements();
    geicoHomePage.cancelAlert();
    }
    @Test(priority = 3)
    public void testclickOnLogInButton() throws InterruptedException {
        getInitElements();
        geicoHomePage.clickOnLogInButton();
    }
    @Test(priority = 4)
    public void testScrollDownTheWebPage() {
        getInitElements();
        geicoHomePage.scrollDownTheWebPage();
    }
    @Test(priority = 5)
    public void testclickOnAutoTab() {
        getInitElements();
        geicoHomePage.clickOnAutoTab();
    }
    @Test(priority = 6)
    public void testclickOncheckBoxTab() throws InterruptedException {
        getInitElements();
        geicoHomePage.checkBoxTab();
    }
    @Test(priority = 7)
    public void testinsurance() {
        getInitElements();
        geicoHomePage.userinsurance();
    }
    @Test(priority = 8)
    public void testzipcode() throws InterruptedException {
        getInitElements();
        geicoHomePage.setUserenterzipcode();
    }
    @Test(priority = 9)
    public void testsearchbox() throws InterruptedException {
        getInitElements();
        geicoHomePage.searchInfo();
    }
    @Test(priority = 10)
    public void testmoreproducts() throws InterruptedException {
        getInitElements();
        geicoHomePage.setUsermoreproducts();
    }
    @Test(priority = 11)
    public void testtrackclaim() throws InterruptedException {
        getInitElements();
        geicoHomePage.trackaclaim();
    }
    @Test(priority = 12)
    public void testclicklogo() {
        getInitElements();
        geicoHomePage.ClickOnLogo();
    }
    @Test(priority = 13)
    public void testclickradioButton() {
        getInitElements();
        geicoHomePage.radioButton();
    }
    @Test(priority = 14)
    public void testNavigateBack() {
        navigateBack();
    }

    @Test(priority=15)
    public void testreportanaccident() throws InterruptedException {
        getInitElements();
    geicoHomePage.reportanaccident();
    }
    @Test(priority=16)
    public void testclickonmenu(){
     getInitElements();
     geicoHomePage.clickonmenu();
    }
    @Test(priority = 17)
    public void testclickonimage(){
    getInitElements();
    geicoHomePage.clickonimageelement();
    }
    @Test(priority = 18)
    public void testclickonMakeapayment(){
    getInitElements();
    }
    @Test(priority = 19)
    public void testclickoncheckmark(){
     getInitElements();
    }
    @Test(priority=20)
    public void testclickonHomeowners(){
    getInitElements();
    geicoHomePage.setClickonHomeowners();
    }
    @Test(priority=21)
    public void testclickAboutGEICOElement(){
    getInitElements();
    geicoHomePage.clickonGEICOElement();
    }
    @Test(priority=22)
    public void testvalidatefooteritemElement(){
        getInitElements();
        geicoHomePage.validatefooterItems("customerserviceElement");
    }
    @Test(priority=23)
    public void testuserclickonDropButton(){
    getInitElements();
    }

    @Test(priority = 24)
    public void testhoveronAccessYourPolicy(){
    getInitElements();
    }
    @Test(priority=25)
     public void testvalidatetext(){
     getInitElements();


    }



}






























































