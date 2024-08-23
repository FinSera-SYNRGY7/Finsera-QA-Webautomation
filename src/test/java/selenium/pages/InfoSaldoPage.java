package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class InfoSaldoPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public InfoSaldoPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60));
    }

    //locator
    By hideButton = By.xpath("//img[@alt='lihat saldo']");
    By saldoText = By.xpath("//*[@id='root']/div/main/div/div[3]/div/div/div[3]");

    //method to verify that the saldo text is displayed
    public void saldoIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(saldoText)).isDisplayed();
    }

    public void clickHide() {
        String expectedUrl = "https://finsera.fly.dev/info-saldo";
        wait.until(ExpectedConditions.urlToBe(expectedUrl));

        try {
            Thread.sleep(5000); // Wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(hideButton));
        element.click();
    }
}
