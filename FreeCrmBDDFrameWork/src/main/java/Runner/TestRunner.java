package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Z:\\Eclipse Workspace\\FreeCrmBDDFrameWork\\src\\main\\java\\Features\\login.feature", //the path of the feature file
		glue={"stepDefinations"}, // the path of step definition files
		format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		monochrome = true, // display the console output in readable format
		strict = true, // it will check if any step is not defined in step definition file
		dryRun = false// to check the mapping is proper between feature file and  and step def file
		
		)
public class TestRunner {

}
