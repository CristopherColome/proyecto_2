
package com.grupo.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 *
 * @author Samuel
 */


@Entity
@Table(name = "tb_empresa")
public class Empresa implements Serializable{
    
//--- PROPIEDADES  -----------------------------------------------------------    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    //--------------------------------------------------------------
    @Column(name = "razon_social")
    private String razonSocial;
      
    @Column(name = "nombre_comercial")
    private String nombreComercial;
    
    @Column(name = "nombre_alias")
    private String alias;
    
    @Column(name = "ruc")
    private String ruc;
    //-------------------------------------------------------------      
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "email")
    private String email;
    
    @Column(name = "contacto")
    private String contacto;
    
       @Column(name = "contacto_cargo")
    private String contactoCargo;
    //-------------------------------------------------------------      
    @Column(name = "fecha_creacion", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
    @Column(name = "creador")
    private int creador;
//============================================================================

    
    
 //--- GETTERS Y SETTERS  -----------------------------------------------------   
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getContactoCargo() {
        return contactoCargo;
    }

    public void setContactoCargo(String contactoCargo) {
        this.contactoCargo = contactoCargo;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public int getCreador() {
        return creador;
    }

    public void setCreador(int creador) {
        this.creador = creador;
    }
 //============================================================================
    
    
    
    
 //-- TO STRING --------------------------------------------------------------- 
       @Override
    public String toString() {
        return "Empresa{" + "id=" + id + ", razonSocial=" + razonSocial + 
                ", nombreComercial=" + nombreComercial + ", alias=" + alias + 
                ", ruc=" + ruc + ", direccion=" + direccion + ", telefono=" + 
                telefono + ", email=" + email + ", contacto=" + contacto + 
                ", contactoCargo=" + contactoCargo + ", fechaCreacion=" + 
                fechaCreacion + ", creador=" + creador + '}';
    }     
    
//============================================================================


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
