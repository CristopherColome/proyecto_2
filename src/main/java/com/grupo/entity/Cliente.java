/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.entity;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author ccolome
 */
@Entity
@Table(name = "tb_cliente")
@PrimaryKeyJoinColumn(name = "id_persona", referencedColumnName = "id")
@DiscriminatorValue(
        value = "C"
)
public class Cliente extends Persona {

//--- PROPIEDADES  -----------------------------------------------------------    
    @Column(name = "id_persona")
    private Integer idPersona;

    @OneToMany(targetEntity = Venta.class, orphanRemoval = true,
            fetch = FetchType.EAGER, mappedBy = "cliente")
    @JoinColumn(name = "id_cliente")
    private List<Venta> ventas;

    public Cliente() {
        super();
    }

//--- GETTERS Y SETTERS  -----------------------------------------------------     
    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public List<Venta> getVentas() {
        return ventas;
    }

    public void setVentas(List<Venta> ventas) {
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return "ID: " + idPersona + " | Nombre Completo : " + super.getNombre() + ", " + super.getApellidos() + " | N° documento : " + super.getNumeroDocumento() + " | Tipo Doc.: " + super.getTipoDocumento();
        //return super.toString() + " Cliente{" + " idPersona=" + idPersona + ", ventas=" + ventas + '}';
    }

}
