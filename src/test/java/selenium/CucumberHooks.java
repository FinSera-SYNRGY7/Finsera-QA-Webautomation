package selenium;

import io.cucumber.java.Before;
import selenium.BaseTest;
import io.cucumber.java.After;
public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        getDriver();
    }

    @After
    public void afterTest() {
        driver.close();
    }
}