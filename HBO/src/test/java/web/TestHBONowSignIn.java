package web;

import basic.HBONowSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import database.XlsxDataReader;
public class TestHBONowSignIn<XlsxDataReader> extends HBONowSignIn {

    XlsxDataReader ex;
    HBONowSignIn hbo;
    @BeforeMethod
    public void initializeElement(){ hbo= PageFactory.initElements(driver, HBONowSignIn.class); }

//    @DataProvider(name="DP")
//    public Object[][] getTestData() throws Exception{
//        File filepath = new File(System.getProperty("src/main/java/search/XlsxDataReader.java"));
//        ex = new XlsxDataReader("");
//        ex.setExcelFile(filepath.getAbsolutePath());
//        String[][] data = ex.getExcelSheetData("Sheet2");
//        return data;
//    }
    @Test(dataProvider = "DP")
    public void LogIn(){
        hbo.getSignInTab();
        hbo.getHboNowLogo();
        hbo.getHboNowSignInTab();
        hbo.getEnterEmailAddress("email");
        hbo.getEnterPassword("password");
        hbo.getClickOnSignIn();
        hbo.errorMessage();
    }
}



