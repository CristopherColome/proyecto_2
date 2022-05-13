/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.util;

import java.util.Arrays;

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

    public enum PersonaTipo {
        C("Cliente"),
        U("Usuario");

        private final String descripcion;

        PersonaTipo(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public enum ClienteTipoPersona {
        NATURAL,
        JURIDICO
    }

    public enum ClienteTipoDocumento {
        DNI,
        RUC,
        CE
    }

    public enum VentaComprobante {
        BOLETA,
        FACTURA
    }

    public enum ComponentesTab {
        PRODUCTO_CONSULTA("Consulta de productos"),
        PRODUCTO_REGISTRO("Registro de producto"),
        PRODUCTO_DETALLE("Detalle de producto"),
        CLIENTE_CONSULTA("Consulta de clientes"),
        CLIENTE_REGISTRO("Registro de cliente"),
        CLIENTE_DETALLE("Detalle de cliente"),
        VENTA_CONSULTA("Consulta de ventas"),
        VENTA_REGISTRO("Registro de venta"),
        VENTA_DETALLE("Detalle de venta"),
        USUARIO_CONSULTA("Consulta de usuarios"),
        USUARIO_REGISTRO("Registro de usuario"),
        USUARIO_DETALLE("Detalle de usuario");
        
        private final String titulo;

        ComponentesTab(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    public static String[] getNnombres(Class<? extends Enum<?>> e) {
        return Arrays.stream(e.getEnumConstants()).map(Enum::name).toArray(String[]::new);
    }
}
