package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {

    @Test
    public void positiveLoginTest(){
        //hotel my camp sitesine positive login testini, pom a tam uygun olarak yapiniz.

        //https://www. hotelmycamp.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        //        login butonuna bas
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.ilkLoginLinki.click();
        //    test data username: manager ,
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        //    test data password : Manager1!
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.bekle(3);
        hotelMyCampPage.loginButonu.click();
        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

        //Driver.getDriver().get("https://www. hotelmycamp.com/");
        // artik bunu da kullanmayacagiz
        //.properties den degistir
        //Driver.getDriver().get("properties dosyasina git, https://www.hotelmycamp.com/'e karsilik gelen degeri getir. ");

        Assert.assertTrue(hotelMyCampPage.basariliGirisYaziElementi.isDisplayed());





    }

}
