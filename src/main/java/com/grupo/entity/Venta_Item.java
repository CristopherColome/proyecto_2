/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ccolome
 */
@Entity
@Table(name = "tb_venta_item")
public class Venta_item implements Serializable {

    
//--- PROPIEDADES  -----------------------------------------------------------  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "id_venta")
    private int idVenta;

    @Column(name = "id_producto")
    private int idProducto;
 
    @Column(name = "cantidad")
    private int cantidad;
    
    @Column(name = "precio_unitario")
    private double precioUnitario;

    @Column(name = "importe_item")
    private double importeItem;
    
    @Column(name = "orden")
    private byte orden;
    
    @Column(name = "anulado")
    private boolean anulado;  
//============================================================================

    


 //--- GETTERS Y SETTERS  -----------------------------------------------------    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public Integer getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Integer idVenta) {
        this.idVenta = idVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getImporteItem() {
        return importeItem;
    }

    public void setImporteItem(double importeItem) {
        this.importeItem = importeItem;
    }

    public byte getOrden() {
        return orden;
    }

    public void setOrden(byte orden) {
        this.orden = orden;
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
        return "Venta_item{" + "id=" + id + ", idVenta=" + idVenta + ", idProducto=" 
                + idProducto + ", cantidad=" + cantidad + ", precioUnitario=" 
                + precioUnitario + ", importeItem=" + importeItem + ", orden=" 
                + orden + ", anulado=" + anulado + '}';
    } 
   
 //============================================================================  

  
   
    
    
    
}
