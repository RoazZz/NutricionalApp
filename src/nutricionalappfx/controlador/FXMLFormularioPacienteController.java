/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package nutricionalappfx.controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LEGION
 */
public class FXMLFormularioPacienteController implements Initializable {

    @FXML
    private ImageView ivRegresar;
    @FXML
    private TextField tfNombre;
    @FXML
    private TextField tfApellidoPaterno;
    @FXML
    private TextField tfApellidoMaterno;
    @FXML
    private DatePicker dpFechaNacimiento;
    @FXML
    private TextField tfTelefonoContacto;
    @FXML
    private RadioButton rbMasculino;
    @FXML
    private ToggleGroup tgSexo;
    @FXML
    private RadioButton rbFemenino;
    @FXML
    private TextField tfAltura;
    @FXML
    private TextField tfPesoInicial;
    @FXML
    private TextField tfCorreoElectronico;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleRegresar(MouseEvent event) {
        Stage primaryStage = (Stage) ivRegresar.getScene().getWindow();
        primaryStage.close();
    }
    
}
