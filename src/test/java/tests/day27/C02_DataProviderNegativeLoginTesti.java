package tests.day27;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTesti {

    @DataProvider
    public static Object[][] wrongUserList() {

        String liste[][]={{"manager11","managar11"},{"manager12","managar12"},{"manager13","managar13"}};

        return liste;
    }

    @Test(dataProvider = "wrongUserList")
    public void WrongUsernamePasswordTest(String wrongUserName, String wrongPassword){
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();
        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage.ilkLoginLinki.click();
        hotelMyCampPage.usernameBox.sendKeys(wrongUserName);
        hotelMyCampPage.passwordBox.sendKeys(wrongPassword);
        hotelMyCampPage.loginButonu.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadiYaziElementi.isDisplayed());
        Driver.closeDriver();
    }

}

