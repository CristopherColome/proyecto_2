/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.Producto;
import com.grupo.entity.Usuario;
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
public class UsuarioController implements IUsuarioController {

    private static final Logger LOG = LogManager.getLogger(UsuarioController.class);

    private final EntityManager entityManager;

    public UsuarioController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Boolean registrar(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listar() {
        LOG.info("INICIO DE LISTAR USUARIOS");
        List<Usuario> usuarios = new ArrayList<Usuario>();
        try {
            usuarios = entityManager.createQuery("SELECT U FROM Usuario U", Usuario.class).getResultList();
            LOG.info("Se obtuvo correctamente los usuarios.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar usuarios : " + e);
        }
        LOG.info("FIN DE LISTAR USUARIOS");
        return usuarios;
    }

    @Override
    public Usuario obtener(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario obtener(String username) {
        LOG.info("INICIO OBTENER USUARIO");
        Usuario usuario = new Usuario();
        try {
            Query query = entityManager.createQuery("SELECT U FROM Usuario U WHERE U.username = :username");
            query.setParameter("username", username);
            usuario = (Usuario) query.getSingleResult();
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener usuario: " + e);
        }
        LOG.info("FIN OBTENER USUARIO");
        return usuario;
    }

    @Override
    public Boolean actualizar(Usuario objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
