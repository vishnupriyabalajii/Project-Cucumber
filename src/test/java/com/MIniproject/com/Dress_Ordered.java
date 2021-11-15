package com.MIniproject.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.SendKeysAction;

import com.Basemini.com.Baseclass_Mini;
import com.Elementmini.com.Elemenet_Mini;

public class Dress_Ordered extends Baseclass_Mini {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browserlaunch();

		url();

		Elemenet_Mini em = new Elemenet_Mini(driver);

		action(em.getWomen());

		Thread.sleep(3000);

		clickonelement(em.getCasualdresses());

		// explicitwait(em.getImage());

		scrolldown();

		Thread.sleep(6000);

		action(em.getImage());

		clickonelement(em.getAddtocart());

		Thread.sleep(5000);

		clickonelement(em.getProceed1());

		scrolldown();

		Thread.sleep(6000);

		clickonelement(em.getProceed2());

		sendthekeys(em.getUsername(), "priyabalaji@gmail.com");

		sendthekeys(em.getPassword(), "vishnupriyabalaji");

		clickonelement(em.getLogin());

		scrolldown();

		Thread.sleep(6000);

		clickonelement(em.getProceed3());

		scrolldown();

		Thread.sleep(6000);

		clickonelement(em.getProceed4());

		Thread.sleep(3000);

		clickonelement(em.getPayment());

		scrolldown();

		Thread.sleep(3000);

		clickonelement(em.getFinall());

	}

}
