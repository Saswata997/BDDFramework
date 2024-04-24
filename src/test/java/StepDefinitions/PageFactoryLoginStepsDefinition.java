/*
 * package StepDefinitions;
 * 
 * import java.time.Duration;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pageFactory.homePageFactory; import pageFactory.loginPageFactory;
 * 
 * public class PageFactoryLoginStepsDefinition {
 * 
 * static WebDriver driver; loginPageFactory login; homePageFactory home;
 * 
 * @Given("User is on Login page") public void user_is_on_login_page() { driver
 * = new ChromeDriver();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * driver.get("https://www.saucedemo.com/");
 * 
 * }
 * 
 * @When("User enters valid credentials for {string} and {string}") public void
 * user_enters_valid_credentials_for_and(String username, String password)
 * throws InterruptedException { Thread.sleep(2000);
 * 
 * 
 * login = new loginPageFactory(driver); login.enterusername(username);
 * login.enterpassword(password);
 * 
 * }
 * 
 * @And("Clicks on Login Button") public void clicks_on_login_button() {
 * 
 * login.clickonLoginButon();
 * 
 * }
 * 
 * @Then("User is navigated to Home page") public void
 * user_is_navigated_to_home_page() {
 * 
 * 
 * Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).
 * size() > 0);
 * 
 * 
 * home = new homePageFactory(driver); // To avoid NullPointerException we have
 * pass the instance argument of the // constructor that has been created in
 * homePageFactory file home.isCartDisplayed();
 * 
 * }
 * 
 * @And("Close the browser") public void close_the_browser() throws
 * InterruptedException {
 * 
 * Thread.sleep(2000); driver.close();
 * 
 * }
 * 
 * }
 */