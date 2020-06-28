//package testsearch;
//
//import googleSheet.GoogleSheetsPage;
//import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.Test;
//
//public class TestGoogleSheet extends GoogleSheetsPage {
//    private static GoogleSheetsPage googleSheetsPage;
//   GoogleSheetsPage googleSheetsPage1;
//    @BeforeMethod
//    public void initialization(){
//        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
//    }
//    // ALI_GS_TC1: Verify log in by taking data from a google sheets file
////    @Test
////    public void testLogInByInvalidIdPassUsingGoogleSheet() throws InterruptedException {
////        sleepFor(3);
////        googleSheetsPage.clickLogIn();
////        int i = 0;
////         Object range = null;
////        List<String> actualErrorMessage = googleSheetsPage.signInByInvalidIdPass(spreadsheetId, range);
////        List<List<Object>> expectedErrorMessage = googleSheetsPage.getSpreadSheetRecords(spreadsheetId, range);
////        for (List row : expectedErrorMessage) {
////            // Assert.assertTrue(actualErrorMessage.get(i).contains(row.get(1).toString()));
////            //System.out.println("expected"+row.get(3).toString());
////            System.out.println(expectedErrorMessage.get(i) + ": Search - Passed");
////            i++;
////        }
////        System.out.println("testLogInByInvalidIdPassUsingGoogleSheet Passed");
////    }
//
//    //public GoogleSheetsPage googleSheetsPage;
//    //Verify log in by taking data from a google sheets file
//    @Test
//    public static void testLogInByInvalidIdPassUsingGoogleSheet() throws Exception {
//        googleSheetsPage = PageFactory.initElements(driver, GoogleSheetsPage.class);
//        googleSheetsPage.testGoogleSheet();
//    }
//
//
//
//}
