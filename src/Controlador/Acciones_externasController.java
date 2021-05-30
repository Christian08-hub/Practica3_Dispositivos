
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


public class Acciones_externasController implements Initializable {

    @FXML
    private Button btnllamada;
    @FXML
    private Button btnmensaje;
    @FXML
    private Button btnnotificacion;
    @FXML
    private Button btncarga;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         btncarga.setOnAction(event -> {
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
    private void llamada(ActionEvent event) {
             try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Llamada_telefonica.fxml"));
            Parent root = loader2.load();
            
            Llamada_telefonicaController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Acciones_externasController.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @FXML
    private void mensaje(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Mensajecre.fxml"));
            Parent root = loader2.load();
            
            MensajecreController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Acciones_externasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void notificacion(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/noti.fxml"));
            Parent root = loader2.load();
            
            NotiController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Acciones_externasController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void carga(ActionEvent event) {
        
        
    }
    
}
