package com.framework.utilities;

import java.io.FileInputStream;
import java.util.Properties;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;

public class commonUtilities {
	public static TestBase objTestBase=new TestBase();
	private static Logger log=LogManager.getLogger(commonUtilities.class);
	
	
static Properties pro=new Properties();
static FileInputStream fi=null;


public void Load_logFile(String Fpath) throws Exception 
{
    log.info("log file path= "+Fpath);
	fi=new FileInputStream(Fpath);
	pro.load(fi);
	PropertyConfigurator.configure(pro);
}


}
