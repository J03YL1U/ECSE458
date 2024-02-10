package ca.mcgill.minimalresto.application;

import ca.mcgill.minimalresto.model.MinimalRestoApp;
import ca.mcgill.minimalresto.view.MinimalRestoAppPage;

public class MinimalRestoAppApplication {
	
	
	private static MinimalRestoApp minimalRestoApp;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// start UI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MinimalRestoAppPage().setVisible(true);
            }
        });
        
	}

	public static MinimalRestoApp getMinimalRestoApp() {
		if (minimalRestoApp == null) {
			// load model
			minimalRestoApp = load();
		}
 		return minimalRestoApp;
	}
	
	public static void save() {
		//PersistenceObjectStream.serialize(restoApp);
	}
	
	public static MinimalRestoApp load() {
		//PersistenceObjectStream.setFilename(filename);
		//restoApp = (RestoApp) PersistenceObjectStream.deserialize();
		// model cannot be loaded - create empty RestoApp
		if (minimalRestoApp == null) {
			minimalRestoApp = new MinimalRestoApp();
		}
		else {
			//minimalRestoApp.reinitialize();
		}
		return minimalRestoApp;
	}
}
