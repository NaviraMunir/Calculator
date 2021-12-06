package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class CurrencyController {
	@FXML
    private TextField amount;
	@FXML
    private TextField converted;
    @FXML
    private ChoiceBox<String> from=new ChoiceBox<String>();
    @FXML
    private ChoiceBox<String> to=new ChoiceBox<String>();
	
   

    @FXML
    void computeexchange(ActionEvent event) {
    	
		String f=from.getValue();
		String t=to.getValue();
		String a=amount.getText();
		String con=Calculator.convertcurrency(f, t, a);
		System.out.println(con);
		converted.setText(con);

    }

    @FXML
    void pressMainmenu(ActionEvent event) {
    	
    	Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
        if (window instanceof Stage){
            ((Stage) window).close();
        }
   	Stage primaryStage=new Stage();
   	try {
   		
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}

    }
    public void initialize(ActionEvent event)
    {
    	
    	to.getItems().add("USD");
		to.getItems().add("PKR");
		to.getItems().add("EUR");
		to.getItems().add("INR");
		
		from.getItems().add("USD");
		from.getItems().add("PKR");
		from.getItems().add("EUR");
		from.getItems().add("INR");
	}

}
