
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class EventoController implements Initializable {

    @FXML
    private TextField btnnombre;
    @FXML
    private TextField btnevento;
    @FXML
    private DatePicker btnfecha;
    @FXML
    private Button btnenviar;
    @FXML
    private Button btncancelar;
    @FXML
    private MenuButton btncalendario;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void nombre(ActionEvent event) {
    }

    @FXML
    private void evento(ActionEvent event) {
    }

    @FXML
    private void fecha(ActionEvent event) {
    }

    @FXML
    private void enviar(ActionEvent event) {
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
    private void calendario(ActionEvent event) {
    }
    
}
