package slideVAlueTest;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SlideValueTest extends BaseTests {
    @Test
    public void slideTest(){
        var slideTest=homePage.clickHorizontalSlide();
        var v="4";
        slideTest.slideValue(v);
        assertEquals(slideTest.getSliderValue(),v,"Unexpected Slidevalue");
    }
}
