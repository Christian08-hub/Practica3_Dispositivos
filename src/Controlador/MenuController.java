
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
import javafx.scene.control.MenuItem;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MenuController implements Initializable {

    @FXML
    private MenuItem btngestionar;
    
    
    @FXML
    private MenuItem btnaccionpri;
    @FXML
    private MenuItem btnaccionse;
    @FXML
    private MenuItem btnbitacora;
    @FXML
    private MenuItem btnasociados;
    @FXML
    private MenuItem btnbitaingreso;
    @FXML
    private MenuItem btningreso;
    @FXML
    private MenuItem btngestion;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void gestionar(ActionEvent event) {
        
        
        try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Gestionar_dispositivos.fxml"));
            Parent root = loader1.load();
            
            Gestionar_dispositivosController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
        
        
        
        
    


    @FXML
    private void accionpri(ActionEvent event) {
        
        try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Acciones_dispositivos.fxml"));
            Parent root = loader1.load();
            
            Acciones_dispositivosController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

    @FXML
    private void accionse(ActionEvent event) {
          try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Acciones_externas.fxml"));
            Parent root = loader1.load();
            
            Acciones_externasController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @FXML
    private void bitacora(ActionEvent event) {
            try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Bitacora.fxml"));
            Parent root = loader1.load();
            
            BitacoraController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }

    @FXML
    private void asociados(ActionEvent event) {
          try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Asociados.fxml"));
            Parent root = loader1.load();
            
            AsociadosController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btningreso(ActionEvent event) {
            try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/bitaingreso.fxml"));
            Parent root = loader1.load();
            
             BitaingresoController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void ingreso(ActionEvent event) {
          try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Almacenados.fxml"));
            Parent root = loader1.load();
            
             AlmacenadosController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @FXML
    private void gestion(ActionEvent event) {
            try {
            FXMLLoader loader1 = new FXMLLoader(getClass().getResource("/Vista/Usuarios.fxml"));
            Parent root = loader1.load();
            
             UsuariosController menu = loader1.getController();
       
            Scene scene = new Scene(root);
            Stage stage = new Stage ();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            
        } catch (IOException ex) {
            Logger.getLogger(MenuController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}


