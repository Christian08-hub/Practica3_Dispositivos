
package Controlador;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;


public class Carga_administracionController implements Initializable {

    @FXML
    private Button btnbuscar;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
              btnbuscar.setOnAction(event -> {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Buscar archivo CSV");

            fileChooser.getExtensionFilters().addAll(
                    new FileChooser.ExtensionFilter("All CSV", "*.*"),
                    new FileChooser.ExtensionFilter("CSV", "*.csv")
            );

            File csvFile = fileChooser.showOpenDialog(null);

        });
        
     
    }    

    @FXML
    private void buscar(ActionEvent event) {
    }
    
}
