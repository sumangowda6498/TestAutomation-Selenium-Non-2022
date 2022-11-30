package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage {
  private WebDriver driver;
  private  String editorIFrameId="mce_0_ifr";
  private By textArea=By.id("tinymce");
  private By decreaseInndent=By.xpath("//*[@id=\"content\"]/div/div/div[1]/div[1]/div[2]/div/div[5]/button[2]");
  public WysiwygEditorPage (WebDriver driver){
      this.driver=driver;
  }
  public void clearTextArea(){
      switchToEditArea();
      driver.findElement(textArea).clear();
      mainPage();
  }
    public void setTextArea(String text){
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        mainPage();
    }

  private void switchToEditArea(){
      driver.switchTo().frame(editorIFrameId);
  }
  private void mainPage(){
      driver.switchTo().parentFrame();
  }
  public void increaseIndent(){
      driver.findElement(decreaseInndent).click();

  }
  public String getStringEditor(){
      switchToEditArea();
      String text=driver.findElement(textArea).getText();
      mainPage();
      return text;

  }
}
