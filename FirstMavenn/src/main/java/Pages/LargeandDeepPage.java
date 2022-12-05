package Pages;

import org.openqa.selenium.*;

public class LargeandDeepPage {
    private WebDriver driver;
    private By table=By.id("large-table");
    public LargeandDeepPage(WebDriver driver){
        this.driver=driver;
    }
    public void scrollpage(){
        WebElement tableElement= driver.findElement(table);
        String script="arguments[0].scrollIntoView();";
        ((JavascriptExecutor)driver).executeScript(script,tableElement);
    }
}
