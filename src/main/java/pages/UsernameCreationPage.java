package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

/*There is more than 18 step before the last one but can't be 
 * executed using the mock website so you can see them in the 
 * excel sheet and will write them as comment*/

public class UsernameCreationPage extends BasePage {
	/*
	 * private final By emailField = By.id("email-input"); private final By otpField
	 * = By.id("otp-input"); private final By scanIdBtn = By.id("scan-id-btn");
	 * private final By mothersNameField = By.id("mothers-name-input");
	 */
	private final By usernameField = By.id("user-name");
	private final By passwordField = By.id("password");
	private final By submitButton = By.id("login-button");

	/*
	 * public VerificationPage(WebDriver driver) { super(driver); }
	 * 
	 * public void enterEmailAndOtp(String email, String otp) {
	 * driver.findElement(emailField).sendKeys(email);
	 * driver.findElement(otpField).sendKeys(otp); }
	 * 
	 * public void scanIdCard() { driver.findElement(scanIdBtn).click(); }
	 * 
	 * public void enterMothersName(String name) {
	 * driver.findElement(mothersNameField).sendKeys(name); }
	 */

	public UsernameCreationPage(WebDriver driver) {
		super(driver);
	}

	public void open(String url) {
		driver.get("https://www.saucedemo.com/");
	}

	public void createAccount(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(passwordField).sendKeys(password);
		driver.findElement(submitButton).click();
	}

}
