package testme;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class tssetup {
	WebDriver driver;
	@Given("user enter the username")
	public void user_enter_the_username() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.id("userName")).sendKeys("Lalitha");
		 
		 
	}

	@Given("user enter the password")
	public void user_enter_the_password() {
		 driver.findElement(By.name("password")).sendKeys("password123");
	}

	@When("user click on submit button")
	public void user_click_on_submit_button() {
		 driver.findElement(By.name("Login")).submit();
	}

	@Then("directs the use to the homepage")
	public void directs_the_use_to_the_homepage() {
		  Assert.assertEquals(driver.getTitle(),"Home");
	}

	@Given("user click on the product")
	public void user_click_on_the_product() {
		 driver.findElement(By.name("products")).sendKeys("bag");
			
			
			
	}

	@Given("user select the product")
	public void user_select_the_product() {
		driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
	}

	@Given("user click on add to cart")
	public void user_click_on_add_to_cart() {
		driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div:nth-child(1) > div > div > div:nth-child(3) > center > a")).click();
	    
	}

	@When("user clicks the product is added to cart")
	public void user_clicks_the_product_is_added_to_cart() {
		 Assert.assertEquals(driver.getTitle(),"View Cart");	
	 
	}

	@Then("click on cart to proceed for payment")
	public void click_on_cart_to_proceed_for_payment() {
		driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
	}	  
	     

	@Given("user click on checkout")
	public void user_click_on_checkout() {
		driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
		  driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
	}

	@Then("click on payment")
	public void click_on_payment() {
		 WebDriverWait wait=new WebDriverWait(driver,100);
	      wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn"))).click();
		 
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=text]:nth-child(2)")).sendKeys("anu5");
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=password]:nth-child(4)")).sendKeys("gunalini11");
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > div > div:nth-child(3) > input[type=submit]")).click();
	}
	


}
