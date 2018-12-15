package com.xcelTechCRM.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.xcelTech.qa.Base.TestBase;

public class LoginPage extends TestBase{
	
	

	//PageFactory -Page Objects
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement PassWord;
	
	@FindBy(xpath= "//input[@type='submit']")
	WebElement Login;
	
	@FindBy(xpath=" /html/body/table[1]/tbody/tr[1]/td/table/tbody/tr/td[1]")
	WebElement logo;
	
			
	//initialization
	public LoginPage() throws IOException{
		
		super();
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	//Methods  - Functions
	
	public String validateTitle() {
		return driver.getTitle();
		
		
	}
	
	
	public HomePage Login(String un, String pw) throws InterruptedException, IOException {
		
		username.sendKeys(un);
		PassWord.sendKeys(pw);
		Thread.sleep(5000);
		Login.click();
		return new HomePage();
		
			
	}
	

}
