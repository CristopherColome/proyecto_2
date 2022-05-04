/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ccolome
 */
@Entity
@Table(name = "tb_producto")
public class Producto implements Serializable {

//--- PROPIEDADES  -----------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "marca")
    private String marca;

    @Column(name = "linea")
    private String linea;

    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "stock")
    private Double stock;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "creador")
    private String creador;

    @Column(name = "modificador")
    private String modificador;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    //RELACIONES
    @OneToMany(targetEntity = ProductoHistorial.class, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private List<ProductoHistorial> productoHistorial;

//--- GETTERS Y SETTERS  -----------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;

    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getModificador() {
        return modificador;
    }

    public void setModificador(String modificador) {
        this.modificador = modificador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public List<ProductoHistorial> getProductoHistorial() {
        return productoHistorial;
    }

    public void setProductoHistorial(List<ProductoHistorial> productoHistorial) {
        this.productoHistorial = productoHistorial;
    }

//-- TO STRING ---------------------------------------------------------------
    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", linea=" + linea + ", observaciones=" + observaciones + ", precioUnitario=" + precioUnitario + ", stock=" + stock + ", creador=" + creador + ", modificador=" + modificador + ", fechaCreacion=" + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", productoHistorial=" + productoHistorial + '}';
    }

//============================================================================
}
