package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameNegativeTestWithSpecialCharacters extends BaseTest {

	// Here i test the Username creation as Login in this website
	// Test Case 4 Step 12: Enter username with special characters	
	
	@Test
	private void testUsernameWithSpecialCharactersFails() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("invalid!@", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"Should fail if username contains special characters.");		}

}
