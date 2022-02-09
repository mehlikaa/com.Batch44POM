package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExcelMapeYukleme {

    @Test
    public void test01(){

        //dosya yolu, ve sayfa ismi verilen bir excel sheet'i map olarak kaydeden reusable bir metod olusturalim

        String path="src/test/java/Resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        Map<String, String> ulkelerMap= ReusableMethodExcel.createMap(path,sayfaAdi);
        // System.out.println("Map imiz : "+ReusableMethod.createMap(path,sayfaAdi));

        System.out.println(ulkelerMap.get("Turkey"));

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));


    }
}
