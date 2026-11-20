/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package nutricionalappfx.controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import nutricionalappfx.NutricionalAppFX;
import nutricionalappfx.dominio.pojo.Colaborador;

/**
 * FXML Controller class
 *
 * @author LEGION
 */
public class FXMLPrincipalController implements Initializable {
    
    private Colaborador colaborador;
    @FXML
    private Label lbNombre;
    @FXML
    private Label lbRol;
    @FXML
    private Button btnAdminPaciente;
    @FXML
    private Button btnFormularioPaciente;
            
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void inicializarInformacion(Colaborador colaborador){
        this.colaborador = colaborador;
        mostrarInfoPantalla();
        
    }
    
    private void mostrarInfoPantalla(){
        if(colaborador != null){
            lbNombre.setText("Bienvenido(a) " + colaborador.toString());
            lbRol.setText("Rol: " + colaborador.getRol());
        }
    }

    @FXML
    private void handleBtnAdminPaciente(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(NutricionalAppFX.class.getResource("vista/FXMLAdminPaciente.fxml"));
            Parent vista = loader.load();
            FXMLAdminPacienteController controlador = loader.getController();
            controlador.configurarInformacion(colaborador.getIdColaborador());
            
            Scene escena = new Scene(vista);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Administrador de Pacientes");
            escenario.showAndWait();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @FXML
    private void handleBtnFormularioPaciente(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(NutricionalAppFX.class.getResource("vista/FXMLFormularioPaciente.fxml"));
            Parent vista = loader.load();
            
            Scene escena = new Scene(vista);
            Stage escenario = new Stage();
            escenario.setScene(escena);
            escenario.initModality(Modality.APPLICATION_MODAL);
            escenario.setTitle("Formulario de Paciente");
            escenario.showAndWait();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
    
}
