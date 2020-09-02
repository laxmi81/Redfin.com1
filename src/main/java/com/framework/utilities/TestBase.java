package com.framework.utilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	
	
	public static commonUtilities common=new commonUtilities();
	public String baseURL ="https://www.redfin.com";
	public static WebDriver driver;
	
	//common.Load_logFile(System.getProperty("user.dir")+"/src/main/java/properties/log4j2.properties");
	public static void waitElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(TestBase.driver, 50);
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
}
