package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;


public class HorizontalSlider {
    private WebDriver driver;
    private By slider = By.cssSelector(".sliderContainer input");
    private By slidevalue=By.id("range");

    public HorizontalSlider(WebDriver driver){
        this.driver=driver;
    }

    public void slideValue(String value){
        while(!getSliderValue().equals(value)){
            driver.findElement(slider).sendKeys(Keys.ARROW_RIGHT);
        }

    }
    public String getSliderValue(){
        return driver.findElement(slidevalue).getText();
    }


}
