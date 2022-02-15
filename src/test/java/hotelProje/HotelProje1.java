package hotelProje;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelProjePage04;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelProje1 {

    @Test
    public void test01() {

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        HotelProjePage04 hotelProje=new HotelProjePage04();

        hotelProje.hotelLoginButton.click();

        hotelProje.hotelUsername.sendKeys("Manager"+ Keys.ENTER);
        hotelProje.hotelPassword.sendKeys("Manager1!"+ Keys.ENTER);

        hotelProje.hotelManagerLogin.click();

        //System.out.println("Sayfa taitle'i Admin - ListOfUsers ise basarili");
        //String actualManagerTitle=Driver.getDriver().getTitle();
        //String expectedManagerTitle="Admin - ListOfUsers";
        //Assert.assertEquals(actualManagerTitle,expectedManagerTitle);
        hotelProje.bekle(1);
        //hotelProje.systemManagementLink.click();
        hotelProje.hotelManagerButonuWebElement.click();

        hotelProje.hotelListLink.click();


        Actions actions=new Actions(Driver.getDriver());
        Faker faker=new Faker();

        actions.click(hotelProje.codeInputBox)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)

                .perform();








    }
}
