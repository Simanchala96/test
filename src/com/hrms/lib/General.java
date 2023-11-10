package com.hrms.lib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import com.hrms.utility.Log;


        public class General extends Global {
	    public void openApplication() {
		driver = new FirefoxDriver();
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		}
		public void closeApplication() {
		driver.close();
		System.out.println("Application closed");
		Log.info("Application closed");
		}
		public void login() {
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
		}
		public void enterFrame() {
		driver.switchTo().frame(empinfo_frame);
		System.out.println("enterintoframe");
		Log.info("enterintoframe");
		}
		public void exitFrame() {
		driver.switchTo().defaultContent();
		System.out.println("exitframe");
		Log.info("exitframe");
		}
		public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
		}
		public void addNewEmp() {
		driver.findElement(By.xpath(btn_Add)).click();
		driver.findElement(By.name(txt_efn)).sendKeys(efn);
		driver.findElement(By.name(txt_eln)).sendKeys(eln);
		driver.findElement(By.id(btn_save)).click();
		System.out.println("Add new Emp");
		Log.info("Add emp");
		}
}
