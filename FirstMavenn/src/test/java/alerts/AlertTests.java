package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class AlertTests extends BaseTests {
    @Test
    public void TestAlert() throws InterruptedException {
        var alertPage=homePage.clickJavaScriptAlert();
        alertPage.triggerAlert();
        alertPage.alert_acceptAlert();
        wait(10000);
        assertEquals(alertPage.getResult(),"You successfully clicked an alert","unexcepected Result");
    }

    @Test
    public void getTextfromAlert(){
        var alertPage=homePage.clickJavaScriptAlert();
alertPage.triggerConfirm();
        String text= alertPage.get_AlertConfir();
        alertPage.alert_dissmissconfirm();
        assertEquals(text,"I am a JS Confirm","text is incorect");
    }

        @Test
                public void getPromptAlert(){
            var alertPage=homePage.clickJavaScriptAlert();
            alertPage.triggerPrompt();
            String txt= "suman";
            alertPage.setAlertInput_prompt(txt);
            alertPage.alert_acceptPrompt();
            assertEquals(alertPage.getResult(),txt,"text is incorect");


        }

}
