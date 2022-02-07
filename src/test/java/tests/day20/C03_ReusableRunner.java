package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_ReusableRunner {

    @Test
    public void test01() throws FileNotFoundException {

        //  Ulkeler xcelindeki, 11. indexteki satirin, 2.indexteki hucrenin Azerbaycan old test edelim.

        String path="src/test/java/Resources/ulkeler.xlsx";
        String expectedData="Azerbaycan";
        String actualData=ReusableMethod.hucreGetir(path, "Sayfa1", 11,2).toString();

        Assert.assertEquals(actualData,expectedData);



    }

}
