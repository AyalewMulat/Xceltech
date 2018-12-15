package com.xcelTechCRM.qa.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.xcelTech.qa.Base.TestBase;
import com.xcelTechCRM.qa.Pages.HomePage;
import com.xcelTechCRM.qa.Pages.LoginPage;


public class TestLogin extends TestBase{
	
	public TestLogin() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	LoginPage lp;
	HomePage hp;
	
	@BeforeMethod
	public void setup() throws IOException {
		
		initialization();
		lp = new LoginPage();
		hp = new HomePage();
	}
	
	
	@Test(priority = 1)
	public void Titlevalidation() {
				 
	    String title = lp.validateTitle();
		Assert.assertEquals(title, "#1 Free CRM software in the cloud for sales and service");
		
	}
	
	
	@Test(priority = 2)
	public void TestInsertUserName() throws IOException, InterruptedException {
		// lp = new LoginPage();
				
		lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	
	@AfterMethod
	public void teardown() {
		
		//driver.close();
	}

}


