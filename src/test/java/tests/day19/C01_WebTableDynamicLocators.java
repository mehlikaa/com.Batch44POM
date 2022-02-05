package tests.day19;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebTableDynamicLocators {
    // 3 test metodu olusturalim
    // 1. metod satir numarasi verdigimde bana o satirdaki datalari yazdirsin
            //2.satiri yazdir desek . //tbody//tr[2]
            // 7. satiri yazdir       //tbody//tr[7]
    // 2. metod satir no ve data numarasi girdigimde verdigim datayi yazdirsin
    // 3- sutun numarasi verdigimde bana tum sutunu yazdirsin.

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;
    @Test
    public void satirYazdirPrint(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        // 1. metod satir numarasi verdigimde bana o satirdaki datalari yazdirsin
        //2.satiri yazdir desek . //tbody//tr[2]
        // 7. satiri yazdir       //tbody//tr[7]

        hmcWebTablePage=new HMCWebTablePage();

        WebElement ucuncuSatirElementi=hmcWebTablePage.satirGetir(3);


        Driver.closeDriver();
    }

    @Test
    public void hucreGetirTesti(){
        hotelMyCampPage =new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        //2.() satir No ve Data numarasi girdigimde verdigim Data'yi yazdirsin
        hmcWebTablePage = new HMCWebTablePage();
        //2.satirin 4.datasi    //tbody//tr[2]//td[4]
        //4.satirin 5.datasi       //tbody//tr[4]//td[5]
        hmcWebTablePage.hucreWebElementGetir(3,5);
        System.out.println("girdiginiz hucredeki element : "+ hmcWebTablePage.hucreWebElementGetir(3,5));
        Driver.closeDriver();
    }

    @Test
    public void sutunYazdirTesti(){
        hotelMyCampPage=new HotelMyCampPage();
        hotelMyCampPage.girisYap();
        hmcWebTablePage=new HMCWebTablePage();
        //sutun  numarası verdiğimde bana tum sutunnu yazdırsın
        hmcWebTablePage.sutunYazdir(4);
        Driver.closeDriver();
    }

}
