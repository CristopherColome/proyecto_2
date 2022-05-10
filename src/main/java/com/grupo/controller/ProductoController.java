/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import static com.grupo.app.ApplicationConfig.getEntityManager;
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

    private EntityManager entityManager;

    @Override
    public Boolean registrar(Producto objeto) {
        LOG.info("INICIO DE REGISTRO PRODUCTO");

        entityManager = getEntityManager();
        Boolean resultado = false;

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se registró correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar el producto: " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        LOG.info("FIN DE REGISTRO PRODUCTO");
        return resultado;
    }

    @Override
    public List<Producto> listar() {
        LOG.info("INICIO DE LISTAR PRODUCTOS");

        entityManager = getEntityManager();
        List<Producto> productos = new ArrayList<Producto>();

        try {
            productos = entityManager.createQuery("SELECT P FROM Producto P", Producto.class).getResultList();
            LOG.info("Se obtuvo correctamente los productos.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar productos : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE LISTAR PRODUCTOS");
        return productos;
    }

    @Override
    public List<Producto> consultar(String parametro) {
        LOG.info("INICIO DE CONSULTA PRODUCTOS");

        entityManager = getEntityManager();
        List<Producto> productos = new ArrayList<Producto>();

        try {
            String sentencia = new StringBuilder()
                    .append("SELECT P FROM Producto P ")
                    .append("WHERE  P.nombre  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR P.id  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR P.marca  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR P.linea  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR P.creador  LIKE CONCAT('%', :parametro ,'%')")
                    .toString();
            Query query = entityManager.createQuery(sentencia, Producto.class);
            query.setHint("eclipselink.refresh", true);
            query.setParameter("parametro", parametro);

            productos = query.getResultList();
            LOG.info("Se obtuvo correctamente los productos.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al consultar productos : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE CONSULTA PRODUCTOS");
        return productos;
    }

    @Override
    public Producto obtener(Integer id) {
        LOG.info("INICIO OBTENER PRODUCTO");

        entityManager = getEntityManager();
        Producto producto = new Producto();

        try {

            Query query = entityManager.createQuery(
                    "SELECT P FROM Producto P LEFT JOIN P.productoHistorial PH ON PH.idProducto = P.id WHERE P.id = :id",
                    Producto.class
            );
            query.setHint("eclipselink.refresh", true);
            query.setParameter("id", id);
            producto = (Producto) query.getSingleResult();
            LOG.info("Se obtuvo correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener producto : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN OBTENER PRODUCTO");
        return producto;
    }

    @Override
    public Boolean actualizar(Producto objeto) {
        LOG.info("INICIO ACTUALIZACION DE PRODUCTO");

        entityManager = getEntityManager();
        Boolean resultado = false;

        try {
            if (objeto.getModificador() != null && objeto.getFechaModificacion() != null) {
                entityManager.getTransaction().begin();
                entityManager.merge(objeto);
                entityManager.getTransaction().commit();
                resultado = true;
            } else {
                throw new Exception("No se encontró fecha de modificación o usuario modificador al actualizar");
            }
            LOG.info("Se actualizó correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al actualizar producto : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE ACTUALIZACION DE PRODUCTO");
        return resultado;
    }

    @Override
    public Boolean eliminar(Integer id) {
        LOG.info("INICIO ELIMINAR PRODUCTO");

        entityManager = getEntityManager();
        Boolean resultado = false;
        try {
            Producto producto = obtener(id);
            entityManager.getTransaction().begin();
            entityManager.remove(producto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se eliminó correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al eliminar producto : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN ELIMINAR PRODUCTO");
        return resultado;
    }

}
