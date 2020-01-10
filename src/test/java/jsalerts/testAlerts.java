package jsalerts;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class testAlerts extends BaseTest {
    @Test
    public void testAcceptAlert(){
        JavaScriptAlertsPage alertsPage = homepage.clickJavaScriptsAlert();
        alertsPage.clickClickJSAlertbtn();
        alertsPage.acceptAlertButton();
        assertEquals(alertsPage.getResultText(),"You successfuly clicked an alert");
    }

}
