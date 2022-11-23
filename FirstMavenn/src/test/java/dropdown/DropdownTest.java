package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;


public class DropdownTest extends BaseTests {
    @Test
    public void testSelection(){
       var dropDownPage= homePage.clickDropDown();
       String option="Option 1";
       dropDownPage.selectFromDropDown(option);
       var selectedOption=dropDownPage.getSelectedOption();
       //assetEquals(selectedOption.size(), 1,"incorrect nimber of selection");
        //assetTrue(selectedOption.contains(option),"option not selacted");

    }
}
