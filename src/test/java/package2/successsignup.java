package package2;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class successsignup {

	@Given("Admin enter the AdminId as {int} in the field")
	public void admin_enter_the_AdminId_as_in_the_field(Integer int1) {
	   System.out.println(int1);
	}

	@Given("Admin enters the password as {int} in the password field")
	public void admin_enters_the_password_as_in_the_password_field(Integer int1) {
	    System.out.println(int1);
	}


@Given("he clicks on the {string} submit button")
public void he_clicks_on_the_submit_button(String string) {
	System.out.println(string);
   
}

@When("admin click on {double}  submit button")
public void admin_click_on_submit_button(Double double1) {
	System.out.println(double1);
   
}



@Then("the homepage is displayed")
public void the_homepage_is_displayed() {
	System.out.println("home is displayed successfully");

}
}

