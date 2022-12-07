package base;

import Pages.HomePage;
import Pages.WindowManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//chapter 9 implicit wait
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
        //driver.manage().window().minimize();
        //driver.manage().window().setSize(new Dimension(375,412));


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
}
