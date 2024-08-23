package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreatePinPage {
    WebDriver driver;
    WebDriverWait wait;

//    By buatPinLocator = By.xpath("//*[@id='root']/div/div/div[2]/div/h2");
    By pinSatu = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[1]");
    By pinDua = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[2]");
    By pinTiga = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[3]");
    By pinEmpat = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[4]");
    By pinLima = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[5]");
    By pinEnam = By.xpath("//*[@id='root']/div/div/div[2]/div/div/input[6]");
    By lanjutButton= By.xpath("//*[@id='root']/div/div/div[2]/div/button");
    By konfpinText = By.xpath("//*[@id='root']/div/div/div[2]/div/h2");

    public CreatePinPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void konfpin(){
        wait.until(ExpectedConditions.presenceOfElementLocated(konfpinText));
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
    public void clickLanjut(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lanjutButton)).click();
    }
}