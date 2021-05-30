
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


public class UsuariosController implements Initializable {

    @FXML
    private Button btncrear;
    @FXML
    private Button btneliminar;


    @Override
    public void initialize(URL url, ResourceBundle rb) {
     
    }    

    @FXML
    private void crear(ActionEvent event) {
               try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Crear_usuario.fxml"));
            Parent root = loader2.load();
            
            Crear_usuarioController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void eliminar(ActionEvent event) {
            try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/Eliminar_usuario.fxml"));
            Parent root = loader2.load();
            
            Eliminar_usuarioController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(UsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
