/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.Cliente;
import com.grupo.entity.Producto;
import com.grupo.entity.Usuario;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 *
 * @author ccolome
 */
public class ClienteController implements IClienteController {

    private static final Logger LOG = LogManager.getLogger(ClienteController.class);

    private final EntityManager entityManager;

    public ClienteController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Boolean registrar(Cliente objeto) {
        LOG.info("INICIO DE REGISTRO CLIENTE");
        Boolean resultado = false;
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se registró correctamente el cliente.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar el cliente: " + e);
        }
        LOG.info("FIN DE REGISTRO CLIENTE");
        return resultado;
    }

    @Override
    public List<Cliente> listar() {
        LOG.info("INICIO DE LISTAR CLIENTES");
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            clientes = entityManager.createQuery("SELECT C FROM Cliente C", Cliente.class).getResultList();
            LOG.info("Se obtuvo correctamente los clientes.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar clientes : " + e);
        }
        LOG.info("FIN DE LISTAR CLIENTES");
        return clientes;
    }

    @Override
    public Cliente obtener(Integer id) {
           LOG.info("INICIO OBTENER CLIENTE");
        Cliente cliente = new Cliente();
        try {

            Query query = entityManager.createQuery(
                    "SELECT C FROM Cliente C WHERE C.id = :id",
                    Cliente.class
            );
            query.setParameter("id", id);
            cliente = (Cliente) query.getSingleResult();
            LOG.info("Se obtuvo correctamente el cliente.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener cliente : " + e);
        }
        LOG.info("FIN OBTENER CLIENTE");
        return cliente;
    }

    @Override
    public Boolean actualizar(Cliente objeto) {
        LOG.info("INICIO ACTUALIZACION DE PRODUCTO");
        Boolean resultado = false;
        try {
            if (objeto.getModificador() != null) {
                entityManager.getTransaction().begin();
                entityManager.merge(objeto);
                entityManager.getTransaction().commit();
                resultado = true;
            } else {
                throw new Exception("No se encontró usuario modificador al actualizar");
            }
            LOG.info("Se actualizó correctamente el producto.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al actualizar producto : " + e);
        }
        LOG.info("FIN DE ACTUALIZACION DE PRODUCTO");
        return resultado;
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
