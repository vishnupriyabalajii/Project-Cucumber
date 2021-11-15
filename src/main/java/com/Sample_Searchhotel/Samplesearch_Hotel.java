package com.Sample_Searchhotel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Samplesearch_Hotel {

	public static WebDriver driver;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "login")
	private WebElement login;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotel;

	@FindBy(xpath = "//select[@name='room_type']")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement noofrooms;

	@FindBy(id = "datepick_in")
	private WebElement indate1;

	@FindBy(id = "datepick_out")
	private WebElement outdate1;

	@FindBy(id = "datepick_in")
	private WebElement indate;

	@FindBy(id = "datepick_out")
	private WebElement outdate;

	@FindBy(id = "adult_room")
	private WebElement adultsperroom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childrenperroom;

	@FindBy(id = "Submit")
	private WebElement search;

	@FindBy(id = "radiobutton_0")
	private WebElement selecthotel;

	@FindBy(id = "continue")
	private WebElement continues;

	public Samplesearch_Hotel(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
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

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getIndate1() {
		return indate1;
	}

	public WebElement getOutdate1() {
		return outdate1;
	}

	public WebElement getIndate() {
		return indate;
	}

	public WebElement getOutdate() {
		return outdate;
	}

	public WebElement getAdultsperroom() {
		return adultsperroom;
	}

	public WebElement getChildrenperroom() {
		return childrenperroom;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSelecthotel() {
		return selecthotel;
	}

	public WebElement getContinues() {
		return continues;
	}

}
