package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ReusableMethodExcel {

        // bir metod olusturalim, dosya yolu, sayfa ismi  ve satir, hucre indexini verince
        // icindeki bilgiyi dondursun.

    public static Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int hucreIndex){

        Cell cell=null ;

        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            cell=workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return cell;
    }

    public static Map<String,String> createMap(String path, String sayfaAdi) {
        // Map<String, String> excelMap=new HashMap();    // mapte 2 sey vardir; key ve value ==> Map<Key, Value>
                                            // 1 key ve 1 value olur ama KEy A sutunu diger 3 Value olacak ama birlestirmemiz gerekir
        Map<String, String> excelMap=new TreeMap<>();   // TreeMap ile kendi sirasi getirmis olduk.

        Workbook workbook=null;

        try {
            FileInputStream fis=new FileInputStream(path);
            workbook=WorkbookFactory.create(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int satirSayisi=workbook.getSheet(sayfaAdi).getLastRowNum();

        String key="";
        String value="";

        for (int i=0;i<satirSayisi;i++){
            //ikinci adim tablodaki hucreleri map'e uygun hale getirecegim
            key=workbook.getSheet(sayfaAdi).getRow(i).getCell(0).toString();
            value=workbook.getSheet(sayfaAdi).getRow(i).getCell(1).toString()+
                    ", "+workbook.getSheet(sayfaAdi).getRow(i).getCell(2).toString()+
                    ", "+workbook.getSheet(sayfaAdi).getRow(i).getCell(3).toString();

            // ucuncu adim, hazirlanan key ve value degelerini map'e eklemek.
            excelMap.put(key,value);
        }

        return excelMap;

    }
}
