package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class LoginPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    // locators
    By usernameField = By.xpath("//*[@id='username']");
    By passwordField = By.xpath("//*[@id='password']");
    By loginButton = By.xpath("//*[@id='root']/div/div/div[2]/div/form/button");
    By errorText = By.xpath("//*[@id='root']/div/div/div[2]/div/form/div[4]");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Initialize WebDriverWait
    }

    public void goToLoginPage() {
        driver.get("https://finsera.fly.dev");
    }

    public void inputUsername(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(usernameField)).sendKeys(username);
    }

    public void inputPassword(String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(passwordField)).sendKeys(password);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();
    }

    public boolean errorTextIsDisplayed() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(errorText)).isDisplayed();
    }
}