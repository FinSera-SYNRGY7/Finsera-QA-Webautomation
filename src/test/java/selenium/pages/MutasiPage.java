package selenium.pages;

import io.cucumber.java.ja.且つ;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class MutasiPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public MutasiPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By monthlyButton = By.xpath("//button[.//p[text()='1 Bulan']]");
    By tangggal = By.xpath("//p[text()='23 Agustus 2024']");
    By downloadButton = By.xpath("//button[.//p[text()='Download']]");

    //method

    public void  clickMothly(){
        wait.until(ExpectedConditions.presenceOfElementLocated(monthlyButton));
        wait.until(ExpectedConditions.visibilityOfElementLocated(monthlyButton)).click();
    }
    public void clickDownload(){
        wait.until(ExpectedConditions.presenceOfElementLocated(tangggal)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(downloadButton)).click();
    }


}
