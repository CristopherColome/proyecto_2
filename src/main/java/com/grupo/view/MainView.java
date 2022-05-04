/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.UsuarioController;
import com.grupo.entity.Usuario;
import javax.persistence.EntityManager;
import javax.swing.GroupLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author ccolome
 */
public class MainView extends JFrame {

    private UsuarioController usuarioController;

    public MainView() {
        //        UsuarioController uc = new UsuarioController(getEntityManager());
//        for (Usuario usuario : uc.listar()) {
//            System.out.println(usuario.toString());
//        }
//        ClienteController cc = new ClienteController();

//        Cliente c = new Cliente();
//        c.setTipo("C");
//        c.setNombre("d");
//        c.setApellidos("d1");
//        c.setNumeroDocumento("55555555");
//        c.setCreador("admin");
//        System.out.println(c.toString());
//        System.out.println("CLIENTE");
//        cc.registrar(c);
//        Cliente c = cc.obtener(7);
//        System.out.println(c.toString());
//        Thread.sleep(1000);
//        c.setApellidos("d_1");
//        c.setModificador("admin");
//        c.setFechaModificacion(new Date());
//        cc.actualizar(c);
//        Thread.sleep(2000);
//  
//        System.out.println("CLIENTE");
//        for (Object object : cc.listar()) {
//            System.out.println(object.toString());
//        }
//      UsuarioController uc = new UsuarioController();
//        PasswordService passwordService = new PasswordMatcher().getPasswordService();
//
//        Usuario u = new Usuario();
//        u.setTipo("U");
//        u.setNombre("ven");
//        u.setApellidos("ta");
//        u.setNumeroDocumento("88888888");
//        u.setCreador("admin");
//        u.setUsername("venta1");
//        u.setPassword(passwordService.encryptPassword("venta1"));
//        u.setRol("VEDEDOR");
//        u.setActivo(Boolean.TRUE);
//        uc.registrar(u);
//        System.out.println(u.toString());
//        Usuario u = uc.obtener(9);
//        u.setRol("VENDEDOR");
//        u.setModificador("admin");
//        u.setFechaModificacion(new Date());
//        uc.actualizar(u);
//        System.out.println("USUARIO");
//        for (Object object : uc.listar()) {
//            System.out.println(object.toString());
//        }
//        ProductoController pc = new ProductoController();
//        Producto p = new Producto();
//        p.setNombre("ARROZ RENDIDOR");
//        p.setMarca("FARAON");
//        p.setLinea("ABARROTES");
//        p.setPrecioUnitario(3.60);
//        p.setStock(100.00);
//        p.setCreador("admin");
//        pc.registrar(p);
//         Producto p = pc.obtener(1);
//         System.out.println(p.toString());
//        p.setNombre("ARROZ ROMPE OLLA");
//        p.setModificador("admin");
//        p.setFechaModificacion(new Date());
//        pc.actualizar(p);
//        System.out.println(p.toString());
//        for (Object object : pc.listar()) {
//            System.out.println(object.toString());
//        }
//        ProductoHistorialController phc = new ProductoHistorialController();
//
//        ProductoHistorial ph = new ProductoHistorial();
//        ph.setIdProducto(1);
//        ph.setCantidad(10.00);
//        ph.setPrecioUnitario(3.60);
//        ph.setOperacion("SALIDA");
//        ph.setCreador("admin");
//
//        phc.registrar(ph);
//        for (Object object : phc.listar()) {
//            System.out.println(object.toString());
//        }
//        VentaController vc = new VentaController();
//        Venta v = new Venta();
//        v.setIdCliente(7);
//        v.setSerie("2022");
//        v.setImporteTotal(10.00 * 3.60);
//        v.setCreador("admin");
//        vc.registrar(v);
//        Venta vo = vc.obtener(1);
//        System.out.println(vo);
//        for (Object object : vc.listar()) {
//            System.out.println(object.toString());
//        }
        initController();
        initComponents();

    }

    private void initController() {
        this.usuarioController = new UsuarioController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        for (Usuario object : usuarioController.listar()) {
            System.out.println(object.toString());
        }

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }

}
