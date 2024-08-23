package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.CreatePinPage;
import selenium.pages.HomePage;
import selenium.pages.LoginPage;

public class HomeSteps extends BaseTest {
    HomePage homePage = new HomePage(driver);


    @Then("user is on homepage")
    public void user_is_on_homepage(){
        homePage.nameIsDisplayed();
    }
    @Given("user already in homepage")
    public void user_already_in_homepage(){
        LoginPage loginPage = new LoginPage(driver);
        CreatePinPage createPinPage = new CreatePinPage(driver);

        loginPage.goToLoginPage();
        loginPage.inputUsername("johndoe");
        loginPage.inputPassword("password123");
        loginPage.clickLoginButton();

        createPinPage.inputSatu("1");
        createPinPage.inputDua("2");
        createPinPage.inputTiga("3");
        createPinPage.inputEmpat("4");
        createPinPage.inputLima("5");
        createPinPage.inputEnam("6");
        createPinPage.clickLanjut();

        //konfirmasi
        createPinPage.konfpin();
        createPinPage.inputSatu("1");
        createPinPage.inputDua("2");
        createPinPage.inputTiga("3");
        createPinPage.inputEmpat("4");
        createPinPage.inputLima("5");
        createPinPage.inputEnam("6");
        createPinPage.clickLanjut();

        homePage.nameIsDisplayed();
    }
    @And("user click info saldo button")
    public void user_click_info_saldo_button(){
        homePage.scrollToElementWithText("Riwayat");
        homePage.clickInfoSaldo();
    }
    @And("user click mutasi button")
    public void user_click_mutasi_button(){
        homePage.scrollToElementWithText("Mutasi");
        homePage.clickMutasi();
    }
    @When("user click qris button")
    public void user_click_qris_button(){
        homePage.scrollToElementWithText("QRIS");
        homePage.clickQris();
    }
    @And("user click virtual acount number")
    public void user_click_virtual_account_number(){
        homePage.scrollToElementWithText("Virtual");
        homePage.clickVA();
    }
    @And("user click tranfer sesama bank button")
    public void user_click_transfer_Sesama_button(){
        homePage.scrollToElementWithText("Sesama");
        homePage.clickTSB();
    }
    @And("user click ewallet button")
    public void user_click_ewallet_button(){
        homePage.scrollToElementWithText("Wallet");
        homePage.clickEwallet();
    }
    @And("user click tranfer antar bank button")
    public void user_click_transfer_antar_bank_button(){
        homePage.scrollToElementWithText("Antar");
        homePage.clickTAB();
    }
}
