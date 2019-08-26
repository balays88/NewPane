package newpane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class ViewController implements Initializable {
    
    @FXML
    public TabPane tabPane;
    @FXML
    public Button addNewTabButton;
    
    public Integer count = 1;
    
    public SingleSelectionModel<Tab> selectionModel;
    
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        selectionModel = tabPane.getSelectionModel();
    }

    @FXML
    public void createNewTab(){
        Tab newTab = new Tab();
        try {
           String id = count.toString();

           newTab.setText("New Flight");
           newTab.setClosable(true);
           newTab.setId(id);
           newTab.setContent(FXMLLoader.load(getClass().getResource("Tab.fxml")));
           count++;

        } catch (IOException e){
            System.out.println("Valami gaz van");
        }
            tabPane.getTabs().add(newTab);
       selectionModel.selectLast();
    }
    
    public void setTabText(String text){
        selectionModel.getSelectedItem().setText(text);
    }
}