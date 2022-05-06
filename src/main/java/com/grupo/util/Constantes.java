/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.util;

/**
 *
 * @author ccolome
 */
public class Constantes {

    public enum Menu {
        PRODUCTO,
        VENTA,
        CLIENTE,
        USUARIO,
        SALIR
    }

    public enum Evento {
        USUARIO_LOGUEADO
    }

    public enum Rol {
        ADMINISTRADOR,
        ALMACEN,
        VENDEDOR
    }

    public enum ProductoOperacion {
        INGRESO,
        SALIDA
    }

    public enum ComponentesTab {
        PRODUCTO_CONSULTA("Consulta de productos"),
        PRODUCTO_REGISTRO("Registro de producto"),
        PRODUCTO_DETALLE("Detalle de producto");

        private final String titulo;

        ComponentesTab(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }
}
