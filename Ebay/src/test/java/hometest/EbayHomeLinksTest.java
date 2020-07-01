package hometest;

import Homepage.EbayHomeLinks;
import org.testng.annotations.Test;
import reporting.TestLogger;

public class EbayHomeLinksTest extends EbayHomeLinks {
    //buy
    @Test
    public void testBuy(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Buy();
    }
    //Sell
    @Test
    public void testSell(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        Sell();
    }
    //T&A
    // @Test
    public void toolsNapps(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        TnA();
    }
    //Companies
    @Test
    public void ebayCompanies(){
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        companies();
    }
    //about Ebay
    //@Test
    public void aboutEbay() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        //about();
    }
}
