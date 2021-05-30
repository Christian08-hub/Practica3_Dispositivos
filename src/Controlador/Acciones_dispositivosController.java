
package Controlador;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Acciones_dispositivosController implements Initializable {

    @FXML
    private Button btncargaacciones;
    @FXML
    private Button btnacciones;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btncargaacciones.setOnAction(event -> {
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
    private void cargaacciones(ActionEvent event) {
   
    }

    @FXML
    private void acciones(ActionEvent event) {
           try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Acciones.fxml"));
            Parent root = loader2.load();
            
            AccionesController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Acciones_dispositivosController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
