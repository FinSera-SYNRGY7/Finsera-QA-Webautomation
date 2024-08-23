package selenium.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class VaPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public VaPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }

    //locator
    By inputBaru = By.xpath("//button[@class='btn d-flex align-items-center btn-outline-base-color' and @aria-label='Tambah penerima baru']");
    By vaField  = By.xpath("//input[@class='form-control py-sm-3 ps-sm-5 fz-input input' and @name='virtualAccountNumber' and @id='virtualAccountNumber' and @placeholder='Masukkan nomor virtual Account']");
    By lanjutButton = By.xpath("//h5[@class='mb-0' and text()='Lanjutkan']");
    By vaText = By.xpath("//span[@role='input' and @aria-label='nomor virtual Account' and text()='Nomor Virtual Account']");


    By pinText = By.xpath("//h4[@class='fw-bold' and text()='Masukkan PIN']");
    By pinSatu = By.xpath("//*[@id='root']/div/main/form/div/div/input[1]");
    By pinDua = By.xpath("//*[@id='root']/div/main/form/div/div/input[2]");
    By pinTiga = By.xpath("//*[@id='root']/div/main/form/div/div/input[3]");
    By pinEmpat = By.xpath("//*[@id='root']/div/main/form/div/div/input[4]");
    By pinLima = By.xpath("//*[@id='root']/div/main/form/div/div/input[5]");
    By pinEnam = By.xpath("//*[@id='root']/div/main/form/div/div/input[6]");
    By successText = By.xpath("//span[@role='label' and @aria-label='Transaksi Berhasil']/h1[@class='fw-bold' and text()='Transaksi Berhasil']");

    //method
    public void clickinputBaru(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(inputBaru)).click();
    }
    public void inputVA(String va){
        wait.until(ExpectedConditions.presenceOfElementLocated(vaText));
        wait.until(ExpectedConditions.visibilityOfElementLocated(vaField)).sendKeys(va);
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
    public void pinTextShow(){
        wait.until(ExpectedConditions.presenceOfElementLocated(pinText));
    }
    public void inputSatu(String satu){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinSatu)).sendKeys(satu);
    }
    public void inputDua(String dua){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinDua)).sendKeys(dua);
    }
    public void inputTiga(String tiga){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinTiga)).sendKeys(tiga);
    }
    public void inputEmpat(String empat){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinEmpat)).sendKeys(empat);
    }
    public void inputLima(String lima){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinLima)).sendKeys(lima);
    }
    public void inputEnam(String enam){
        wait.until(ExpectedConditions.visibilityOfElementLocated(pinEnam)).sendKeys(enam);
    }
    public void successTextDisplayed(){
        WebElement success = wait.until(ExpectedConditions.presenceOfElementLocated(successText));
        success.isDisplayed();
    }

}
