package Homepage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import common.WebAPI;

public class ExpediaHomeTest extends WebAPI {
    @FindBy(how= How.CSS,using=clickElement)
    WebElement clickOnButton;

    @FindBy(how= How.CSS,using=accountTab)
    WebElement accountTabelement;


    @FindBy(how= How.CSS,using=checkbox)
    WebElement checkboxabelement;


    @FindBy(how= How.XPATH,using=imageElement)
    WebElement imageWebelement;


    @FindBy(how= How.XPATH,using= checkboxelement)
    WebElement  usercheckboxelement;






    public void userclickOnButton(){
        driver.get( url);
        clickOnButton.click();
    }
    public void clickonAccountTab(){
        driver.get( url2);
        driver.manage().window().maximize();
        accountTabelement.click();
        System.out.println( driver.getTitle());
    }
    public void clickOnCheckBox(){
        driver.get( url2);
        driver.manage().window().maximize();
        checkboxabelement.isSelected();
        System.out.println( driver.getTitle());
    }
    public void clickOnimageelement(){
        driver.get( url2);
        driver.manage().window().maximize();
        imageWebelement.click();
        System.out.println( driver.getTitle());
    }

    public void scrollDownTheWebPage() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);
    }


    public void scrollDownTillEnd() throws InterruptedException {
        //This will scroll the web page till end.
        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(3000);
    }


    public void clickOncheckBox() throws InterruptedException {
        usercheckboxelement.isSelected();
        Thread.sleep(3000);


    }
}
