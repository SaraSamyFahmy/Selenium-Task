package advancedTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.SecuritySwipePage;

public class SecuritySwipeBackClearsData extends BaseTest {

	@Test
	public void testSecuritySwipeBackClearsData() {
		SecuritySwipePage page = new SecuritySwipePage(driver);
		page.enterUsername("standard_user");
		page.simulateSwipeBackOrNavigation();
		driver.get("https://www.saucedemo.com/");
		String fieldValue = page.getUsernameFieldValue();
		Assert.assertEquals(fieldValue, "", "Input field should be cleared after a swipe-back security event.");
	}
}
