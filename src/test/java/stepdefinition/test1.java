package stepdefinition;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.framework.utilities.TestBase;
import PageObject_for_pages.reddif_page_elements;
import Page_elements.Web_pageElements;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class test1 extends TestBase{
	private static Logger log=LogManager.getLogger(test1.class);
	reddif_page_elements element=new reddif_page_elements(TestBase.driver);
	private TestBase base;
	public test1(TestBase base)
	{
		this.base=base;
	}
	@Given("^www\\.Redfin\\.com site to launch$")
	public void www_Redfin_com_site_to_launch() throws Throwable {
		log.info("launch browser");
		TestBase.driver.get(base.baseURL);
		System.out.println("browser launch");
	}

	@When("^User enter Sunnyvale in searchbox$")
	public void user_enter_Sunnyvale_in_searchbox() throws Throwable {
		log.info("user enter sunnyvale text in search box");
		element.user_enter_Sunnyvale_in_searchbox_1();
	}

	@When("^press enter$")
	public void press_enter() throws Throwable {
		log.info("click on submit button");
	    element.click_submit();
	}


	@Then("^pop up appears$")
	public void pop_up_appears() throws Throwable {
	   
	}

	@When("^user select the entry \"([^\"]*)\"$")
	public void user_select_the_entry(String arg1) throws Throwable {
		log.info("user select CA and Dallas one by one");
		element.user_select_the_entry_1(arg1) ;
	}
	@Then("^navigated to Sunnyvale Real Estate page$")
	public void navigated_to_Sunnyvale_Real_Estate_page() throws Throwable {
		log.info("navigate on next page");
		//element.navigated_to_Sunnyvale_Real_Estate_page_1();
	}

	@Then("^Test Sunnyvale in search box$")
	public void test_Sunnyvale_in_search_box() throws Throwable {
		log.info("sunnyvale text found in search box on next page");
		element.test_Sunnyvale_in_search_box_1();
	}

	@When("^Select the min price as \"([^\"]*)\" and max price as \"([^\"]*)\"$")
	public void select_the_min_price_as_and_max_price_as(String arg1, String arg2) throws Throwable {
		log.info("select min and max price ");
		element.select_the_min_price_as_and_max_price_as_1(arg1,arg2);
	}

	@Then("^Verify List of homes appears from Sunnyvale,CA,USA otherwise error$")
	public void verify_List_of_homes_appears_from_Sunnyvale_CA_USA_otherwise_error() throws Throwable {
		log.info("list of homes appears");
		element.verify_List_of_homes_appears_from_Sunnyvale_CA_USA_otherwise_error_1();
	}

	@Then("^close the browser$")
	public void close_the_browser() throws Throwable {
		log.info("close browser");
	    //TestBase.driver.quit();
	}




}
