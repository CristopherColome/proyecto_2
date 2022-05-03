/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.entity;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ccolome
 */
@Entity
@Table(name = "tb_usuario")
@PrimaryKeyJoinColumn(name = "id_persona", referencedColumnName = "id")
@DiscriminatorValue(
        value = "U"
)
public class Usuario extends Persona {

//--- PROPIEDADES  -----------------------------------------------------------
    @Column(name = "id_persona")
    private Integer idPersona;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "rol")
    private String rol;

    @Column(name = "activo", columnDefinition = "TINYINT(1)")
    private Boolean activo;

    public Usuario() {
        super();
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

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

    public Boolean getActivo() {
        return activo;
    }

    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return super.toString() + " Usuario{" + " idPersona=" + idPersona + ", username=" + username + ", password=" + password + ", rol=" + rol + ", activo=" + activo + '}';
    }

}
