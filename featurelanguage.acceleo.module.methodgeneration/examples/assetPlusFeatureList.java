public class MaintenanceTicket{
	
	//Private Fields generation
	@FXML 
	private Button addMaintenanceTicketButton;
	
	@FXML
	private Button cancelMaintenanceTicketButton; 
	
	@FXML 
	private TextField idField; 
	
	@FXML 
	private TextField raisedOnDateField; 
	
	@FXML 
	private TextField descriptionField; 
	
	
	@FXML 
	private TextField ticketNotesField; 
	

	//Method Generation
	public String addMaintenanceTicket(ActionEvent event){
	
		int id = idField.getText();
		String raisedOnDate = raisedOnDateField.getText();
		String description = descriptionField.getText();
		MaintenanceNote ticketNotes = ticketNotesField.getText();
			
	}
}
