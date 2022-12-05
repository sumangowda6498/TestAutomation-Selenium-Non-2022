package wait;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class Loadingtexttest extends BaseTests {
    @Test
    public void dynamicTest(){
        var loading=homePage.clickDynamic().clickExample1();
        loading.clickStart();
        assertEquals(loading.getLoadedeText(),"Hello World!","Incorrect Output");

    }
}
