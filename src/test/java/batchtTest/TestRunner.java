package batchtTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber .class)
//fearures=(where exact feature  file is there and dummy file)
//tags=(method which u have to run name)
//tags=~ (which method not to execute mention name with negation)
//plugin=where u have to generate report
@CucumberOptions(features="28jancucumber.feature",glue= {"StepGlue"},tags= {"@datadriven"}
,plugin="json:target/cucumber-report.json")


public class TestRunner {

}
