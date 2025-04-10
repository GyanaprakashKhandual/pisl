package Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Page.Login;
import Utils.OpenApp;

public class LoginTest {

    WebDriver driver;
    OpenApp utils;
    Login login;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        utils = new OpenApp(driver);
        login = new Login(driver);
        utils.openInfra("https://staging.pislinfra.com/");
        driver.manage().window().maximize();
    }


    @Test
    public void Login() {

        login.login("avidusinteractive@gmail.com", "avidus@001");

    }

    @Test
    public void loginWithInvalidEmail() {
        login.login("invalidemail@gmail.com", "avidus@001");
    }

    @Test
    public void loginWithInvalidPassword() {
        login.login("avidusinteractive@gmail.com", "wrongpassword123");
    }

    @Test
    public void loginWithEmptyEmail() {
        login.login("", "avidus@001");
    }

    @Test
    public void loginWithEmptyPassword() {
        login.login("avidusinteractive@gmail.com", "");
    }

    @Test
    public void loginWithEmptyCredentials() {
        login.login("", "");
    }

    @Test
    public void loginWithSQLInjectionAttempt() {
        login.login("avidusinteractive@gmail.com", "' OR '1'='1");
    }

    @Test
    public void loginWithLongEmail() {
        login.login("averylongemailaddress_thatiswaytoolongforthefieldlimit@somemailprovider.com", "avidus@001");
    }

    @Test
    public void loginWithSpecialCharactersInEmail() {
        login.login("avidus!@#$%^&*()interactive@gmail.com", "avidus@001");
    }

    @Test
    public void loginWithWhitespaceInEmailAndPassword() {
        login.login(" avidusinteractive@gmail.com ", " avidus@001 ");
    }

    
}
