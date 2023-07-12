package StepDefinition;

import Utilities.TestContainer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Category {
	
	public TestContainer testContainer;
	public Category(TestContainer tc) {
		this.testContainer = tc;
	} 
	
	@Given("check for backGround scenario")
	public void check_for_back_ground_scenario() {
	    System.out.println("Testing");
	}
	@Given("user clicks the addIcon and selects Category")
	public void user_clicks_the_add_icon_and_selects_category() {
		testContainer.pageObject.Category().selectAddClickCategory();
	}
	@Then("check for category popUp")
	public void check_for_category_pop_up() {
		testContainer.pageObject.Category().checkCategoryPopUp();
	}
	@When("user enters the category option {string} {int} {string}")
	public void user_enters_the_category_option_amount(String string,int num, String string2) {
		testContainer.pageObject.Category().enter_Valid_Category_Option(string, num, string2);
	}
	@Then("check for options in transcationType")
	public void check_for_options_in_transcation_type(DataTable dataTable) {
		testContainer.pageObject.Category().check_Options_TransType(dataTable);
	}
	@Then("click add button")
	public void click_add_button() throws InterruptedException {
		testContainer.pageObject.Category().click_Add_Button();
	}

	
}
