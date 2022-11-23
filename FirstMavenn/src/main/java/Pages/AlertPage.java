package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
private WebDriver driver;
private By triggerAlertButton=By.xpath("//*[@id=\"content\"]/div/ul/li[1]/button");
private  By result=By.id("result");
private By triggerConfirmButton=By.xpath(".//button[text()='Click for JS Confirm']");
private By triggerPromptbtn=By.xpath(".//button[text()='Click for JS Prompt']");
public AlertPage(WebDriver driver){
    this.driver=driver;
}

public void triggerAlert(){
    driver.findElement(triggerAlertButton).click();
}
 public void alert_acceptAlert(){
    driver.switchTo().alert().accept();
 }
 public String getResult(){
    return driver.findElement(result).getText();
 }
 public  void triggerConfirm(){
    driver.findElement(triggerConfirmButton).click();
 }
 public void alert_dissmissconfirm(){

 driver.switchTo().alert().dismiss();
 }
 public String get_AlertConfir(){
    return driver.findElement(result).getText();
 }
 public void triggerPrompt(){
    driver.findElement(triggerPromptbtn).click();
 }

 public void setAlertInput_prompt(String text){
    driver.switchTo().alert().sendKeys(text);
 }
 public void  alert_acceptPrompt(){
    driver.switchTo().alert().accept();
 }
}
