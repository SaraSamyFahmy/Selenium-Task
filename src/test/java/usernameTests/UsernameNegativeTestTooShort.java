package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestTooShort extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4 Step 6: Enter username shorter than expected format (8 characters)
	
	@Test
	private void testUsernameTooShortFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("inva12", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail if username is shorter than 8 characters.");
		}

}
