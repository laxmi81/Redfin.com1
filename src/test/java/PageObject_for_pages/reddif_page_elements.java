package PageObject_for_pages;

import static org.testng.Assert.assertTrue;
import java.util.List;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.framework.utilities.TestBase;

public class reddif_page_elements extends TestBase {

private static Logger log=LogManager.getLogger(reddif_page_elements.class);

public reddif_page_elements(WebDriver driver) {
	TestBase.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//input[@type='search']")
private List<WebElement> search_box;

@FindBy(xpath="//*[contains(@class,'item-title block')]")
private WebElement sunnyvale;

@FindBy(xpath="//*[@type='submit']")
private WebElement submit_Button;

public void search_box_click() throws Exception
{
	//browser.waitElement(search_box.get(0));
	Thread.sleep(1000);
	log.info("Found search box and send Sunnyvale");
	search_box.get(0).click();
	//browser.Input_sendkeys(search_box.get(0),System.getProperty("ca"));
	//search_box.get(0).sendKeys("Sunnyvale");
	
}
public void click_submit() throws Exception
{
	//browser.waitElement(submit_Button);
	Thread.sleep(1000);
	log.info("click submit button");
	submit_Button.click();
}
public void select_option()
{
	log.info("select right option");
	
}
public void user_enter_Sunnyvale_in_searchbox_1() throws Exception
{
	//browser.waitElement(search_box.get(0));
	Thread.sleep(1000);
	log.info("sunnyvale text");
	search_box.get(0).click();
	search_box.get(0).sendKeys("Sunnyvale");
}
/*WebElement sunny=driver.findElement(By.xpath("//*[contains(@class,'item-title block')]"));
sunny.click();
Thread.sleep(2000);
WebElement taxas=driver.findElement(By.xpath("//*[contains(text(),'Dallas, TX, USA')]"));
	taxas.click();
*/
@FindBy(xpath="//*[contains(@class,'item-title block')]")
private WebElement sunny;
@FindBy(xpath="//*[contains(text(),'Dallas, TX, USA')]")
private WebElement taxas;
public void user_select_the_entry_1(String arg1) throws Exception
{
	Thread.sleep(1000);
	if(arg1.equalsIgnoreCase("CA"))
	{
		sunny.click();
	}
	if(arg1.equalsIgnoreCase("TX"))
	{
		taxas.click();
	}
}
/*WebElement sun=driver.findElement(By.xpath("//*[contains(@class,'textContent')]"));
String Sunny=sun.getText();
System.out.println("text="+Sunny);
Assert.assertEquals(Sunny, "Sunnyvale");
Thread.sleep(1000);
System.out.println("pass");*/
@FindBy(xpath="//*[contains(@class,'textContent')]")
private WebElement Sun;
public void test_Sunnyvale_in_search_box_1() throws Exception
{
	Thread.sleep(1000);
	String sunny=Sun.getText();
	Assert.assertEquals(sunny, "Sunnyvale", "Sunnyvale is present");
}
/*List<WebElement> min_p=driver.findElements(By.xpath("//*[contains(@class,'value')]"));
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
Thread.sleep(1000);*/
@FindBy(xpath="//*[contains(@class,'value')]")
List<WebElement> min_p;
@FindBy(xpath="//span[contains(text(),'$600k')]")
WebElement sel_p_600;
@FindBy(xpath="//span[contains(text(),'$800k')]")
WebElement sel_p_800;
@FindBy(xpath="//*[contains(text(),'No max')][1]")
WebElement max_p;
@FindBy(xpath="//span[contains(text(),'$950')]")
WebElement max_sel_950;
@FindBy(xpath="//span[contains(text(),'$800')]")
WebElement max_sel_800;
public void select_the_min_price_as_and_max_price_as_1(String arg1,String arg2) throws Exception
{
	Thread.sleep(1000);
	min_p.get(0).click();
	if(arg1.equalsIgnoreCase("800"))
	{
	sel_p_800.click();
	}
	if(arg1.equalsIgnoreCase("600"))
	{
		sel_p_600.click();
	}
	Thread.sleep(1000);
	max_p.click();
	if(arg2.equalsIgnoreCase("950"))
	{
	max_sel_950.click();
	}
	if(arg2.equalsIgnoreCase("800"))
	{
		max_sel_800.click();
	}
	
}
/*List<WebElement> list_home=driver.findElements(By.xpath("//span[contains(text(),'SUNNYVALE, CA')]"));
String name="SUUNYVALE, CA";
System.out.println("size = "+list_home.size() );
Thread.sleep(1000);*/
@FindBy(xpath="//span[contains(text(),'SUNNYVALE, CA')]")
List<WebElement> list_home;
@FindBy(xpath="//span[contains(text(),'Dallas')]")
WebElement dallas;
public void verify_List_of_homes_appears_from_Sunnyvale_CA_USA_otherwise_error_1() throws Exception
{
	if(dallas!=null)
	{
	Thread.sleep(1000);
	//String name="SUNNYVALE, CA";
	System.out.println(list_home.size());
	
	for(int i=0;i<list_home.size();i++)
	{
		System.out.println(list_home.get(i).getText().toString());
		String actualString = list_home.get(i).getText().toString();
		assertTrue(actualString.contains("SUNNYVALE, CA"));
		//Thread.sleep(1000);
	}
	}
	else
	{
		System.out.println("Error");
	}
}

}