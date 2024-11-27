package stepsDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/features",
glue="stepsDefinition",
plugin = {"html:reports"},
tags = {"@smoke"} )

public class TestRunner extends AbstractTestNGCucumberTests{
	

}
