package hometest;

import common.WebAPI;
import homepage.Database;
import homepage.GEICOHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reporting.TestLogger;
import utility.DataReader;


import java.io.IOException;


public class GEICOHomeTest extends WebAPI {

    static GEICOHomePage geicoHomePage;

    public static void getInitElements() {
        geicoHomePage = PageFactory.initElements(driver, GEICOHomePage.class);
    }

    @DataProvider
    public static Object[][] getData() throws IOException, IOException {
        DataReader reader = new DataReader();
        Object[][] Data = reader.fileReader3("login");
        return Data;
    }
    @Test(dataProvider = "getData", enabled = false)
    public void TestlogIn(String id, String pass) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        geicoHomePage.logIn(id, pass);
    }
    @Test(priority = 1, enabled = true)
    public void testUpdateLocation() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        geicoHomePage.updateLocation();
    }
    @DataProvider
    public static Object[][] getData1() throws IOException, IOException {
        DataReader reader = new DataReader();
        Object[][] Data = reader.fileReader3("claim");
        return Data;
    }
    @Test(dataProvider = "getData1", enabled = true)
    public void TestRegisterToGeico(String pNumber, String Bday, String zCode) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getInitElements();
        geicoHomePage.registerToGeico(pNumber, Bday, zCode);
    }
      @DataProvider
      public static Object[] dataFromSql() throws Exception {
        Database base= new Database();
        Object[] Data= base.getUserDatafromDB().toArray();
        return Data;
      }
    @Test(dataProvider = "dataFromSql", enabled = true)
        public void TestSearchOptionInGeicoUsingDatabase(String keyword) {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
            getInitElements();
            geicoHomePage.searchOptionInGeicoUsingDatabase(keyword);
        }

}