package Login;

import Pages.LoginPage;
import Pages.SecurePage;
import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTests {
    @Test
    public void testSuccessfulLoin(){
       LoginPage loginPage = homePage.clickFormAuthentication();
        loginPage.setUsername("tomsmith");
        loginPage.setUsername("SuperSecretPassword!");
        SecurePage securePage =loginPage.clicklogin();

        assertTrue("You logged into a secure area!"
                        .contains(securePage.statusmsg()),
                "Alert text is incorrect");

    }
}
