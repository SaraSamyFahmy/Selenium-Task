package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestBlank extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4 Step 2: Leave username field blank and click submit

	@Test
	private void testBlankUsernameFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail and stay on page if username field is blank.");
	}

}
