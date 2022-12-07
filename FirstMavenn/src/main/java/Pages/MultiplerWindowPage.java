package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultiplerWindowPage {
private WebDriver driver;
private By clickhere=By.linkText("Click Here");

public MultiplerWindowPage(WebDriver driver){
    this.driver=driver;
}
public void setClickhere(){
    driver.findElement(clickhere).click();
}
}
