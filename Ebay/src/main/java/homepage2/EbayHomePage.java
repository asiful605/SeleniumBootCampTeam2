package homepage2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayHomePage {

    @FindBy(id = "gh-ac")
    WebElement searchBox;
    @FindBy(id = "gh-btn")
    WebElement submit;
    @FindBy(linkText = "Electronics")
    WebElement clickonElectronics;
    @FindBy(id = "gh-shop-a")
    WebElement clickoncatagories;
    //addtocart
    @FindBy(id = "gh-ac")
    WebElement searchBar;
    @FindBy(id = "gh-btn")
    WebElement go;
    @FindBy(partialLinkText = "Java The Complete Reference, 11th Edition")
    WebElement clickOnJavaBook;
    @FindBy(id = "atcRedesignId_btn")
    WebElement addToCart;
    //buy
    @FindBy(id = "gh-ac")
    WebElement searchInput;
    @FindBy(id = "gh-btn")
    WebElement locate;
    @FindBy(partialLinkText = "Java The Complete Reference, 11th Edition")
    WebElement clickOnJavaBooks;
    @FindBy(id = "binBtn_btn")
    WebElement buyNow;
    //searchTest
    @FindBy(xpath = "//input[@id='gh-ac']")
    public static WebElement search;
    public void lookForALaptop() {
        search.sendKeys(" dell laptop", Keys.ENTER); }
    //MotorsPageSearch
    @FindBy(partialLinkText = "Motors")
    WebElement clickMotorElement;
    @FindBy(id = "gh-ac")
    WebElement searchCarParts;
    @FindBy(id = "gh-btn")
    WebElement clickSearch;
    //
    @FindBy(id =  "gh-shop-a")
    WebElement dropDownList;
    @FindBy(partialLinkText = "TV, audio & surveillance")
    WebElement clickOnElement;
    @FindBy(id = "gh-ac")
    WebElement searching;
    @FindBy(id = "gh-btn")
    WebElement goButton;
    //sporting goods
    @FindBy(partialLinkText = "Sporting Goods")
    WebElement clickOption;
    @FindBy(partialLinkText = "Hunting")
    WebElement huntingOption;
    @FindBy(partialLinkText = "Optics")
    WebElement moreInfo;
    @FindBy(partialLinkText = " Help & Contact")
    WebElement userHelpPoint;
    @FindBy(id = "search_input_element")
    WebElement searchRequest;
    //EbayCatagories list
    @FindBy(xpath= "//*[@id=\"gh-cat\"]")
    WebElement selectList;
    @FindBy(xpath = "//*[@id=\"gh-cat\"]/option[8]")
    WebElement selectPhones;
    public void lookForAPhone() {
        search.sendKeys(" iphone 11 pro max ", Keys.ENTER); }
        //addToCart
        @FindBy(xpath = "//input[@id='gh-ac']")
        WebElement searchLink;
    @FindBy(id = "gh-btn")
    WebElement clickSearchButton;
    public void lookForABook() {
        search.sendKeys(" maven book ", Keys.ENTER); }
        @FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[6]/div/div[2]/a/h3")
        WebElement selectBook;
    @FindBy(id = "binBtn_btn")
    WebElement addBook;

    @FindBy(xpath = "//input[@id='gh-ac']")
    WebElement searchText;
    @FindBy(id = "gh-btn")
    WebElement clickSearchBar;
    //CartIconTest
    @FindBy(xpath = "//*[@id=\"gh-minicart-hover\"]/div/a[1]")
    WebElement userClickCartLogo;
    @FindBy(id = "gh-ac")
    WebElement searchItem;
    @FindBy(xpath = "//*[@id=\"s0-13-11-6-3-query_answer1-answer-2-1-0-list\"]/li[1]/div/a/div/text()")
    WebElement clickPrice;
    @FindBy(id = "gh-btn")
    WebElement userClickSearch;
    @FindBy(xpath = "//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3/span")
    WebElement clickPhone;
    //about Ebay
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[2]/a")
    WebElement clickOnAboutInfo;
    //header
    @FindBy (xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[4]/a")
    WebElement fashion;
    //SearchMore
    @FindBy(id = "gh-ac")
    WebElement typeKeyword;
    @FindBy(id = "gh-btn")
WebElement clickSubmit;
    @FindBy(xpath = "//*[@id=\"gh-shop-a\"]")
    WebElement usercatagory;
    @FindBy(id = "gh-ac")
    WebElement typeItem;
    @FindBy(id = "gh-btn")
    WebElement clickButton;
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[6]/a")
    WebElement userPress;
    @FindBy(id = "gh-ac")
    WebElement keyword;
    @FindBy(id = "gh-btn")
    WebElement click;
    @FindBy(xpath = "//*[@id=\"gh-p-1\"]/a")
    WebElement clickDailyDeals;


    public void clickFashion(){
        fashion.click();
    }
    public void testingSearchBar() {
        searchBox.sendKeys("car diffusor");
        submit.click(); }
    public void testingHeaderOnElectronic() {
        clickonElectronics.click(); }
    public void dropDownTest() throws InterruptedException {
        Thread.sleep(3000);
        clickoncatagories.click(); }
    public void addToCart(){
        searchBar.sendKeys("java book");
        go.click();
        clickOnJavaBook.click();
        addToCart.click(); }
    public void buyItemOption() throws InterruptedException {
        searchInput.sendKeys("java books");
        locate.click();
        clickOnJavaBooks.click();
        Thread.sleep(3000);
        buyNow.click(); }
    public void motorsPage(){
        clickMotorElement.click();
        searchCarParts.sendKeys("muffler for honda");
        clickSearch.click(); }
    public void tvAndAudioPage(){
        dropDownList.click();
        clickOnElement.click();
        searching.sendKeys("Sony Tv");
        goButton.click(); }
    public void ebayHuntingPage(){
        clickOption.click();
        huntingOption.click();

        moreInfo.click(); }
    public void userHelpPage(){
        userHelpPoint.click();
        searchRequest.sendKeys("account"); }
    public void userCatagories(){
        selectList.click();
        selectPhones.click();
        search.sendKeys("iphone 11 pro max"); }
    public void userAddBookToCart() throws InterruptedException {
        search.sendKeys("maven book");
        clickSearchButton.click();
        Thread.sleep(Long.parseLong("3000"));
        selectBook.click();
        addBook.click(); }
    public void userLocateItem(){
        searchText.sendKeys("Mac book");
        clickSearchBar.click();
    }
    public void EbayInfo(){
        clickOnAboutInfo.click();
    }
    public void EbayCartIcon() throws InterruptedException {
        userClickCartLogo.click();
        searchItem.sendKeys("iphone 8");
        Thread.sleep(Long.parseLong("2500"));
        userClickSearch.click();
        clickPrice.click();
        clickPhone.click();
    }
    public void EbayMultiSearch(){
        typeKeyword.sendKeys("xbox,ps4,ps3");
        clickSubmit.click();

    }
    public void ebayShoppingCatagory(){
        usercatagory.click();

    }
    public void SearchItem(){
        typeItem.sendKeys("Basketball hoop");
        clickButton.click();
    }
    public void ebayDiversityPage(){
        userPress.click();
    }
    public void identify(){
        keyword.sendKeys("tv");
        click.click();
    }
    public void userDailyDeals(){
        clickDailyDeals.click();
    }






}
