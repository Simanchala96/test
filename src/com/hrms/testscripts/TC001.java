package com.hrms.testscripts;
import org.apache.log4j.xml.DOMConfigurator;

import org.testng.annotations.Test;

import com.hrms.lib.General;
public class TC001 {
	//public static void main(String args[]) throws Exception{
	@Test
	public void tc001() throws Exception{
	    //Test Steps
		DOMConfigurator.configure("log4j.xml");
	  General obj = new General();
	  obj.openApplication();
	  obj.login();
	  Thread.sleep(3000);
	  
	  obj.logout();
	  Thread.sleep(3000);
	  obj.closeApplication();
	 
	}
}
