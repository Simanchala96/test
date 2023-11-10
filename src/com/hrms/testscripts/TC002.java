package com.hrms.testscripts;
import org.testng.annotations.Test;
import org.apache.log4j.xml.DOMConfigurator;


import com.hrms.lib.General;

public class TC002 {
	//public static void main(String args[]) throws Exception{
	@Test
	public void tc002() throws Exception{
	    //Test Steps
		DOMConfigurator.configure("log4j.xml");
	   General obj = new General();
	   obj.openApplication();
	   obj.login();
	   obj.enterFrame();
	   obj.addNewEmp();
	   Thread.sleep(3000);
	   obj.exitFrame();
	   obj.logout();
	   obj.closeApplication();
}
}
