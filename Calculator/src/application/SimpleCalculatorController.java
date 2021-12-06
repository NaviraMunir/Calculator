package application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;


public class SimpleCalculatorController {
	@FXML
	public Label res;
	public double num1=0;
	public double num2;
	public String opr="";
	public Calculator calculator=new Calculator();
	
	private boolean s=true;
	@FXML
	void pressMainmenu(ActionEvent event)
	{
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
	@FXML
	public void pressNumbersbutton(ActionEvent e)
	{
		if(s)
		{
			res.setText("");
			s=false;
		}
		String input=((Button)e.getSource()).getText();
		res.setText(res.getText()+input);
		
	}
	public void pressOperatorbutton(ActionEvent e)
	{
		String input=((Button)e.getSource()).getText();
		if(!input.equals("="))
		{
			if(!opr.isEmpty()) 
				
				switch(input) {
				case "C":
					res.setText("");
					num1=0;
					num2=0;
					break;
				default:
					break;
				}
			opr=input;
			num1=Long.parseLong(res.getText());
			res.setText("");
			return;
		}
		else
		{
			if(opr.isEmpty())
			{
				return;
			}
			num2=Long.parseLong(res.getText());
			double res1=calculator.simplecalculator(num1, num2, opr);
			res.setText(String.valueOf(res1));
			num1=0;
			num2=0;
			opr="";
			s=true;
		}
	}
	
}
