/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.controller;

import com.grupo.entity.Producto;
import com.grupo.entity.Venta;
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

    private final EntityManager entityManager;

    public VentaController(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Boolean registrar(Venta objeto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Venta> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Venta obtener(Integer id) {
        LOG.info("INICIO OBTENER VENTA");
        Venta venta = new Venta();
        try {

            Query query = entityManager.createQuery(
                    "SELECT V FROM Venta V LEFT JOIN V.productoHistorial PH ON PH.idVenta = V.id WHERE V.id = :id",
                    Venta.class
            );
            query.setParameter("id", id);
            venta = (Venta) query.getSingleResult();
            LOG.info("Se obtuvo correctamente la venta.");
        } catch (Exception e) {
            LOG.error("Ocurrió un error al obtener la venta : " + e);
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
}
