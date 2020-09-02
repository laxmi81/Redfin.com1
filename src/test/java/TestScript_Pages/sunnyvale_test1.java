package TestScript_Pages;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.utilities.TestBase;

import PageObject_for_pages.next_page_elements;
import PageObject_for_pages.reddif_page_elements;


public class sunnyvale_test1 extends TestBase {
	reddif_page_elements main_page;
	next_page_elements next;
	//pageElement_calc calc;
	private static Logger log=LogManager.getLogger(reddif_page_elements.class);
	
	@BeforeTest
	public void Settings()
	{
		driver.get(cons.getAppUrl());
		main_page=new reddif_page_elements(TestBase.driver);
		next=new next_page_elements(TestBase.driver);
		log.info("login page of raddif.com test");
	}
	
	
	@Test
	public void enter_sunnyvale() throws Exception
	{/*
		log.info("enter sunny vale in search box and click submit button");
		main_page.search_box_click();
		main_page.click_submit();
		log.info("select sunnyvale CA USA");
		Thread.sleep(2000);
		
		next.click_1_option();
		log.info("assertion on sunnyvale");
		Thread.sleep(1000);
		String sun=next.get_title();
		Assert.assertEquals(sun, "Sunnyvale");*/
	}
	
}
