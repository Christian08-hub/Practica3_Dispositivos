
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class MusicaController implements Initializable {

    @FXML
    private Button btnreproducir;
    @FXML
    private Button btncancelar;
    @FXML
    private RadioButton btnauriculares;
    @FXML
    private RadioButton btnparlantes;
    @FXML
    private TextField btnnombre;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }    

    @FXML
    private void reproducir(ActionEvent event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();  
    }

    @FXML
    private void cancelar(ActionEvent event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();  
    }

    @FXML
    private void auriculares(ActionEvent event) {
    }

    @FXML
    private void parlantes(ActionEvent event) {
    }

    @FXML
    private void nombre(ActionEvent event) {
    }
    
}
