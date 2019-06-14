package package3;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class lgstep {
	@Given("I want to enter the username {string}")
	public void i_want_to_enter_the_username(String string) {
		System.out.println(string);
	    
	}

	@When("I want to enter the password {string}")
	public void i_want_to_enter_the_password(String string) {
		System.out.println(string);
	    
	}

	@Then("I verify the login")
	public void i_verify_the_login() {
		System.out.println("home page displayed");
	  
	}

}
