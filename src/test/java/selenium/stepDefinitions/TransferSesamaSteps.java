package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import selenium.BaseTest;
import selenium.pages.TransferSesamaPage;

public class TransferSesamaSteps extends BaseTest {
    TransferSesamaPage transferSesamaPage = new TransferSesamaPage(driver);

    @And("user input nomor rekening with {string}")
    public void user_input_nomor_rekening_with(String norek){
        transferSesamaPage.inputNorek(norek);
        transferSesamaPage.clickLanjut();
    }
    @And("user input nominal with {string}")
    public void user_input_nominal_with(String nominal){
        transferSesamaPage.inputNominal(nominal);
    }
    @And("user input catatan with {string}")
    public void user_input_catatan_with(String catatan){
        transferSesamaPage.inpuCatatan(catatan);
        transferSesamaPage.clickLanjut();
        transferSesamaPage.clickLanjut();
    }
    @And("user click the lanjut button")
    public void user_click_the_lanjut_button(){
        transferSesamaPage.clickLanjut();
        transferSesamaPage.text();
        transferSesamaPage.clickLanjut();
    }
}
