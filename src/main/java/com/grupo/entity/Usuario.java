/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;


/**
 *
 * @author ccolome
 */
@Entity
@Table(name = "tb_usuario")
public class Usuario extends Persona implements Serializable {

     
//--- PROPIEDADES  -----------------------------------------------------------
    @Column(name = "username")
    private String username;
    
    @Column(name = "password")
    private String password;
    
    @Column(name = "rol")
    private String rol;   
    
    @Column(name = "activo")
    private boolean activo;
//============================================================================
   

    
//--- GETTERS Y SETTERS  -----------------------------------------------------
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }   
    
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
//============================================================================

    
    
    
//-- TO STRING ---------------------------------------------------------------
    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", password=" + 
                password + ", rol=" + rol + ", activo=" + activo + '}';
    }    
//============================================================================
    
    
   

   
    
}
