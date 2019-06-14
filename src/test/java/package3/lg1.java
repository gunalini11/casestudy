package package3;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true, plugin= {"pretty","html:src\\test\\java\\package3/cucumber-reports"})
public class lg1 {

}
