package stepdefinitions;

import org.testng.Assert;

import amazonimplementation.Product;
import amazonimplementation.Search;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {

	Product product;
	Search search;

	@Given("I have a search field on amazon page")
	public void i_have_a_search_field_on_amazon_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Step 1 : I am on search page");
	}

	@When("I search a product with name {string} and price {int}")
	public void i_search_a_product_with_name_and_price(String productName, Integer price) {
		// Write code here that turns the phrase above into concrete actions

		System.out.println("Step 2: Search the product with" + productName + " and price: " + price);
		product = new Product(productName, price);

	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("step 3: product name:  " + productName + " is displayed");
		
		search= new Search();
		String name=search.displayProductName(product);
		System.out.println("Searched product is: "+name);
		Assert.assertEquals(product.getProdName(), name);
		
		

	}

}
