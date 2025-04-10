package Page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

    WebDriver driver;

    @FindBy(xpath = "//input[@id='mat-input-0']")
    WebElement emailIdElement;

    @FindBy(xpath = "//input[@id='mat-input-1']")
    WebElement passwordElement;

    @FindBy(xpath = "//span[@class='mat-button-wrapper']")
    WebElement submitBtnElement;

    public Login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // initialize elements here itself!
    }

    public void login(String emailId, String password) {
        emailIdElement.sendKeys(emailId);
        passwordElement.sendKeys(password);
        submitBtnElement.click();
        
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlContains("dashboard"));
    }
}
