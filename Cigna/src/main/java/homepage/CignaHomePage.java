package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.cignaWebElements.*;

public class CignaHomePage extends WebAPI {

    @FindBy (how = How.CSS, using = findADoctorElement)
    WebElement findADoctor;

    @FindBy (how = How.CSS, using = logInElement)
    WebElement logIn;

    @FindBy (how = How.CSS, using = healthCareProvidersElement)
    WebElement healthCareProviders;

    @FindBy (how = How.CSS, using = dentalInsurancePlanElement)
    WebElement dentalInsurancePlans;

    @FindBy (how = How.CSS, using = medicarePlanElement)
    WebElement medicarePlan;

    @FindBy (how = How.CSS, using = internationalHealthInsuranceElement)
    WebElement internationalHealthInsurance;












    public void findADoctor(){
        windowMaximize();
        findADoctor.click();

    }
    public void logIn(){
        windowMaximize();
        logIn.click();
    }
    public void healthCareProviders(){
        windowMaximize();
        healthCareProviders.click();
    }
    public void dentalInsurancePlans(){
        windowMaximize();
        dentalInsurancePlans.click();
    }
    public void medicarePlan(){
        windowMaximize();
        medicarePlan.click();
    }
    public void internationalHealthInsurance(){
        windowMaximize();
        internationalHealthInsurance.click();
    }
}

