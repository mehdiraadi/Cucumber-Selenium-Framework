package Utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by shahe on 14/11/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "json:target/cucumber.json", features = {
        "src/test/java/Features/Search.feature"
}, glue = "StepDefs")
public class RunCukesTest {


}
