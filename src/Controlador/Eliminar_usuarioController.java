
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Eliminar_usuarioController implements Initializable {

    @FXML
    private Button btneliminar;
    @FXML
    private Button btncancelar;

 
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void eliminar(ActionEvent event) {
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
    
}
