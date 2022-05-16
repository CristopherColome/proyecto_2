/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.app;

import com.grupo.view.MainView;
import java.awt.EventQueue;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author ccolome
 */
public class Application {

    static {
        BasicConfigurator.configure();
    }

    public static void main(String[] args) throws InterruptedException {
        /*
        MODO DE USO:
        
        * MODIFICAR ARCHIVO PARA LA CONEXION A LA BASE DE DATOS
        
        - src/main/resources/META-INF/persistence.xml
        - IP = 127.0.0.1
        - USUARIO = root
        - PASSWORD = root
        <property name="javax.persistence.jdbc.url" value="jdbc:mysql://{{IP}}:3306/bodega?zeroDateTimeBehavior=CONVERT_TO_NULL"/>
        <property name="javax.persistence.jdbc.user" value="{{USUARIO}}"/>
        <property name="javax.persistence.jdbc.driver" value="com.mysql.cj.jdbc.Driver"/>
        <property name="javax.persistence.jdbc.password" value="{{PASSWORD}}"/>
        
        * CARGAR LA BASE DE DATOS
        
        - src/main/resources/sql/bodega.sql
        
        * COMPILAR Y CORRER LA APLICACION
        
        * USAURIO: admin , PASSWORD: admin
        */
        EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

}
