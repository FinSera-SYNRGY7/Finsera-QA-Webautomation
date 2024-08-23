package selenium.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import selenium.BaseTest;
import selenium.pages.LoginPage;

public class LoginSteps extends BaseTest {
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on login page")
    public void user_is_on_login_page(){
        loginPage.goToLoginPage();
    }
    @And("user input username with {string}")
    public void user_input_username_with(String username){
        loginPage.inputUsername(username);
    }
    @And("user input password with {string}")
    public void user_input_password_with(String password){
        loginPage.inputPassword(password);
    }
    @And("user click login button")
    public void user_click_login_button(){
        loginPage.clickLoginButton();
    }
}
