package tests.day20;

import org.apache.poi.ss.usermodel.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public record C01_ReadExcel() {

    @Test
    public void testExcel() throws IOException {

        String path="src/test/java/Resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);     //okuyamazsan exception firlat
        //Biz FileInputStream ile okudugumuz excel dosyasini projemiz icerisinde kullanabilmek icin,
        //Apache poi dependency yardimi ile bir workbook olusturduk.

        // Bu workbook icerisinde ulkerler excelinin bir kopyasini kullanmamizi sagliyor.
        //Excelin yapisi geregi, bir hucreye ulasabilmek icin, workbooktan baslayarak sirasi ile,
        // sheet, row ve cell objeleri olusturmamiz gerekiyor.

        Workbook workbook= WorkbookFactory.create(fis);
        Sheet sheet=workbook.getSheet("Sayfa1");
        Row row=sheet.getRow(4);
        Cell cell= row.getCell(2);

        System.out.println(cell);
//Indexi 4 olan satirdaki, indexi 2 olan hucrenin Andorra oldugunu test edelim.

        String expectedData="Andorra";

        Assert.assertEquals(cell.toString(), expectedData);
        //Assert.assertEquals(cell.getStringCellValue(), expectedData);


        // 5.indexteki satirin 3,indexteki hucre bilgisini yazdiralim
        row=sheet.getRow(5);
        cell=row.getCell(3);
        System.out.println(cell);
    }
}
