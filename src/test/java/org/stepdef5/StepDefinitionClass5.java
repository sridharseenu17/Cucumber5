package org.stepdef5;

import java.util.List;
import java.util.Map;

import org.stepdef5.Page1Locator;
import org.stepdef5.Page2Locator;
import org.stepdef5.Page3Locator;
import org.stepdef5.Page4Locator;
import org.stepdef5.Page5Locator;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionClass5 extends StepDefBaseClass5 {

	Page1Locator p1;
	Page2Locator p2;
	Page3Locator p3;
	Page4Locator p4;
	Page5Locator p5;

	@Given("User is in the Adactin webpage")
	public void user_is_in_the_Adactin_webpage() {
		launch("http://adactinhotelapp.com/");
	}

	@When("User enter the userName and password")
	public void user_enter_the_userName_and_password(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> asMap = dataTable.asMap(String.class, String.class);
		p1 = new Page1Locator();
		fill(p1.getUn(), asMap.get("userName"));
		fill(p1.getPass(), asMap.get("password"));
	}

	@Then("user should click the login button")
	public void user_should_click_the_login_button() {
		c(p1.getLogin());
	}

	@Given("User is in search hotel page and user should select location, hotels, room type and number of rooms")
	public void user_is_in_search_hotel_page_and_user_should_select_location_hotels_room_type_and_number_of_rooms() {
		p2 = new Page2Locator();
		dd(p2.getLocationDD(), "Sydney");
		dd(p2.getHotelsDD(), "Hotel Sunshine");
		dd(p2.getRoomtypeDD(), "Super Deluxe");
		dd(p2.getRoomnosDD(), "1 - One");
	}

	@Then("User should mention the {string} and {string} date")
	public void user_should_mention_the_and_date(String string, String string2) {
		fill(p2.getCheckinDate(), string);
		fill(p2.getCheckoutDate(), string2);
	}

	@Then("user should select Adults per room and Children per room")
	public void user_should_select_Adults_per_room_and_Children_per_room() {
		dd(p2.getAdults(), "1 - One");
		dd(p2.getChildren(), "0 - None");
	}

	@Then("User should click the search button")
	public void user_should_click_the_search_button() {
		c(p2.getSubmitbtn());
	}

	@Given("User is in select hotel page and user should select the hotel")
	public void user_is_in_select_hotel_page_and_user_should_select_the_hotel() {
		p3 = new Page3Locator();
		c(p3.getRadiobtn());
	}

	@Then("User should click the continue button")
	public void user_should_click_the_continue_button() {
		c(p3.getContinuebtn());
	}

	@Given("User is in book a hotel page and User should enter {string}, {string}, {string} and {string}.")
	public void user_is_in_book_a_hotel_page_and_User_should_enter_and(String string, String string2, String string3,
			String string4) {
		p4 = new Page4Locator();
		fill(p4.getFirstName(), string);
		fill(p4.getLastName(), string2);
		fill(p4.getAddress(), string3);
		js("arguments[0].setAttribute('value','1234567891234567')", p4.getCc());
	}

	@Given("User should Select credit card type and expiry details.")
	public void user_should_Select_credit_card_type_and_expiry_details() {
		dd(p4.getCcType(), "American Express");
		dd(p4.getExpMonth(), "December");
		dd(p4.getExpYear(), "2022");
	}

	@When("User enter the {string}.")
	public void user_enter_the(String string) {
		fill(p4.getCvv(), string);
	}

	@Then("User should click book now button.")
	public void user_should_click_book_now_button() {
		c(p4.getBook());
		driver.quit();
	}
}
