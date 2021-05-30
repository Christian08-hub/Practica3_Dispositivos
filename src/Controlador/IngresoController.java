
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
import javafx.scene.control.PasswordField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class IngresoController implements Initializable {

    @FXML
    private PasswordField btncontra;
    @FXML
    private javafx.scene.control.TextField btnusuario;
    @FXML
    private javafx.scene.control.Button btningreso;

    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        
        
        
    }    

    @FXML
    private void contra(ActionEvent event) {
    }

    @FXML
    private void usuario(ActionEvent event) {
    }

    @FXML
    private void Ingreso(ActionEvent event) {
         
        
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/Menu.fxml"));
            Parent root = loader.load();
            
            MenuController menu = loader.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(IngresoController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
