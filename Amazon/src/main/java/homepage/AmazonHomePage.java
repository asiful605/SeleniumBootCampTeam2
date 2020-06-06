package homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage {

    @FindBy(id = "twotabsearchtextbox")
    WebElement searchBar;

    public void setSearchBar(){
        searchBar.click();
    }
}
