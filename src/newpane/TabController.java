package newpane;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;

public class TabController extends ViewController implements Initializable {

    
    @FXML
    ChoiceBox<String> text;
    ObservableList<String> list = FXCollections.observableArrayList();
    @FXML
    private Button setTextButton;
    
    @FXML
    private void fooBar(){
        setTabText(text.getValue()); //set Text for Tab which is in the ViewController
        //itt a setTabText()-en kívül még van egy csomó beállíás amit itt class-on belül állítok.
        //próbáltam eventListener-t is használni a ViewController-ben, de ugyanúgy NullPointer lett a vége
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        loadList();
    }
    
    private void loadList() {
        list.removeAll(list);
        list.add("foo");
        list.add("bar");
        text.setItems(list);
    }

}
