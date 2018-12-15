package com.xcelTechCRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xcelTech.qa.Base.TestBase;

public class ContactsPage extends TestBase{
	
	//Page Factory - Page Objects
	@FindBy(xpath="//td[contains(text(),'Contacts')]")
	WebElement contactsLabel;
	
	@FindBy(name="title")
	WebElement title;
	
	@FindBy(id="first_name")
	WebElement FirstName;
	
	@FindBy(id="surname")
	WebElement LastName;
	
	@FindBy(id="department")
	WebElement Department;
		
	@FindBy(name="status")
	WebElement Status;
	
	
	
	public ContactsPage() throws IOException {
		super();
		PageFactory.initElements(driver, this);
	}
	
		
	
	//Actions - Methods
	
	public boolean VerifyContactsLabel() {
		return contactsLabel.isDisplayed();
		
	}
	
			
    public void ClickspecificContacts() {
		
		driver.findElement(By.xpath("//a[text()='Adanech Habibi']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id' and @value='52420677']")).click();
		
	}
    
    public void insertContacts(String tit,String FN, String LN,String Dep) {
    	Select insert = new Select(title);
    	insert.selectByVisibleText(tit);
    	FirstName.sendKeys(FN);
    	LastName.sendKeys(LN);
    	Department.sendKeys(Dep);
    }

}
