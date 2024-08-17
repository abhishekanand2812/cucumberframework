package stepdefinitions;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegSteps {

	@Given("User is on registration page")
	public void user_is_on_registration_page(io.cucumber.datatable.DataTable dataTable) {

		System.out.println("User navigates to reg page");
	}

	@When("The user enters the following details")
	public void the_user_enters_the_following_details(DataTable dataTable) {
		List<List<String>> dataList = dataTable.asLists(String.class);
		for (List<String> e : dataList) {
			System.out.println(e);

		}
	}

	@Then("User reg is successful")
	public void user_reg_is_successful() {

		System.out.println("User navigates is successful");

	}

}
