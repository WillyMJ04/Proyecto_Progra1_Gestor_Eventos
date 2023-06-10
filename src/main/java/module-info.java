module com.mycompany.proyecto_final_progra1_gestor {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.proyecto_final_progra1_gestor to javafx.fxml;
    exports com.mycompany.proyecto_final_progra1_gestor;
}
