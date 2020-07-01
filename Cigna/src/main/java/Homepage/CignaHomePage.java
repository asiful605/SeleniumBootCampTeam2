package Homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class CignaHomePage extends WebAPI {
    @FindBy(css ="#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.navbar-expand-lg.site-navigation-level-1 > div > ul > li:nth-child(2) > a" )
    WebElement employerBrokerLogin;

    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(2) > div.icon-teaser-content > a ")
    WebElement dentalInsurancePlan;
    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(5) > div.icon-teaser-content > a")
    WebElement otherSupplimentalInsurance;
    @FindBy(css = "#\\31 564310141632 > div > div.col-12.col-lg-5.mb-xl.mb-lg-0.content-block-section > div > div > div:nth-child(6) > div.icon-teaser-content > a")
    WebElement internationalHealthInsurance;
    @FindBy(css = "#\\31 564310141633 > div > div.col-12.col-lg-3 > h2")
    WebElement importantBenifitUpdates;
    @FindBy(xpath="//*[@id=\"includes-content\"]/div[1]/nav[1]/div/ul/li[1]/a")
    WebElement cignaInternational;
    @FindBy(css="#\\31 564310141631 > div > div > div:nth-child(2) > div > div.teaser-content.col-12.col-md-7.col-lg-12.align-self-lg-center > header > a")
    WebElement healthierKidsforOurFuture;
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[3]/div/ul/li[4]/a")
    WebElement aboutUs;
    @FindBy(css = ".container>ul>li:nth-child(4)>a")
    WebElement investorRelations;
    @FindBy(xpath = "//a[text()='Cigna Overview']")
    WebElement cignaOverview;

    public void clickOnIndividulasAndFamilies() {
        clickOnElement("#includes-content > div.d-none.d-lg-block > nav.navbar.global-nav.navbar-expand-lg.site-navigation-level-1 > div > ul > li:nth-child(4) > afir");
    }
    public void employerBrokerLoginTest() { this.employerBrokerLogin.click(); }
    public void internationalHealthInsuranceTest(){
        internationalHealthInsurance.click();
    }
    public void otherSupplimentalInsuranceTest() {
        this.otherSupplimentalInsurance.click();
    }
    public void importantBenifitUpdatesTest() {
        this.importantBenifitUpdates.click();
    }
    public void setCignaInternational(){ cignaInternational.click(); }
    public void getAboutUsCigna(){ aboutUs.click(); }
    public void setDentalInsurance(){
        this.dentalInsurancePlan.click();
    }
    public void setHealthierKidsforOurFuture(){
        this.healthierKidsforOurFuture.click();
    }
    public void mouseHoverOnInvestorRelations(){
        WebElement element=investorRelations;
        Actions actions=new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void clickOnCignaOverview(){
        this.getAboutUsCigna();
        mouseHoverOnInvestorRelations();
        cignaOverview.click();


    }
}
