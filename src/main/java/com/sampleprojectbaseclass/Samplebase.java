package com.sampleprojectbaseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Samplebase {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\Selenium_Programs\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;

	}

	public static void gettheurl(String url) {
		driver.get(url);

	}

	public static void implicitwait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public static void sendthekeys(WebElement element, String str) {
		element.sendKeys(str);

	}

	public static void clickonelement(WebElement element) {
		element.click();
	}

	public static void drop_down(WebElement element, String str) {
		Select s = new Select(element);
		s.selectByValue(str);

	}

	public static void selectbyvisible(WebElement element, String str) {

		Select s = new Select(element);

		s.selectByVisibleText(str);
	}
	
	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	public static void clear(WebElement element) {
	
		element.clear();

	}

}
