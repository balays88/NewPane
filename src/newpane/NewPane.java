package newpane;

import java.io.IOException;
import javafx.application.Application; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.control.*; 
import javafx.event.Event; 
import javafx.event.EventHandler; 
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
  
public class NewPane extends Application { 
  
@Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("View.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    
    public static void main(String[] args) {
        launch(args);
    }
}