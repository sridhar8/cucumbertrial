package org.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {
	
	public WebDriver driver;
	
	@FindBy(id="logout")
	private WebElement logout;



	public Logout_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}



	public WebElement getLogout() {
		return logout;
	}
	

}
