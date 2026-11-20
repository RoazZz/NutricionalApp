/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package nutricionalappfx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LEGION
 */
public class FXMLAdminPacienteController implements Initializable {
    
    private int idNutriologo;
    @FXML
    private ImageView ivRegresar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void configurarInformacion(int idNutriologo){
        this.idNutriologo = idNutriologo;
    }

    @FXML
    private void handleRegresar(MouseEvent event) {
        Stage primaryStage = (Stage) ivRegresar.getScene().getWindow();
        primaryStage.close();
    }
    
}
