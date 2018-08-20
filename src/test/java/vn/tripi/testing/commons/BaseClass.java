package vn.tripi.testing.commons;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import vn.tripi.testing.utils.WebDriverFactory;

public class BaseClass {
	protected WebDriver driver = null;

	@BeforeClass
	public void beforeClass() {
		driver = WebDriverFactory.getDriver();
		driver.manage().window().maximize();
		driver.get(System.getProperty("baseURL"));
	}

	@AfterClass
	public void afterClass() {
		if (driver != null)
			driver.quit();
	}
}
