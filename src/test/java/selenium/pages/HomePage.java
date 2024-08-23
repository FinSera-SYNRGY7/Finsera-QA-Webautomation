package selenium.pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HomePage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;
    public HomePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By userName = By.xpath("//*[@id='root']/div/main/div[1]/div/div/div/div/div[1]/h3/span");
    By infosaldoButton = By.xpath("//a[@href='/info-saldo' and @aria-label='Info Saldo']");
    By mutasiButton = By.xpath("//*[@id='root']/div/main/div[3]/a[2]");
    By transfersesamaButton = By.xpath("//*[@id='root']/div/main/div[3]/a[3]");
    By transferantarButton = By.xpath("//*[@id='root']/div/main/div[3]/a[4]");
    By vaButton = By.xpath("//*[@id='root']/div/main/div[3]/a[5]");
    By ewalletButton = By.xpath("//*[@id='root']/div/main/div[3]/a[6]");
    By qrisButton = By.xpath("//*[@id='root']/div/main/div[3]/a[7]");

    //method
    public void nameIsDisplayed(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).isDisplayed();
    }

    public void clickInfoSaldo() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(infosaldoButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }

    public void clickMutasi() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(mutasiButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }

    public void clickQris() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(qrisButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }

    public void clickVA() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(vaButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }
    public void clickTSB() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(transfersesamaButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }
    public void clickEwallet() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ewalletButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
    }
    public void clickTAB() {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(transferantarButton));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);

        try {
            Thread.sleep(5000); // Tambahkan penundaan 5 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        js.executeScript("arguments[0].click();", element);
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

}
