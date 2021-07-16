package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/FeatureFiles",
glue="stepDefinitions")
public class TestRunnerTestNG extends AbstractTestNGCucumberTests{

	}
