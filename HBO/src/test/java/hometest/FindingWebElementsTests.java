package hometest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingWebElementsTests {
    public static void main(String[] args) {

        // TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "BrowserDriver/mac/chromedriver 8");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.hbo.com/");

        // Find the radio button  using its xpath and click on it
        driver.findElement(By.xpath("//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/div/a/span")).click();

        //Click on Check Button
        driver.findElement(By.id("Already a subscriber")).click();

    }


}
