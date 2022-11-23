package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePage {
    private WebDriver driver;
    private By status=By.id("flash");

    public SecurePage(WebDriver driver) {

        this.driver = driver;
    }
    public String statusmsg(){

        return driver.findElement(status).getText();
    }

}
