/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Willy Morales
 */
public class LoginController implements Initializable {

    @FXML
    private TextField txtCorreoUsuario;
    @FXML
    private TextField txtPasswordUsuario;
    @FXML
    private Button btnIniciarSesion;
    @FXML
    private Button btnCrearCuenta;
    @FXML
    private Label btnIniciarInvitado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void btnIniciarSesionClick(ActionEvent event) {
    }

    @FXML
    private void btnCrearCuentaClick(ActionEvent event) {
    }

    @FXML
    private void btnIniciarInvitadoClick(MouseEvent event) {
    }
    
}
