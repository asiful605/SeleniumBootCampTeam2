package Homepage;

import common.WebAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class HBOHomePage extends WebAPI {
    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[2]/div/div/div")
    public WebElement searchButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    public void clickOnSearchButton() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSearchButton().click();
    }

    @FindBy(how = How.XPATH, using = "/html/body/main/div[1]/div/div/header/div[1]/div/div[3]/div/a/span")
    public WebElement getHBO;

    public WebElement getGetHBO() {
        return getHBO;
    }

    public void clickonGetHBO() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getGetHBO().click();
    }

    @FindBy(how = How.XPATH, using = "//div[@class='bands/MainNavigation--stickyBar']//span[@class='components/Tooltip--label']")
    public WebElement signIn;

    public WebElement getSignIn() {
        return signIn;
    }

    public void clickOnSignIn() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        getSignIn();
    }

    @FindBy(xpath = "/html/body/main/div[1]/div/div/header/div[1]/div/div[1]/span/a/svg/g/g/path")
    public WebElement HBOLogo;

    public void clickOnLogo() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        HBOLogo.click();
    }

    @FindBy(xpath = "//div[contains(@class,'bands/MainNavigation--searchIcon')]")
    public WebElement searchlink;

    public void clicksearchlink() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchlink.click();
    }

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    public void sendInput() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchBox.sendKeys("Game of Thrones", Keys.ENTER);
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[1]/div/a")
    public WebElement series;

    public void findSeries() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        series.click();
    }

    @FindBy(css = ".bands\\/MainNavigation--topBar [href='\\/movies']")
    public WebElement movies;

    public String findMovies() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        movies.click();
        String title = driver.getTitle();
        System.out.println("Movies page Title: " + title);
        return title;
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[3]/ul/li[1]/div/a")
    public WebElement searchFreeEpisodes;

    public void getFreeEpisodes() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        searchFreeEpisodes.click();
    }

    @FindBy(xpath = "//*[@id=\"root\"]/main/div[2]/header/div[1]/div/div[2]/div/div/ul/li[4]/div/a")
    public WebElement sports;

    public void getSports() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        sports.click();
    }

    @FindBy(xpath = "//a[@title='facebook']")
    public WebElement fbPage;

    public void getFbPage() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        fbPage.click();
    }

    @FindBy(xpath = "//a[@title='instagram']")
    public WebElement instaPage;

    public void getInstaPage() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        instaPage.click();
    }

    @FindBy(xpath = "//a[@title='twitter']")
    public WebElement twitterLogo;

    public void getTwitterPage() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        twitterLogo.click();
    }

    @FindBy(xpath = "//a[@title='youtube']")
    public WebElement youtubeLogo;

    public void navigateToYoutubePage() {
        TestLogger.log(getClass().getSimpleName() + ":" + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        youtubeLogo.click();
    }

    public List webElementList() {
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
        webElements.add(sports);
        webElements.add(fbPage);
        webElements.add(instaPage);
        webElements.add(twitterLogo);
        webElements.add(youtubeLogo);

        List<String> list = new ArrayList<>();
        for (int i = 0; i < webElements.size(); i++) {
            list.add(webElements.get(i).getText());
        }
        System.out.println(list);
        return list;
    }

}
