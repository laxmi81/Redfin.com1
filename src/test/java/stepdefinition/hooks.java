package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class hooks {
private com.framework.utilities.TestBase base;
	
	public hooks(com.framework.utilities.TestBase base) {
		this.base = base;
	}

	@Before
	public void initDriver() {
		System.out.println("Open browser");
		//System.setProperty("webdriver.chrome.driver", "lib/chromedriver 3");
		WebDriverManager.chromedriver().setup();
		com.framework.utilities.TestBase.driver = new ChromeDriver();
		com.framework.utilities.TestBase.driver.manage().window().maximize();
		com.framework.utilities.TestBase.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@After
	public void teardown() {
		System.out.println("Close browser");
		com.framework.utilities.TestBase.driver.quit();
	}
}
