package com.stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
//@Cucumber.Options(features="OrangeHRM",glue={"com.OHRM_LogInTest"})

@CucumberOptions(features="OrangeHRM",glue={"com.OHRM_LogInTest"})

public class TestRunner {

	
}
