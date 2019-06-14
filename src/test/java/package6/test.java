package package6;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome=true,  plugin= {"pretty","html:src\\test\\java\\package6\\cucumber-reports"})
public class test {
	

}
