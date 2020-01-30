package com.stepDefination;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="OrangeHRM",glue={"com.NewTours_LoginTest"})

public class TestRunner {

}
