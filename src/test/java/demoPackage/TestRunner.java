package demoPackage;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"./src/test/java/featureFiles/login.feature"},
		
		glue = {"demoPackage"},
		
		monochrome = true,
		
		dryRun=false
		
		)

public class TestRunner {

}
