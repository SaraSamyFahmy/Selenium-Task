package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestTooLong extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4: Enter username longer than expected format (15 characters)
	
	@Test
	private void testUsernameTooLongFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("invalidusername123", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail if username is longer than 15 characters.");
	}

}
