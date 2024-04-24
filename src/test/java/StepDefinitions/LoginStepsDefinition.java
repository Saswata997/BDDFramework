
  package StepDefinitions;
  
  import java.time.Duration;
  
  import org.junit.Assert; import org.openqa.selenium.By; import
  org.openqa.selenium.WebDriver; import
  org.openqa.selenium.chrome.ChromeDriver;
  
  import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
  io.cucumber.java.en.Then; import io.cucumber.java.en.When;
  
  public class LoginStepsDefinition {
  
  static WebDriver driver;
  
  @Given("User is on Login page") public void user_is_on_login_page() { driver
  = new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
  driver.get("https://www.saucedemo.com/");
  
  }
  
  
 /* @When("User enters valid credentials for {string} and {string}") public void
  user_enters_valid_credentials_for_and(String username, String password)*/
  @When("User enters valid credentials for username and password")
  public void user_enters_valid_credentials_for_username_and_password() throws InterruptedException {
   
  Thread.sleep(2000); 
	/*
	 * driver.findElement(By.id("user-name")).sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(password);
	 */
  
  driver.findElement(By.id("user-name")).sendKeys("standard_user");
  driver.findElement(By.id("password")).sendKeys("secret_sauce");
  
  }
  
  @And("Clicks on Login Button") public void clicks_on_login_button() {
  driver.findElement(By.id("login-button")).click();
  
  }
  
  @Then("User is navigated to Home page") public void
  user_is_navigated_to_home_page() {
  
  Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).
  size() > 0);
  
  } 
  
  @And("Close the browser") public void close_the_browser() throws
  InterruptedException {
  
  Thread.sleep(2000); 
  
  driver.quit();
  
  
  }
  
  }
 