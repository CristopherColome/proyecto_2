/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.ClienteController;
import com.grupo.controller.ProductoController;
import com.grupo.controller.ProductoHistorialController;
import com.grupo.controller.VentaController;
import com.grupo.entity.Cliente;
import com.grupo.entity.Producto;
import com.grupo.entity.ProductoHistorial;
import com.grupo.entity.Usuario;
import com.grupo.entity.Venta;
import com.grupo.util.Constantes;
import com.grupo.util.Constantes.ComponentesTab;
import com.grupo.util.Constantes.ProductoOperacion;
import com.grupo.util.Constantes.VentaComprobante;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ccolome
 */
public class VentaView extends JTabbedPane {

    private VentaController ventaController;
    private ClienteController clienteController;
    private ProductoController productoController;
    private ProductoHistorialController productoHistorialController;

    private Usuario usuario;

    //CONSULTA
    private javax.swing.JLabel consultaBuscarLabel;
    private javax.swing.JTextField consultaBuscarTextField;
    private javax.swing.JPanel consultaPanel;
    private javax.swing.JButton nuevoVentaButton;
    private javax.swing.JScrollPane ventasTableScrollPane;
    private javax.swing.JTable ventasTable;
    private javax.swing.JButton detalleVerVentaButton;
    // REGISTRO
    private Integer selectedClienteList;
    private Integer selectedProductoList;
    private Integer selectedProductoTable;
    private List<Producto> ventaProductos;
    private List<ProductoHistorial> nuevoVentaProductos;
    private javax.swing.JLabel nuevoVentaLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton nuevoCancelarButton;
    private javax.swing.JComboBox<String> nuevoComprobanteComboBox;
    private javax.swing.JLabel nuevoComprobanteLabel;
    private javax.swing.JLabel nuevoIGVjLabel;
    private javax.swing.JButton nuevoProductojButton;
    private javax.swing.JButton nuevoProductoEliminarjButton;
    private javax.swing.JLabel nuevoProductojLabel;
    private javax.swing.JTable nuevoProductosTable;
    private javax.swing.JButton nuevoRegistrarButton;
    private javax.swing.JLabel nuevoSelecionCliLabel;
    private javax.swing.JTextField nuevoSelectCliTextField;
    private javax.swing.JList<Cliente> nuevoSelectClientejList;
    private javax.swing.JTextField nuevoSerieTextField;
    private javax.swing.JLabel nuevoSeriejLabel;
    private javax.swing.JLabel nuevoSubTotaljLabel;
    private javax.swing.JLabel nuevoTotaljLabel;
    private javax.swing.JLabel nuevoValidacionLabel;
    private javax.swing.JPanel registroPanel;
    //DIALOG VENTA PRODUCTO
    private JDialog nuevoVentaProductoDialog;
    private javax.swing.JScrollPane nuevoProductoListScroll;
    private javax.swing.JButton nuevoAgregarProdjButton;
    private javax.swing.JLabel nuevoCantidadJLabel;
    private javax.swing.JSpinner nuevoCantidadSpinner;
    private javax.swing.JList<Producto> nuevoProductojList;
    private javax.swing.JLabel nuevoSeleccionProdLabel;
    private javax.swing.JTextField nuevoSelectProductoTextField;
    private javax.swing.JPanel nuevoVentaProductoPanel;
    private javax.swing.JLabel nuevoVentaProductoValidaLabel;

    private javax.swing.JTable clienteVentaTable;
    private javax.swing.JLabel deatlleEmailLabel;
    private javax.swing.JTextField detalleApellidoTextField;
    private javax.swing.JLabel detalleClienteLabel;

    public VentaView() {
        initController();
        initComponents();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private void initController() {
        ventaController = new VentaController();
        clienteController = new ClienteController();
        productoController = new ProductoController();
        productoHistorialController = new ProductoHistorialController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        //CONSULTA
        consultaPanel = new javax.swing.JPanel();
        consultaBuscarLabel = new javax.swing.JLabel();
        consultaBuscarTextField = new javax.swing.JTextField();
        nuevoVentaButton = new javax.swing.JButton();
        ventasTableScrollPane = new javax.swing.JScrollPane();
        ventasTable = new javax.swing.JTable();
        detalleVerVentaButton = new javax.swing.JButton();
        //REGISTRO
        ventaProductos = new ArrayList<>();
        nuevoVentaProductos = new ArrayList<>();
        registroPanel = new javax.swing.JPanel();
        nuevoVentaLabel = new javax.swing.JLabel();
        nuevoSelecionCliLabel = new javax.swing.JLabel();
        nuevoRegistrarButton = new javax.swing.JButton();
        nuevoCancelarButton = new javax.swing.JButton();
        nuevoValidacionLabel = new javax.swing.JLabel();
        nuevoSelectCliTextField = new javax.swing.JTextField();
        nuevoSerieTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nuevoSelectClientejList = new javax.swing.JList<>();
        nuevoSeriejLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        nuevoProductosTable = new javax.swing.JTable();
        nuevoProductojLabel = new javax.swing.JLabel();
        nuevoSubTotaljLabel = new javax.swing.JLabel();
        nuevoTotaljLabel = new javax.swing.JLabel();
        nuevoIGVjLabel = new javax.swing.JLabel();
        nuevoComprobanteLabel = new javax.swing.JLabel();
        nuevoComprobanteComboBox = new javax.swing.JComboBox<>();
        nuevoProductojButton = new javax.swing.JButton();
        nuevoProductoEliminarjButton = new javax.swing.JButton();
        //DIALOG VENTA PRODUCTO
        nuevoVentaProductoPanel = new javax.swing.JPanel();
        nuevoSeleccionProdLabel = new javax.swing.JLabel();
        nuevoProductoListScroll = new javax.swing.JScrollPane();
        nuevoProductojList = new javax.swing.JList<>();
        nuevoCantidadSpinner = new javax.swing.JSpinner();
        nuevoCantidadJLabel = new javax.swing.JLabel();
        nuevoAgregarProdjButton = new javax.swing.JButton();
        nuevoSelectProductoTextField = new javax.swing.JTextField();
        nuevoVentaProductoValidaLabel = new javax.swing.JLabel();

        consultaBuscarLabel.setText("Buscar :");

        consultaBuscarTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                consultaBuscarTextFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        nuevoVentaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        nuevoVentaButton.setText("Nuevo");
        nuevoVentaButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoVentaButtonActionPerformed(evt);
        });

        ventasTable.setModel(new VentaTableModel());

        ventasTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ventasTable.setRowSelectionAllowed(true);

        ventasTableScrollPane.setViewportView(ventasTable);
        ventasTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
//                if (!detalleInProgress) {
//                    int row = clientesTable.getSelectedRow();
//
//                    if (selectedProductosTable != null && selectedProductosTable.equals(row)) {
//                        clientesTable.getSelectionModel().clearSelection();
//                        selectedProductosTable = null;
//                        detalleVerClienteButton.setVisible(false);
//                    } else {
//                        selectedProductosTable = row;
//                        detalleVerClienteButton.setText("Cliente N°: " + clientesTable.getValueAt(row, 0));
//                        detalleVerClienteButton.setVisible(true);
//                    }
//                }
            }
        });

        detalleVerVentaButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        detalleVerVentaButton.setText("Venta N°");
//        detalleVerVentaButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                detalleVerVentaButtonActionPerformed(evt);
//            }
//        });
        detalleVerVentaButton.setVisible(false);

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ventasTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addComponent(consultaBuscarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleVerVentaButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoVentaButton)))
                                .addContainerGap())
        );
        consultaPanelLayout.setVerticalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(consultaBuscarLabel)))
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoVentaButton)
                                                        .addComponent(detalleVerVentaButton))))
                                .addGap(18, 18, 18)
                                .addComponent(ventasTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.VENTA_CONSULTA.getTitulo(), consultaPanel);

        nuevoVentaLabel.setText("Nueva venta");

        nuevoSelecionCliLabel.setText("<html><body>Seleccione<br>cliente:</body></html>");

        nuevoRegistrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        nuevoRegistrarButton.setText("Registrar");
        nuevoRegistrarButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoRegistrarButtonActionPerformed(evt);
        });

        nuevoCancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        nuevoCancelarButton.setText("Cancelar");
        nuevoCancelarButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoCancelarButtonActionPerformed(evt);
        });

        nuevoValidacionLabel.setBackground(new java.awt.Color(255, 0, 0));
        nuevoValidacionLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        nuevoValidacionLabel.setForeground(new java.awt.Color(255, 0, 0));
        nuevoValidacionLabel.setVisible(false);

        nuevoSelectCliTextField.setText("Buscar cliente");
        nuevoSelectCliTextField.addFocusListener(new BuscarTexFieldFocusAdapter());
        nuevoSelectCliTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                clienteBuscarTextFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        nuevoSelectClientejList.setModel(new ClienteListModel());

        nuevoSelectClientejList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nuevoSelectClientejList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = nuevoSelectClientejList.getSelectedIndex();

                if (selectedClienteList != null && selectedClienteList.equals(row)) {
                    nuevoSelectClientejList.getSelectionModel().clearSelection();
                    selectedClienteList = null;
                } else {
                    selectedClienteList = row;
                }
            }
        });

        jScrollPane1.setViewportView(nuevoSelectClientejList);

        nuevoSeriejLabel.setText("Serie:");

        nuevoProductosTable.setModel(new VentaProductoTableModel());

        nuevoProductosTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = nuevoProductosTable.getSelectedRow();

                if (selectedProductoTable != null && selectedProductoTable.equals(row)) {
                    nuevoProductosTable.getSelectionModel().clearSelection();
                    selectedProductoTable = null;
                    nuevoProductoEliminarjButton.setVisible(false);

                } else {
                    selectedProductoTable = row;
                    nuevoProductoEliminarjButton.setVisible(true);
                }
            }
        });

        jScrollPane5.setViewportView(nuevoProductosTable);

        nuevoProductojLabel.setText("Productos:");

        nuevoSubTotaljLabel.setText("SubTotal: ");

        nuevoTotaljLabel.setText("Total: ");

        nuevoIGVjLabel.setText("I:G.V(18%): ");

        nuevoComprobanteLabel.setText("Comprobante:");

        nuevoComprobanteComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Constantes.getNnombres(Constantes.VentaComprobante.class)
        ));

        nuevoProductojButton.setText("Agregar");
        nuevoProductojButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoProductojButtonActionPerformed(evt);
        });

        nuevoProductoEliminarjButton.setText("Eliminar");
        nuevoProductoEliminarjButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoProductoEliminarjButtonActionPerformed(evt);
        });
        nuevoProductoEliminarjButton.setVisible(false);

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nuevoSelecionCliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoSeriejLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoSerieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(nuevoComprobanteLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(nuevoComprobanteComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(nuevoSelectCliTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                                                        .addComponent(jScrollPane1)))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoVentaLabel)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(nuevoValidacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(nuevoProductojLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(nuevoProductoEliminarjButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(nuevoProductojButton))
                                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                                .addGap(22, 22, 22)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nuevoSubTotaljLabel)
                                                        .addComponent(nuevoIGVjLabel)
                                                        .addComponent(nuevoTotaljLabel)
                                                        .addComponent(nuevoRegistrarButton, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                                                        .addComponent(nuevoCancelarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoVentaLabel)
                                        .addComponent(nuevoValidacionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nuevoSeriejLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(nuevoSerieTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(nuevoComprobanteLabel)
                                                .addComponent(nuevoComprobanteComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 22, Short.MAX_VALUE)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoSelectCliTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(nuevoSelecionCliLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nuevoProductojLabel)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoProductojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoProductoEliminarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoSubTotaljLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoIGVjLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoTotaljLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nuevoRegistrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoCancelarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        nuevoSeleccionProdLabel.setText("<html><body>Seleccione<br>producto:</body></html>");

        nuevoProductojList.setModel(new ProductoListModel());

        nuevoProductojList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        nuevoProductoListScroll.setViewportView(nuevoProductojList);

        nuevoProductojList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = nuevoProductojList.getSelectedIndex();

                if (selectedProductoList != null && selectedProductoList.equals(row)) {
                    nuevoProductojList.getSelectionModel().clearSelection();
                    selectedProductoList = null;
                } else {
                    selectedProductoList = row;
                }
            }
        });
        nuevoCantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        nuevoCantidadJLabel.setText("Cantidad:");

        nuevoSelectProductoTextField.setText("Buscar producto");
        nuevoSelectProductoTextField.addFocusListener(new BuscarProductoTexFieldFocusAdapter());
        nuevoSelectProductoTextField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                productoBuscarTextFieldActionPerformed();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        nuevoAgregarProdjButton.setText("Agregar");
        nuevoAgregarProdjButton.addActionListener((java.awt.event.ActionEvent evt1) -> {
            nuevoAgregarProdjButtonActionPerformed(evt1);
        });

        nuevoVentaProductoValidaLabel.setBackground(new java.awt.Color(255, 0, 0));
        nuevoVentaProductoValidaLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        nuevoVentaProductoValidaLabel.setForeground(new java.awt.Color(255, 0, 0));
        nuevoVentaProductoValidaLabel.setVisible(false);
        // nuevoVentaProductoValidaLabel.setText("EL campo {} es obligatorio.");

        javax.swing.GroupLayout nuevoVentaProductoPanelLayout = new javax.swing.GroupLayout(nuevoVentaProductoPanel);
        nuevoVentaProductoPanel.setLayout(nuevoVentaProductoPanelLayout);
        nuevoVentaProductoPanelLayout.setHorizontalGroup(
                nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoCantidadJLabel)
                                                                .addGap(31, 31, 31))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, nuevoVentaProductoPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoSeleccionProdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nuevoProductoListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 324, Short.MAX_VALUE)
                                                        .addComponent(nuevoSelectProductoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                                                        .addComponent(nuevoCantidadSpinner)))
                                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(nuevoAgregarProdjButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoVentaProductoValidaLabel)))
                                .addContainerGap(16, Short.MAX_VALUE))
        );
        nuevoVentaProductoPanelLayout.setVerticalGroup(
                nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(nuevoSeleccionProdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(nuevoVentaProductoPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoSelectProductoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, 0)
                                                .addComponent(nuevoProductoListScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoCantidadJLabel)
                                        .addComponent(nuevoCantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                                .addGroup(nuevoVentaProductoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoAgregarProdjButton)
                                        .addComponent(nuevoVentaProductoValidaLabel))
                                .addGap(15, 15, 15))
        );

    }

    private void removeTab(String tabTitle) {
        for (int i = 0; i < getTabCount(); i++) {
            if (getTitleAt(i).equals(tabTitle)) {
                remove(i);
                break;
            }
        }
    }

    private void consultaBuscarTextFieldActionPerformed() {
        if (consultaBuscarTextField.getText().length() > 0) {
            List<Venta> ventas = ventaController.consultar(consultaBuscarTextField.getText());

            if (ventas.size() > 0) {
                ventasTable.setModel(new VentaTableModel(ventas));
            }
        }
    }

    private void clienteBuscarTextFieldActionPerformed() {
        if (nuevoSelectCliTextField.getText().length() > 0) {
            List<Cliente> clientes = clienteController.consultar(nuevoSelectCliTextField.getText());

            if (clientes.size() > 0) {
                nuevoSelectClientejList.setModel(new ClienteListModel(clientes));
            }
        }
    }

    private void nuevoVentaButtonActionPerformed(ActionEvent evt) {
        nuevoVentaButton.setEnabled(false);
        addTab(Constantes.ComponentesTab.VENTA_REGISTRO.getTitulo(), registroPanel);
        setSelectedComponent(registroPanel);
    }

    private void nuevoCancelarButtonActionPerformed(ActionEvent evt) {
        String[] opciones = {"Sí", "No"};

        int cancelar = JOptionPane.showOptionDialog(
                this,
                "¿Esta seguro de cancelar el registro?",
                ComponentesTab.VENTA_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (cancelar == JOptionPane.YES_OPTION) {
            nuevoRegistroFinalizar();
        }
    }

    private void nuevoRegistrarButtonActionPerformed(ActionEvent evt) {
        boolean registroValido = true;

        if (nuevoSerieTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo serie es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoSelectClientejList.isSelectionEmpty()) {
            nuevoValidacionLabel.setText("Debe seleccionar un cliente.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoVentaProductos.isEmpty()) {
            nuevoValidacionLabel.setText("Debe agregar productos para la venta.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }

        if (registroValido) {

            nuevoValidacionLabel.setText("");
            nuevoValidacionLabel.setVisible(false);

            String[] opciones = {"Sí", "No"};

            int actualizar = JOptionPane.showOptionDialog(
                    this,
                    "Se registrará una nueva venta",
                    ComponentesTab.VENTA_REGISTRO.getTitulo(),
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[1]);

            if (actualizar == JOptionPane.YES_OPTION) {

                ClienteListModel clm = (ClienteListModel) nuevoSelectClientejList.getModel();
                Cliente seleccionCliente = (Cliente) clm.getElementAt(nuevoSelectClientejList.getSelectedIndex());

                try {
                    // REGISTRAR VENTA
                    Venta nuevaVenta = new Venta();

                    nuevaVenta.setIdCliente(seleccionCliente.getIdPersona());
                    nuevaVenta.setSerie(nuevoSerieTextField.getText());
                    nuevaVenta.setCorrelativo(ventaController.obtenerCorrelativo());
                    nuevaVenta.setComprobante((String) nuevoComprobanteComboBox.getSelectedItem());

                    Double subTotal = nuevoVentaProductos.stream()
                            .reduce(0.0d, (partialSubTotalResult, prod) -> partialSubTotalResult + prod.getImporteTotal(), Double::sum);
                    Double igv = 18.00d * subTotal / 100;
                    Double importeTotal = subTotal + igv;

                    nuevaVenta.setImporteTotal(
                            Double.valueOf(new DecimalFormat("#.##").format(importeTotal))
                    );

                    nuevaVenta.setCreador(usuario.getUsername());
                    nuevaVenta.setFechaCreacion(new Date());

                    ventaController.registrar(nuevaVenta);

                    //REGISTRAR HISTORIAL DE PRODUCTO
                    for (ProductoHistorial nuevoVentaProducto : nuevoVentaProductos) {

                        nuevoVentaProducto.setIdVenta(nuevaVenta.getId());
                        nuevoVentaProducto.setCreador(usuario.getUsername());
                        nuevoVentaProducto.setFechaCreacion(new Date());

                        productoHistorialController.registrar(nuevoVentaProducto);

                        // ACTUALIZAR STOCK PRODUCTO
                        Producto productoActualizar = productoController.obtener(nuevoVentaProducto.getIdProducto());
                        productoActualizar.setStock(
                                productoActualizar.getStock() - nuevoVentaProducto.getCantidad()
                        );
                        productoActualizar.setModificador(usuario.getUsername());
                        productoActualizar.setFechaModificacion(new Date());

                        productoController.actualizar(productoActualizar);
                    }

                    nuevoRegistroFinalizar();
                } catch (Exception e) {
                    nuevoValidacionLabel.setText(e.getMessage());
                    nuevoValidacionLabel.setVisible(true);
                }
            }
        }
    }

    private void nuevoRegistroFinalizar() {

        nuevoSerieTextField.setText("");
        nuevoSelectCliTextField.setText("");
        nuevoComprobanteComboBox.setSelectedItem(VentaComprobante.BOLETA.name());
        nuevoSelectClientejList.setModel(new ClienteListModel());
        nuevoVentaProductos = new ArrayList();

        nuevoProductosTable.setModel(new VentaProductoTableModel());

        nuevoSubTotaljLabel.setText("SubTotal: ");
        nuevoIGVjLabel.setText("I:G.V(18%): ");
        nuevoTotaljLabel.setText("Total: ");

        selectedProductoTable = null;
        nuevoVentaButton.setEnabled(true);

        removeTab(ComponentesTab.VENTA_REGISTRO.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    private void nuevoProductojButtonActionPerformed(ActionEvent evt) {

        JOptionPane detalleProductoHOP = new JOptionPane();
        nuevoVentaProductoDialog = detalleProductoHOP.createDialog(ComponentesTab.PRODUCTO_DETALLE.getTitulo());
        nuevoVentaProductoDialog.setDefaultCloseOperation(JDialog.HIDE_ON_CLOSE);
        nuevoVentaProductoDialog.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                nuevoVentaProductoAgregarFinalizar();
            }
        });
        nuevoVentaProductoDialog.setSize(460, 213);
        nuevoVentaProductoDialog.setContentPane(nuevoVentaProductoPanel);
        nuevoVentaProductoDialog.setVisible(true);

    }

    private void productoBuscarTextFieldActionPerformed() {
        if (nuevoSelectProductoTextField.getText().length() > 0) {
            ventaProductos = productoController.consultar(nuevoSelectProductoTextField.getText());

            if (ventaProductos.size() > 0) {
                nuevoProductojList.setModel(new ProductoListModel(ventaProductos));
            }
        }
    }

    private void nuevoAgregarProdjButtonActionPerformed(ActionEvent evt1) {

        boolean registroValido = true;

        ProductoListModel plm = (ProductoListModel) nuevoProductojList.getModel();
        Producto seleccionProducto = (Producto) plm.getElementAt(nuevoProductojList.getSelectedIndex());

        if (nuevoProductojList.isSelectionEmpty()) {
            nuevoVentaProductoValidaLabel.setText("Debe seleccionar un producto.");
            nuevoVentaProductoValidaLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoCantidadSpinner.getValue().equals(0.0d)) {
            nuevoVentaProductoValidaLabel.setText("EL campo cantidad es obligatorio.");
            nuevoVentaProductoValidaLabel.setVisible(true);
            registroValido = false;
        }
        if ((Double) nuevoCantidadSpinner.getValue() > seleccionProducto.getStock()) {

            nuevoVentaProductoValidaLabel.setText("La cantidad seleccionada supera al stock.");
            nuevoVentaProductoValidaLabel.setVisible(true);
            registroValido = false;

        }

        if (nuevoVentaProductos.size() > 0) {
            Double cantidadProducto = nuevoVentaProductos.stream()
                    .filter(p -> p.getIdProducto().equals(seleccionProducto.getId()))
                    .map(p -> p.getCantidad())
                    .findFirst()
                    .orElse(Double.NaN);

            if (((Double) nuevoCantidadSpinner.getValue() + cantidadProducto) > seleccionProducto.getStock()) {
                nuevoVentaProductoValidaLabel.setText("La cantidad seleccionada supera al stock.");
                nuevoVentaProductoValidaLabel.setVisible(true);
                registroValido = false;
            }
        }

        if (registroValido) {
            nuevoVentaProductoValidaLabel.setText("");
            nuevoVentaProductoValidaLabel.setVisible(false);

            boolean existeProducto = nuevoVentaProductos.stream()
                    .filter(p -> p.getIdProducto().equals(seleccionProducto.getId()))
                    .count() > 0;

            if (!existeProducto) {
                ProductoHistorial nuevoVentaPH = new ProductoHistorial();

                nuevoVentaPH.setIdProducto(seleccionProducto.getId());
                nuevoVentaPH.setOperacion(ProductoOperacion.SALIDA.name());
                nuevoVentaPH.setDescripcion(seleccionProducto.getNombre());
                nuevoVentaPH.setPrecioUnitario(seleccionProducto.getPrecioUnitario());
                nuevoVentaPH.setCantidad((Double) nuevoCantidadSpinner.getValue());

                Double importeTotal = seleccionProducto.getPrecioUnitario() * (Double) nuevoCantidadSpinner.getValue();

                nuevoVentaPH.setImporteTotal(
                        Double.valueOf(new DecimalFormat("#.##").format(importeTotal))
                );
                nuevoVentaProductos.add(nuevoVentaPH);

            } else {
                nuevoVentaProductos.stream()
                        .filter(p -> p.getIdProducto().equals(seleccionProducto.getId()))
                        .forEach(p -> {

                            p.setCantidad(
                                    p.getCantidad() + (Double) nuevoCantidadSpinner.getValue()
                            );
                            p.setImporteTotal(
                                    p.getImporteTotal()
                                    + ((Double) seleccionProducto.getPrecioUnitario() * (Double) nuevoCantidadSpinner.getValue())
                            );
                        });

            }

            nuevoProductosTable.setModel(new VentaProductoTableModel(nuevoVentaProductos));

            nuevoSetPreciosImporte();
            nuevoVentaProductoAgregarFinalizar();

        }
    }

    private void nuevoSetPreciosImporte() {

        Double subTotal = nuevoVentaProductos.stream()
                .reduce(0.0d, (partialSubTotalResult, prod) -> partialSubTotalResult + prod.getImporteTotal(), Double::sum);

        Double igv = 18.00d * subTotal / 100;

        Double importeTotal = subTotal + igv;

        nuevoSubTotaljLabel.setText("SubTotal: " + new DecimalFormat("S/#.##").format(subTotal));

        nuevoIGVjLabel.setText("I:G.V(18%): " + new DecimalFormat("S/#.##").format(igv));

        nuevoTotaljLabel.setText("Total: " + new DecimalFormat("S/#.##").format(importeTotal));

    }

    private void nuevoProductoEliminarjButtonActionPerformed(ActionEvent evt1) {

        nuevoVentaProductos.remove(nuevoProductosTable.getSelectedRow());
        nuevoProductosTable.setModel(new VentaProductoTableModel(nuevoVentaProductos));
        nuevoSetPreciosImporte();

        nuevoProductoEliminarjButton.setVisible(false);
        selectedProductoTable = null;
    }

    private void nuevoVentaProductoAgregarFinalizar() {
        nuevoSelectProductoTextField.setText("");
        nuevoProductojList.setModel(new ProductoListModel());
        nuevoCantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        selectedProductoList = null;

        nuevoVentaProductoValidaLabel.setText("");
        nuevoVentaProductoValidaLabel.setVisible(false);
        nuevoVentaProductoDialog.setVisible(false);
    }

    private class BuscarTexFieldFocusAdapter extends FocusAdapter {

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (nuevoSelectCliTextField.getText().equals("Buscar cliente")) {
                nuevoSelectCliTextField.setText("");
                nuevoSelectCliTextField.setForeground(Color.GRAY);
            }
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (nuevoSelectCliTextField.getText().isEmpty()) {
                nuevoSelectCliTextField.setForeground(Color.GRAY);
                nuevoSelectCliTextField.setText("Buscar cliente");
            }
        }
    }

    private class BuscarProductoTexFieldFocusAdapter extends FocusAdapter {

        public void focusGained(java.awt.event.FocusEvent evt) {
            if (nuevoSelectProductoTextField.getText().equals("Buscar producto")) {
                nuevoSelectProductoTextField.setText("");
                nuevoSelectProductoTextField.setForeground(Color.GRAY);
            }
        }

        public void focusLost(java.awt.event.FocusEvent evt) {
            if (nuevoSelectProductoTextField.getText().isEmpty()) {
                nuevoSelectProductoTextField.setForeground(Color.GRAY);
                nuevoSelectProductoTextField.setText("Buscar producto");
            }
        }
    }

    private class VentaTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "ID", "ID Cliente", "Correlativo", "Serie", "Comprobante", "Creador", "Creacion"
                };

        private List<Venta> ventas;

        public VentaTableModel() {
            ventas = new ArrayList<Venta>();
        }

        public VentaTableModel(List<Venta> ventas) {
            this.ventas = ventas;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public int getRowCount() {
            return ventas.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            Venta venta = getVenta(row);

            switch (column) {
                case 0:
                    return venta.getId();
                case 1:
                    return venta.getIdCliente();
                case 2:
                    return venta.getCorrelativo();
                case 3:
                    return venta.getSerie();
                case 4:
                    return venta.getComprobante();
                case 5:
                    return venta.getCreador();
                case 6:
                    return formatDateToString(venta.getFechaCreacion());
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            Venta venta = getVenta(row);

            switch (column) {
                case 0:
                    venta.setId((Integer) value);
                    break;
                case 1:
                    venta.setIdCliente((Integer) value);
                    break;
                case 2:
                    venta.setCorrelativo((String) value);
                    break;
                case 3:
                    venta.setSerie((String) value);
                    break;
                case 4:
                    venta.setComprobante((String) value);
                    break;
                case 5:
                    venta.setCreador((String) value);
                    break;
                case 6:
                    venta.setFechaCreacion((Date) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public Venta getVenta(int row) {
            return ventas.get(row);
        }

        private String formatDateToString(Date value) {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return value != null ? parser.format(value) : "";
        }
    }

    private class VentaProductoTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Descripcion", "Cantidad", "Precio", "Importe"
                };

        private List<ProductoHistorial> ventaProductos;

        public VentaProductoTableModel() {
            ventaProductos = new ArrayList<ProductoHistorial>();
        }

        public VentaProductoTableModel(List<ProductoHistorial> ventaProductos) {
            this.ventaProductos = ventaProductos;
        }

        @Override
        public int getColumnCount() {
            return columnNames.length;
        }

        @Override
        public String getColumnName(int column) {
            return columnNames[column];
        }

        @Override
        public int getRowCount() {
            return ventaProductos.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            ProductoHistorial ventaProducto = getVentaProducto(row);

            switch (column) {
                case 0:
                    return ventaProducto.getDescripcion();
                case 1:
                    return ventaProducto.getCantidad();
                case 2:
                    return ventaProducto.getPrecioUnitario();
                case 3:
                    return ventaProducto.getImporteTotal();
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            ProductoHistorial ventaProducto = getVentaProducto(row);

            switch (column) {
                case 0:
                    ventaProducto.setDescripcion((String) value);
                    break;
                case 1:
                    ventaProducto.setCantidad((Double) value);
                    break;
                case 2:
                    ventaProducto.setPrecioUnitario((Double) value);
                    break;
                case 3:
                    ventaProducto.setImporteTotal((Double) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public ProductoHistorial getVentaProducto(int row) {
            return ventaProductos.get(row);
        }
    }

    private class ClienteListModel extends AbstractListModel {

        private List<Cliente> clientes;

        public ClienteListModel() {
            clientes = new ArrayList<Cliente>();
        }

        public ClienteListModel(List<Cliente> clientes) {
            this.clientes = clientes;
        }

        public int getSize() {
            return clientes.size();
        }

        public Cliente getElementAt(int i) {
            return clientes.get(i);
        }

    }

    private class ProductoListModel extends AbstractListModel {

        private List<Producto> producto;

        public ProductoListModel() {
            producto = new ArrayList<Producto>();
        }

        public ProductoListModel(List<Producto> producto) {
            this.producto = producto;
        }

        public int getSize() {
            return producto.size();
        }

        public Producto getElementAt(int i) {
            return producto.get(i);
        }
    }
}
