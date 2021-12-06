package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class BmiController {
	double w=0;
	double h=0;
	Calculator calculator=new Calculator();
    @FXML
    private TextField weight;

    @FXML
    private TextField height;

    @FXML
    private TextField BMI;

    @FXML
    void ComputeBMI(ActionEvent event) {
    	w=Long.parseLong(weight.getText());
    	h=Long.parseLong(height.getText());
    	double bmi=calculator.CalculateBmi(w, h);
    	BMI.setText(String.valueOf(bmi));
    	
    }

    @FXML
    void ComputeHeight(ActionEvent event) {
    	
    	h=Long.parseLong(height.getText());
    	
    }

    @FXML
    void ComputeWeight(ActionEvent event) {

    	w=Long.parseLong(weight.getText());
    
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

}
