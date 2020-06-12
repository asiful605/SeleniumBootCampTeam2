package homepage;

import common.WebAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static webelements.at_tWebelements.searchbox;

//first extend the WebAPI
public class at_tHomePage extends WebAPI {
    // using Findbyannotation which is under selinium
    // must import Webelements

    @FindBy(how = How.CSS, using = searchbox )

    //initialize and import webelements

    public WebElement searchBoxwebelement;

    // created a method for searchbox
    public void usersearchbox(){
       driver.get("https://www.att.com/");
        searchBoxwebelement.sendKeys("AT&T deals");

    }
    //Scrolldownwebpage
    public void scrolldownwebpage(){
        JavascriptExecutor scroll = (JavascriptExecutor)driver;
        scroll.executeScript("window.scrollBy(0, 2000)");

    }
    //ScrolltoEnd
    public void scrolltoend() throws InterruptedException {
        JavascriptExecutor scrollend = (JavascriptExecutor)driver;
        scrollend.executeScript("window.scrollTo(10, document.body.scrollHeight");
//        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Thread.sleep(2000);

    }

}
