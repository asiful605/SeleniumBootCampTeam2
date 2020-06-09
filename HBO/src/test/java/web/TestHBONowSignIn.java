package web;
import basic.HBONowSignIn;
import database.XlsxDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class TestHBONowSignIn<XlsxDataReader> extends HBONowSignIn{

    XlsxDataReader ex;
    HBONowSignIn hbo;
    @BeforeMethod
    public void initializeElement(){ hbo= PageFactory.initElements(driver, HBONowSignIn.class); }

    @DataProvider(name="DP")
    public Object[][] getTestData() throws Exception{
        File filepath = new File(System.getProperty("C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\src\\test\\HomePageHBO.xlsx"));
        ex = new XlsxDataReader("");
        ex.setExcelFile(filepath.getAbsolutePath());
        String[][] data = ex.getExcelSheetData("Sheet2");
        return data;
    }
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
