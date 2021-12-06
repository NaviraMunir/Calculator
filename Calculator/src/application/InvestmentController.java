package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class InvestmentController {

    @FXML
    private TextField amount;

    @FXML
    private TextField interest;


    @FXML
    private TextField duration;

    @FXML
    private TextField totalamount;

    @FXML
    private TextField totalinterest;

    @FXML
    void computeDiscount(ActionEvent event) {
    	double amount1=Long.parseLong(amount.getText());
    	double interest1=Long.parseLong(interest.getText());
    	int year=Integer.parseInt(duration.getText());
    	interest1=Calculator.calculateinvestment(amount1, interest1, year);
    	String str="Total Interest: "+interest1+"";
    	totalinterest.setText(str);
    	amount1=amount1*year;
    	str="Total Contribution: "+amount1+"";
    	totalamount.setText(str);
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
