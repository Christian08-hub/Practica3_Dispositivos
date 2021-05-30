
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class Crear_dispositivoController implements Initializable {

    @FXML
    private Button btnguardar;
    @FXML
    private Button btncancelar;
    @FXML
    private TextField btncorreo;
    @FXML
    private TextField btnnombre;
    @FXML
    private CheckBox btnvisible;
    @FXML
    private CheckBox btnencendido;
    @FXML
    private MenuButton btndispositivo;
    @FXML
    private TextField btnnumero;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void guardar(ActionEvent event) {
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
    private void correo(ActionEvent event) {
    }

    @FXML
    private void nombre(ActionEvent event) {
    }

    @FXML
    private void visible(ActionEvent event) {
    }

    @FXML
    private void encendido(ActionEvent event) {
    }

    @FXML
    private void dispositivo(ActionEvent event) {
    }

    @FXML
    private void numero(ActionEvent event) {
    }
    
}
