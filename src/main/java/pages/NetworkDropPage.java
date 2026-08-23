package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

// this test not meant to be used in mock website just to show the structure

public class NetworkDropPage extends BasePage {
	private final By usernameField = By.id("user-name");
	private final By submitButton = By.id("login-button");
	private final By errorBanner = By.cssSelector("[data-test='error']");

	public NetworkDropPage(WebDriver driver) {
		super(driver);
	}

	public void enterUsernameAndSubmit(String username, String password) {
		driver.findElement(usernameField).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(submitButton).click();
	}

	public boolean isErrorMessageDisplayed() {
		return driver.findElement(errorBanner).isDisplayed();
	}

}
