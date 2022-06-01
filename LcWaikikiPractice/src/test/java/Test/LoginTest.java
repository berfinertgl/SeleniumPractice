package Test;

import driver.Main;
import org.junit.Test;
import page.LoginPage;

public class LoginTest extends Main {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage();
        loginPage.Login();
    }
}
