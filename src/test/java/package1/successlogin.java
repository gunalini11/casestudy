package package1;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class successlogin {
	@Given("i enter the username")
	public void i_enter_the_username() {
	   System.out.println("user name is anu");
	}

	@And("i enter the password")
	public void i_enter_the_password() {
	    System.out.println("password is anu123");
	}

	@When("i click on login button")
	public void i_click_on_login_button() {
	    System.out.println("successfull login");
	}

	@Then("the homepage is displayed")
	public void the_homepage_is_displayed() {
	  System.out.println("home page");
	}


}
