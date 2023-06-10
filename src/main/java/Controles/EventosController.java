/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controles;

import Modelos.Evento;
import java.io.File;
import java.net.URL;
//import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.query.Query;

/**
 * FXML Controller class
 *
 * @author Willy Morales
 */
public class EventosController implements Initializable {
///*******************************Elementos de Register Event***********************
    @FXML
    private Button btnNewEventoRegister;
    @FXML
    private DatePicker dateInicioEventoRegister;
    @FXML
    private DatePicker datePreventaEventoRegister;
    @FXML
    private TextField txtNombreEventoRegister;
    @FXML
    private TextArea txtDetalleEventoRegister;
    @FXML
    private ImageView imageEventoRegister;
    @FXML
    private DatePicker dateFinalizacionEventoRegister;
    @FXML
    private TextField txtPrecioPlateaAEventoRegister;
    @FXML
    private TextField txtPrecioVIPMGEventoRegister;
    @FXML
    private TextField txtPrecioPlateaBEventoRegister;
    @FXML
    private TextField txtPrecioVIPEventoRegister;
    @FXML
    private DatePicker dateRetiroEventoRegister;
    @FXML
    private ComboBox<String> cbxEstadoEventoRegister;
    private ObservableList<String> options;
    @FXML
    private TextField txtNombreResponsableEventoRegister1;
    @FXML
    private ImageView imageStageEventoRegister;
    @FXML
    private Button btnNuevaPortadaRegister;

    private Map<String, Integer> optionValues;

    ///*******************************Elementos de List Event***********************
    @FXML
    private TableView<Evento> tviewEventosList;
    @FXML
    private TableColumn<Evento, Integer> colId;
    @FXML
    private TableColumn<Evento, String> colNombre;
    @FXML
    private TableColumn<Evento, String> colDescripcion;
    @FXML
    private TableColumn<Evento, ?> colFechaInicio;
    @FXML
    private TableColumn<Evento, ?> colFechaFin;
    @FXML
    private TableColumn<Evento, ?> colPreventa;
    @FXML
    private TableColumn<Evento, ?> colRetiro;
    @FXML
    private TableColumn<Evento, ?> colPrecioVipMG;
    @FXML
    private TableColumn<Evento, ?> colPrecioVip;
    @FXML
    private TableColumn<Evento, ?> colPrecioPlateaA;
    @FXML
    private TableColumn<Evento, ?> colPrecioPlateaB;
    @FXML
    private TableColumn<Evento, ?> colResponsableEvento;
    @FXML
    private TableColumn<Evento, ?> colEstado;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

    /**
    public Boolean
            createEvento(String nombre, String descripcion, String imagen, Timestamp fecha_inicio, Timestamp fecha_fin, Timestamp fecha_preventa, Timestamp fecha_retiro, float precioVipMG, float precioVip, float precioPlateaA, float precioPlateaB, String responsable, int estado) {

        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Evento.class
        ).buildSessionFactory();
        Session sessionActual = sessionFactory.openSession();

        try {
            Evento evento1 = new Evento(nombre, descripcion, imagen, fecha_inicio, fecha_fin, fecha_preventa, fecha_retiro, precioVipMG, precioVip, precioPlateaA, precioPlateaB, responsable, estado);
            sessionActual.beginTransaction();
            sessionActual.save(evento1);
            sessionActual.getTransaction().commit();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }

        return false;
    }
    * */

    @FXML
    private void seleccionarImagenPortadaRegister(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar imagen");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Archivos de imagen", "*.png", "*.jpg", "*.jpeg", "*.gif"),
                new ExtensionFilter("Todos los archivos", "*.*")
        );

        File archivoImagen = fileChooser.showOpenDialog(null);
        if (archivoImagen != null) {
            Image imagen = new Image(archivoImagen.toURI().toString());
            imageEventoRegister.setImage(imagen);
        }
    }

    @FXML
    private void registrarNuevoEvento(ActionEvent event) {
        /**
        String newNombre = txtNombreEventoRegister.getText();
        String newDescripcion = txtNombreEventoRegister.getText();

        LocalDate dateSelected1 = dateInicioEventoRegister.getValue();
        Timestamp newFechaInicio = Timestamp.valueOf(dateSelected1.atStartOfDay());

        LocalDate dateSelected2 = dateFinalizacionEventoRegister.getValue();
        Timestamp newFechaFin = Timestamp.valueOf(dateSelected2.atStartOfDay());

        LocalDate dateSelected3 = datePreventaEventoRegister.getValue();
        Timestamp newFechaPreventa = Timestamp.valueOf(dateSelected3.atStartOfDay());

        LocalDate dateSelected4 = dateFinalizacionEventoRegister.getValue();
        Timestamp newFechaRetiro = Timestamp.valueOf(dateSelected4.atStartOfDay());

        String responsableEvento = txtNombreResponsableEventoRegister1.getText();

        float precioVipMG = Float.parseFloat(txtPrecioVIPMGEventoRegister.getText());
        float precioVip = Float.parseFloat(txtPrecioVIPEventoRegister.getText());
        float precioPlateaA = Float.parseFloat(txtPrecioPlateaAEventoRegister.getText());
        float precioPlateaB = Float.parseFloat(txtPrecioPlateaBEventoRegister.getText());

        String selectedOption = cbxEstadoEventoRegister.getValue();
        int estadoEvento = optionValues.get(selectedOption);

        String rutaImagenEvento = "";

        Boolean seCreoEvento = createEvento(newNombre, newDescripcion, rutaImagenEvento, newFechaInicio, newFechaFin, newFechaPreventa, newFechaRetiro, precioVipMG, precioVip, precioPlateaA, precioPlateaB, responsableEvento, estadoEvento);

        if (seCreoEvento) {
            mostrarMensaje(AlertType.INFORMATION, "Registro Creado", "Se registro el evento correctamente.");
        } else {
            mostrarMensaje(AlertType.ERROR, "Algo anda mal", "Hubo un error al registrar el evento, verifica los datos e intenta nuevamente.");
        }
        * 
        * */
    }

    public String getEvento(int id) {
        /**
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Evento.class
        ).buildSessionFactory();
        Session sessionActual = sessionFactory.openSession();

        try {
            sessionActual.beginTransaction();
            Evento evento = sessionActual.get(Evento.class,
                    id);
            sessionActual.getTransaction().commit();

            return evento.toString();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }
        * */

        return "Evento no encontrado";
    }

    public List<Evento> getEventos() {
        
        /*
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Evento.class
        ).buildSessionFactory();
        Session sessionActual = sessionFactory.openSession();
        List<Evento> eventos = new ArrayList<>();

        try {
            sessionActual.beginTransaction();
            Query<Evento> query = sessionActual.createQuery("FROM Evento", Evento.class
            );
            eventos = query.getResultList();
            sessionActual.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionActual.close();
            sessionFactory.close();
        }

        */
        //return eventos;
        return null;
    }

    public String
            updateEvento(int id, String nombre) {

        /*
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Evento.class
        ).buildSessionFactory();
        Session sessionActual = sessionFactory.openSession();

        try {
            sessionActual.beginTransaction();
            Evento evento = sessionActual.get(Evento.class,
                    id);
            evento.setNombre(nombre);
            sessionActual.update(evento);

            sessionActual.getTransaction().commit();

            return "Actualizado correctamente";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sessionFactory.close();
        }

        */

        return "Error al actualizar";
    }

    public void mostrarMensaje(AlertType tipoMensaje, String titulo, String mensajePrincipal) {
        // Crear una instancia de Alert
        Alert alert = new Alert(tipoMensaje);

        // Configurar el título y el mensaje del diálogo
        alert.setTitle("Mensaje del sistema");
        alert.setHeaderText(titulo); // No se muestra un encabezado
        alert.setContentText(mensajePrincipal);

        // Mostrar el diálogo
        alert.showAndWait();
    }

    public void setElementosEnTableView(List<?> elementos, TableView tableView) {
        tableView.getItems().addAll(elementos);
    }

    @FXML
    private void initialListaEventos(Event event) {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colDescripcion.setCellValueFactory(new PropertyValueFactory<>("descripcion"));
        
        List<Evento> eventos = getEventos();
        
        ObservableList<Evento> listaEventos = FXCollections.observableArrayList(eventos);
        tviewEventosList.setItems(listaEventos);
    }

    @FXML
    private void initialRegistroEventos(Event event) {
        options = FXCollections.observableArrayList(
                "Publicado",
                "No publicado",
                "Activo",
                "Vencido"
        );
        cbxEstadoEventoRegister.setItems(options);

        optionValues = new HashMap<>();
        optionValues.put("Publicado", 1);
        optionValues.put("No publicado", 2);
        optionValues.put("Activo", 3);
        optionValues.put("Vencido", 4);

        cbxEstadoEventoRegister.setValue("Publicado");
    }
}