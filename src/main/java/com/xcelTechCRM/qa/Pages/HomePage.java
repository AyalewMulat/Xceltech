package com.xcelTechCRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.xcelTech.qa.Base.TestBase;

public class HomePage  extends TestBase{
	
	// Page Factory - Page Objects
	
	

	@FindBy(xpath="//td[contains(text(),'User: Ayalew Mulat')]")
	WebElement userLabel;
	
	@FindBy(xpath="//a[contains(text(),'Contacts')]")
	WebElement contacts;
	
	@FindBy(xpath="//a[contains(text(), 'New Contact')]")
	WebElement newContacts;
	
	
	
	public HomePage() throws IOException {
		
		super();
		
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions - Methods
	
	public ContactsPage clickContacts() throws IOException {
		
		contacts.click();
		return new ContactsPage();
	}
	
	public void clickOnNewContacts() {
		
		Actions act = new Actions(driver);
		act.moveToElement(contacts).build().perform();
		newContacts.click();
		
	}
	
	
	public boolean validateUserLabel() {
		
		boolean ul = userLabel.isDisplayed();
		return ul;
	}

}


