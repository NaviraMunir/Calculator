package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

public class DiscountController {

	Calculator calculator=new Calculator();
    @FXML
    private TextField orginalprice;

    @FXML
    private TextField Discount;

    @FXML
    private TextField save;

    @FXML
    private TextField finalprice;

    @FXML
    void computeDiscount(ActionEvent event) {
    	
    	double orgprice=Long.parseLong(orginalprice.getText());
    	double discount=Long.parseLong(Discount.getText());
    	discount=calculator.CalculateDiscount(orgprice,discount);
    	String str="You save Rs "+Integer.toString((int) discount);
    	save.setText(str);
    	double finals=orgprice-discount;
    	finalprice.setText(Integer.toString((int) finals));
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
