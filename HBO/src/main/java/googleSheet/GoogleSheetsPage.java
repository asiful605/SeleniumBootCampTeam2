//package googleSheet;
//
////import com.google.api.services.sheets.v4.Sheets;
//
//import common.WebAPI;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.testng.Assert;
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
////import static googleApi.GoogleSheetReader.getSheetsService;
//
//
//public class GoogleSheetsPage<Sheets> extends WebAPI {
//
//    public static String spreadsheetId = "1Ul4nRYHWdQ6KUR0U7-VQmy479FKhzdyzAsnrBibqcl8";
//    String range = "Sheet1!A1:Z1000";
//    // we have to use our own methods
//    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
//    public static WebElement signIn;
//    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/div/div[4]/div/div[1]/div[1]/div/a/span")
//    public static WebElement hboNowSignIn;
//    @FindBy(xpath = "//span[contains(text(),'Sign In')]")
//    public static WebElement hboNOWHomeSignIn;
//    @FindBy (xpath = "//input[@type='text']")
//    public static WebElement email;
//    @FindBy (xpath = "//input[@type='password']")
//    public static WebElement password;
//    @FindBy(xpath = "//*[@id=\"Viewport\"]/div[1]/div[5]/div/div[1]/div[2]/span")
//    public static WebElement logInErrorMesagege;
//
//    public void clickLogIn() throws InterruptedException {
//
//        signIn.click();
//        hboNowSignIn.click();
//        hboNOWHomeSignIn.click();
//        sleepFor(3);
//       /* email.sendKeys("");
//        password.sendKeys("", Keys.ENTER);*/
//    }
//
////    public  List<List<Object>> getSpreadSheetRecords() throws IOException {
////        // Build a new authorized API client service.
////        Sheets service = getSheetsService();
////        ValueRange response = service.spreadsheets().values().get(spreadsheetId, range).execute();
////        List<List<Object>> values = response.getValues();
////       if (values == null || values.size() == 0) {
////            return null;
////        } else {
////            return values;
////        }
////    }
//
//    private static void execute() {
//    }
//
//    private Sheets getSheetsService() {
//
//        return null;
//    }
//
//
//    //ALI_GS_TC1 LogIn by using Google Sheet sheet data
//    public List<String> signInByInvalidIdPass() throws IOException, InterruptedException {
//
//        List<List<Object>> col2Value = getSpreadSheetRecords();
//        List<String> actual = new ArrayList<>();
//        for (List<Object> row : col2Value) {
//            sleepFor(1);
//            inputValueInTextBoxByWebElement(email, row.get(0).toString());
//            inputValueInTextBoxByWebElement(password, row.get(1).toString());
//            sleepFor(1);
//            //actual.add(getCurrentPageTitle());
//            WebElement logInErrorMesage = null;
//            actual.add(getTextByWebElement(logInErrorMesage));
//            System.out.println(getTextByWebElement(logInErrorMesage));
//            clearInputBox(email);
//            clearInputBox(password);
//            sleepFor(1);
//        }
//        return actual;
//    }
//
//    private  List<List<Object>> getSpreadSheetRecords() {
//        return null;
//    }
//
//
//    public String getTextByWebElement(WebElement webElement) {
//        String text = webElement.getText();
//        return text;
//    }
//    public void testGoogleSheet() throws Exception{
//        clickLogIn();
//        List<String> actualItems = signInByInvalidIdPass();
//        List<List<Object>> expectedItems = getSpreadSheetRecords();
//        Assert.assertEquals(actualItems,expectedItems);
//    }
//
//
//    public List<List<Object>> getSpreadSheetRecords(String spreadsheetId, Object range) {
//        return null;
//    }
//
//    public List<String> signInByInvalidIdPass(String spreadsheetId, Object range) {
//        return null;
//    }
//}