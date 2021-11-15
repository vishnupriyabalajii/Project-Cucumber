package com.Basemini.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Baseclass_Mini {

	public static WebDriver driver;

	public static WebDriver browserlaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rathi\\eclipse-workspace\\MavenProject\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public static void url() {
		driver.get("http://automationpractice.com/index.php");

	}

	public static void action(WebElement element) {
		Actions as = new Actions(driver);
		as.moveToElement(element).build().perform();

	}

	public static void explicitwait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void scrolldown() throws InterruptedException {
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("window.scroll(0,800)", "");
		Thread.sleep(1000);

	}

	public static void clickonelement(WebElement element) {
		element.click();
	}
	
	public static void sendthekeys(WebElement element, String str) {
		element.sendKeys(str);

	}
	

}
