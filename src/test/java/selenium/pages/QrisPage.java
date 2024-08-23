package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class QrisPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public QrisPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By qrCode = By.xpath("//div[contains(@class, '_qrCodeWrapper_f9nor_70')]");

    public void qrcodeDisplayed(){
        WebElement qr = wait.until(ExpectedConditions.presenceOfElementLocated(qrCode));
        qr.isDisplayed();
    }
}
