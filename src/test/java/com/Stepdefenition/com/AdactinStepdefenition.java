package com.Stepdefenition.com;

import org.openqa.selenium.WebDriver;

import com.Sample_Searchhotel.Samplesearch_Hotel;
import com.helper.com.FileReaderManager;
import com.runner.com.AdactinRunner;
import com.sampleprojectPom.com.Sample_BookAHotel;
import com.sampleprojectbaseclass.Samplebase;

import cucumber.api.java.en.*;

public class AdactinStepdefenition extends Samplebase {

	public static WebDriver driver = AdactinRunner.driver;

	Samplesearch_Hotel ssh = new Samplesearch_Hotel(driver);

	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {

		gettheurl("https://www.adactinhotelapp.com/");

	}

	@When("^user enter the valid username in the username field$")
	public void user_enter_the_valid_username_in_the_username_field() throws Throwable {
		sendthekeys(ssh.getUsername(), "vishnuamsa");

	}

	@When("^user enter the valid password in the password field$")
	public void user_enter_the_valid_password_in_the_password_field() throws Throwable {
		sendthekeys(ssh.getPassword(), "vishnupriyarathi");

	}

	@Then("^user clicks on the login button$")
	public void user_clicks_on_the_login_button() throws Throwable {
		clickonelement(ssh.getLogin());

	}

	@When("^User searching the hotel location$")
	public void user_searching_the_hotel_location() throws Throwable {
		drop_down(ssh.getLocation(), "Los Angeles");
	}

	@When("^user searching the hotel$")
	public void user_searching_the_hotel() throws Throwable {
		drop_down(ssh.getHotel(), "Hotel Sunshine");
	}

	@When("^user search the what kind of rooms avaiable in the hotel$")
	public void user_search_the_what_kind_of_rooms_avaiable_in_the_hotel() throws Throwable {
		drop_down(ssh.getRoomtype(), "Super Deluxe");
	}

	@When("^user select the rooms they wanted$")
	public void user_select_the_rooms_they_wanted() throws Throwable {
		drop_down(ssh.getNoofrooms(), "1");
	}

	@When("^user clear the indate of the hotel$")
	public void user_clear_the_indate_of_the_hotel() throws Throwable {
		clear(ssh.getIndate1());

	}

	@When("^user clear the outdate of the hotel$")
	public void user_clear_the_outdate_of_the_hotel() throws Throwable {
		clear(ssh.getOutdate1());
	}

	@When("^user pick the indate of the hotel$")
	public void user_pick_the_indate_of_the_hotel() throws Throwable {
		sendthekeys(ssh.getIndate(), "09/12/2021");
	}

	@When("^user pick the outdate of the hotel$")
	public void user_pick_the_outdate_of_the_hotel() throws Throwable {
		sendthekeys(ssh.getOutdate(), "15/12/2021");
	}

	@When("^user pick the rooms for the adultsper room$")
	public void user_pick_the_rooms_for_the_adultsper_room() throws Throwable {
		drop_down(ssh.getAdultsperroom(), "3");
	}

	@When("^user pick the rooms for the childrenper room$")
	public void user_pick_the_rooms_for_the_childrenper_room() throws Throwable {
		drop_down(ssh.getChildrenperroom(), "0");
	}

	@When("^user search if these options are available in that hotel room$")
	public void user_search_if_these_options_are_available_in_that_hotel_room() throws Throwable {
		clickonelement(ssh.getSearch());
	}

	@When("^user select that room$")
	public void user_select_that_room() throws Throwable {
		clickonelement(ssh.getSelecthotel());
	}

	@Then("^user countinues the future process$")
	public void user_countinues_the_future_process() throws Throwable {
		clickonelement(ssh.getContinues());
	}

	Sample_BookAHotel bah = new Sample_BookAHotel(driver);

	@Given("^user enter the firstname in the firstname field$")
	public void user_enter_the_firstname_in_the_firstname_field() throws Throwable {
		sendthekeys(bah.getFirstname(), "vishnupriya");
	}

	@When("^user enter the lastname in the lastname field$")
	public void user_enter_the_lastname_in_the_lastname_field() throws Throwable {
		sendthekeys(bah.getLastname(), "balaji");
	}

	@When("^user enter the address in the address field$")
	public void user_enter_the_address_in_the_address_field() throws Throwable {
		sendthekeys(bah.getAddress(), "Ramakrishana colony,pannavadi road,mettur(tk) salem(dt),pincode:636303");
	}

	@When("^user enter the creditcard type in the creditcard field$")
	public void user_enter_the_creditcard_type_in_the_creditcard_field() throws Throwable {
		drop_down(bah.getCreditcardtype(), "MAST");
	}

	@When("^user enter the creditcard no in the cardno field$")
	public void user_enter_the_creditcard_no_in_the_cardno_field() throws Throwable {
		sendthekeys(bah.getCreditcardno(), "1234 5678 9876 5432");
	}

	@When("^user enter the expirymonth of the creditcard$")
	public void user_enter_the_expirymonth_of_the_creditcard() throws Throwable {
		drop_down(bah.getExpirymonth(), "9");
	}

	@When("^user enter the expiryyear of the creditcard$")
	public void user_enter_the_expiryyear_of_the_creditcard() throws Throwable {
		drop_down(bah.getExpiryyear(), "2022");
	}

	@When("^user enter the CVV of the creditcard$")
	public void user_enter_the_CVV_of_the_creditcard() throws Throwable {
		sendthekeys(bah.getCvv(), "461");
	}

	@When("^user booking the select hotel$")
	public void user_booking_the_select_hotel() throws Throwable {
		clickonelement(bah.getBooknow());
	}

	@Then("^user select the myitinerary of the booking hotel$")
	public void user_select_the_myitinerary_of_the_booking_hotel() throws Throwable {

		clickonelement(bah.getMyitinerary());
	}

}
