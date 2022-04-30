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
public class Producto implements Serializable{

        
//--- PROPIEDADES  -----------------------------------------------------------
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    //--------------------------------------------------------------
    @Column(name = "codigo_fabrica")
    private String codigoFabrica;   
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "marca")
    private String marca;
    
    @Column(name = "linea")
    private String linea;
    
    @Column(name = "oservaciones")
    private String observaciones;
    //----------------------------------------------------------------
    @Column(name = "precio_unitario")
    private Double precioUnitario;

    @Column(name = "precio_costo")
    private Double precioCosto;       
          
    @Column(name = "stock")
    private Double stock;    
    //---------------------------------------------------------------
    @Column(name = "creador")
    private int creador;

    @Column(name = "modificador")
    private int modificador;

    @Column(name = "fecha_creacion", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion", insertable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;
//============================================================================
   
    
    
//--- RELACIONES -------------------------------------------------------------
    @OneToMany(targetEntity = Venta_item.class, orphanRemoval = true, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_producto")
    private List<Venta_item> productoHistorial;
//============================================================================
    
    
    
//--- GETTERS Y SETTERS  -----------------------------------------------------
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //----------------------------------------------------------
     public String getCodigoFabrica() {
        return codigoFabrica;
    }

    public void setCodigoFabrica(String codigoFabrica) {
        this.codigoFabrica = codigoFabrica;
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
        
    } public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    //-----------------------------------------------------------
    
    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(Double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

     public Double getPrecioCosto() {
        return precioCosto;
    }

    public void setPrecioCosto(Double precioCosto) {
        this.precioCosto = precioCosto;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }
    
    //-----------------------------------------------------------

    public int getCreador() {
        return creador;
    }

    public void setCreador(int creador) {
        this.creador = creador;
    }

    public int getModificador() {
        return modificador;
    }

    public void setModificador(int modificador) {
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

    public List<Venta_item> getProductoHistorial() {
        return productoHistorial;
    }

    public void setProductoHistorial(List<Venta_item> productoHistorial) {
        this.productoHistorial = productoHistorial;
    }
    
//============================================================================
    
    
    
//-- TO STRING ---------------------------------------------------------------
     @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", codigoFabrica=" + codigoFabrica + ", nombre=" + nombre + ", marca=" + marca + 
                ", linea=" + linea + ", observaciones=" + observaciones + ", precioUnitario=" + precioUnitario + ", precioCosto=" 
                + precioCosto + ", stock=" + stock + ", creador=" + creador + ", modificador=" + modificador + ", fechaCreacion=" 
                + fechaCreacion + ", fechaModificacion=" + fechaModificacion + ", productoHistorial=" + productoHistorial + '}';
    } 
    
//============================================================================

   

    
   
  
    
    
}
