package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScroll {
    private WebDriver driver;
    By textblock=By.className("jscroll-added");
    public InfiniteScroll(WebDriver driver){
        this.driver=driver;

    }

    /**
     * Scroll until paragraph specified is in view
     * @param index
     */
    public void scrollToIndex(int index){
        String script="window.scrollTo(0,document.body.scrollHeight)";
        var jsExecutor=(JavascriptExecutor)driver;

        while (getNumberOfParagraphPresent()<index){
            jsExecutor.executeScript(script);
        }
    }
    private int getNumberOfParagraphPresent(){
        return driver.findElements(textblock).size();


    }

}
