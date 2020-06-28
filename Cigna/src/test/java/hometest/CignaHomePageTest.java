package hometest;

import common.WebAPI;
import homepage.CignaHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.DataReader;

import java.io.IOException;


public class CignaHomePageTest extends WebAPI {

    static CignaHomePage mainhomepage;
    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, CignaHomePage.class);
    }
    @Test
    public void testCignaLogin(){
        getInitElements();
        mainhomepage.CignaLogin();
    }
    @Test
    public void testsearchbox() {
        getInitElements();
        mainhomepage.searchomepage();
    }
    @DataProvider
    public static Object[][] getData() throws IOException, IOException {
        DataReader reader= new DataReader();

        Object[][] Data  =  reader.fileReader3("login");
        return Data;
    }
    @Test(dataProvider="getData",enabled = true)
    public void TestItems(String username, String password) throws InterruptedException {
        getInitElements();
        mainhomepage.useusernameandPAssword(username, password);
    }
    @Test
    public void TestUsername(){
        getInitElements();
        mainhomepage.username();
    }
}
