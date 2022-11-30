package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadExample1 {
    private WebDriver driver;
    private By start=By.cssSelector("#start > button");
    private By loadonginIndicator=By.id("loading");
    private By loadingText=By.id("finish");
    public DynamicLoadExample1(WebDriver driver){
        this.driver=driver;
    }
    public void clickStart() throws InterruptedException {
        driver.findElement(start).click();
        WebDriverWait wait=new WebDriverWait(driver,5);
        //wait(5000);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadonginIndicator)));
    }
    public String getLoadedeText(){
        return driver.findElement(loadingText).getText();
    }
}
