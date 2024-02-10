Feature: Create Table
As the manager, I want to add a table in the system.

	Background: 
  	Given the following table exists in the system
  		| number | location	|
  		|				1| Indoors	|

	Scenario Outline: Successfully create a table
		When the manager attempts to create a new table in the system with number "<tableNumber>" and location "<location>"
		Then the number of tables in the system shall be "2"
		Then the table "<tableNumber>" with location "<location>" shall exist in the system

		Examples: 
			| number	| location	|
			|				2	| Patio			|
			|				3	| Indoors		|

	Scenario Outline: Unsuccessfully create a table
		When the manager attempts to create a new table in the system with number "<tableNumber>" and location "<location>"
		Then the number of tables in the system shall be "1"
		Then the error "<error>" shall be raised
	
		Examples:
			| number	|	location		| error																					|
			|				1	|	Patio				| The table number must be unique.							|
			|				2	| SecondFloor	| The table location must be Indoors or Patio.	|
			|				0	|	Indoors			|	The table number must be greather than 0.			|