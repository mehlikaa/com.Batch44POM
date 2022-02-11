package tests.day22;

import com.github.javafaker.Faker;
import org.checkerframework.checker.i18nformatter.qual.I18nFormat;
import org.testng.Assert;
import pages.FacebookPage;
import utilities.Driver;
import utilities.TestBaseRapor;

//public class C02_FacebookTesti extends TestBaseRapor {
//
//    @Iest
//    public void test01() throws InterruptedException {
//
//        // 1 - https://www.facebook.com/ adresine gidin
//        Driver.getDriver().get("https://www.facebook.com/");
//        FacebookPage facebookPage = new FacebookPage();
//        facebookPage.facebookCookies.click();
//
//        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
//
//        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
//        Faker faker = new Faker();
//        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());
//        facebookPage.passKutusu.sendKeys(faker.internet().password());
//        facebookPage.loginButonu.click();
//
//        //4- Basarili giris yapilamadigini test edin
//
//        Assert.assertTrue(facebookPage.girilemediYazisiElemnti.isDisplayed());
//
//        Thread.sleep(5000);
//        Driver.closeDriver();
//    }
//
//}
