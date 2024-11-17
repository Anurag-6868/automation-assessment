package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;
	
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
		 System.setProperty("webdriver.edge.driver","Z:\\Testing tools drivers\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		 }

	 @When("^title of login page is Customer Login$")
	 public void title_of_login_page_is_customer_login(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Customer Login", title);
	 }
	 
	 @Then("^user enters \"(.*)\" and \"(.*)\"$")
	 public void user_enters_username_and_password(String username, String password) {
	     // Enter email
	     driver.findElement(By.name("login[username]")).sendKeys(username);
	     
	     // Enter password
	     driver.findElement(By.name("login[password]")).sendKeys(password);
	     
	     // Click on the Sign In button
	     driver.findElement(By.id("send2")).click();
	 }
	 
	 
	 @Then("^user is on myaccount page$")
	 public void user_is_on_myaccount_page(){	 
	 WebDriverWait wait = new WebDriverWait(driver, 40); // Increase the wait time to accommodate loading
     wait.until(ExpectedConditions.titleContains("Home Page")); // Wait for the home page title
		 
	 String title = driver.getTitle();
	 System.out.println("Page title ::"+ title);
	 Assert.assertEquals("Home Page", title);
	 }
	 

	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
	 
	 
}
