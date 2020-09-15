package org.runner5;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse\\Cucumber5\\src\\test\\resources\\Features", glue = "org.stepdef5", dryRun = false, monochrome = true, plugin = {
		"pretty", "json:D:\\Eclipse\\Cucumber5\\src\\test\\resources\\Reporting\\rep.json" })
public class TestRunnerClass5 {

}
