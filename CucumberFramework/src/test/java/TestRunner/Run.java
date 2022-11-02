package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Features/LoginFeature.feature",
		glue ="StepDefination",
		dryRun = true,
		//feature file and step defination file ki mapping hoti h ye check karta hai sare 
		//ye check karega feature file main jitne bhi step hai unke liye humne implementation method create kiya hai ya nahi
		monochrome = true,
		plugin = {"pretty"}
		)



public class Run {

	//this class will be empty 
	
	
	
}
