package com.xcelTechCRM.qa.TestCase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.xcelTech.qa.Base.TestBase;
import com.xcelTech.qa.Util.TestUtil;
import com.xcelTechCRM.qa.Pages.ContactsPage;
import com.xcelTechCRM.qa.Pages.HomePage;
import com.xcelTechCRM.qa.Pages.LoginPage;

public class TestContacts extends TestBase{

	public TestContacts() throws IOException {
		super();
		
	}
	
	LoginPage lp;
	HomePage hp;
	TestUtil util;
	ContactsPage cp;
	String sheetName = "Contacts";
	
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException{
		
		initialization();
		lp = new LoginPage();
		hp = new HomePage();
		util = new TestUtil();
		cp = new ContactsPage();
		hp = lp.Login(prop.getProperty("username"), prop.getProperty("password"));
		util.switchToFrame();;
		cp = hp.clickContacts();
		
	 }
	
		
	    @Test(priority =1)
	    public void VerifyContactslabel() {
		boolean cL = cp.VerifyContactsLabel();
		Assert.assertTrue(cL, "Contacts Label is missing on this page ");
	     }
	     
		/*@Test(priority = 2)
		public void ClickContacts(){
		cp.ClickspecificContacts();
		}*/
		
		
		@DataProvider
		public  Object[][] getXcelTechTestData() throws EncryptedDocumentException, InvalidFormatException {
			Object data [][]=TestUtil.getTestData(sheetName);
			return data;
		}
		
					
		@Test(priority = 2, dataProvider = "getXcelTechTestData")
		
		public void NewContacts(String title, String firstName, String lastName, String company) throws InterruptedException {
			
		hp.clickOnNewContacts();
		cp.insertContacts(title,firstName,lastName,company);
		
		}
		
	
   
}
