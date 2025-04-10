package Utils;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenApp {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement emailIdElement;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    WebElement passwordElement;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    WebElement submitBtnElement;

    // Constructor
    public OpenApp(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    // Open the application
    public void openInfra(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.titleContains("Pragati Infra"));
    }

    // Login method
    public void login(String emailId, String password) {
        emailIdElement.sendKeys(emailId);
        passwordElement.sendKeys(password);
        submitBtnElement.click();
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }

    // Close the browser
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
