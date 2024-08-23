package selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.BaseTest;

import java.time.Duration;

public class TransferAntarPage extends BaseTest {
    WebDriver driver;
    WebDriverWait wait;

    public TransferAntarPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //locator
    By dropdownField = By.xpath("//div[contains(@class, 'css-13cymwt-control')]");
    By searchField = By.xpath("//input[@aria-label='Pilih Bank Tujuan Transfer']");
    By bankOption = By.xpath("//div[contains(text(),'BRI')]");

    //method
    public void inputBank(String bank){
        // Click to open the dropdown
        WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(dropdownField));
        dropdown.click();

        // Wait for the search field to become visible and interactable
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(searchField));
        search.sendKeys(bank);

        // Wait for the bank option to be clickable, then click
        WebElement bankToSelect = wait.until(ExpectedConditions.elementToBeClickable(bankOption));
        bankToSelect.click();
    }
}
