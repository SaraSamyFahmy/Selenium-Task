package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestWithoutNumber extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 2 Step 10: Enter username without any numbers
	
	@Test
	private void testUsernameWithoutNumberFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("username", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail if username does not contain at least one number.");		}

}
