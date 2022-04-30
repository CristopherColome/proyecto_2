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
public class Venta implements Serializable{

//--- PROPIEDADES  -----------------------------------------------------------    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    //--------------------------------------------------------------
    @Column(name = "serie")
    private String serie;
    
    @Column(name = "correlativo")
    private String correlativo;
    
    @Column(name = "id_cliente")
    private String idCliente;
    
    @Column(name = "importe_total")
    private double importeTotal;
    //--------------------------------------------------------------
    @Column(name = "id_usuario")
    private int IdUsuario;

    @Column(name = "fecha_creacion", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @Column(name = "anulado")
    private boolean anulado;    
//============================================================================
    
    
    
    
//--- RELACIONES -------------------------------------------------------------
    @OneToMany(targetEntity = Venta_item.class, orphanRemoval = true, 
            fetch = FetchType.EAGER)
    @JoinColumn(name = "id_venta")
    private List<Venta_item> ventaItems;
//============================================================================
    
    
    
    
//--- GETTERS Y SETTERS  -----------------------------------------------------   
    public List<Venta_item> getVentaItems() {
        return ventaItems;
    }

    public void setVentaItems(List<Venta_item> ventaItems) {
        this.ventaItems = ventaItems;
    }
    //----------------------------------------------------------------
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
 
    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
   
    public boolean isAnulado() {
        return anulado;
    }
   
    public void setAnulado(boolean anulado) {
        this.anulado = anulado;
    }
//============================================================================
    
    
    
//--- TO STRING  -------------------------------------------------------------  
@Override
    public String toString() {
        return "Venta{" + "id=" + id + ", serie=" + serie + ", correlativo=" + 
                correlativo + ", idCliente=" + idCliente + ", impTotal=" + importeTotal +
                ", IdUsuario=" + IdUsuario + ", fechaCreacion=" + fechaCreacion +
                ", anulado=" + anulado + ", ventaItems=" + ventaItems + '}';
    }        
//============================================================================

    
   
    
    
    

}
