package com.facebookstepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                     glue = "com.facebookstepdefinition",
                    plugin= "html:target",
               monochrome = true,
                    dryRun=true,
                    tags  = "@smoke") // particular scenario run
						  //"~@smoke" to skip particular scenario
						 //{"@smoke","@regression"}
						//{"@smoke,@regression"}
public class TestRunner {

}
