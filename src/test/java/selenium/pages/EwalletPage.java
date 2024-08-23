package selenium.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class EwalletPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public EwalletPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By backText = By.xpath("//span[text()='Back']");
    By gopayButton = By.xpath("//*[@id='root']/div/main/div[2]/a[3]/div/div");
    By nomorField = By.xpath("//input[@id='ewalletAccount']");
    By nomorText = By.xpath("//span[text()='Nomor Telfon']");
    By lanjutButton = By.xpath("//button[@aria-label='Lanjutkan']//h5[text()='Lanjutkan']");

    //method
    public void clickShopee() {
        WebElement shopeeElement = wait.until(ExpectedConditions.elementToBeClickable(gopayButton));
        try {
            shopeeElement.click();
        } catch (ElementClickInterceptedException e) {
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", shopeeElement);
        }
    }
    public void backtextIsDisplayed(){
        WebElement back = wait.until(ExpectedConditions.presenceOfElementLocated(backText));
        back.isDisplayed();
    }

    public void inputNomor(String nomor){
        wait.until(ExpectedConditions.presenceOfElementLocated(nomorText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nomorField)).sendKeys(nomor);
    }
    public void clickLanjut() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            js.executeScript("arguments[0].click();", element);
        } catch (StaleElementReferenceException e) {
            // Refresh elemen dan coba lagi
            element = driver.findElement(lanjutButton);
            js.executeScript("arguments[0].click();", element);
        }
    }


}
