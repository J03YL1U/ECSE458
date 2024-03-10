public class MaintenanceTicket{
	
	//Private Fields generation
	@FXML 
	private Button addMaintenanceTicketButton;
	
	@FXML
	private Button cancelMaintenanceTicketButton;
	
	@FXML
	private Label addMaintenanceTicketError;
	
	@FXML 
	private TextField idField; 
	
	@FXML 
	private TextField raisedOnDateField; 
	
	@FXML 
	private TextField descriptionField; 
	
	
	@FXML 
	private TextField ticketNotesField; 
	

	//Method Generation
	public void addMaintenanceTicketClicked (ActionEvent event){
	
		int id = idField.getText();
		String raisedOnDate = raisedOnDateField.getText();
		String description = descriptionField.getText();
		MaintenanceNote ticketNotes = ticketNotesField.getText();
		
		if(id == null||raisedOnDate == null||description == null||||ticketNotes == null){
			addMaintenanceTicketError.setText("One of the required fields is empty");
		}
	
		else{
			String error = setXController.addMaintenanceTicket(id, raisedOnDate, description, , ticketNotes);
			
			if(error = ""){
				idField.getText("");
				raisedOnDateField.getText("");
				descriptionField.getText("");
				ticketNotesField.getText("");
				
			}
			else{
				addMaintenanceTicketError.setText(error);
			}
		}
	}

	public void cancelClicked(ActionEvent event){
		 AssetPlusFXMLView.getInstance().closePopUpWindow();
	}
}
