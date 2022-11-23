package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPresses {
    private WebDriver driver;
    private By inputFeild= By.id("target");
    private By resultText=By.id("result");
    public KeyPresses(WebDriver driver){
        this.driver=driver;
    }


    public void enterInputField(String text){
        driver.findElement(inputFeild).sendKeys(text);
    }
    public String getResult(){
        return driver.findElement(resultText).getText();

    }
    public void enterPI(){

        enterInputField(Keys.chord(Keys.ALT,"p")+"=3.14");
    }
}
