package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, features = {"src/test/resources/features"}, glue = {"step.def"},
        tags = "@login",
        monochrome = true

)
public class Run {
}
