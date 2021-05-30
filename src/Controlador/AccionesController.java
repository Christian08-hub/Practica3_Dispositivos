
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AccionesController implements Initializable {

    @FXML
    private Button btnfotografia;
    @FXML
    private Button btncopiar;
    @FXML
    private Button btnpegar;
    @FXML
    private Button btncompartir;
    @FXML
    private Button btnmusica;
    @FXML
    private Button btndocumentos;
    @FXML
    private Button btnllamada;
    @FXML
    private Button btnmensajes;
    @FXML
    private Button btnnotificaciones;
    @FXML
    private Button btncerrar;
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
    private void fotografia(ActionEvent event) {
                try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Fotografia.fxml"));
            Parent root = loader2.load();
            
            FotografiaController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void copiar(ActionEvent event) {
           try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Copiar.fxml"));
            Parent root = loader2.load();
            
            CopiarController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @FXML
    private void pegar(ActionEvent event) {
             try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Pegar.fxml"));
            Parent root = loader2.load();
            
            PegarController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void compartir(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Compartir.fxml"));
            Parent root = loader2.load();
            
            CompartirController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @FXML
    private void musica(ActionEvent event) {
              try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/musica.fxml"));
            Parent root = loader2.load();
            
            MusicaController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void documentos(ActionEvent event) {
              try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/documentos.fxml"));
            Parent root = loader2.load();
            
            DocumentosController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void llamada(ActionEvent event) {
               try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Llamada.fxml"));
            Parent root = loader2.load();
            
            LlamadaController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void mensajes(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Mensajes.fxml"));
            Parent root = loader2.load();
            
            MensajesController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void notificaciones(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Notificaciones.fxml"));
            Parent root = loader2.load();
            
            NotificacionesController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(AccionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btncerrar(ActionEvent event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();  
    }

    @FXML
    private void carga(ActionEvent event) {
    }
    
}
