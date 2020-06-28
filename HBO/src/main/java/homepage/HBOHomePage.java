package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static webelements.HBOHomePageWebElements.*;

public class HBOHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = signInWebElement) public WebElement sighIN;
    @FindBy(how = How.XPATH, using = HBOPlanWebElement) public WebElement HBOPlan;
    @FindBy(how = How.XPATH, using = sighInPageWebElement) public WebElement signInPage;
    @FindBy(how = How.XPATH, using = emailWebElement) public WebElement email;
    @FindBy(how = How.XPATH, using = passwordWebElement) public WebElement password;
    @FindBy(how = How.XPATH, using = clickSignInWebElement) public WebElement clickSignIn;
    @FindBy(how = How.XPATH, using = headerWebElements) public List<WebElement> header;
    @FindBy(how = How.XPATH, using = moviesWebElement) public WebElement movies;
    @FindBy(how = How.XPATH, using = documentariesWebElement) public WebElement documentaries;
    @FindBy(how = How.XPATH, using = seriesWebElement) public WebElement series;
    @FindBy(how = How.XPATH, using = allSeriesWebElement) public WebElement allSeries;
    @FindBy(how = How.XPATH, using = specialsWebElement) public WebElement specials;
    @FindBy(how = How.XPATH, using = allSpecialsWebElement) public WebElement allSpecials;
    @FindBy(how = How.XPATH, using = kidsWebElement) public WebElement kids;
    @FindBy(how = How.XPATH, using = royWebElement) public WebElement roy;
    @FindBy(how = How.XPATH, using = sportsWebElement) public WebElement sports;
    @FindBy(how = How.XPATH, using = allSportsWebElement) public WebElement allSports;
    @FindBy(how = How.XPATH, using = footerLinksWebElement) public List <WebElement> footer;
    @FindBy(how = How.XPATH, using = aboutWebElement) public WebElement about;
    @FindBy(how = How.XPATH, using = facebookWebElement) public WebElement facebook;
    @FindBy(how = How.XPATH, using = fbPhotoWebElement) public WebElement fbPhoto;
    public void timeOuts(){driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);}
    public void clickSignIn() { sighIN.click(); }
    public void chooseHBOPlan() { HBOPlan.click(); }
    public void getInSignInPage() { signInPage.click(); }
    public void enterEmail() { email.sendKeys("test@yahoo.com"); }
    public void enterPassword() { password.sendKeys("test12345"); }
    public void execute() { clickSignIn.click(); }
    public List<WebElement> getHeader() {
        List<WebElement> headerName = header;
        for (WebElement head : header) {
            System.out.println(head.getText());
        }
        return headerName;
    }
    public void selectMovies(){movies.click();}
    public void chooseDocumentaries(){documentaries.click();}
    public void selectSeries(){series.click();}
    public void chooseAllSeries(){allSeries.click();}
    public void selectSpecials(){specials.click();}
    public void chooseAllSpecials(){allSpecials.click();}
    public void selectKids(){kids.click();}
    public void chooseRoy(){roy.click();}
    public void selectSports(){sports.click();}
    public void chooseALLSports(){allSports.click();}
    public List<WebElement> getFooter() {
        List<WebElement> footerName = footer;
        for (WebElement foot : footer) {
            System.out.println(foot.getText());
        }
        return footerName;
    }
    public void clickAboutTab(){about.click();}
    public void facebookTab(){facebook.click();}
    public void fbPhotos(){fbPhoto.click();}

    public void signInToHBO() {
        clickSignIn();
        chooseHBOPlan();
        getInSignInPage();
        timeOuts();
        enterEmail();
        enterPassword();
        execute();
        Boolean verifyTitle = driver.getTitle().equalsIgnoreCase("successfully login");
        Assert.assertFalse(verifyTitle);
    }
    public void readHeader() {
        getHeader();
    }
    public void documentariesPage(){
        selectMovies();
        mouseHoverByXpath("//*[@id=\"root\"]/main/div[2]/header/div[2]/div/div/div/div/ul/li[2]/div/a");
        timeOuts();
        chooseDocumentaries();
    }
    public void validateDocPage(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/documentaries");
    }
    public void allSeriesPage(){
        selectSeries();
        mouseHoverByXpath("//body/div/main/div/header/div/div/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]");
        chooseAllSeries();
    }
    public void validateAllSeriesPage(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/series/all-series");
    }
    public void allSpecialsPage(){
        selectSpecials();
        mouseHoverByXpath("//*[@id=\"root\"]/main/div[2]/header/div[2]/div/div/div/div/ul/li[2]/div/a");
        chooseAllSpecials();
    }
    public void validateAllSpecialsPage(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/specials/all-specials");
    }
    public void kidsPage(){
        selectKids();
        mouseHoverByXpath("//body/div/main/div/header/div/div/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/a[1]");
        timeOuts();
        chooseRoy();
    }
    public void validateKidsPage(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/kids/esme-and-roy");
    }
    public void sportsPage(){
        selectSports();
        mouseHoverByXpath("//*[@id=\"root\"]/main/div[2]/header/div[2]/div[2]/div/div/div/ul/li[2]/div/a");
        chooseALLSports();
    }
    public void validateSportsPage(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/sports/sports-catalog");
    }
    public void readFooter(){ getFooter(); }
    public void validateAboutTab(){
        clickAboutTab();
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.hbo.com/about/");
    }
    public void checkFB(){
       facebookTab();
       mouseHoverByXpath("//span[contains(text(),'Photos')]");
       fbPhotos();
    }
    public void validateFbTab(){
        String actualTitle=driver.getCurrentUrl();
        Assert.assertEquals(actualTitle,"https://www.facebook.com/HBO/photos/");
    }





}
