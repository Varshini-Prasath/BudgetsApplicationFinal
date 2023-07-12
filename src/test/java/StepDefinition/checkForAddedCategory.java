package StepDefinition;

import Utilities.TestContainer;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class checkForAddedCategory {
	
	public TestContainer tc;
	public checkForAddedCategory(TestContainer tcs) {
		this.tc = tcs;
	}

	@Given("check for the added category")
	public void check_for_the_added_category(DataTable dataTable) throws InterruptedException {
	    tc.pageObject.checkForCategory().find_Category(dataTable);
	}

	@Then("check for amount logic")
	public void check_for_amount_logic() {
	    System.out.println("1");
	}

	@Then("verify whether empty space is getting displayed on clicking dropdown icon")
	public void verify_whether_empty_space_is_getting_displayed_on_clicking_dropdown_icon() {
		tc.pageObject.checkForCategory().amount_Logic();
	}
}
