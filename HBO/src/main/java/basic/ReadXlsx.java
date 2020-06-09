package basic;
import base.WebAPI;
import common.WebAPI;
import database.XlsxDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class ReadXlsx extends WebAPI {

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public  WebElement searchButton;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
    public  WebElement getHBO;

    @FindBy (xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/ul/li[3]/div/span")
    public WebElement signIn;

    @FindBy (css="body > main > div.navigationband.basecomponent > div > div > header > div.components\\2f Band--maxWidth > div > div.bands\\2f MainNavigation--leftSlot > span > a > svg > g > g > path")
    public WebElement HBOLogo;

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/series']")
    public WebElement series;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public WebElement movies;

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/watch-free-episodes']")
    public WebElement searchFreeEpisodes;

    @FindBy (css = "body > main > div.producteducationband.basecomponent > div > div > div.components\\2f Band--maxWidth > div > div.bands\\2f ProductEducation--pane1 > div.bands\\2f ProductEducation--ctaContainer > div > a > span")
    public WebElement HBOToday;

    @FindBy (css = "body > main > div:nth-child(4) > div > div > div.components\\2f Band--maxWidth > div.modules\\2f cards\\2f BasicCard--containers > div.modules\\2f cards\\2f BasicCard--tabletContainer > section > div > button.components\\2f CarouselButton--container.components\\2f CarouselButton--next > div > span > span > svg")
    public WebElement nextSlide;

    @FindBy (css = "body > main > div.footerband.basecomponent > div > div > footer > div.modules\\2f FollowHbo--darkGray > div > div > ul > li:nth-child(1) > a")
    public WebElement fbPage;

    @FindBy (xpath = "//a[@title='instagram']")
    public WebElement instaPage;

    @FindBy (xpath = "//a[@title='twitter']")
    public WebElement twitterLogo;

    @FindBy (xpath = "//a[@title='youtube']")
    public WebElement youtubeLogo;

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(searchButton);
        webElements.add(getHBO);
        webElements.add(signIn);
        webElements.add(HBOLogo);
        webElements.add(searchlink);
        webElements.add(searchBox);
        webElements.add(series);
        webElements.add(movies);
        webElements.add(searchFreeEpisodes);
        webElements.add(HBOToday);
        webElements.add(nextSlide);
        webElements.add(fbPage);
        webElements.add(instaPage);
        webElements.add(twitterLogo);
        webElements.add(youtubeLogo);

        List<String>list = new ArrayList<>();
        for(int i=0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

    XlsxDataReader xlData = new XlsxDataReader("C:\\Users\\Rob Dos\\Desktop\\Robin\\The-A-Team\\HBO\\src\\test\\HomePageHBO.xlsx");
    public List expectedWebElement(){
        int rowcount = xlData.getRowCount("Home");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i <= rowcount; i++){
            expect.add(xlData.getCellData("Home","searchButton",i));
        }
        System.out.println(expect);
        return expect;
    }





}
