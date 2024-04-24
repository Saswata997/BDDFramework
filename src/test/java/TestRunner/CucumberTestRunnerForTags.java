package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke or @regression and @perf", features= {"src/test/resources/FeatureWithTags"}, glue= {"StepDefinitions"},
plugin= {"pretty", "html:target/htmlreport.html"})

public class CucumberTestRunnerForTags extends AbstractTestNGCucumberTests {




}
