module Calculator {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.base;
	requires javafx.graphics;
	requires java.xml;
	
	opens application to javafx.graphics, javafx.fxml;
}
