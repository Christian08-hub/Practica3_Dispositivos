
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
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


public class NotiController implements Initializable {

    @FXML
    private TextField btnnombre;
    @FXML
    private TextField btnasunto;
    @FXML
    private TextField btnmensaje;
    @FXML
    private Button btnenviar;
    @FXML
    private Button btncancelar;
    @FXML
    private MenuButton btncorreo;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
    }    

    @FXML
    private void nombre(ActionEvent event) {
    }

    @FXML
    private void asunto(ActionEvent event) {
    }

    @FXML
    private void mensaje(ActionEvent event) {
    }

    @FXML
    private void enviar(ActionEvent event) {
        
          try {
            FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/Vista/evento.fxml"));
            Parent root = loader2.load();
            
            EventoController menu = loader2.getController();
            
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(NotiController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @FXML
    private void cancelar(ActionEvent event) {
    Node source = (Node) event.getSource();
    Stage stage = (Stage) source.getScene().getWindow();
    stage.close();
    }

    @FXML
    private void correo(ActionEvent event) {
    }
    
}
