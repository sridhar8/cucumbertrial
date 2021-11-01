package org.pomadactin.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckinDetails_page {
	public WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomtype;
	
	@FindBy(id="room_nos")
	private WebElement roomnos;
	
	@FindBy(id="adult_room")
	private WebElement adultrooms;
	
	@FindBy(id="child_room")
	private WebElement childroom;
	
	@FindBy (id="Submit")
	private WebElement sumbmit;

	public CheckinDetails_page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getAdultrooms() {
		return adultrooms;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSumbmit() {
		return sumbmit;
	}
	
}
