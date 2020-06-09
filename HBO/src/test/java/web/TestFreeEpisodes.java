package web;
import basic.AllFreeEpisodes;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class TestFreeEpisodes extends AllFreeEpisodes{

    AllFreeEpisodes free;
    @BeforeMethod
    public void initializeElement(){ free= PageFactory.initElements(driver, AllFreeEpisodes.class); }
    @Test
    public void navigateToFreeEpisodes(){free.getFreeEpisodes();}
    @Test
    public void watchSoprano(){
        free.getFreeEpisodes();
        free.getWatchSopranos();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlaySopranos();
        free.getInputEmail();
        free.getPressPlay();
    }
    @Test
    public void watchTheIceBox(){
        free.getFreeEpisodes();
        //js.executeScript("arguments[0].scrollIntoView();", theIceBox);
        free.getTheIceBox();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayIceBox();
        free.getInputEmail();
        free.getPressPlay();
    }
    @Test
    public void watchWestWorld(){
        free.getFreeEpisodes();
        free.getWestWorld();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayWestWorld();
    }
    @Test
    public void watchBarry(){
        free.getFreeEpisodes();
        free.getBarry();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayBarry();
    }
    @Test
    public void watchSally4Ever(){
        free.getFreeEpisodes();
        free.getSally4Ever();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlaySally4Ever();
    }
    @Test
    public void watchPodSaveAmerica(){
        free.getFreeEpisodes();
        free.getPodSaveAmerica();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayPodSaveAmerica();
    }
    @Test
    public void watchSharpObjects(){
        free.getFreeEpisodes();
        free.getSharpObjects();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlaySharpObjects();
    }
    @Test
    public void watchAnimals(){
        free.getFreeEpisodes();
        free.getAnimals();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayAnimals();
    }
    @Test
    public void watchSrAvila(){
        free.getFreeEpisodes();
        free.getSrAvila();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlaySrAvila();
    }
    @Test
    public void watchVeep(){
        free.getFreeEpisodes();
        free.getVeep();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayVeep();
    }
    @Test
    public void watchHereAndNow(){
        free.getFreeEpisodes();
        free.getHereAndNow();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayHereAndNow();
    }
    @Test
    public void watchTheNightOf(){
        free.getFreeEpisodes();
        free.getTheNightOf();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayTheNightOf();
    }
    @Test
    public void watchRoom104(){
        free.getFreeEpisodes();
        free.getRoom104();
        try {
            sleepFor(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        free.getPlayRoom104();
    }
    @Test
    public void allFreeSpisodes(){
        free.getFreeEpisodes();
        List actual = free.list();
        List expected = free.expectedAllFreeEpisodes();
        Assert.assertEquals(actual,expected);
    }



}
