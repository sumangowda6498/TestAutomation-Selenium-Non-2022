package wysiwyg;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class WYSIWYGtest extends BaseTests {
    @Test
    public void wytest(){
        var wyz= homePage.clickW();
        wyz.clearTextArea();
        String text1="suman";
        String text2=" gowda";
        wyz.setTextArea("suman");
        wyz.increaseIndent();
        wyz.setTextArea(" gowda");

        assertEquals(wyz.getStringEditor(),text1+text2,"EEERRRROOORR");
    }

}
