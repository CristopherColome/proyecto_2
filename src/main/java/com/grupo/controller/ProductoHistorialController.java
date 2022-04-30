/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.Venta_Item;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author ccolome
 */
public class ProductoHistorialController implements IProductoHistorialController {

    private static final Logger LOG = LogManager.getLogger(ProductoHistorialController.class);

    private final EntityManager entityManager;

    public ProductoHistorialController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Boolean registrar(Venta_Item objeto) {
        LOG.info("INICIO DE REGISTRO PRODUCTO HISTORIAL");
        Boolean resultado = false;
        try {
            entityManager.persist(objeto);
            resultado = true;
            LOG.info("Se registró correctamente el producto historial.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar producto historial : " + e);
        }
        LOG.info("FIN DE REGISTRO PRODUCTO HISTORIAL");
        return resultado;
    }

    @Override
    public List<Venta_Item> listar() {
        LOG.info("INICIO DE LISTAR PRODUCTOS HISTORIAL");
        List<Venta_Item> productohistorial = new ArrayList<Venta_Item>();
        try {
            productohistorial = entityManager.createQuery("SELECT PH FROM ProductoHistorial PH", Venta_Item.class).getResultList();
            LOG.info("Se obtuvo correctamente los productos historial.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar productos historial : " + e);
        }
        LOG.info("FIN DE LISTAR PRODUCTOS HISTORIAL");
        return productohistorial;
    }

    @Override
    public Venta_Item obtener(Integer id) {
        LOG.info("INICIO DE OBTENER PRODUCTO HISTORIAL: " + id);
        Venta_Item productoHistorial = new Venta_Item();
        try {
            productoHistorial = entityManager.find(Venta_Item.class, id);
            LOG.info("Se obtuvo correctamente el producto historial.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener producto historial : " + e);
        }
        LOG.info("FIN DE OBTENER PRODUCTO HISTORIAL");
        return productoHistorial;
    }

    @Override
    public Boolean actualizar(Venta_Item objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
