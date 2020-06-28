package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CignaInternational extends WebAPI {

    @FindBy(how = How.XPATH, using = "//*[@id=\"includes-content\"]/header/div[2]/nav[1]/div/ul/li[1]/a")
    WebElement useinternational;
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Individual Plans')]")
    WebElement checkIndividualPlan;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'two-lines')]")
    WebElement mousehovertoHTP;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'mainNav')][contains(text(),'Brokers')]")
    WebElement brokers;
    @FindBy(how = How.XPATH, using = "//a[contains(@class,'two-lines')]")
    WebElement useHealthCareProf;
    @FindBy(how = How.XPATH, using = "//span[contains(text(),'JOIN NOW')]")
    WebElement joinNow;
    @FindBy(how = How.XPATH, using = "//input[@id='billingPayment_1']")
    WebElement radiobtn;
    @FindBy(how = How.XPATH, using = "//input[@id='poBOX_1']")
    WebElement radiobtnPOBox;


    public void maximizeWindow(){
        driver.manage().window().maximize();
    }
    public void CignaInter(){
        maximizeWindow();
        useinternational.click();
    }
    public void indiviualPlan(){
        maximizeWindow();
        useinternational.click();
        checkIndividualPlan.click();
    }
    public void mousehvrtoHPC(){
        maximizeWindow();
        useinternational.click();
        maximizeWindow();
        mouseHoverByXpath("//a[contains(@class,'two-lines')]");
    }
    public void brokers(){ maximizeWindow();
        useinternational.click();
        brokers.click();
    }
    public void HCP(){ maximizeWindow();
        useinternational.click();
        useHealthCareProf.click();

    }
    public void JoinNow(){ maximizeWindow();
        useinternational.click();
        useHealthCareProf.click();
        joinNow.click();
    }
    public void setRadiobtn(){ maximizeWindow();
        useinternational.click();
        useHealthCareProf.click();
        joinNow.click();
        radiobtn.click();
        radiobtnPOBox.click();
    }
}
