package org.sdp.com;

import org.openqa.selenium.WebDriver;
import org.pomadactin.com.Address_page;
import org.pomadactin.com.CheckinDetails_page;
import org.pomadactin.com.Detailsconfirm_page;
import org.pomadactin.com.Logout_page;
import org.pomadactin.com.Signin_page;

public class P_O_M_adactin {
	public WebDriver driver;
	
	private Signin_page signin;
	private CheckinDetails_page checkindetails;
	private Address_page address;
	private Detailsconfirm_page details;
	private Logout_page logout;
	
	public P_O_M_adactin(WebDriver driver2) {
	this.driver=driver2;
	}
	
	public Signin_page getInstanceSignin() {
	signin=new Signin_page(driver);
		return signin;
	}
	public CheckinDetails_page getInstanceCheckindetails() {
		checkindetails=new CheckinDetails_page(driver);
		return checkindetails;
	}
	public Address_page getInstanceAddress() {
		address =new Address_page(driver);
		return address;
	}
	public Detailsconfirm_page getInstanceDetails() {
		details =new Detailsconfirm_page(driver);
		return details;
	}
	public Logout_page getInstanceLogout() {
		logout=new Logout_page(driver);
		return logout;
	}
	

}
