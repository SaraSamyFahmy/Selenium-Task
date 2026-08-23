package advancedTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.DeletedAccountPage;

//this test not meant to be used in mock website just to show the structure

public class ReuseDeletedAccountUsername extends BaseTest {

	@Test
	public void testReuseDeletedAccountUsername() {
		DeletedAccountPage page = new DeletedAccountPage(driver);
		page.attemptReuseOfDeletedUsername("deleted_user123", "secret_sauce");
		Assert.assertFalse(driver.getCurrentUrl().contains("inventory"),
				"System should restrict reusing a retained username from a deleted account.");

	}
}
