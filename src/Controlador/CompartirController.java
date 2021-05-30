
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

public class CompartirController implements Initializable {

    @FXML
    private Button btndocumento;
    @FXML
    private TextField btnnombre;
    @FXML
    private TextField btnlista;
    @FXML
    private Button btncompartir;
    @FXML
    private Button btncancelar;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
            btndocumento.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar archivo CSV");

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All CVS", "*.*"),
                    new FileChooser.ExtensionFilter("CSV", "*.csv")
            );

            File csvFile = fileChooser.showOpenDialog(null);

        });
    }    

    @FXML
    private void documento(ActionEvent event) {
    }

    @FXML
    private void nombre(ActionEvent event) {
    }

    @FXML
    private void lista(ActionEvent event) {
    }

    @FXML
    private void compartir(ActionEvent event) {
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
