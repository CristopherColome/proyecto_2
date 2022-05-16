/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import static com.grupo.app.ApplicationConfig.getEntityManager;
import com.grupo.entity.Producto;
import com.grupo.entity.Venta;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author ccolome
 */
public class VentaController implements IVentaController {

    private static final Logger LOG = LogManager.getLogger(VentaController.class);

    private EntityManager entityManager;

    @Override
    public Boolean registrar(Venta objeto) {
        LOG.info("INICIO DE REGISTRO VENTA");

        entityManager = getEntityManager();
        Boolean resultado = false;

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se registró correctamente la venta.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar la venta: " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        LOG.info("FIN DE REGISTRO VENTA");
        return resultado;
    }

    @Override
    public List<Venta> listar() {
        LOG.info("INICIO DE LISTAR VENTAS");

        entityManager = getEntityManager();
        List<Venta> ventas = new ArrayList<Venta>();

        try {
            ventas = entityManager.createQuery("SELECT V FROM Venta V LEFT JOIN V.cliente C ON C.idPersona = V.cliente.id", Venta.class).getResultList();
            LOG.info("Se obtuvo correctamente las ventas.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar ventas : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE LISTAR VENTAS");
        return ventas;
    }

    @Override
    public List<Venta> consultar(String parametro) {
        LOG.info("INICIO DE CONSULTA VENTAS");

        entityManager = getEntityManager();
        List<Venta> ventas = new ArrayList<Venta>();

        try {
            String sentencia = new StringBuilder()
                    .append("SELECT V FROM Venta V ")
                    .append("LEFT JOIN V.cliente C ON C.idPersona = V.cliente.id ")
                    .append("WHERE  V.serie  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR V.id  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR V.correlativo  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR V.comprobante  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR C.nombre LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR C.apellidos LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR C.numeroDocumento LIKE CONCAT('%', :parametro ,'%')")
                    .toString();
            Query query = entityManager.createQuery(sentencia, Producto.class);
            query.setHint("eclipselink.refresh", true);
            query.setParameter("parametro", parametro);

            ventas = query.getResultList();
            LOG.info("Se obtuvo correctamente las ventas.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al consultar ventas : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE CONSULTA VENTAS");
        return ventas;
    }

    @Override
    public Venta obtener(Integer id) {
        LOG.info("INICIO OBTENER VENTA");

        entityManager = getEntityManager();
        Venta venta = new Venta();

        try {
            Query query = entityManager.createQuery(
                    "SELECT V FROM Venta V LEFT JOIN V.ventaItems VI ON VI.idVenta = V.id  LEFT JOIN V.cliente C ON C.idPersona = V.cliente.id WHERE V.id = :id",
                    Venta.class
            );
            query.setHint("eclipselink.refresh", true);
            query.setParameter("id", id);
            venta = (Venta) query.getSingleResult();

            LOG.info("Se obtuvo correctamente la venta.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener venta : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN OBTENER VENTA");
        return venta;
    }

    @Override
    public Boolean actualizar(Venta objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String obtenerCorrelativo() {
        LOG.info("INICIO OBTENER CORRELATIVO");

        entityManager = getEntityManager();
        String correlativo = "";

        try {

            correlativo = (String) entityManager.createNativeQuery(
                    "SELECT CONCAT(DATE_FORMAT(CURDATE(), '%Y%m%d'),'-', (SELECT LPAD((COUNT(V.id) + 1), 4, 0) FROM bodega.tb_venta V WHERE DATE_FORMAT(V.fecha_creacion, '%Y-%m-%d') = CURDATE()))"
            ).getSingleResult();

            LOG.info("Se obtuvo correctamente el correlativo.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener correlativo : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DOBTENER CORRELATIVO");
        return correlativo;
    }

}
