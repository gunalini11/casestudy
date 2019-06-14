package package4;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class d1 {
	@Given("I want to enter the username {string}")
	public void i_want_to_enter_the_username(String string) {
	    System.out.println(string);
	}

	@Given("i want to enter the password {string}")
	public void i_want_to_enter_the_password(String string) {
	  System.out.println(string);
	}

	@When("I click on sumbit button")
	public void i_click_on_sumbit_button() {
		  System.out.println("click");
	}

	@Then("home page is displayed")
	public void home_page_is_displayed() {

		  System.out.println("home page");
	}

	@Given("i want to enter the old password {string}")
	public void i_want_to_enter_the_old_password(String string) {
	    System.out.println(string);
	}

	@Given("i want to enter the new password {string}")
	public void i_want_to_enter_the_new_password(String string) {
		  System.out.println(string);
	}

	@Given("i want to confirm the new password {string}")
	public void i_want_to_confirm_the_new_password(String string) {
		  System.out.println(string);
	}

	@Then("my old password is changed")
	public void my_old_password_is_changed() {
		  System.out.println("password changed");
	}

	@Given("I want to enter the productid {string}")
	public void i_want_to_enter_the_productid(String string) {
		  System.out.println(string);
	}

	@Given("i want to click on the cart")
	public void i_want_to_click_on_the_cart() {
	    System.out.println("cart");
	}

	@Given("i want to proceed with the payement credentials")
	public void i_want_to_proceed_with_the_payement_credentials() {
		  System.out.println("payment credentials");
	}

	@When("i click on payment button")
	public void i_click_on_payment_button() {
		  System.out.println("click");
	}

	@Then("payment is succesfull")
	public void payment_is_succesfull() {
		  System.out.println("successfull payed");
	}

	@Given("I want to back to home page")
	public void i_want_to_back_to_home_page() {
	    System.out.println("back to home page");
	}
	@Given("i wantto click on logout button")
	public void i_wantto_click_on_logout_button() {
	  System.out.println("logout");
	}

	@When("I click on logout button")
	public void i_click_on_logout_button() {
	    System.out.println("press log out button");
	}

	@Then("my account is successfully logged out")
	public void my_account_is_successfully_logged_out() {
	    System.out.println("log out");
	}

}
