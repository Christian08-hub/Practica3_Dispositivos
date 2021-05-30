
package Controlador;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FotografiaController implements Initializable {

    @FXML
    private TextField btnnombre;
    @FXML
    private Button btnguardar;
    @FXML
    private Button btncancelar;
    @FXML
    private Button btncargar;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            btncargar.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar archivo CSV");

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All JPG", "*.*"),
                    new FileChooser.ExtensionFilter("JPG", "*.jpg")
            );

            File csvFile = fileChooser.showOpenDialog(null);

        });
       
    }    

    @FXML
    private void nombre(ActionEvent event) {
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
    private void cargar(ActionEvent event) {
        
    }
    
}
