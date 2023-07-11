package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category {
	@Given("check for backGround scenario")
	public void check_for_back_ground_scenario() {
	    System.out.println("Testing");
	}
	@Given("user clicks the addIcon and selects Category")
	public void user_clicks_the_add_icon_and_selects_category() {
	    
	}
	@Then("check for category popUp")
	public void check_for_category_pop_up() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("user enters the category option {string} < Amount> {string}")
	public void user_enters_the_category_option_amount(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("check for options in transcationType")
	public void check_for_options_in_transcation_type(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    throw new io.cucumber.java.PendingException();
	}
	@Then("click add button")
	public void click_add_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	
}
