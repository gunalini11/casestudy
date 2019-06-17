package package6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class tesesetup {
	WebDriver driver;
	@Given("user enter username and password and logins")
	public void user_enter_username_and_password_and_logins() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.id("userName")).sendKeys("Lalitha");
		  driver.findElement(By.name("password")).sendKeys("password123");
		  driver.findElement(By.name("Login")).submit();
	}

	@And("select the product")
	public void select_the_product() {
		 WebDriverWait wait=new WebDriverWait(driver,100);
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
		    driver.findElement(By.name("products")).sendKeys("bag");	
			driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
			driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div:nth-child(1) > div > div > div:nth-child(3) > center > a")).click();
	    
	}

	@Then("user proceed for payement")
	public void user_proceed_for_payement() {
		 driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
		  driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
		  driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
	     WebDriverWait wait=new WebDriverWait(driver,100);
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn"))).click();
		 // driver.findElement(By.cssSelector("#btn")).click();
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=text]:nth-child(2)")).sendKeys("anu5");
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > input[type=password]:nth-child(4)")).sendKeys("gunalini11");
	      driver.findElement(By.cssSelector("#horizontalTab > div.resp-tabs-container > div > div > div > div > form > div > div:nth-child(3) > input[type=submit]")).click();
		  
		  //Assert.assertEquals(driver.getTitle(),"payment successfull");
	    
	}

}
