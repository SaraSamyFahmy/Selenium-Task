package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestNonEnglish extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4 Step 8: Enter username in non-English alphanumeric characters

	@Test
	private void testNonEnglishUsernameFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("123مستخدم", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail if username contains non-English characters.");
	}

}
