package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.BasePage;

//this test not meant to be used in mock website just to show the structure


public class SecuritySwipePage extends BasePage {
    private final By usernameField = By.id("user-name");

    public SecuritySwipePage(WebDriver driver) {
        super(driver);
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void simulateSwipeBackOrNavigation() {
        // Simulate browser navigation back or clear state
        driver.navigate().back();
        driver.navigate().forward();
    }

    public String getUsernameFieldValue() {
        return driver.findElement(usernameField).getAttribute("value");
    }
}