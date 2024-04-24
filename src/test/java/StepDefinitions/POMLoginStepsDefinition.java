/*
 * package StepDefinitions;
 * 
 * import org.junit.Assert; import org.openqa.selenium.By; import
 * org.openqa.selenium.WebDriver; import
 * org.openqa.selenium.chrome.ChromeDriver;
 * 
 * import io.cucumber.java.en.And; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * pageObjects.loginPage;
 * 
 * public class POMLoginStepsDefinition {
 * 
 * static WebDriver driver; loginPage login;
 * 
 * @Given("User is on Login page") public void user_is_on_login_page() { driver
 * = new ChromeDriver(); //
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 * driver.get("https://www.saucedemo.com/");
 * 
 * }
 * 
 * // @When("User enters valid credentials for username and password") // public
 * void user_enters_valid_credentials_for_username_and_password() throws //
 * InterruptedException {
 * 
 * @When("User enters valid credentials for {string} and {string}") public void
 * user_enters_valid_credentials_for_and(String username, String password)
 * throws InterruptedException {
 * 
 * 
 * driver.findElement(By.id("user-name")).sendKeys(username);
 * driver.findElement(By.id("password")).sendKeys(password); Thread.sleep(2000);
 * 
 * 
 * login = new loginPage(driver); // passing reference argument of the loginPage
 * constructor to stepDefinitions login.enterUsername(username);
 * login.enterPassword(password);
 * 
 * }
 * 
 * @And("Clicks on Login Button") public void clicks_on_login_button() { //
 * driver.findElement(By.id("login-button")).click(); login.clickonButton();
 * 
 * }
 * 
 * @Then("User is navigated to Home page") public void
 * user_is_navigated_to_home_page() {
 * 
 * login.labellogoisShowing();
 * 
 * //
 * Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).
 * size()>0);
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