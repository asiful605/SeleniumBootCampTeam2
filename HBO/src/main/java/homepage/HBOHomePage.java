package homepage;
import WebElements.HBOWebElements;
import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class HBOHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = HBOWebElements.logoElement)
    public WebElement logoElement;
    @FindBy(how = How.XPATH, using = HBOWebElements.getHBOElement)
    public WebElement getHBO;
    @FindBy(how = How.XPATH, using = HBOWebElements.MoviesElement)
    public WebElement Movies;
    @FindBy(how = How.XPATH, using = HBOWebElements.signinElement)
    public WebElement signinElement;
    @FindBy(how = How.XPATH, using = HBOWebElements.SPECIALSElement)
    public WebElement SPECIALSElement;
    @FindBy(how = How.XPATH, using = HBOWebElements.FREEEPISODESElement)
    public WebElement FREEEPISODESElement;
    @FindBy(how = How.XPATH, using = HBOWebElements.HBOkidsElement)
    public WebElement HBOkidsElement;
    @FindBy(how=How.XPATH,using =HBOWebElements.HBOWatchElements)
    public WebElement HBOWatchElements;
    @FindBy(how=How.XPATH,using =HBOWebElements.hoveronImage)
    public WebElement hoveronimageElements;

    //Set up Methods:
    public void setLogoElement() throws InterruptedException {
        logoElement.click();
    }
    public void clickgetHBOElement() throws InterruptedException {
        getHBO.click();
    }
    public void clickMoviesElement() {
        Movies.click();
    }

    public void clickonsigninElements() throws InterruptedException {
        signinElement.click();
    }
    public void scrrollDownTheWEbPage() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(1000)");
    }
    public void clickonSPECIALSElement() {
        SPECIALSElement.click();
    }

    public void clickonFREEEPISODESElement() {
        FREEEPISODESElement.click();
    }

    public void clickonHBOkidsElement() {
        HBOkidsElement.click();
    }
    public void hoveringonSPORTS() throws InterruptedException {
        Actions actions = new Actions(driver);
    }
    public void clickonHBOWatchElements(){
    HBOWatchElements.click();
    }
    public void hoveronImage(){
    Actions action=new Actions(driver);
    }







}





