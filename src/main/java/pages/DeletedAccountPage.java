package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

//this test not meant to be used in mock website just to show the structure


public class DeletedAccountPage extends BasePage {
    private final By usernameField = By.id("user-name");
    private final By passwordField = By.id("password");
    private final By submitButton = By.id("login-button");

    public DeletedAccountPage(WebDriver driver) {
        super(driver);
    }

    public void attemptReuseOfDeletedUsername(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(submitButton).click();
    }
}