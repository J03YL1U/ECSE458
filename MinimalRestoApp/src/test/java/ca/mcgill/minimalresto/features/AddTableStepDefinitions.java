package test.java.ca.mcgill.minimalresto.features;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import main.java.ca.mcgill.minimalresto.model.Table;
import cucumber.api.java.en.Then;

public class AddTableStepDefinitions {
	
	@When("the manager attempts to create a new table in the system with number {int} and location {Location}")
	public void the_manager_attempts_to_create_a_new_table_in_the_system_with_number_and_location(
		int number, Location location) {
		
		error = RestoAppController.createTable(number, location);
	}
	
	@Then("the table {int} with location {Location} shall exist in the system")
	public void the_table_with_location_shall_exist_in_the_system(
		int number, Location location) {
		
		Table table = Table.getTable(number);
		assertNotNull(table);
		assertEquals(table.location, location);
	}

	@Then("the error {string} shall be raised")
	public void the_error_shall_be_raised(String expectedError) {
	
		assertEquals(expectedError, error);
	}

}
