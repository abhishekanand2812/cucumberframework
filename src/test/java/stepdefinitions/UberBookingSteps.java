
package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UberBookingSteps {
	
	@Given("User wants to select a car type {string} from uber app")
	public void user_wants_to_select_a_car_type_from_uber_app(String carType) {
		
		System.out.println("step 1 "+carType);
	}

	@When("user selects car {string} and pickup location {string} and drop location {string}")
	public void user_selects_car_and_pickup_location_and_drop_location(String carType, String pickupLocation, String dropLocation) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("step 2 "+carType+" "+pickupLocation+" "+dropLocation);
	}

	@Then("Driver starts the journey")
	public void driver_starts_the_journey() {
		System.out.println("step 3");
	}

	@Then("Driver ends the journey")
	public void driver_ends_the_journey() {
		
		System.out.println("step 4");
	}


	@Then("user pays {int} usd")
	public void user_pays_usd(Integer price) {
		System.out.println("step 5 "+price);

		
	}

}
