package base;

import Pages.HomePage;
import Pages.WindowManager;
import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BaseTests {
//    private WebDriver driver;  //Tutorial 13 event listner
    private WebDriver driver;

    protected HomePage homePage;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        // 13 driver.register();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//chapter 9 implicit wait
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //driver.manage().window().minimize();
        //driver.manage().window().setSize(new Dimension(375,412));r



        System.out.println(driver.getTitle());

//        List<WebElement> link=driver.findElements(By.tagName("a"));
//        System.out.println(link.size());
//
//        WebElement inputlink= driver.findElement(By.linkText("Inputs"));
//        inputlink.click();
        goHome();

        homePage=new HomePage(driver);


    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");

        homePage = new HomePage(driver);
    }
    @AfterClass
    public void teardown(){
        driver.quit();

    }
//    public static void main(String[] args) {
//        BaseTests test=new BaseTests();
//        test.setUp();
//    }
    @AfterClass
    public WindowManager getWindow(){
        return new WindowManager(driver);


    }
    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            var camera = (TakesScreenshot) driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            // System.out.println("Screen shot taken"+screenshot.getAbsolutePath());
            try {
                Files.move(screenshot, new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private ChromeOptions getChromeOptions(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("disable-infoBars");
        return options;
    }
}

