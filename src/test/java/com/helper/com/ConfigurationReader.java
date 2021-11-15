package com.helper.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ConfigurationReader {

	public static Properties p;
	
	public ConfigurationReader() throws Throwable {
		File f = new File(
				"C:\\Users\\rathi\\eclipse-workspace\\MavenProProject\\src\\test\\java\\com\\Properties\\com\\TestData.properties");

		FileInputStream fis = new FileInputStream(f);

		p = new Properties();

		p.load(fis);
	}
	
	public String getBrowser() {
		String browser = p.getProperty("Broswer");
		return browser;

	}

	public String getUrl() {
		String url = p.getProperty("Url");
		return url;

	}

	public String getUsername() {
		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() {
		String password = p.getProperty("password");
		return password;

	}
	
	

}
