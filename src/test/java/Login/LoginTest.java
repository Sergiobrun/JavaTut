package Login;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testSuccessLogin(){
        LoginPage loginPage =  homepage.clickFormAuth();
        loginPage.setUsername("tomsmith");
        loginPage.setPasswordfield("SuperSecretPassword!");
        SecureAreaPage secureAreaPage = loginPage.clickLogin();
        secureAreaPage.getAlertText();
        assertTrue(secureAreaPage.getAlertText().contains("You logged into a secure area!"),"Alert text is wrong");

    }
}
