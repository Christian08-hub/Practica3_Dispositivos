
package Controlador;

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
import javafx.stage.Modality;
import javafx.stage.Stage;


public class Gestionar_dispositivosController implements Initializable {

    @FXML
    private Button btncrear;
    @FXML
    private Button btneliminar;
    @FXML
    private Button btnmasiva;
    @FXML
    private Button btncargaadmi;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void crear(ActionEvent event) {
          try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Crear_dispositivo.fxml"));
            Parent root = loader2.load();
            
            Crear_dispositivoController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gestionar_dispositivosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    
    @FXML
    private void eliminar(ActionEvent event) {
           try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Eliminar.fxml"));
            Parent root = loader2.load();
            
            EliminarController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gestionar_dispositivosController.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }

    
    
    @FXML
    private void masiva(ActionEvent event) {
             try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Carga_dispositivos.fxml"));
            Parent root = loader2.load();
            
            Carga_dispositivosController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gestionar_dispositivosController.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }

    
    
    @FXML
    private void cargaadmi(ActionEvent event) {
        
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Carga_administracion.fxml"));
            Parent root = loader2.load();
            
            Carga_administracionController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Gestionar_dispositivosController.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }
    
}
