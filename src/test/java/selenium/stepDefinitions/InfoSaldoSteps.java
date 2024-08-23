package selenium.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.InfoSaldoPage;

public class InfoSaldoSteps extends BaseTest {
    InfoSaldoPage infoSaldoPage = new InfoSaldoPage(driver);

    @When("user click hide button")
    public void user_click_hide_button(){
        infoSaldoPage.clickHide();
    }
    @Then("user's balance appears on screen")
    public void user_balance_appears_on_screen(){
        infoSaldoPage.saldoIsDisplayed();
    }
}
