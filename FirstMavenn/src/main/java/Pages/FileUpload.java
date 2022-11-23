package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUpload {
    private WebDriver driver;
    public FileUpload(WebDriver driver){this.driver=driver;}
     private By clickhere=By.id("file-upload");
    private By uploadBtn=By.id("file-submit");
    private By filename=By.id("uploaded-files");
public void clickUploadBtn(){
    driver.findElement(uploadBtn).click();
}
public void uoloadFile(String absolutepath){
    driver.findElement(clickhere).sendKeys(absolutepath);
    clickUploadBtn();
}
public String getUploadFile(){
   return driver.findElement(filename).getText();
}
}
