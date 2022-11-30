package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
private WebDriver driver;
private By formAuthentication=By.linkText("formAuthentication");

public HomePage (WebDriver driver){
    this.driver=driver;
}

public LoginPage clickFormAuthentication(){
    driver.findElement(formAuthentication).click();
    //clickLink("formAuthentication");
    return new LoginPage(driver);
}

public DropdownPage clickDropDown(){
    clickLink("Dropdown");
    return new DropdownPage(driver);
}
public   void clickLink(String linkText)
{
    driver.findElement(By.linkText(linkText)).click();
}

public HoverPage clickHover(){
    clickLink("Hovers");
    return new HoverPage(driver);
}
public KeyPresses clickKeyPress(){
    clickLink("Key Presses");
    return new KeyPresses(driver);
}
    public HorizontalSlider clickHorizontalSlide(){
        clickLink("Horizontal Slider");
        return new HorizontalSlider(driver);
    }

    public AlertPage clickJavaScriptAlert(){
    clickLink("JavaScript Alerts");
    return new AlertPage(driver);
    }
    public FileUpload clickFileUpload(){
    clickLink("File Upload");
    return  new FileUpload(driver);
    }
    public ContextMenuPage clickContextMenu(){
    clickLink("Context Menu");
    return new ContextMenuPage(driver);
    }
    public WysiwygEditorPage clickW(){
    clickLink("WYSIWYG Editor");
    return new WysiwygEditorPage(driver);
    }
}
