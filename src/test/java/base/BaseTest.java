package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import DriverManger.DriverManger;

public class BaseTest {

	protected WebDriver driver;

	@BeforeMethod
	public void setup() {

		driver = DriverManger.createDriver("chrome");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

}
