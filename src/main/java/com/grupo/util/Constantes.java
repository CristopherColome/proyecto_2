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

    public enum PRODUCTO_OPERACION {
        INGRESO,
        SALIDA
    }
}
