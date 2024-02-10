/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ca.mcgill.minimalresto.model;
import java.util.*;

import ca.mcgill.minimalresto.model.Table.Location;

// line 3 "../../../../MinimalRestoApp.ump"
public class MinimalRestoApp
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //MinimalRestoApp Associations
  private List<Table> tables;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public MinimalRestoApp()
  {
    tables = new ArrayList<Table>();
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Table getTable(int index)
  {
    Table aTable = tables.get(index);
    return aTable;
  }

  public List<Table> getTables()
  {
    List<Table> newTables = Collections.unmodifiableList(tables);
    return newTables;
  }

  public int numberOfTables()
  {
    int number = tables.size();
    return number;
  }

  public boolean hasTables()
  {
    boolean has = tables.size() > 0;
    return has;
  }

  public int indexOfTable(Table aTable)
  {
    int index = tables.indexOf(aTable);
    return index;
  }

  public static int minimumNumberOfTables()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Table addTable(int aNumber, Location aLocation)
  {
    return new Table(aNumber, aLocation, this);
  }

  public boolean addTable(Table aTable)
  {
    boolean wasAdded = false;
    if (tables.contains(aTable)) { return false; }
    MinimalRestoApp existingMinimalRestoApp = aTable.getMinimalRestoApp();
    boolean isNewMinimalRestoApp = existingMinimalRestoApp != null && !this.equals(existingMinimalRestoApp);
    if (isNewMinimalRestoApp)
    {
      aTable.setMinimalRestoApp(this);
    }
    else
    {
      tables.add(aTable);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeTable(Table aTable)
  {
    boolean wasRemoved = false;
    //Unable to remove aTable, as it must always have a minimalRestoApp
    if (!this.equals(aTable.getMinimalRestoApp()))
    {
      tables.remove(aTable);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addTableAt(Table aTable, int index)
  {  
    boolean wasAdded = false;
    if(addTable(aTable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTables()) { index = numberOfTables() - 1; }
      tables.remove(aTable);
      tables.add(index, aTable);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveTableAt(Table aTable, int index)
  {
    boolean wasAdded = false;
    if(tables.contains(aTable))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfTables()) { index = numberOfTables() - 1; }
      tables.remove(aTable);
      tables.add(index, aTable);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addTableAt(aTable, index);
    }
    return wasAdded;
  }

  public void delete()
  {
    while (tables.size() > 0)
    {
      Table aTable = tables.get(tables.size() - 1);
      aTable.delete();
      tables.remove(aTable);
    }
    
  }

}