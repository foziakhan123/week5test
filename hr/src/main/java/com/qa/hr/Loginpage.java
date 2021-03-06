package com.qa.hr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	
	@FindBy (xpath="//*[@id=\"txtUsername\"]")
	private WebElement username;
	
	@FindBy (xpath = "//*[@id=\"txtPassword\"]")
	private WebElement password;
	
	@FindBy (xpath = "//*[@id=\"btnLogin\"]")
	private WebElement login;
	
	public void typeusername (String text) {
		username.sendKeys("Admin");
	}
	
	public void typepassword (String text) {
		password.sendKeys("AdminAdmin");
		
	}
	
	public void clickloginbutton () {
		login.click();
		
	}
			
	
}
