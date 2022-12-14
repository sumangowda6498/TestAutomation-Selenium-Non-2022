package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class KeysTest extends BaseTests {
    @Test
    public void testBackSpace(){
   var keypage=homePage.clickKeyPress();
   keypage.enterInputField("A"+ Keys.BACK_SPACE);
   assertEquals(keypage.getResult(),"You entered: BACK_SPACE!","Wrong result");
    }

    @Test
    public void testPI(){
        var keypage= homePage.clickKeyPress();
        keypage.enterPI();
    }
}
