package testsearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search.MyDataReader;

import java.util.List;

public class TestDataReader {
    WebDriver driver;
    MyDataReader myDataReader;
    @BeforeMethod
    public void setUP(){
        myDataReader = PageFactory.initElements(driver,MyDataReader.class);}
    @Test
    public void webElementName(){// data driven test, using data from excel sheets
        List actual = myDataReader.webElementList();
        List expected = myDataReader.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void webElementName1(){// data driven test, using data from excel sheets
        List actual = myDataReader.webElementList1();
        List expected = myDataReader.expectedWebElement1();
        Assert.assertEquals(actual,expected);
    }
}
