package DriverManger;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public final class DriverManger {
	private DriverManger() {
	}
	
	// To choose which BrowserType you need to test on
	public static WebDriver createDriver(String browserType) {
		WebDriver driver;
		
		/*This is used only if you have old versions
		 * And this will only work on my test because it has the path for my chromedriver so if you want to change it please provide yous.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\salma\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");*/

		switch (browserType.toLowerCase()) {
		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		case "chrome":
        default:
            // Create options and prefs to disable password manager leak detection warnings
           ChromeOptions options = new ChromeOptions();
            Map<String, Object> prefs = new HashMap<>();       
            prefs.put("profile.password_manager_leak_detection", false); // Stops breach checks
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("disable-features=SafeBrowsing,PasswordLeakToggleMove");

            driver = new ChromeDriver(options);
            break;
		}
		return driver;

	}

}
