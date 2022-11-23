package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTest extends BaseTests {
    @Test
    public void hoverUserTest1(){
        var hoverPage=homePage.clickHover();
        var caption=hoverPage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisplayed(),"caption is not displayed");
        assertEquals(caption.getTitle(),"name: user1","Caption title is incorrect");
        assertEquals(caption.getLinkText(),"View profile", "Inncorrect Link Text");
        assertTrue(caption.getLink().endsWith("users/1"),"Wrong url");

    }
}
