package selenium.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class TransferSesamaPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public TransferSesamaPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By inpuBaru = By.xpath("//a[@href='/transfer-sesama-bank/check']");
    By norekField = By.xpath("//input[@id='accountnum_recipient']");
    By norekText = By.xpath("//h4[span[text()='Nomor Rekening']]");
    By lanjutButton = By.xpath("//h5[@class='mb-0' and text()='Lanjutkan']");
    By nominalField = By.xpath("//input[@id='nominal']");
    By nominalText = By.xpath("//textarea[@id='note']");
    By catatanField = By.xpath("//textarea[@placeholder='Masukkan catatan']");
    By sumbnorekText = By.xpath("//span[text()='Sumber rekening']");

    //method
    public void clickInputBaru(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inpuBaru)).click();
    }
    public void inputNorek(String norek){
        wait.until(ExpectedConditions.presenceOfElementLocated(norekText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(norekField)).sendKeys(norek);
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
    public void inputNominal(String nominal){
        wait.until(ExpectedConditions.presenceOfElementLocated(nominalText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(nominalField)).sendKeys(nominal);
    }
    public void inpuCatatan(String catatan){
        wait.until(ExpectedConditions.presenceOfElementLocated(catatanField));
        wait.until(ExpectedConditions.visibilityOfElementLocated(catatanField)).sendKeys(catatan);
    }
    public void scrollToElementWithText(String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        boolean isElementFound = false;

        while (!isElementFound) {
            try {
                WebElement element = driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]"));
                js.executeScript("arguments[0].scrollIntoView(true);", element);
                isElementFound = true;
            } catch (NoSuchElementException e) {
                // Scroll down a bit to attempt to find the element again
                js.executeScript("window.scrollBy(0,500);");

                // If we are at the bottom of the page, stop the loop
                if ((Boolean) js.executeScript("return (window.innerHeight + window.scrollY) >= document.body.scrollHeight;")) {
                    break;
                }
            }
        }
    }
    public void text(){
        wait.until(ExpectedConditions.presenceOfElementLocated(sumbnorekText)).isDisplayed();
    }
}
