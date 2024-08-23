package selenium.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.CreatePinPage;

public class CreatePinSteps extends BaseTest {
    CreatePinPage createPinPage = new CreatePinPage(driver);

    @When("user create app lock pin")
    public void user_create_app_lock_pin(){
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

    }
}
