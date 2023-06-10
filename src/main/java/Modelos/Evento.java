/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Willy Morales
 */
@Entity
@Table(name = "eventos")
public class Evento {
    
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "titulo")
    private String nombre;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "imagen")
    private String imagen;
    
    @Column(name = "fecha_inicio")
    private Timestamp fecha_inicio;
    
    @Column(name = "fecha_fin")
    private Timestamp fecha_fin;
    
    @Column(name = "fecha_preventa")
    private Timestamp fecha_preventa;
    
    @Column(name = "fecha_retiro")
    private Timestamp fecha_retiro;
    
    @Column(name = "precio_vip_mg")
    private float precioVipMG;
    
    @Column(name = "precio_vip")
    private float precioVip;
    
    @Column(name = "precio_platea_a")
    private float precioPlateaA;
    
    @Column(name = "precio_platea_b")
    private float precioPlateaB;
    
    @Column(name = "encargado")
    private String responsable;
    
    @Column(name = "estado")
    private int estado;

    public Evento(String nombre, String descripcion, String imagen, Timestamp fecha_inicio, Timestamp fecha_fin, Timestamp fecha_preventa, Timestamp fecha_retiro, float precioVipMG, float precioVip, float precioPlateaA, float precioPlateaB, String responsable, int estado) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.fecha_preventa = fecha_preventa;
        this.fecha_retiro = fecha_retiro;
        this.precioVipMG = precioVipMG;
        this.precioVip = precioVip;
        this.precioPlateaA = precioPlateaA;
        this.precioPlateaB = precioPlateaB;
        this.responsable = responsable;
        this.estado = estado;
    }
    
    public Evento() {
        
    }
    
    public int getId() {
        return id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public Timestamp getFecha_inicio() {
        return fecha_inicio;
    }

    public Timestamp getFecha_preventa() {
        return fecha_preventa;
    }

    public int getEstado() {
        return estado;
    }

//    ***************SETTERS********************
    public void setId(int id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public void setFecha_inicio(Timestamp fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_preventa(Timestamp fecha_preventa) {
        this.fecha_preventa = fecha_preventa;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", " + "nombre=" + nombre + ", descripcion=" + descripcion + ", imagen=" + imagen + ", fecha_inicio=" + fecha_inicio + ", fecha_preventa=" + fecha_preventa + ", estado=" + estado + '}';
    }
}
