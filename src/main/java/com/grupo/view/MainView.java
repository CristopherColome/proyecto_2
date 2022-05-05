/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.entity.Usuario;
import com.grupo.util.Constantes.Evento;
import com.grupo.util.Constantes.Menu;
import com.grupo.util.Constantes.Rol;
import static com.grupo.util.Constantes.Rol.ADMINISTRADOR;
import static com.grupo.util.Constantes.Rol.ALMACEN;
import static com.grupo.util.Constantes.Rol.VENDEDOR;
import static com.grupo.util.Constantes.Menu.PRODUCTO;
import static com.grupo.util.Constantes.Menu.VENTA;
import static com.grupo.util.Constantes.Menu.CLIENTE;
import static com.grupo.util.Constantes.Menu.USUARIO;
import static com.grupo.util.Constantes.Menu.SALIR;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;

/**
 *
 * @author ccolome
 */
public class MainView extends JFrame {

    private LoginView loginView;

    private Usuario usuario;

    private JPanel principalPanel;
    private JPanel componentePanel;
    private JToolBar principalToolBar;
    private JButton productoButton;
    private JButton ventaButton;
    private JButton clienteButton;
    private JButton usuarioButton;
    private JButton salirButton;

    public MainView() {

        //<editor-fold defaultstate="collapsed" desc="PRUEBAS DE CRUD DE ENTIDADES">
        //        UsuarioController uc = new UsuarioController(getEntityManager());
//        for (Usuario usuario : uc.listar()) {
//            System.out.println(usuario.toString());
//        }
//        ClienteController cc = new ClienteController();
//        Cliente c = new Cliente();
//        c.setTipo("f");
//        c.setTipoPersona("NATURAL");
//        c.setNombre("f");
//        c.setApellidos("f1");
//        c.setTipoDocumento("DNI");
//        c.setNumeroDocumento("99999999");
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
//        v.setCorrelativo("2022-000111");
//        vc.registrar(v);
//        Venta vo = vc.obtener(1);
//        System.out.println(vo);
//        for (Object object : vc.listar()) {
//            System.out.println(object.toString());
//        }
//</editor-fold>
//        initController();
//        initComponents();

    }

    private void initController() {
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        loginView = new LoginView();
        principalPanel = new JPanel();
        principalToolBar = new JToolBar();
        productoButton = new JButton();
        ventaButton = new JButton();
        clienteButton = new JButton();
        usuarioButton = new javax.swing.JButton();
        salirButton = new javax.swing.JButton();
        componentePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        principalPanel.setPreferredSize(new java.awt.Dimension(720, 480));

        principalToolBar.setFloatable(false);
        principalToolBar.setOrientation(javax.swing.SwingConstants.VERTICAL);
        principalToolBar.setRollover(true);
        principalToolBar.setToolTipText("");

        productoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        productoButton.setText("Productos");
        productoButton.setFocusable(false);
        productoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        productoButton.setMaximumSize(new java.awt.Dimension(90, 95));
        productoButton.setMinimumSize(new java.awt.Dimension(90, 95));
        productoButton.setPreferredSize(new java.awt.Dimension(90, 95));
        productoButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventaButton.addActionListener((ActionEvent evt) -> {
            menuButtonActionPerformed(evt, PRODUCTO);
        });

        ventaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir-al-carrito.png"))); // NOI18N
        ventaButton.setText("Ventas");
        ventaButton.setFocusable(false);
        ventaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventaButton.setMaximumSize(new java.awt.Dimension(90, 95));
        ventaButton.setMinimumSize(new java.awt.Dimension(90, 95));
        ventaButton.setPreferredSize(new java.awt.Dimension(90, 95));
        ventaButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventaButton.addActionListener((ActionEvent evt) -> {
            menuButtonActionPerformed(evt, VENTA);
        });

        clienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cliente.png"))); // NOI18N
        clienteButton.setText("Clientes");
        clienteButton.setFocusable(false);
        clienteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        clienteButton.setMaximumSize(new java.awt.Dimension(90, 95));
        clienteButton.setMinimumSize(new java.awt.Dimension(90, 95));
        clienteButton.setPreferredSize(new java.awt.Dimension(90, 95));
        clienteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        clienteButton.addActionListener((ActionEvent evt) -> {
            menuButtonActionPerformed(evt, CLIENTE);
        });

        usuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vendedora.png"))); // NOI18N
        usuarioButton.setText("Usuarios");
        usuarioButton.setFocusable(false);
        usuarioButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        usuarioButton.setMaximumSize(new java.awt.Dimension(90, 95));
        usuarioButton.setMinimumSize(new java.awt.Dimension(90, 95));
        usuarioButton.setPreferredSize(new java.awt.Dimension(90, 95));
        usuarioButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        usuarioButton.addActionListener((ActionEvent evt) -> {
            menuButtonActionPerformed(evt, USUARIO);
        });

        salirButton.setText("Salir");
        salirButton.setFocusable(false);
        salirButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        salirButton.setMaximumSize(new java.awt.Dimension(90, 20));
        salirButton.setMinimumSize(new java.awt.Dimension(90, 20));
        salirButton.setPreferredSize(new java.awt.Dimension(90, 30));
        salirButton.setVerticalTextPosition(SwingConstants.BOTTOM);
        salirButton.addActionListener((ActionEvent evt) -> {
            menuButtonActionPerformed(evt, SALIR);
        });

        javax.swing.GroupLayout componentePanelLayout = new javax.swing.GroupLayout(componentePanel);
        componentePanel.setLayout(componentePanelLayout);
        componentePanelLayout.setHorizontalGroup(
                componentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 632, Short.MAX_VALUE)
        );
        componentePanelLayout.setVerticalGroup(
                componentePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout principalPanelLayout = new javax.swing.GroupLayout(principalPanel);
        principalPanel.setLayout(principalPanelLayout);
        principalPanelLayout.setHorizontalGroup(
                principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(principalPanelLayout.createSequentialGroup()
                                .addComponent(principalToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(componentePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        principalPanelLayout.setVerticalGroup(
                principalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                        .addGroup(principalPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(componentePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        principalPanel.setVisible(false);
        loginView.addPropertyChangeListener((PropertyChangeEvent event) -> {
            loginPropertyChangeEvent(event);
        });
        add(loginView);
        pack();
    }

    private void initMenuComponents() {

        setMenuPermitido();

        principalPanel.setVisible(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(principalPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

    }

    private void setMenuPermitido() {

        try {
            System.out.println(usuario.getRol());
            Rol usuarioRol = Rol.valueOf(usuario.getRol());

            switch (usuarioRol) {
                case ADMINISTRADOR:
                    principalToolBar.add(productoButton);
                    principalToolBar.add(new JToolBar.Separator());
                    principalToolBar.add(ventaButton);
                    principalToolBar.add(new JToolBar.Separator());
                    principalToolBar.add(clienteButton);
                    principalToolBar.add(new JToolBar.Separator());
                    principalToolBar.add(usuarioButton);
                    principalToolBar.add(new Box.Filler(
                            new Dimension(0, 0),
                            new Dimension(0, 0),
                            new Dimension(0, 32767)
                    ));
                    principalToolBar.add(salirButton);
                    break;
                case ALMACEN:
                    principalToolBar.add(productoButton);
                    principalToolBar.add(new Box.Filler(
                            new Dimension(0, 0),
                            new Dimension(0, 0),
                            new Dimension(0, 32767)
                    ));
                    principalToolBar.add(salirButton);
                    break;
                case VENDEDOR:
                    principalToolBar.add(ventaButton);
                    principalToolBar.add(new JToolBar.Separator());
                    principalToolBar.add(clienteButton);
                    principalToolBar.add(new Box.Filler(
                            new Dimension(0, 0),
                            new Dimension(0, 0),
                            new Dimension(0, 32767)
                    ));
                    principalToolBar.add(salirButton);
                    break;
                default:
                    throw new Exception("Rol no encontrado");
            }
        } catch (Exception e) {
            System.out.println("Error al designar menu: " + e.getMessage());
        }

    }

    private void loginPropertyChangeEvent(PropertyChangeEvent event) {
        if (event.getPropertyName().equals(Evento.USUARIO_LOGUEADO.name())) {
            usuario = (Usuario) event.getNewValue();
            System.out.println("Usuraio logueado " + usuario.getUsername());
            loginView.setVisible(false);
            initMenuComponents();
        }
    }

    private void menuButtonActionPerformed(ActionEvent event, Menu vista) {
        try {
            switch (vista) {
                case PRODUCTO:
                    break;
                case VENTA:
                    break;
                case CLIENTE:
                    break;
                case USUARIO:
                    break;
                case SALIR:
                    break;
                default:
                    throw new Exception("vista no encontrado");
            }
        } catch (Exception e) {
            System.out.println("Error al designar menu: " + e.getMessage());
        }
    }

}
