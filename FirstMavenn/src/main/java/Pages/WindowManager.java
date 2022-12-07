package Pages;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;
    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate=driver.navigate();
    }

    public void goBack(){
        driver.navigate().back();
    }

    public  void goFprword(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }

    public void switchWindow(String tabTitle){
        var windows=driver.getWindowHandles();
        System.out.println("Total windows "+windows.size());

        System.out.println("Window Handles");
        windows.forEach (System.out::println);

        for(String window:windows){
            System.out.println("Switchind to window "+window);
            driver.switchTo().window(window);

            System.out.println("Title of the window "+driver.getTitle());

            if (tabTitle.equals(driver.getTitle())){
                break;
            }
        }
    }
}
