package hometest;

import common.WebAPI;
import homepage2.HomePageDropDown;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class TestHomePageDropDown extends HomePageDropDown {
    HomePageDropDown dropdownMenu;
    @BeforeMethod
    public void initialize() {
        TestLogger.log(getClass().getSimpleName() + ": " + WebAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        dropdownMenu = PageFactory.initElements(driver, HomePageDropDown.class); }

            @Test
        public void test42(){
            ebayDropDown();
            }
        @Test
        public void test43(){
            selectDropDownOne();
        }
        @Test
        public void test44(){
            selectDropDownTwo();
        }
        @Test
        public void test45(){
            selectDropDownThree();
        }
        @Test
        public void test46(){
            selectDropDownFour();
        }
        @Test
        public void test47(){
            selectDropDownFive();
        }
        @Test
        public void test48(){
            selectDropDownSix();
        }
        @Test
        public void test49(){
            selectDropDownSeven();
        }
        @Test
        public void test50(){
            selectDropDownEight();
        }
        @Test
        public void test51(){
            selectDropDownNine();
        }
        @Test
        public void test52(){
            selectDropDownTen();
        }
        @Test
        public void test53(){
            selectDropDownEleven();
        }
        @Test
        public void test54(){
            selectDropDownTwelve();
        }
        @Test
        public void test55(){
            selectDropDownThirteen();
        }
        @Test
        public void test56(){
            selectDropDownFourteen();
        }
        @Test
        public void test57(){
            selectDropDownFifteen();
        }
        @Test
        public void test58(){
            selectDropDownSixteen();
        }
        @Test
        public void test59(){
            selectDropDownSeventeen();
        }
        @Test
        public void test60(){
            selectDropDownEighteen();
        }
        @Test
        public void test61(){
            selectDropDownNinteen();
        }
    @Test
    public void test62(){
        selectDropDownTwenty();
    }
    @Test
    public void test63(){
        selectDropDownTwentyOne();
    }
    @Test
    public void test64(){
        selectDropDownTwentyTwo();
    }
    @Test
    public void test65(){
        selectDropDownTwentyThree();
    }
}
