package Homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import java.util.List;

public class HomePageDropDown extends WebAPI {

    @FindBy(xpath ="//*[@id=\"gh-cat\"]")
    public static WebElement DDArrow;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[2]")
    public static WebElement Antiques;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[3]")
    public static WebElement Art;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[4]")
    public static WebElement Baby;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[5]")
    public static WebElement Books;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[6]")
    public static WebElement Business;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[7]")
    public static WebElement Cameras;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[8]")
    public static WebElement CellPhones;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[9]")
    public static WebElement Clothing;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[10]")
    public static WebElement Coins;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[11]")
    public static WebElement Collectibles;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[12]")
    public static WebElement Computers;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[13]")
    public static WebElement Electronics;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[14]")
    public static WebElement Crafts;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[15]")
    public static WebElement Dolls;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[16]")
    public static WebElement Dvd;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[17]")
    public static WebElement Motors;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[18]")
    public static WebElement Entertaiment;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[19]")
    public static WebElement GiftCards;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[20]")
    public static WebElement Health;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[21]")
    public static WebElement Home;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[22]")
    public static WebElement Jewlery;
    @FindBy(xpath ="//*[@id=\"gh-cat\"]/option[23]")
    public static WebElement Music;

    public void ebayDropDown() {
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<WebElement> element = getListOfWebElementsByXpath("//*[@id=\"gh-cat\"]");
        List<String> listOfText = getListOfString(element);
        for (String text : listOfText) {
            System.out.println(text);
        }
        //List<String> expectedMenu = listOfText;
        //Assert.assertEquals(listOfText, expectedMenu);
    }
    public void selectDropDownOne(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Antiques.click();
    }
    public void selectDropDownTwo(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Art.click();
    }
    public void selectDropDownThree(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Baby.click();
    }
    public void selectDropDownFour(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Books.click();
    }
    public void selectDropDownFive(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Business.click();
    }
    public void selectDropDownSix(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Cameras.click();
    }
    public void selectDropDownSeven(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        CellPhones.click();
    }
    public void selectDropDownEight(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Clothing.click();
    }
    public void selectDropDownNine(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Coins.click();
    }
    public void selectDropDownTen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Collectibles.click();
    }
    public void selectDropDownEleven(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Computers.click();
    }
    public void selectDropDownTwelve(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Electronics.click();
    }
    public void selectDropDownThirteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Crafts.click();
    }
    public void selectDropDownFourteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Dolls.click();
    }
    public void selectDropDownFifteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Dvd.click();
    }
    public void selectDropDownSixteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Motors.click();
    }
    public void selectDropDownSeventeen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Entertaiment.click();
    }
    public void selectDropDownEighteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        GiftCards.click();
    }
    public void selectDropDownNinteen(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Health.click();
    }
    public void selectDropDownTwenty(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Health.click();
    }
    public void selectDropDownTwentyOne(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Home.click();
    }
    public void selectDropDownTwentyTwo(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Jewlery.click();
    }
    public void selectDropDownTwentyThree(){
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        DDArrow.click();
        Music.click();
    }
}
