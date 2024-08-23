package selenium.stepDefinitions;

import io.cucumber.java.en.Then;
import selenium.BaseTest;
import selenium.pages.QrisPage;

public class QrisSteps extends BaseTest {
    QrisPage qrisPage = new QrisPage(driver);

    @Then("the qr code appears on screen")
    public void the_qr_code_qppears_on_screen(){
        qrisPage.qrcodeDisplayed();
    }

}
