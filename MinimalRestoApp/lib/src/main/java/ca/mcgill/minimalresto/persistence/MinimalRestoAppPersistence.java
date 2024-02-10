package ca.mcgill.minimalresto.persistence;

import ca.mcgill.minimalresto.application.MinimalRestoAppApplication;
import ca.mcgill.minimalresto.model.MinimalRestoApp;

public class MinimalRestoAppPersistence {

	 //The following fields and setFilename method deal with the json file location. 
	  private static String filename = "ap.data";
	  private static JsonSerializer serializer = new JsonSerializer("ca.mcgill.minimalresto");

	  public static void setFilename(String filename) {
	    MinimalRestoAppPersistence.filename = filename;
	  }

	  //This method is utilized in the controller methods in order to save the modified objects to the json file. 
	  public static void save() {
	    save(MinimalRestoAppApplication.getMinimalRestoApp());
	  }

	  public static void save(MinimalRestoApp r) {
	    serializer.serialize(r, filename);
	  }

	  //This method is utilized to load the data back in upon restarting the application.
	  public static MinimalRestoApp load() {
	    MinimalRestoApp ap = (MinimalRestoApp) serializer.deserialize(filename);
	    
	    if (ap == null) {
	      ap = new MinimalRestoApp();
	    } else {
	      ap.reinitialize();
	    }
	    return ap;
	  }
}
