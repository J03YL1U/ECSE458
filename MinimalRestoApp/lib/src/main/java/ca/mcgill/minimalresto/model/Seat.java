/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package ca.mcgill.minimalresto.model;

// line 16 "../../../../MinimalRestoApp.ump"
public class Seat
{

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Seat Associations
  private Table table;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Seat(Table aTable)
  {
    boolean didAddTable = setTable(aTable);
    if (!didAddTable)
    {
      throw new RuntimeException("Unable to create seat due to table");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public Table getTable()
  {
    return table;
  }

  public boolean setTable(Table aTable)
  {
    boolean wasSet = false;
    if (aTable == null)
    {
      return wasSet;
    }

    Table existingTable = table;
    table = aTable;
    if (existingTable != null && !existingTable.equals(aTable))
    {
      existingTable.removeSeat(this);
    }
    table.addSeat(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    Table placeholderTable = table;
    this.table = null;
    if(placeholderTable != null)
    {
      placeholderTable.removeSeat(this);
    }
  }

}