Feature: Create Table
As the manager, I want to add a table in the system.

Background: 
    	Given the following table exists in the system
          | number 	| Location	|
          |       1 | Indoors		|
			
Scenario Outline: Successfully create a table
	When the manager attempts to create a new table in the system with number "<tableNumber>" and location "<location>"
	Then the number of tables in the system shall be "2"
	Then the table "<tableNumber>" with location "<location>" shall exist in the system

	Examples: 
      	  | number 	| Location	|
          |       2 | Patio			|
	  			|	      3 | Indoors		|	

Scenario : Unsuccessfully create a table
	When the manager attempts to create a new table in the system with number "<tableNumber>" and location "<location>"
	Then the number of tables in the system shall be "1"
	Then the error "<error>" shall be raised
	
	Examples: 
      	  | number 	| Location		| Error
          |       1 | Patio				| The table number must be unique.
	  			|	      4 | SecondFloor	|	The table location must be Indoors or Patio.
	  			|	     -23| Indoors			| The table number must be greater than 0.