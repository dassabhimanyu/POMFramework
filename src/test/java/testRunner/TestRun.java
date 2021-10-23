package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions
(
features = {".//Features/LoginPage.feature"},
glue = {"stepDefinitions"},
dryRun = false,
//tags = {"@US002"},
monochrome=true,
plugin = {"pretty", "html:test-output","json:target/cucumber.json",
		}
)
public class TestRun {

}
