package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.MutasiPage;

public class MutasiSteps extends BaseTest {
    MutasiPage mutasiPage = new MutasiPage(driver);

    @When("user click monthly button")
    public void user_click_monthly_button(){
        mutasiPage.clickMothly();
    }
    @Then("user downloaded the mutasi")
    public void user_downloaded_the_mutasi(){
        mutasiPage.clickDownload();
    }

}
