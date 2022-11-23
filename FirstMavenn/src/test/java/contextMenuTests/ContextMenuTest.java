package contextMenuTests;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class ContextMenuTest extends BaseTests {
    @Test
    public void testRightClick(){
        var menuPage = homePage.clickContextMenu();
        //homePage.clickLink("Context Menu");
        //ContextMenuPage menuPage=new ContextMenuPage();

        menuPage.rightClickInBox();
        String message = menuPage.getPopUpText();
        menuPage.acceptPopUp();
        assertEquals(message, "You selected a context menu", "Popup message incorrect");
    }
}
