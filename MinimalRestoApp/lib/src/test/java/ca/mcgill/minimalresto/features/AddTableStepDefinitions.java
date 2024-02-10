package ca.mcgill.minimalresto.features;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import ca.mcgill.minimalresto.application.MinimalRestoAppApplication;
import ca.mcgill.minimalresto.controller.MinimalRestoAppController;
import ca.mcgill.minimalresto.model.MinimalRestoApp;
import ca.mcgill.minimalresto.model.Table;
import ca.mcgill.minimalresto.model.Table.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddTableStepDefinitions {
	private MinimalRestoApp minimalRestoApp= MinimalRestoAppApplication.getMinimalRestoApp();
	private String error;
	
	@Given("the following table exists in the system")
	  public void the_following_table_exists_in_the_system(
	      io.cucumber.datatable.DataTable dataTable) {

		List<Map<String, String>> rows = dataTable.asMaps();

	    for (Map<String, String> row : rows) {
	      int tableNumber = Integer.parseInt(row.get("number"));
	      Location location = Location.valueOf(row.get("location"));
	      new Table(tableNumber, location, minimalRestoApp);
	    }
	  }
	
	@When("the manager attempts to create a new table in the system with number {int} and location {string}")
	public void the_manager_attempts_to_create_a_new_table_in_the_system_with_number_and_location(
		int number, String location) {
		
		error = MinimalRestoAppController.createTable(number, location);
	}
	
	@Then("the table {int} with location {string} shall exist in the system")
	public void the_table_with_location_shall_exist_in_the_system(
		int number, String location) {
		
		Table table = Table.getWithNumber(number);
		assertNotNull(table);
		assertEquals(table.getLocation(), location);
	}
	
	 @Then("the number of tables in the system shall be {int}")
	  public void the_number_of_tables_in_the_system_shall_be(int expectedNumOfTables) {

	    int numOfTables = minimalRestoApp.numberOfTables();
	    assertEquals(expectedNumOfTables, numOfTables);
	  }

	@Then("the error {string} shall be raised")
	public void the_error_shall_be_raised(String expectedError) {
	
		assertEquals(expectedError, error);
	}

}
