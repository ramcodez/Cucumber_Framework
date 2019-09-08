package ui.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/ui/feature", glue="ui.steps", tags= {"@tag1"},  monochrome=true)

public class CucumberRunner {

}
