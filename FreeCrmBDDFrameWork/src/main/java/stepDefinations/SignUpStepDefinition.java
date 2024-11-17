package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpStepDefinition {

	WebDriver driver;
	
	 @Given("^the user is on the sign-up page$")
	 public void user_is_on_the_signup_page(){
		 System.setProperty("webdriver.edge.driver","Z:\\Testing tools drivers\\edgedriver_win64\\msedgedriver.exe");
		 driver = new EdgeDriver();
		 driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
		 }
	 
	 @When("^title of sign-up page is Create New Customer Account$")
	 public void title_of_signup_is_create_new_customer_account(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Create New Customer Account", title);
	 }
	 
	 @Then("^user enters the details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	 public void user_enters_account_details_(String firstName, String lastName, String email, String password, String confirmPassword) {
	     WebDriverWait wait = new WebDriverWait(driver, 40);

	     // Wait for the First Name field to be visible
	     WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstname")));
	     WebElement lastNameField = driver.findElement(By.id("lastname"));
	     WebElement emailField = driver.findElement(By.id("email_address"));
	     WebElement passwordField = driver.findElement(By.id("password"));
	     WebElement confirmPasswordField = driver.findElement(By.id("password-confirmation"));

	     // Enter the details in the respective fields
	     firstNameField.clear();
	     firstNameField.sendKeys(firstName);

	     lastNameField.clear();
	     lastNameField.sendKeys(lastName);

	     emailField.clear();
	     emailField.sendKeys(email);

	     passwordField.clear();
	     passwordField.sendKeys(password);

	     confirmPasswordField.clear();
	     confirmPasswordField.sendKeys(confirmPassword);

	     // Locate and click the "Create an Account" button
	     WebElement createAccountButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and contains(@title, 'Create an Account')]")));
	     createAccountButton.click();

	     System.out.println("Entered account details and clicked on Create an Account.");
	 }

	 @Then("^user is on myaccount page$")
	 public void user_is_on_myaccount_page(){
		 
	 WebDriverWait wait = new WebDriverWait(driver, 40); // Increase the wait time to accommodate loading
     wait.until(ExpectedConditions.titleContains("My Account")); // Wait for the home page title
		 
	 String title = driver.getTitle();
	 System.out.println("Page title ::"+ title);
	 Assert.assertEquals("My Account", title);
	 }
	 
	
}
