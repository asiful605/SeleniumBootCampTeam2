package hometest;

import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class CignaHomeTest extends WebAPI {

    static CignaHomePage cignaHomePage;
    public static void getInitElements() {
        cignaHomePage = PageFactory.initElements(driver, CignaHomePage.class); }

    @Test
    public void testSearchBox() {
        getInitElements();
        cignaHomePage.enterKeyword(); }
    @Test
    public void testClickButton() {
        getInitElements();
        cignaHomePage.enterKeyword();
        cignaHomePage.clickonButton(); }
    @Test
    public void testScrollDownTheWebPage() {
        getInitElements();
        cignaHomePage.theScrollDownWebPage(); }
    @Test
    public void testScrollDownTillEnd(){
        getInitElements();
        cignaHomePage.theScrollDownTillEnd(); }
    @Test
    public void testgoToCustomerLogInByMouseHovering() {
        getInitElements();
        cignaHomePage.goToCustomerLogInByMouseHovering(); }
    @Test
    public void testenterKeyWordForLogIn() {
        getInitElements();
        cignaHomePage.enterKeyWordForLogIn(); }
    @Test
    public void testsetEnterKeyWordForPassword() {
        getInitElements();
        cignaHomePage.goToCustomerLogInByMouseHovering();
        cignaHomePage.enterKeyWordForLogIn();
        cignaHomePage. setEnterKeyWordForPassword(); }
    @Test
    public void testGetTilteOfcignaInternationalTab() {
        getInitElements();
        cignaHomePage.getTilteOfcignaInternationalTab(); }
    @Test
    public void testmouseHoverOnContactanosTab() {
        getInitElements();
        cignaHomePage.mouseHoverOnAquienesServimos(); }
    @Test
    public void testuserhoverOnMedicare() {
        getInitElements();
        cignaHomePage.hoverOnMedicare(); }
    @Test
    public void testuserClickOnOprion1() {
        getInitElements();
        cignaHomePage.userClickOnOprion1(); }
    @Test
    public void testuserusermedicareelement() {
        getInitElements();
        cignaHomePage.usermedicareelement(); }
    @Test
    public void testvalidatetext() {
        cignaHomePage.validatetext("Cigna Official Site| Global Health Service Company"); }
    @Test
    public void testsetSearchwebElement() {
        cignaHomePage.setSearchwebElement(); }
    @Test
    public void testtheBrokenLinks() throws IOException {
        getInitElements();
        cignaHomePage.theBrokenLinks(); }

}
