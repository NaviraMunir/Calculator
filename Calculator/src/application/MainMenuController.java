package application;
import javafx.event.*;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.fxml.*;

public class MainMenuController {
	Stage primaryStage=new Stage();
	@FXML
	void pressBMI(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("bmi.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	void pressInvestment(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("investment.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	void pressDiscount(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Discount.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	void pressAge(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Age.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	void pressCalculator(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("SimpleCalculator.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	@FXML
	void pressCurrency(ActionEvent event)
	{
		 Window window =   ((javafx.scene.Node)(event.getSource())).getScene().getWindow(); 
         if (window instanceof Stage){
             ((Stage) window).close();
         }
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("Currency.fxml"));
			Scene scene = new Scene(root,317,457);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
