package javascript;

import base.BaseTests;
import org.testng.annotations.Test;

public class Scrolltest extends BaseTests {
    @Test
    public void testscrollPage(){
        homePage.clickLargeDeep().scrollpage();
    }

    @Test
    public void testInfinitescroll(){
        homePage.clickInfinite().scrollToIndex(5);
    }
}
