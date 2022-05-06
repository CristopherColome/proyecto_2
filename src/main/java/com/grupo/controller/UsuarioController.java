/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import static com.grupo.app.ApplicationConfig.getEntityManager;
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

    private EntityManager entityManager;

    @Override
    public Boolean registrar(Usuario objeto) {
        LOG.info("INICIO DE REGISTRO USUARIO");

        entityManager = getEntityManager();
        Boolean resultado = false;

        try {
            entityManager.getTransaction().begin();
            entityManager.persist(objeto);
            entityManager.getTransaction().commit();
            resultado = true;
            LOG.info("Se registró correctamente el usuario.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al insertar el usuario: " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }

        LOG.info("FIN DE REGISTRO USUARIO");
        return resultado;
    }

    @Override
    public List<Usuario> listar() {
        LOG.info("INICIO DE LISTAR USUARIOS");

        entityManager = getEntityManager();
        List<Usuario> usuarios = new ArrayList<Usuario>();

        try {
            usuarios = entityManager.createQuery("SELECT U FROM Usuario U", Usuario.class).getResultList();
            LOG.info("Se obtuvo correctamente los usuarios.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al listar usuarios : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE LISTAR USUARIOS");
        return usuarios;
    }

    @Override
    public Usuario obtener(Integer id) {
        LOG.info("INICIO OBTENER USUARIO");

        entityManager = getEntityManager();
        Usuario usuario = new Usuario();

        try {

            usuario = entityManager.find(Usuario.class, id);
            LOG.info("Se obtuvo correctamente el usuario.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener usuario : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN OBTENER CLIENTE");
        return usuario;
    }

    @Override
    public Usuario obtener(String username) {
        LOG.info("INICIO OBTENER USUARIO");

        entityManager = getEntityManager();
        Usuario usuario = new Usuario();

        try {
            Query query = entityManager.createQuery("SELECT U FROM Usuario U WHERE U.username = :username");
            query.setParameter("username", username);
            usuario = (Usuario) query.getSingleResult();
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener usuario: " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN OBTENER USUARIO");
        return usuario;
    }

    @Override
    public Boolean actualizar(Usuario objeto) {
        LOG.info("INICIO ACTUALIZACION DE USUARIO");

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
            LOG.info("Se actualizó correctamente el usuario.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al actualizar usuario : " + e);
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        LOG.info("FIN DE ACTUALIZACION DE USUARIO");
        return resultado;
    }

    @Override
    public Boolean eliminar(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> consultar(String parametro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
