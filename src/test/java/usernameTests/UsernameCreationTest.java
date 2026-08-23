package usernameTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.UsernameCreationPage;

public class UsernameCreationTest extends BaseTest {

	/*
	 * There is more than 18 step before the last one but can't be executed using
	 * the mock website so you can see them in the excel sheet and will write them
	 * as comment
	 */

	/*
	 * public void testCompleteUserJourney() { Steps 1-6: Opening app and getting
	 * started WelcomePage welcome = new WelcomePage(driver); welcome.openApp();
	 * welcome.clickGetStarted();
	 * 
	 * Steps 7-12: Email, ID scan, and facial recognition checks OtpPage otpPage =
	 * new OtpPage(driver); otpPage.enterEmailAndOtp("test@email.com", "1234");
	 * 
	 * BiometricPage bioPage = new BiometricPage(driver); bioPage.scanIdCard();
	 * bioPage.completeLivenessCheck();
	 * 
	 * Steps 13-18: PIN, details confirmation, and reaching username page (You can
	 * chain these as you build more page classes)
	 */

	// Here i test the Username creation as Login in this website

	@Test
	public void makeNewUsername() {
		UsernameCreationPage usernameCreation = new UsernameCreationPage(driver);
		usernameCreation.createAccount("standard_user", "secret_sauce");
		Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),
				"URL should contain 'inventory' after successful login");

	}

}
