/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 * @author ccolome
 */
@Entity
@Table(name = "tb_cliente")
public class Cliente implements Serializable {

//--- PROPIEDADES  -----------------------------------------------------------    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipo")
    private byte tipo; //1-persona, 2-Empresa
    
    @Column(name = "id_persona")
    private int idPersona;
    
    @Column(name = "id_empresa")
    private int idEmpresa;
    //--------------------------------------------------------------
    @Column(name = "id_usuario")
    private int IdUsuario;

    @Column(name = "fecha_creacion", updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;
    
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

    public byte getTipo() {
        return tipo;
    }

    public void setTipo(byte tipo) {
        this.tipo = tipo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
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
        return "Cliente{" + "id=" + id + ", tipo=" + tipo + ", idPersona=" + 
                idPersona + ", idEmpresa=" + idEmpresa + ", IdUsuario=" + 
                IdUsuario + ", fechaCreacion=" + fechaCreacion + ", anulado=" + 
                anulado + '}';
    }    
//============================================================================
    
      
        
    


}
