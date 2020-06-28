//package testcases;
//
//import org.testng.annotations.Test;
//
//import PageClasses.SearchPage;
//
//import org.testng.annotations.BeforeMethod;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//
//
//public class TestNg {
//
//    private WebDriver driver;
//    private String baseURL;
//
//    @BeforeMethod
//    public void beforeMethod() {
//        baseURL= "https://www.expedia.com";
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//    }
//
//    @Test
//    public void TestSearchTestCase() {
//
//        driver.get(baseURL);
//        SearchPage.getFromAirport(driver).sendKeys("SFO");
//        SearchPage.getToAirport(driver).sendKeys("FLL");
//        SearchPage.getDeptDate(driver).sendKeys("07/22/2016");
//        SearchPage.getReturnDate(driver).sendKeys("08/21/2016");
//        //SearchPage.getReturnDate(driver).sendKeys("12/30/2016");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        SearchPage.Searchbutton(driver).click();
//    }
//
//    @Test
//    public void testSearch(){
//        driver.get(baseURL);
//        SearchPage.getFromAirport(driver).sendKeys("SFO");
//        SearchPage.getToAirport(driver).sendKeys("FLL");
//        SearchPage.getDeptDate(driver).sendKeys("07/22/2016");
//        SearchPage.getReturnDate(driver).sendKeys("08/21/2016");
//        //SearchPage.getReturnDate(driver).sendKeys("12/30/2016");
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//        SearchPage.Searchbutton(driver).click();
//    }
//
//	/*@Test
//	public void testHotelSearch(){
//		driver.get(baseURL);
//		HotelSearchPage.ClickHotelTab(driver).click();
//		HotelSearchPage.getGoingTo(driver).sendKeys("FLL");
//		HotelSearchPage.getCheckIn(driver).sendKeys("07/22/2016");
//		driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//		HotelSearchPage.getCheckOut(driver).sendKeys("08/21/2016");
//		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
//		HotelSearchPage.Searchbutton(driver).click();
//	} */
//
//
//
//    @AfterMethod
//    public void afterMethod() {
//    }
//
//}
//
