package package5;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class setg1 {
	@Given("I want to enter username and password")
	public void i_want_to_enter_username_and_password(io.cucumber.datatable.DataTable dt) {
		List<Map<String,String>> list=dt.asMaps(String.class,String.class);
				for(int i=0;i<list.size();i++)
				{
					System.out.println(list.get(i).get("username"));
					System.out.println(list.get(i).get("password"));
				}
		
		
	}
	    

	@When("I enter login")
	public void i_enter_login() {
		System.out.println("login");
	    
	}

	@Then("homepage is displayed")
	public void homepage_is_displayed() {
		System.out.println("home");
		
	   
	}


}
