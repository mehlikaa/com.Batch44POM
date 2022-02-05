package tests.day16;

import org.testng.annotations.Test;
import utilities.Driver;

public class T01DriverIlkTest {

    @Test
    public void test01(){
        Driver.getDriver().get("ht");
    }

}
