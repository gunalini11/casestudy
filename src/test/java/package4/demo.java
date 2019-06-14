package package4;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions( tags= {"@smoke","@UAT"},
                  monochrome=true,
                    plugin= {"pretty"})
public class demo {

}
