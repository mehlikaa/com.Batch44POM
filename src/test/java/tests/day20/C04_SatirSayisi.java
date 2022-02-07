package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {

    @Test
    public void test01() throws IOException {

        //ulkeler excelindeki sayfa1 ve sayfa2 deki satir sayilarini ve kullanilan satir sayilarini bulunuz
        String path="src/test/java/Resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(fis);

        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();
        int sayfa1FizikiKullanilanSatirSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();
        System.out.println("sayfa1 SatirSayisi :"+sayfa1SatirSayisi);
        System.out.println("sayfa1 FizikiKullanilanSatirSayisi : "+ sayfa1FizikiKullanilanSatirSayisi);

       // sayfa1SatirSayisi :190        //index numarasi getirir
        // sayfa1FizikiKullanilanSatirSayisi : 191   // fiziki satir sayisini verir

        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();
        int sayfa2FizikiKullanilanSatirSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();
        System.out.println("sayfa2 SatirSayisi :"+sayfa2SatirSayisi);
        System.out.println("sayfa2 FizikiKullanilanSatirSayisi : "+ sayfa2FizikiKullanilanSatirSayisi);




    }
}
