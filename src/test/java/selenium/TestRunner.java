package selenium;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"selenium"},
        plugin = {
                "pretty",
                "html:target/report-web.html",
                "json:target/cucumber-json.json"
        }
)
public class TestRunner {}