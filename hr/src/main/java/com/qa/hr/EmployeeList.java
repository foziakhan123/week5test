package com.qa.hr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmployeeList {
	
	@FindBy (xpath= "//*[@id=\"employee_name_quick_filter_employee_list_value\"]")
	WebElement searchbox;
	
	@FindBy (xpath = "//*[@id=\"employeeListTable\"]/tbody/tr/td[3]")
	WebElement selectemployee;
	
	
	public void clicksearchbox () {
		searchbox.click();
	}
	
	public void clickemployee () {
		selectemployee.click();
	}

}
