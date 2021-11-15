package sampleprojectwork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Sample_Searchhotel.Samplesearch_Hotel;
import com.sampleprojectPom.com.Sample_BookAHotel;
import com.sampleprojectbaseclass.Samplebase;

public class Sample_BookingHotel extends Samplebase {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = browserLaunch("chrome");

		gettheurl("https://www.adactinhotelapp.com/");

		Samplesearch_Hotel ssh = new Samplesearch_Hotel(driver);

		sendthekeys(ssh.getUsername(), "vishnuamsa");

		sendthekeys(ssh.getPassword(), "vishnupriyarathi");

		clickonelement(ssh.getLogin());

		Thread.sleep(2000);

		drop_down(ssh.getLocation(), "Los Angeles");

		drop_down(ssh.getHotel(), "Hotel Sunshine");

		drop_down(ssh.getRoomtype(), "Super Deluxe");

		drop_down(ssh.getNoofrooms(), "1");

		clear(ssh.getIndate1());
		
		clear(ssh.getOutdate1());
		
		sendthekeys(ssh.getIndate(), "01/11/2021");

		sendthekeys(ssh.getOutdate(), "03/11/2021");

		drop_down(ssh.getAdultsperroom(), "2");

		drop_down(ssh.getChildrenperroom(), "0");

		clickonelement(ssh.getSearch());

		clickonelement(ssh.getSelecthotel());

		clickonelement(ssh.getContinues());

		Sample_BookAHotel bah = new Sample_BookAHotel(driver);

		sendthekeys(bah.getFirstname(), "vishnupriya");

		sendthekeys(bah.getLastname(), "balaji");

		sendthekeys(bah.getAddress(), "Ramakrishna colony,Pannavadi road,mettur(tk),salem(dt),pin.code:636303");

		sendthekeys(bah.getCreditcardno(), "1234 5678 9987 6543");

		drop_down(bah.getCreditcardtype(), "MAST");

		drop_down(bah.getExpirymonth(), "9");

		drop_down(bah.getExpiryyear(), "2022");

		sendthekeys(bah.getCvv(), "461");

		clickonelement(bah.getBooknow());

		Thread.sleep(6000);

		clickonelement(bah.getMyitinerary());
	}

}
