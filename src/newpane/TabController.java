package newpane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class TabController implements Initializable {

    ViewController view = new ViewController();
    
    @FXML
    public ChoiceBox<String> textBox;
    public ObservableList<String> fList = FXCollections.observableArrayList();
    @FXML
    public Button setTextButton;
    @FXML
    public ChoiceBox<?> flightNumber;
    
    @FXML
    public void fooBar(){
        view.setTabText("fooBar"); //set Text for Tab which is in the ViewController
        //itt a setTabText()-en kívül még van egy csomó beállíás amit itt class-on belül állítok.
        //próbáltam eventListener-t is használni a ViewController-ben, de ugyanúgy NullPointer lett a vége
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadList();
    }
    
    public void loadList() {
        fList.removeAll(fList);
        fList.add("foo");
        fList.add("bar");
        textBox.setItems(fList);
    }

}
