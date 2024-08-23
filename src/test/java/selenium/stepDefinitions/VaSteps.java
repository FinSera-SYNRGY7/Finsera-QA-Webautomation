package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.VaPage;

public class VaSteps extends BaseTest {
    VaPage vaPage = new VaPage(driver);

    @And("user click tambah penerima baru button")
    public void user_click_tambah_penerima_baru_button(){
        vaPage.clickinputBaru();
    }
    @And("user input valid virtual account with {string}")
    public void user_input_valid_virtual_account_with(String va){
        vaPage.inputVA(va);
        vaPage.clickLanjut();
    }
    @And("user click lanjut button")
    public void user_click_lanjut_button(){
        vaPage.scrollToElementWithText("Lanjutkan");
        vaPage.clickLanjut();
        vaPage.clickLanjut();
    }
    @When("user input valid payment pin")
    public void user_input_valid_payment_pin(){
        vaPage.pinTextShow();
        vaPage.inputSatu("1");
        vaPage.inputDua("2");
        vaPage.inputTiga("3");
        vaPage.inputEmpat("4");
        vaPage.inputLima("5");
        vaPage.inputEnam("6");
        vaPage.clickLanjut();
    }
    @Then("user successfully transfer money")
    public void user_successfully_transfer_money(){
        vaPage.successTextDisplayed();
    }
}
