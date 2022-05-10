/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import static com.grupo.app.ApplicationConfig.getEntityManager;
import com.grupo.entity.Cliente;
import com.grupo.entity.Producto;
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
public class ClienteController implements IClienteController {

    private static final Logger LOG = LogManager.getLogger(ClienteController.class);

    private EntityManager entityManager;

    @Override
    public Boolean registrar(Cliente objeto) {
        LOG.info("INICIO DE REGISTRO CLIENTE");

        entityManager = getEntityManager();
        Boolean resultado = false;

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se registró correctamente el cliente.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar el cliente: " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE REGISTRO CLIENTE");
        return resultado;
    }

    @Override
    public List<Cliente> listar() {
        LOG.info("INICIO DE LISTAR CLIENTES");

        entityManager = getEntityManager();
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            clientes = entityManager.createQuery("SELECT C FROM Cliente C", Cliente.class).getResultList();
            LOG.info("Se obtuvo correctamente los clientes.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar clientes : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE LISTAR CLIENTES");
        return clientes;
    }

    @Override
    public List<Cliente> consultar(String parametro) {
        LOG.info("INICIO DE CONSULTA CLIENTES");

        entityManager = getEntityManager();
        List<Cliente> clientes = new ArrayList<Cliente>();

        try {
            String sentencia = new StringBuilder()
                    .append("SELECT C FROM Cliente C ")
                    .append("WHERE  C.nombre  LIKE CONCAT('%', :parametro ,'%') ")
                    .append("OR C.id  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR C.apellidos  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR C.numeroDocumento  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR C.telefono  LIKE CONCAT('%', :parametro ,'%')")
                    .append("OR C.creador  LIKE CONCAT('%', :parametro ,'%')")
                    .toString();
            Query query = entityManager.createQuery(sentencia, Cliente.class);
            query.setHint("eclipselink.refresh", true);
            query.setParameter("parametro", parametro);

            clientes = query.getResultList();
            LOG.info("Se obtuvo correctamente los clientes.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al consultar clientes : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE CONSULTA CLIENTES");
        return clientes;
    }

    @Override
    public Cliente obtener(Integer id) {
        LOG.info("INICIO OBTENER CLIENTE");

        entityManager = getEntityManager();
        Cliente cliente = new Cliente();

        try {

            Query query = entityManager.createQuery(
                    "SELECT C FROM Cliente C LEFT JOIN C.ventas V ON V.idCliente = C.id WHERE C.id = :id",
                    Cliente.class
            );
            query.setHint("eclipselink.refresh", true);
            query.setParameter("id", id);
            cliente = (Cliente) query.getSingleResult();
            LOG.info("Se obtuvo correctamente el cliente.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener cliente : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN OBTENER CLIENTE");
        return cliente;
    }

    @Override
    public Boolean actualizar(Cliente objeto) {
        LOG.info("INICIO ACTUALIZACION DE CLIENTE");

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
            LOG.info("Se actualizó correctamente el cliente.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al actualizar cliente : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE ACTUALIZACION DE CLIENTE");
        return resultado;
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
