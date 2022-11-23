package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By username=By.id("username");
    private By password=By.id("password");
    private By loginbtn=By.cssSelector("#login button");


    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    public void setUsername(String usrnam)
    {
        driver.findElement(username).sendKeys(usrnam);
    }

    public void setPassword(String pasword)
    {
        driver.findElement(password).sendKeys(pasword);
    }
    public SecurePage clicklogin()
    {
        driver.findElement(loginbtn).click();
        return new SecurePage(driver);
    }

}
