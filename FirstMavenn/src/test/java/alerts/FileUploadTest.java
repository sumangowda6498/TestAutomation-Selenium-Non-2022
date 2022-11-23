package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FileUploadTest extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileup=homePage.clickFileUpload();
                fileup.uoloadFile("C:\\Users\\sumana\\IdeaProjects\\FirstMavenn\\resources\\chromedriver.exe");
   assertEquals(fileup.getUploadFile(),"chromedriver.exe","file does'nt match");
    }
}