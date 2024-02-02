/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.27.0.3728.d139ed893 modeling language!*/

package main.java.ca.mcgill.minimalresto.model;
import java.util.*;

// line 7 "../../../../MinimalRestoApp.ump"
public class Table
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum Location { Indoors, Patio }

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static Map<Integer, Table> tablesByNumber = new HashMap<Integer, Table>();

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //Table Attributes
  private int number;
  private Location location;

  //Table Associations
  private List<Seat> seats;
  private MinimalRestoApp minimalRestoApp;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public Table(int aNumber, Location aLocation, MinimalRestoApp aMinimalRestoApp)
  {
    location = aLocation;
    if (!setNumber(aNumber))
    {
      throw new RuntimeException("Cannot create due to duplicate number");
    }
    seats = new ArrayList<Seat>();
    boolean didAddMinimalRestoApp = setMinimalRestoApp(aMinimalRestoApp);
    if (!didAddMinimalRestoApp)
    {
      throw new RuntimeException("Unable to create table due to minimalRestoApp");
    }
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setNumber(int aNumber)
  {
    boolean wasSet = false;
    Integer anOldNumber = getNumber();
    if (hasWithNumber(aNumber)) {
      return wasSet;
    }
    number = aNumber;
    wasSet = true;
    if (anOldNumber != null) {
      tablesByNumber.remove(anOldNumber);
    }
    tablesByNumber.put(aNumber, this);
    return wasSet;
  }

  public boolean setLocation(Location aLocation)
  {
    boolean wasSet = false;
    location = aLocation;
    wasSet = true;
    return wasSet;
  }

  public int getNumber()
  {
    return number;
  }

  public static Table getWithNumber(int aNumber)
  {
    return tablesByNumber.get(aNumber);
  }

  public static boolean hasWithNumber(int aNumber)
  {
    return getWithNumber(aNumber) != null;
  }

  public Location getLocation()
  {
    return location;
  }

  public Seat getSeat(int index)
  {
    Seat aSeat = seats.get(index);
    return aSeat;
  }

  public List<Seat> getSeats()
  {
    List<Seat> newSeats = Collections.unmodifiableList(seats);
    return newSeats;
  }

  public int numberOfSeats()
  {
    int number = seats.size();
    return number;
  }

  public boolean hasSeats()
  {
    boolean has = seats.size() > 0;
    return has;
  }

  public int indexOfSeat(Seat aSeat)
  {
    int index = seats.indexOf(aSeat);
    return index;
  }

  public MinimalRestoApp getMinimalRestoApp()
  {
    return minimalRestoApp;
  }

  public static int minimumNumberOfSeats()
  {
    return 0;
  }
  /* Code from template association_AddManyToOne */
  public Seat addSeat()
  {
    return new Seat(this);
  }

  public boolean addSeat(Seat aSeat)
  {
    boolean wasAdded = false;
    if (seats.contains(aSeat)) { return false; }
    Table existingTable = aSeat.getTable();
    boolean isNewTable = existingTable != null && !this.equals(existingTable);
    if (isNewTable)
    {
      aSeat.setTable(this);
    }
    else
    {
      seats.add(aSeat);
    }
    wasAdded = true;
    return wasAdded;
  }

  public boolean removeSeat(Seat aSeat)
  {
    boolean wasRemoved = false;
    //Unable to remove aSeat, as it must always have a table
    if (!this.equals(aSeat.getTable()))
    {
      seats.remove(aSeat);
      wasRemoved = true;
    }
    return wasRemoved;
  }

  public boolean addSeatAt(Seat aSeat, int index)
  {  
    boolean wasAdded = false;
    if(addSeat(aSeat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeats()) { index = numberOfSeats() - 1; }
      seats.remove(aSeat);
      seats.add(index, aSeat);
      wasAdded = true;
    }
    return wasAdded;
  }

  public boolean addOrMoveSeatAt(Seat aSeat, int index)
  {
    boolean wasAdded = false;
    if(seats.contains(aSeat))
    {
      if(index < 0 ) { index = 0; }
      if(index > numberOfSeats()) { index = numberOfSeats() - 1; }
      seats.remove(aSeat);
      seats.add(index, aSeat);
      wasAdded = true;
    } 
    else 
    {
      wasAdded = addSeatAt(aSeat, index);
    }
    return wasAdded;
  }

  public boolean setMinimalRestoApp(MinimalRestoApp aMinimalRestoApp)
  {
    boolean wasSet = false;
    if (aMinimalRestoApp == null)
    {
      return wasSet;
    }

    MinimalRestoApp existingMinimalRestoApp = minimalRestoApp;
    minimalRestoApp = aMinimalRestoApp;
    if (existingMinimalRestoApp != null && !existingMinimalRestoApp.equals(aMinimalRestoApp))
    {
      existingMinimalRestoApp.removeTable(this);
    }
    minimalRestoApp.addTable(this);
    wasSet = true;
    return wasSet;
  }

  public void delete()
  {
    tablesByNumber.remove(getNumber());
    while (seats.size() > 0)
    {
      Seat aSeat = seats.get(seats.size() - 1);
      aSeat.delete();
      seats.remove(aSeat);
    }
    
    MinimalRestoApp placeholderMinimalRestoApp = minimalRestoApp;
    this.minimalRestoApp = null;
    if(placeholderMinimalRestoApp != null)
    {
      placeholderMinimalRestoApp.removeTable(this);
    }
  }


  public String toString()
  {
    return super.toString() + "["+
            "number" + ":" + getNumber()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "location" + "=" + (getLocation() != null ? !getLocation().equals(this)  ? getLocation().toString().replaceAll("  ","    ") : "this" : "null") + System.getProperties().getProperty("line.separator") +
            "  " + "minimalRestoApp = "+(getMinimalRestoApp()!=null?Integer.toHexString(System.identityHashCode(getMinimalRestoApp())):"null");
  }
}