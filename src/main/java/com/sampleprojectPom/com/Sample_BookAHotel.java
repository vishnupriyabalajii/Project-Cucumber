package com.sampleprojectPom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sample_BookAHotel {

	public static WebDriver driver;

	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastname;

	@FindBy(id = "address")
	private WebElement address;

	@FindBy(xpath = "//input[@name='cc_num']")
	private WebElement creditcardno;

	@FindBy(xpath = "//select[@name='cc_type']")
	private WebElement creditcardtype;

	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expirymonth;

	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiryyear;

	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv;

	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;

	@FindBy(xpath ="//input[@id='my_itinerary']")
	private WebElement myitinerary;

	public Sample_BookAHotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditcardno() {
		return creditcardno;
	}

	public WebElement getCreditcardtype() {
		return creditcardtype;
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public WebElement getMyitinerary() {
		return myitinerary;
	}

}
