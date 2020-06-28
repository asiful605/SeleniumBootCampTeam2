package hometest;

import common.WebAPI;
import homepage.GEICOHomePage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;

public class GEICOHomeTest extends WebAPI {
    static GEICOHomePage geicoHomePage;// Reference variable/object of CignaHomePage

    public static void getInitElements(){
        geicoHomePage= PageFactory.initElements(driver, GEICOHomePage.class);
    }

    @Test
    public void testclickOnLogInButton() throws InterruptedException {
        getInitElements();
        sleepFor(3);
        geicoHomePage.clickOnLogInButton();
         sleepFor(2);}
    @Test
    public void  testScrollDownTheWebPage(){
        getInitElements();
        geicoHomePage.scrollDownTheWebPage(); }
    @Test
    public void testclickOnAutoTab()  {
        getInitElements();
        geicoHomePage.clickOnAutoTab(); }
    @Test
    public void testclickOncheckBoxTab() throws InterruptedException {
        getInitElements();
        geicoHomePage.checkBoxTab(); }
    @Test
    public void testuserclickonboatWebelement()  {
        getInitElements();
        geicoHomePage.userclickonboatWebelement(); }
    @Test
    public void testCheckIn()  {
        getInitElements();
        geicoHomePage.doCheck("pnt123@gmail.com","1234");}
    @Test
    public void testCheckBox()  {
        getInitElements();
        geicoHomePage.doCheckBox();}

    @Test
    public void testuservalidateboatWebelement()  {
        getInitElements();
        geicoHomePage.validateboatWebelement(); }

    @DataProvider
    public static Object[][] getData() throws IOException, IOException, IOException, InvalidFormatException {
        DataReader reader= new DataReader();
        Object[][] Data  =  reader.fileReader3("login");
        return Data;
    }

    @Test(dataProvider="getData",enabled = true)
    public void TestlogIn(String id,String password){
        getInitElements();
        geicoHomePage.doCheck(id,password);
    }





}
