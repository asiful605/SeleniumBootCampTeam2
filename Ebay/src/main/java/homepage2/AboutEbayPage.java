package homepage2;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AboutEbayPage extends WebAPI {
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[2]/a")
    WebElement clickComapany;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[3]/a")
    WebElement clickNews;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[4]/a")
    WebElement clickInvest;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[7]/a")
    WebElement clickGlobalImpact;
    @FindBy(className = "Government relations")
    WebElement clickGovernmentRelations;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[10]/a")
    WebElement clickPolicy;


public void EbayCompany(){
clickComapany.click();
}
public void ebayNews(){
    clickNews.click();
}
public void ebayInvestor(){
    clickInvest.click();
}
public void ebayGlobal() {
    clickGlobalImpact.click();
}
public void ebayGovRelations(){
    clickGovernmentRelations.click();
}
public void ebayPolicyPage(){
    clickPolicy.click();
}
}
