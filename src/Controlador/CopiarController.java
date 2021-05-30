
package Controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class CopiarController implements Initializable {

    @FXML
    private Button btncopiar;
    @FXML
    private Button btncancelar;
    @FXML
    private TextField btntexto;

  
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void copiar(ActionEvent event) {
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
    private void texto(ActionEvent event) {
    }
    
}
