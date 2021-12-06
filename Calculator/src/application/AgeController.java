package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class AgeController {
	Calculator calculator=new Calculator();
    @FXML
    private DatePicker DOB;

    @FXML
    private DatePicker givendate;

    @FXML
    private TextField days;

    @FXML
    private TextField months;

    @FXML
    private TextField years;

    @FXML
    private Button age;

    @FXML
    void ComputeAge(ActionEvent event) {
    	String str1=DOB.getValue().toString();
    	String str2=givendate.getValue().toString();
    	int d1=0,d2=0;
    	int m1=0,m2=0;
    	int y1=0,y2=0;
    	String[] arr1 = str1.split("-", 3);
    	
    	String[] arr2 = str2.split("-", 3);
    	d1=Integer.parseInt(arr1[2]);
    	d2=Integer.parseInt(arr2[2]);
    	m1=Integer.parseInt(arr1[1]);
    	m2=Integer.parseInt(arr2[1]);
    	y1=Integer.parseInt(arr1[0]);
    	y2=Integer.parseInt(arr2[0]);
    	int[] arr=calculator.CalculateAge(d2, m2, y2, d1, m1, y1);
    	days.setText(Integer.toString(arr[0]));
    	months.setText(Integer.toString(arr[1]));
    	years.setText(Integer.toString(arr[2]));
    	
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
