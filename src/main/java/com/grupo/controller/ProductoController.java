/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.google.gson.Gson;
import com.grupo.entity.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author ccolome
 */
@ApplicationScoped
public class ProductoController implements IProductoController {

    private static final Logger LOG = LogManager.getLogger(ProductoController.class);

    private final EntityManager entityManager;

    public ProductoController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Boolean registrar(Producto objeto) {
        LOG.info("INICIO DE REGISTRO PRODUCTO");
        Boolean resultado = false;
        try {
            entityManager.persist(objeto);
            resultado = true;
            LOG.info("Se registró correctamente el producto.");
        }  catch (Exception e) {
            LOG.error("Ocurrió un error al insertar producto : " + e);
        }
        LOG.info("FIN DE REGISTRO PRODUCTO");
        return resultado;
    }

    @Override
    public List<Producto> listar() {
        LOG.info("INICIO DE LISTAR PRODUCTOS");
        List<Producto> productos = new ArrayList<Producto>();
        try {
            productos = entityManager.createQuery("SELECT P FROM Producto P", Producto.class).getResultList();
            LOG.info("Se obtuvo correctamente los productos.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar productos : " + e);
        }
        LOG.info("FIN DE LISTAR PRODUCTOS");
        return productos;
    }

    @Override
    public Producto obtener(Integer id) {
        LOG.info("INICIO OBTENER PRODUCTO");
        Producto producto = new Producto();
        try {

            Query query = entityManager.createQuery(
                    "SELECT P FROM Producto P LEFT JOIN P.productoHistorial PH ON PH.idProducto = P.id WHERE P.id = :id",
                    Producto.class
            );
            query.setParameter("id", id);
            producto = (Producto) query.getSingleResult();
            LOG.info("Se obtuvo correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener producto : " + e);
        }
        LOG.info("FIN OBTENER PRODUCTO");
        return producto;
    }

    @Override
    public Boolean actualizar(Producto objeto) {
        LOG.info("INICIO ACTUALIZACION DE PRODUCTO");
        Boolean resultado = false;
        try {
            if (!objeto.getModificador().isEmpty()) {
                entityManager.merge(objeto);
                resultado = true;
            } else {
                throw new Exception("No se encontró usuario modificador al actualizar");
            }
            LOG.info("Se actualizó correctamente el producto.");
        }  catch (Exception e) {
            LOG.error("Ocurrió un error al actualizar producto : " + e);
        }
        LOG.info("FIN DE ACTUALIZACION DE PRODUCTO");
        return resultado;
    }

    @Override
    public Boolean eliminar(Integer id) {
        LOG.info("INICIO ELIMINAR PRODUCTO");
        Boolean resultado = false;
        try {
            Producto producto = obtener(id);
            entityManager.remove(producto);
            resultado = true;
            LOG.info("Se eliminó correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al eliminar producto : " + e);
        }
        LOG.info("FIN ELIMINAR PRODUCTO");
        return resultado;
    }

}
