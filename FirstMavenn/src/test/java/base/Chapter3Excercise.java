package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Chapter3Excercise {
    private WebDriver driver;
    public void setuP(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());

        WebElement shiftingContent= driver.findElement(By.linkText("Shifting Content"));
        shiftingContent.click();

        WebElement Example1= driver.findElement(By.xpath("//*[@id=\"content\"]/div/a[1]"));
        Example1.click();

        List<WebElement> menulink= driver.findElements(By.tagName("li"));
        System.out.println(menulink.size());
        for( WebElement menu : menulink){
            System.out.println(menu.getText());


    }
}

    public static void main(String[] args) {
        Chapter3Excercise ch3=new Chapter3Excercise();
        ch3.setuP();
    }
}
