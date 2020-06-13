package hometest;

import common.WebAPI;
import homepage.at_tHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class at_tHomeTest extends WebAPI {

    public void getInitElements() {
        mainhomepage = PageFactory.initElements(driver, at_tHomePage.class);
    }


}
