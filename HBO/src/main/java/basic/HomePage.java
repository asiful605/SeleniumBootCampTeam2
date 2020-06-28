package basic;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;
import search.XlsxDataReader;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends WebAPI {
 /*public static void sendKeys(WebElement webElement, String elementName, String keys){
        webElement.clear();
        TestLogger.log("Send keys to "+ elementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys sent to " + elementName);
    }
    public static String getText(WebElement webElement, String webElementName){
        TestLogger.log("getting Text from " + webElementName);
        String actualText = webElement.getText();
        TestLogger.log("Actual text : " + webElementName);
        return actualText;
    }*/

    @FindBy (how =How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public  WebElement searchButton;
    public  WebElement getSearchButton() {return searchButton;}
    public void clickOnSearchButton () {
        testLogger();
        getSearchButton().click();}

    @FindBy (how = How.XPATH, using = "//span[contains(text(),'Get HBO')]")
    public  WebElement getHBO;
    public  WebElement getGetHBO() {return getHBO;}
    public void clickonGetHBO () {
        testLogger();
        getGetHBO().click(); }

    @FindBy (how = How.XPATH, using = "//span[@class='components/Tooltip--label']")
    public WebElement signIn;
    public WebElement getSignIn() {return signIn;}
    public void clickOnSignIn() {
        testLogger();
        getSignIn();}

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[1]/span/a/svg/g/g/path")
    public WebElement HBOLogo;
    public void clickOnLogo () {
        testLogger();
        HBOLogo.click(); }

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;
    public void clicksearchlink(){
        testLogger();
        searchlink.click();
    }
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;
    public void sendInput () {
        testLogger();
        searchBox.sendKeys("Game of Thrones", Keys.ENTER);
    }

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/series']")
    public WebElement series;
    public void findSeries(){
        testLogger();
        series.click();}

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public WebElement movies;
    public String findMovies(){
        testLogger();
        movies.click();
        String title = driver.getTitle();
        System.out.println("Movies page Title: " + title);
        return title;
    }
    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/watch-free-episodes']")
    public WebElement searchFreeEpisodes;
    public void getFreeEpisodes(){
        testLogger();
        searchFreeEpisodes.click();}

    @FindBy (className = "components/BasicButton--children")
    public WebElement HBOToday;
    public void clickHBOToday(){
        testLogger();
        HBOToday.click();}

    @FindBy (xpath = "//h2[contains(text(),'New Releases')]")
    public WebElement NewReleases;
    public void clickNewReleases(){
        testLogger();
        NewReleases.click();}

    @FindBy (xpath = "/html/body/main/div[6]/div/div/div[1]/div[2]/div/button[2]/div/span/span/svg/g/g/g/polygon")
    public WebElement nextSl;
    public void clickNextSl(){
        testLogger();
        nextSl.click();}

    @FindBy (xpath = "//*[@id=\"root\"]/main/section/div[1]/div/section/div/button[2]/div/span/span/svg/g/g/g/polygon")
    public WebElement nextSlide;
    public void clickNextSlide(){
        testLogger();
        nextSlide.click();}

    @FindBy (xpath = "//a[@title='facebook']")
    public WebElement fbPage;
    public void getFbPage(){
        testLogger();
        fbPage.click();}

    @FindBy (xpath = "//a[@title='instagram']")
    public WebElement instaPage;
    public void getInstaPage(){
        testLogger();
        instaPage.click();}

    @FindBy (xpath = "//a[@title='twitter']")
    public WebElement twitterLogo;
    public void getTwitterPage(){
        testLogger();
        twitterLogo.click();}

    @FindBy (xpath = "//a[@title='youtube']")
    public WebElement youtubeLogo;
    public void navigateToYoutubePage(){
        testLogger();
        youtubeLogo.click();}

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(searchButton);
        webElements.add(getHBO);
        webElements.add(signIn);
        webElements.add(HBOLogo);
        webElements.add(searchlink);
        webElements.add(searchBox);
        webElements.add(series);
        webElements.add(movies);
        webElements.add(searchFreeEpisodes);
        webElements.add(HBOToday);
        webElements.add(nextSlide);
        webElements.add(fbPage);
        webElements.add(instaPage);
        webElements.add(twitterLogo);
        webElements.add(youtubeLogo);

        List<String>list = new ArrayList<>();
        for(int i=0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    XlsxDataReader xlData = new XlsxDataReader("src/main/java/basic/ReadXlsx.java");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Sheet1","searchButton",i));
        }
        System.out.println(expect);
        return expect;
    }


    /*
    Helping
    method for TestLogger
     */
    public void testLogger(){
        TestLogger.log(getClass().getSimpleName()+":"+convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }













}
