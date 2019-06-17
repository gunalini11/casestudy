package css;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class adrun {
	WebDriver driver;
	@Given("user enter the admin id and password and logins")
	public void user_enter_the_admin_id_and_password_and_logins() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_c2a.05.08\\Desktop\\Selium 3.0\\Selium 3.0\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("SignIn")).click();
		  driver.findElement(By.id("userName")).sendKeys("admin");
		  driver.findElement(By.name("password")).sendKeys("password456");
		  driver.findElement(By.cssSelector("body > main > div > div > div > form > fieldset > div:nth-child(8) > div > input.btn.btn-lg.btn-success.col-xs-4.col-md-offset-0")).submit();
	   
	}

	@And("admin add product and fills mandatory details")
	public void admin_add_product_and_fills_mandatory_details() {
		WebDriverWait wait=new WebDriverWait(driver,100);
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button > h4")));
	    driver.findElement(By.cssSelector("body > main > div > div > div > div:nth-child(1) > button > h4")).click();
	    
	}

	@Then("click on add product")     
	public void click_on_add_product() {
		Actions b= new Actions(driver);
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[1]/div")).click();
		  b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/div")).click();
		  b.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	  driver.findElement(By.xpath("//*[@id=\"prodid\"]")).sendKeys("Laptop");
	  driver.findElement(By.xpath("//*[@id=\"priceid\"]")).sendKeys("80,000");
	  driver.findElement(By.xpath("//*[@id=\"quantityid\"]")).sendKeys("1");
	  driver.findElement(By.xpath("//*[@id=\"brandid\"]")).sendKeys("hp1");
	  driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("laptops for office purpose");
	  driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[10]/div/input[1]")).submit();
	  driver.findElement(By.linkText("SignOut")).click();
	  
	  WebDriverWait wait=new WebDriverWait(driver,100);
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignIn")));
	  driver.findElement(By.linkText("SignIn")).click();
	  driver.findElement(By.id("userName")).sendKeys("Lalitha");
	  driver.findElement(By.name("password")).sendKeys("password123");
	  driver.findElement(By.name("Login")).submit();
	  
	
	     wait.until(ExpectedConditions.presenceOfElementLocated(By.name("products")));
		    driver.findElement(By.name("products")).sendKeys("headphone");
		    driver.findElement(By.cssSelector("body > div.col-md-12.col-sm-12.col-xs-12 > form > input[type=submit]")).click();
			driver.findElement(By.cssSelector("body > section > div > div > div.col-sm-9 > div > div > div > div:nth-child(3) > center > a")).click();
			driver.findElement(By.cssSelector("#header > div.header-middle > div > div > div.col-sm-8 > div > a:nth-child(2)")).click();
			driver.findElement(By.cssSelector("#cart > tfoot > tr:nth-child(2) > td:nth-child(5) > a")).click();
			driver.findElement(By.cssSelector("body > b > div > div > div.col-lg-6.col-md-6.col-sm-6.col-xs-12.col-md-push-6.col-sm-push-6 > div > div.panel-body > div:nth-child(4) > div > form:nth-child(2) > input")).click();
			  WebDriverWait wa=new WebDriverWait(driver,50);
				 wa.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#btn")));
				 driver.findElement(By.cssSelector("#swit > div:nth-child(2) > div > label > i")).click();
				 driver.findElement(By.id("btn")).click();
					driver.findElement(By.name("username")).sendKeys("Lalitha");
					 driver.findElement(By.name("password")).sendKeys("password123");
					 driver.findElement(By.cssSelector("input[type='submit']")).submit();
					 //driver.close();
		    
	  
	    
	}

}
