package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import selenium.BaseTest;
import selenium.pages.EwalletPage;

public class EwalletSteps extends BaseTest {
    EwalletPage ewalletPage = new EwalletPage(driver);

    @And("user select shopeePay")
    public void user_select_shopeepay(){
        ewalletPage.clickShopee();
    }
    @And("user input nomor telfon with {string}")
    public void user_input_nomor_telfon_with(String nomor){
        ewalletPage.inputNomor(nomor);
        ewalletPage.clickLanjut();
    }
    @And("user is on the e-wallet selection page")
    public void user_is_on_ewallet(){
        ewalletPage.backtextIsDisplayed();
    }
}
