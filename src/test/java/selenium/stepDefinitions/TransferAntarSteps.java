package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import selenium.BaseTest;
import selenium.pages.TransferAntarPage;

public class TransferAntarSteps extends BaseTest {
    TransferAntarPage transferAntarPage = new TransferAntarPage(driver);
    @And("user select bank BRI")
    public void user_select_bank_BRI(){
        transferAntarPage.inputBank("BRI");
    }
}
