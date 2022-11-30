package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DaynmicLoadPage {
    private WebDriver driver;
    private By linkEx1=By.xpath("//*[@id=\"content\"]/div/a[1]");
    public  DaynmicLoadPage(WebDriver driver){
        this.driver=driver;
    }
    public  DynamicLoadExample1 clickExample1(){
        driver.findElement(linkEx1).click();
        return new DynamicLoadExample1(driver);
    }
}
