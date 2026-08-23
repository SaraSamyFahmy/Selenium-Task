package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestDuplicate extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4 step 14: Enter a username that is already taken / not unique

	@Test
	private void testDuplicateUsernameFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("usedusername", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"), "Should fail if username is already taken.");
	}

}
