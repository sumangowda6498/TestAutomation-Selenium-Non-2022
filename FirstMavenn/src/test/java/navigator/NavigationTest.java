package navigator;

import base.BaseTests;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTests {
    @Test
    public void navigationTest(){
        homePage.clickDynamic().clickExample1();
        getWindow().goBack();
        getWindow().refreshPage();
        getWindow().goFprword();
        getWindow().goTo("https://testautomationu.applitools.com/selenium-webdriver-tutorial-java/chapter11.html");
    }
    @Test
    public void switchToMultipleTest(){
        homePage.clickMultipleWindow().setClickhere();
        getWindow().switchWindow("New Window");
    }
}
