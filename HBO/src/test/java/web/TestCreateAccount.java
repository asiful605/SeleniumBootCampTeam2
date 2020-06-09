package web;
import basic.CreateAccount;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

public class TestCreateAccount extends CreateAccount {
    CreateAccount ca;
    @BeforeMethod
    public void initializeElement() {
        ca = PageFactory.initElements(driver, CreateAccount.class);
    }
    @Test
    public void test()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                ca.getPassWord();
                ca.getFirstName();
                ca.getLastName();
                ca.getZipCode();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test1()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.invalidEmail();
                ca.getPassWord();
                ca.getFirstName();
                ca.getLastName();
                ca.getZipCode();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test2()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                ca.invalidPassword();
                ca.getFirstName();
                ca.getLastName();
                ca.getZipCode();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test4()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                ca.getPassWord();
                ca.emptyFirstName();
                ca.getLastName();
                ca.getZipCode();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
    @Test
    public void test5()throws Exception{
        ca.clickGetHBO();
        ca.getStartYourFreeTrial();

        String parent = driver.getWindowHandle();
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> I1 = s1.iterator();

        while (I1.hasNext()) {
            String child_window = I1.next();
            if (!parent.equals(child_window)) {
                driver.switchTo().window(child_window);
                Thread.sleep(3000);
                ca.getEmail();
                ca.getPassWord();
                ca.getFirstName();
                ca.emptyLastName();
                ca.getZipCode();
                ca.getAgreeToTerms();
                Thread.sleep(3000);
                ca.getClickOnCreateAccount();
            }
        }
    }
}
