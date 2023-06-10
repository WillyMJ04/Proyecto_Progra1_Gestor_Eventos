package com.willymorales.proyecto_final_progra1_gestor;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrimaryController {

    @FXML
    private Button primaryButton;
    @FXML
    private Button btnIrLogin;
    @FXML
    private Button btnIrAdmin;
    @FXML
    private Button btnIrCliente;

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @FXML
    private void switchToLogin(ActionEvent event) throws IOException {
        App.setRoot("Login");
    }

    @FXML
    private void btnIrAdminClick(ActionEvent event) throws IOException {
        App.setRoot("/Admin/Eventos");
    }

    @FXML
    private void btnIrClienteClick(ActionEvent event) throws IOException {
        App.setRoot("Login");
    }
}
