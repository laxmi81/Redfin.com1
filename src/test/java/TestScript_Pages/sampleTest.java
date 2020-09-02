package TestScript_Pages;

import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class sampleTest {
	
	     static WebDriver driver;
		public static void main(String[] args) throws Exception{
			
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\Users\\urajp\\.m2\\repository\\webdriver\\chromedriver\\win32\\83.0.4103.39\\chromedriver.exe");
	driver=new ChromeDriver();
	String url="https://www.redfin.com";

	driver.get(url);
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<WebElement> search=driver.findElements(By.xpath("//input[@type='search']"));
	search.get(0).click();
	search.get(0).sendKeys("Sunnyvale");
	Thread.sleep(1000);
	WebElement submit_btn=driver.findElement(By.xpath("//*[@type='submit']"));
	submit_btn.click();
	Thread.sleep(1000);
	
	/*WebElement sunny=driver.findElement(By.xpath("//*[contains(@class,'item-title block')]"));
	sunny.click();*/
	WebElement taxas=driver.findElement(By.xpath("//*[contains(text(),'Dallas, TX, USA')]"));
	taxas.click();
	Thread.sleep(2000);
	
	WebElement sun=driver.findElement(By.xpath("//*[contains(@class,'textContent')]"));
	String Sunny=sun.getText();
	System.out.println("text="+Sunny);
	Assert.assertEquals(Sunny, "Sunnyvale");
	Thread.sleep(1000);
	System.out.println("pass");
	
List<WebElement> min_p=driver.findElements(By.xpath("//*[contains(@class,'value')]"));
min_p.get(0).click();
Thread.sleep(1000);
WebElement sel_p=driver.findElement(By.xpath("//span[contains(text(),'$800k')]"));
sel_p.click();
Thread.sleep(1000);
WebElement max_p=driver.findElement(By.xpath("//*[contains(text(),'No max')][1]"));
max_p.click();
WebElement max_sel=driver.findElement(By.xpath("//span[contains(text(),'$950')]"));
max_sel.click();
//*[contains(text(),'SUNNYVALE, CA')]
Thread.sleep(1000);

List<WebElement> list_home=driver.findElements(By.xpath("//span[contains(text(),'SUNNYVALE, CA')]"));
String name="SUUNYVALE, CA";
System.out.println("size = "+list_home.size() );
Thread.sleep(1000);

for(int i=0;i<list_home.size();i++)
{
	System.out.println(list_home.get(i).getText().toString());
	String actualString = list_home.get(i).getText().toString();
	assertTrue(actualString.contains("SUNNYVALE, CA"));
	Thread.sleep(1000);
}
System.out.println("All homes belongs to SunnyVale, CA");


/*//Create instance of Javascript executor
JavascriptExecutor je = (JavascriptExecutor) driver;
//Identify the WebElement which will appear after scrolling down
WebElement element = driver.findElement(By.xpath("//select/option[8]"));
//now execute query which actually will scroll until that element is not appeared on page.
je.executeScript("arguments[0].scrollIntoView(true);",element);*/


	driver.quit();
		}

	}


