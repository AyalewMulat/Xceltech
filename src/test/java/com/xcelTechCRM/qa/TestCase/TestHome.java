package com.xcelTechCRM.qa.TestCase;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.xcelTech.qa.Base.TestBase;
import com.xcelTech.qa.Util.TestUtil;
import com.xcelTechCRM.qa.Pages.HomePage;
import com.xcelTechCRM.qa.Pages.LoginPage;

public class TestHome extends TestBase{
	public TestHome() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}



	LoginPage lp;
	HomePage hp;
	TestUtil tu;
	
	
	@BeforeMethod
	public void setUp() throws IOException, InterruptedException {
	initialization();
	lp = new LoginPage();
	hp = new HomePage();
	tu = new TestUtil();
	lp.Login(prop.getProperty("username"), prop.getProperty("password"));
	tu.switchToFrame();
	}
	
	
	
	@Test(priority =1)
	
	public void validateUsersLabel(){
		
		boolean vu = hp.validateUserLabel();
		Assert.assertTrue(vu, "VERIFIED");
		
	}
	
	
	@Test(priority=2)
	
	public void ClickingContacts() throws IOException {
		
		hp.clickContacts();
		
		
	}
	
	@Test(priority=3)
	public void clickingContactsspecific() throws IOException {
		hp.clickContacts();
		
	}
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

