package ca.mcgill.minimalresto.application;

import ca.mcgill.minimalresto.model.MinimalRestoApp;
import ca.mcgill.minimalresto.persistence.MinimalRestoAppPersistence;
import javafx.application.Application;

public class MinimalRestoAppApplication {

  private static MinimalRestoApp minimalRestoApp;

  public static void main(String[] args) {
    getMinimalRestoApp();
    //no view
    //Application.launch(MinimalRestoAppPage.class, args);
  }
  
  public static MinimalRestoApp getMinimalRestoApp() {
    if (minimalRestoApp == null) {
      minimalRestoApp = MinimalRestoAppPersistence.load();
    }
    return minimalRestoApp;
  }

}
