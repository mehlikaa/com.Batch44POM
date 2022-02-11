package tests.practice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P01_DemoGuruPage;
import pages.P01_DemoGuruPage;
import pages.P01_DemoGuruPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
public class P01_DemoGuruTest {
    /*
    http://demo.guru99.com/test/drag_drop.html url e git
    DEBIT SIDE da Account bolumune BANK butonunu surukle ve birak
    CREDIT SIDE da Account bolumune SALES butonunu surukle ve birak
    DEBIT SIDE da Amount bolumune 5000 butonunu surukle ve birak
    CREDIT SIDE da Amount bolumune ise ikinci 5000  butonunu surukle ve birak
    Perfect butonun goruntulendigini dogrulayin
     */
    @Test
    public void test(){
        Driver.getDriver().get(ConfigReader.getProperty("demoGuruUrl"));
        Actions actions = new Actions(Driver.getDriver());
        P01_DemoGuruPage p01_demoGuruPage = new P01_DemoGuruPage();
        actions.dragAndDrop(p01_demoGuruPage.bankButonu, p01_demoGuruPage.debitsideAccount).
                dragAndDrop(p01_demoGuruPage.salesButonu,p01_demoGuruPage.creditSideAccount).
                dragAndDrop(p01_demoGuruPage.firstnum5000Butonu,p01_demoGuruPage.debitsideAmount).
                dragAndDrop(p01_demoGuruPage.secondnum5000Butonu,p01_demoGuruPage.creditSideAmount).
                sendKeys(Keys.PAGE_DOWN).perform();
        Assert.assertTrue(p01_demoGuruPage.perfectYazisi.isDisplayed());
        ReusableMethods.waitFor(4);
    }
}