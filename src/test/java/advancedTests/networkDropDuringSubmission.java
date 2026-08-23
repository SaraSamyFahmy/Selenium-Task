package advancedTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.NetworkDropPage;

//this test not meant to be used in mock website just to show the structure

public class networkDropDuringSubmission extends BaseTest {
	
	@Test
    public void testNetworkDropDuringSubmission() {
        NetworkDropPage page = new NetworkDropPage(driver);
        page.enterUsernameAndSubmit("standard_user", "secret_sauce");
        Assert.assertNotNull(driver.getCurrentUrl(), "App should handle network drop state safely.");
    }
}
