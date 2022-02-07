package tests.day20;

import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {

    @Test
    public void test01() throws IOException {

        // Ulkeler exceline  5, sutun ekleyelim
        //3, satirdaki ulkenin nufusunu 100000 yapalim

        String path="src/test/java/Resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);

        //ilk satirin 5.hucresine NUFUS basligini yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        workbook.getSheet("Sayfa1").getRow(2).createCell(4).setCellValue("100000");

        //kopyada olusturulan degisikleri asil dosyaya eklemek istiyoruz.
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);
       //  exceliniz aciksa ve bu halde run ederseniz dosyayi bozabilir.
    }
}
