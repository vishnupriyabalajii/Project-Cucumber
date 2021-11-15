package com.Elementmini.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Elemenet_Mini {

	public static WebDriver driver;

	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[6]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//a[@title='Casual Dresses'][1]")
	private WebElement casualdresses;

	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement image;

	@FindBy(xpath = "//a[@title='Add to cart']")
	private WebElement addtocart;

	@FindBy(xpath = "/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")
	private WebElement proceed1;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")
	private WebElement proceed2;

	@FindBy(id = "email")
	private WebElement username;

	@FindBy(id = "passwd")
	private WebElement password;

	@FindBy(id = "SubmitLogin")
	private WebElement login;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
	private WebElement proceed3;

	@FindBy(id = "cgv")
	private WebElement check;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/div/form/p/button")
	private WebElement proceed4;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement payment;

	@FindBy(xpath = "/html/body/div/div[2]/div/div[3]/div/form/p/button")
	private WebElement finall;

	public Elemenet_Mini(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdresses() {
		return casualdresses;
	}

	public WebElement getImage() {
		return image;
	}

	public WebElement getAddtocart() {
		return addtocart;
	}

	public WebElement getProceed1() {
		return proceed1;
	}

	public WebElement getProceed2() {
		return proceed2;
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

	public WebElement getProceed3() {
		return proceed3;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getProceed4() {
		return proceed4;
	}

	public WebElement getPayment() {
		return payment;
	}

	public WebElement getFinall() {
		return finall;
	}

}
