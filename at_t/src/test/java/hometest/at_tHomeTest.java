package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.Database;

import java.io.IOException;

public class at_tHomeTest extends WebAPI {
    static at_tHomePage mainhomepage;



    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }
    @Test
    public void testusersearchbox() {
        getInitElements();
        mainhomepage.usersearchbox();
    }

    @Test
    public void testsearchclickbutton() {
        getInitElements();
        mainhomepage.usersearchbox();
       // mainhomepage.searchclickbutton();
    }


    @Test
    public void testscroll(){
        getInitElements();
        mainhomepage.scrolldownwebpage();
    }

    @Test
    public void testscrolltoend() throws InterruptedException {
        getInitElements();
       // mainhomepage.scrolltoend();
    }

    @Test
    public void testclickaccountlogin() {
        getInitElements();
        mainhomepage.clickaccountlogin();
    }
    @Test
    public void testpricingoption() throws InterruptedException {
        getInitElements();
       // mainhomepage.clickoniphoneimage();
        //mainhomepage.selectpricingoption();

    }
    @Test
      public void testiphoneimage(){
          getInitElements();
         // mainhomepage.clickoniphoneimage();
      }
    @Test
    public void testhoveringOnMenuElement() throws InterruptedException {
          getInitElements();
          // mainhomepage.hoveringOnMenuElement();
     }
    @Test
     public void testUserclickOnImageelement(){ getInitElements();
    mainhomepage.UserclickOnImageelement();
     }
     @Test
      public void testUserhandleAlert(){
      getInitElements();
     // mainhomepage.handleAlert();
      }
      @Test
      public void testupdateUserDeals() throws InterruptedException {
        getInitElements();
        //mainhomepage.userDealsUpdate();
      }
      @Test
      public void testcheckUpgrade(){
          getInitElements();
         // mainhomepage.checkUpgrade();
      }
        @Test
        public void testcheckMenuOption(){
        getInitElements();
        //mainhomepage.menuOption();
      }
    @Test
    public void testBundles(){
        getInitElements();
        mainhomepage.usebundle();
    }
      @Test(priority = 15)
      public void testBusiness(){
      getInitElements();
      mainhomepage.UseBusiness();
      }
      @Test
      public void testtv(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        mainhomepage.useTV();
    }
    @Test
    public void testbrokenlink(){
        getInitElements();
        mainhomepage.getBrokenLink();
    }
    @DataProvider
    public static Object[][] getData() throws IOException, IOException, InvalidFormatException {
        DataReader reader= new DataReader();
        Object[][] Data  =  reader.fileReader3("itemslists");
        return Data;
    }
    @Test(dataProvider="getData",enabled = true)
    public void TestItems(String Items){
        getInitElements();
        mainhomepage.searchItemsFromXlsx(Items);
    }
     @Test(dataProvider = "testdata")
    public void testsearchitemsFromDB(String key) {
        getInitElements();
        mainhomepage.searchtemsFromDB(key);
     }
     @DataProvider(name = "testdata")
    public Object[] testitemsFromDB() throws Exception {
        Database db = new Database();
        Object[] data=db.getUserDatafromDB().toArray();
        return data;
     }




}
