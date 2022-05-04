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
@Table(name = "tb_venta")
public class Venta implements Serializable {

//--- PROPIEDADES  -----------------------------------------------------------    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    //--------------------------------------------------------------
    @Column(name = "id_cliente")
    private Integer idCliente;

    @Column(name = "serie")
    private String serie;

    @Column(name = "importe_total")
    private Double importeTotal;

    @Column(name = "creador")
    private String creador;

    @Column(name = "fecha_creacion", insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

//--- RELACIONES -------------------------------------------------------------
    @OneToMany(targetEntity = ProductoHistorial.class, orphanRemoval = true,
            fetch = FetchType.EAGER)
    @JoinColumn(name = "id_venta")
    private List<ProductoHistorial> ventaItems;

//--- GETTERS Y SETTERS  -----------------------------------------------------   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public Double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(Double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public List<ProductoHistorial> getVentaItems() {
        return ventaItems;
    }

    public void setVentaItems(List<ProductoHistorial> ventaItems) {
        this.ventaItems = ventaItems;
    }

    @Override
    public String toString() {
        return "Venta{" + "id=" + id + ", idCliente=" + idCliente + ", serie=" + serie + ", importeTotal=" + importeTotal + ", creador=" + creador + ", fechaCreacion=" + fechaCreacion + ", ventaItems=" + ventaItems + '}';
    }

}
