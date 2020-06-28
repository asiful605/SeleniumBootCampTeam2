package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.IntPurchaseWebelements.*;

public class InternetPurchase extends WebAPI {

    @FindBy(how = How.XPATH,using = internet) WebElement clickinternet;
    @FindBy(how = How.XPATH,using = support) WebElement usesupport;
    @FindBy(how = How.XPATH, using = shopalloffers) WebElement useshopalloffers;
    @FindBy(how = How.XPATH, using = adressfield) WebElement enteradressfield;
    @FindBy(how = How.XPATH, using = zipcode) WebElement usezipcode;
    @FindBy(how = How.XPATH, using = Baddresscheckbox) WebElement checkBaddresscheckbox;
    @FindBy(how = How.XPATH, using = listclick) WebElement checklistclick;
    @FindBy(how = How.XPATH, using = submitdeals) WebElement checksubmitdeals;
    @FindBy(how = How.XPATH, using = checkavail) WebElement checkcheckavail;

    public void clickSupport(){
        usesupport.click();
    }
    public void shopAllOfferClick() {
        clickinternet.click();
        useshopalloffers.click();
    }
    public void enteradressfield() {
        clickinternet.click();
        useshopalloffers.click();
        enteradressfield.sendKeys("452 main st");
    }
    public void Baddresscheckbox()  {
        clickinternet.click();
        useshopalloffers.click();
        enteradressfield.sendKeys("154 10th St, Brooklyn, NY 11215");
        checklistclick.isSelected();
        checkcheckavail.click();
    }
}
