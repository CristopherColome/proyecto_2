/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.ProductoHistorial;
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

    public Boolean registrar(ProductoHistorial objeto) {
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
    public List<ProductoHistorial> listar() {
        LOG.info("INICIO DE LISTAR PRODUCTOS HISTORIAL");
        List<ProductoHistorial> productohistorial = new ArrayList<ProductoHistorial>();
        try {
            productohistorial = entityManager.createQuery("SELECT PH FROM ProductoHistorial PH", ProductoHistorial.class).getResultList();
            LOG.info("Se obtuvo correctamente los productos historial.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar productos historial : " + e);
        }
        LOG.info("FIN DE LISTAR PRODUCTOS HISTORIAL");
        return productohistorial;
    }

    @Override
    public ProductoHistorial obtener(Integer id) {
        LOG.info("INICIO DE OBTENER PRODUCTO HISTORIAL: " + id);
        ProductoHistorial productoHistorial = new ProductoHistorial();
        try {
            productoHistorial = entityManager.find(ProductoHistorial.class, id);
            LOG.info("Se obtuvo correctamente el producto historial.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener producto historial : " + e);
        }
        LOG.info("FIN DE OBTENER PRODUCTO HISTORIAL");
        return productoHistorial;
    }

    @Override
    public Boolean actualizar(ProductoHistorial objeto) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
