package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
   
	WebDriver driver;

	By txt_username = By.id("user-name");
	By txt_password = By.id("password");
	By btn_login = By.id("login-button");
	By txt_logo = By.xpath("//div[@class='app_logo']");
	
	public loginPage(WebDriver driver) {                 //Creating constructor to initialize reference variable of webdriver to maintain the session between pageobject file and step definitions 
		
		this.driver = driver;
	}

	public void enterUsername(String username) {

		driver.findElement(txt_username).sendKeys(username);
            
	}

	public void enterPassword(String password) {

		driver.findElement(txt_password).sendKeys(password);

	}

	public void clickonButton() {

		driver.findElement(btn_login).click();

	}

	public void labellogoisShowing() {

		driver.findElement(txt_logo).isDisplayed(); 
	}

	public void userLogin(String username, String password) {

		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
            
	}

}
