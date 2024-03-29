package ca.mcgill.minimalresto.controller;

import ca.mcgill.minimalresto.application.MinimalRestoAppApplication;
import ca.mcgill.minimalresto.model.MinimalRestoApp;
import ca.mcgill.minimalresto.model.Table;
import ca.mcgill.minimalresto.model.Table.Location;
import ca.mcgill.minimalresto.persistence.MinimalRestoAppPersistence;

public class MinimalRestoAppController {
	
	public MinimalRestoAppController() {
	}
	
	public static String createTable(int number, String location) {
		
		MinimalRestoApp r = MinimalRestoAppApplication.getMinimalRestoApp();
		
		if (!(number > 0)) {
			return "The table number must be greater than 0.";			
		}
		Location parsedLocation;
		try {
			parsedLocation = Location.valueOf(location);
		}
		catch (Exception e) {
			return "The table location must be Indoors or Patio.";
		}
			
		try {
			new Table(number, parsedLocation, r);
		}
		catch (RuntimeException e) {
			return "The table number must be unique.";
		}
		
		try {
			MinimalRestoAppPersistence.save();
		}
		catch (RuntimeException e) {
			return e.getMessage();
		}

		return "";

	}
	
}
