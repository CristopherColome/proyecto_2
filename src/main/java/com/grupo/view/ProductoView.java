/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.ProductoController;
import com.grupo.entity.Producto;
import com.grupo.util.Constantes.ComponentesTab;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ccolome
 */
public class ProductoView extends JTabbedPane {

    private ProductoController productoController;

    private JPanel consultaPanel;

    private JLabel consultaBuscarLabel;
    private JTextField consultaBuscarTextField;
    private JButton nuevoProductoButton;

    private JScrollPane tablaScrollPane;
    private JTable productosTable;

    // REGISTRO
    private JPanel registroPanel;
    private JLabel nuevoNombreLabel;
    private JLabel nuevoLineaLabel;
    private JLabel nuevoProductoLabel;
    private JLabel nuevoObservacionLabel;
    private JLabel nuevoPrecioULabel;
    private JLabel nuevoMarcaLabel;
    private JLabel nuevoStockLabel;
    private JTextField nuevoNombreTextField;
    private JTextField nuevoLineaTextField;
    private JTextField nuevoMarcaTextField;
    private JScrollPane observacionScrollPane1;
    private JSpinner nuevoPrecioUSpinner;
    private JSpinner nuevoStockSpinner;
    private JTextArea nuevoObservacionTextArea;

    private JButton nuevoCancelarButton;
    private JButton nuevoRegistrarButton;

    private javax.swing.JScrollPane jScrollPane1;

    // DETALLE   
    private javax.swing.JButton detalleAgregarPButton;
    private javax.swing.JButton detalleEditarButto;
    private javax.swing.JButton detalleSalirButton;
    private javax.swing.JTextField detalleLineaTextField;
    private javax.swing.JLabel detalleMarcaLabel;
    private javax.swing.JTextField detalleMarcaTextField;
    private javax.swing.JLabel detalleNombreLabel;
    private javax.swing.JTextField detalleNombreTextField;
    private javax.swing.JLabel detalleObservacionLabel;
    private javax.swing.JTextArea detalleObservacionTextArea;
    private javax.swing.JLabel detalleStockLabel;
    private javax.swing.JPanel detallePanel;
    private javax.swing.JLabel detallePrecioULabel;
    private javax.swing.JSpinner detallePrecioUSpinner;
    private javax.swing.JLabel detalleProductoHLabel;
    private javax.swing.JLabel detalleProductoLabel;
    private javax.swing.JSpinner detalleStockSpinner;
    private javax.swing.JButton detalleEditarButton;
    private javax.swing.JLabel detalleLineaLabel;
    private javax.swing.JTable productoHTable;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;

    public ProductoView() {
        initController();
        initComponents();
    }

    private void initController() {
        productoController = new ProductoController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        setPreferredSize(new Dimension(670, 360));
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaPanel = new JPanel();
        consultaBuscarLabel = new JLabel();
        consultaBuscarTextField = new JTextField();
        nuevoProductoButton = new JButton();
        tablaScrollPane = new JScrollPane();
        productosTable = new JTable();
        //REGISTRO
        registroPanel = new JPanel();
        nuevoNombreLabel = new JLabel();
        nuevoLineaLabel = new JLabel();
        nuevoProductoLabel = new JLabel();
        nuevoObservacionLabel = new JLabel();
        nuevoPrecioULabel = new JLabel();
        nuevoMarcaLabel = new JLabel();
        nuevoStockLabel = new JLabel();
        nuevoNombreTextField = new JTextField();
        nuevoLineaTextField = new JTextField();
        nuevoMarcaTextField = new JTextField();
        nuevoPrecioUSpinner = new JSpinner();
        nuevoStockSpinner = new JSpinner();
        nuevoCancelarButton = new JButton();
        nuevoRegistrarButton = new JButton();
        observacionScrollPane1 = new JScrollPane();
        nuevoObservacionTextArea = new JTextArea();
        //DETALLE

        detallePanel = new javax.swing.JPanel();
        detalleProductoLabel = new javax.swing.JLabel();
        detalleNombreLabel = new javax.swing.JLabel();
        detalleNombreTextField = new javax.swing.JTextField();
        detalleLineaTextField = new javax.swing.JTextField();
        detalleStockSpinner = new javax.swing.JSpinner();
        detalleMarcaTextField = new javax.swing.JTextField();
        detalleMarcaLabel = new javax.swing.JLabel();
        detallePrecioULabel = new javax.swing.JLabel();
        detallePrecioUSpinner = new javax.swing.JSpinner();
        detalleObservacionLabel = new javax.swing.JLabel();
        detalleLineaLabel = new javax.swing.JLabel();
        detalleStockLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        productoHTable = new javax.swing.JTable();
        detalleProductoHLabel = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        detalleObservacionTextArea = new javax.swing.JTextArea();
        detalleAgregarPButton = new javax.swing.JButton();
        detalleEditarButton = new javax.swing.JButton();
        detalleSalirButton = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();

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

        nuevoProductoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        nuevoProductoButton.setText("Nuevo");
        nuevoProductoButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoProductoButtonActionPerformed(evt);
        });

        productosTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Descripcion", "Marca", "Linea", "Precio", "Stock", "Creación", "Modificación"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tablaScrollPane.setViewportView(productosTable);
        if (productosTable.getColumnModel().getColumnCount() > 0) {
            productosTable.getColumnModel().getColumn(0).setMinWidth(50);
            productosTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            productosTable.getColumnModel().getColumn(0).setMaxWidth(50);
            productosTable.getColumnModel().getColumn(4).setMinWidth(50);
            productosTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            productosTable.getColumnModel().getColumn(4).setMaxWidth(50);
            productosTable.getColumnModel().getColumn(7).setHeaderValue("Modificación");
        }

        //REGISTRO
        nuevoNombreLabel.setText("Nombre:");
        nuevoProductoLabel.setText("Nuevo producto");

        nuevoNombreLabel.setText("Nombre:");

        nuevoMarcaLabel.setText("Marca:");

        nuevoLineaLabel.setText("Linea:");

        nuevoStockLabel.setText("Stock:");

        nuevoPrecioULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoPrecioULabel.setText("<html><body>Precio<br>unitario:</body></html>");

//        nuevoObservacionTextArea.setColumns(20);
//        nuevoObservacionTextArea.setRows(5);
//        observacionScrollPane1.setViewportView(nuevoObservacionTextArea);
        nuevoObservacionTextArea.setColumns(20);
        nuevoObservacionTextArea.setRows(5);
        jScrollPane1.setViewportView(nuevoObservacionTextArea);

        nuevoObservacionLabel.setText("Observaciones:");

        nuevoRegistrarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        nuevoRegistrarButton.setText("Registrar");
        nuevoRegistrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //nuevoRegistrarButtonActionPerformed(evt);
            }
        });

        nuevoCancelarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boton-x.png"))); // NOI18N
        nuevoCancelarButton.setText("Cancelar");
        nuevoCancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //nuevoCancelarButtonActionPerformed(evt);
            }
        });

        //DETALLE
        detalleProductoLabel.setText(" Detalle producto : N° ");

        detalleNombreLabel.setText("Nombre:");

        detalleMarcaLabel.setText("Marca:");

        detallePrecioULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detallePrecioULabel.setText("<html><body>Precio<br>unitario:</body></html>");

        detalleObservacionLabel.setText("Observaciones:");

        detalleLineaLabel.setText("Linea:");

        detalleStockLabel.setText("Stock:");

        productoHTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Operacion", "Cantidad", "Precio", "Creador", "Creación"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        jScrollPane4.setViewportView(productoHTable);

        detalleProductoHLabel.setText("Historial de operaciones:");

        detalleObservacionTextArea.setColumns(20);
        detalleObservacionTextArea.setRows(5);
        jScrollPane5.setViewportView(detalleObservacionTextArea);

        detalleAgregarPButton.setText("Agregar");
        detalleAgregarPButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            //detalleAgregarPButtonActionPerformed(evt);
        });

        detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        detalleEditarButton.setToolTipText("Editar");
        detalleEditarButton.setMaximumSize(new java.awt.Dimension(55, 40));
        detalleEditarButton.setMinimumSize(new java.awt.Dimension(55, 40));
        detalleEditarButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            // detalleEditarButtonActionPerformed(evt);
        });

        detalleSalirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        detalleSalirButton.setToolTipText("Salir");
        detalleSalirButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            // detalleSalirButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tablaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addComponent(consultaBuscarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(nuevoProductoButton)))
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
                                                .addComponent(nuevoProductoButton)))
                                .addGap(18, 18, 18)
                                .addComponent(tablaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.PRODUCTO_CONSULTA.getTitulo(), consultaPanel);

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoNombreLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoLineaLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoLineaTextField))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nuevoProductoLabel)
                                                        .addComponent(nuevoObservacionLabel))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registroPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane1))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoPrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(nuevoPrecioUSpinner))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoMarcaLabel)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(nuevoMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoStockLabel)
                                                .addGap(18, 18, 18)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nuevoStockSpinner)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoCancelarButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(nuevoRegistrarButton)))))
                                .addContainerGap())
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(nuevoProductoLabel)
                                .addGap(32, 32, 32)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoNombreLabel)
                                        .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoLineaLabel)
                                        .addComponent(nuevoLineaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoMarcaLabel)
                                        .addComponent(nuevoMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoStockLabel)
                                        .addComponent(nuevoStockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoPrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoPrecioUSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nuevoObservacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(nuevoCancelarButton)
                                                .addComponent(nuevoRegistrarButton))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.PRODUCTO_REGISTRO.getTitulo(), registroPanel);

        javax.swing.GroupLayout detallePanelLayout = new javax.swing.GroupLayout(detallePanel);
        detallePanel.setLayout(detallePanelLayout);
        detallePanelLayout.setHorizontalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleProductoLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleNombreLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleLineaLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleLineaTextField))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detallePrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(detallePrecioUSpinner))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleMarcaLabel)
                                                                .addGap(30, 30, 30)
                                                                .addComponent(detalleMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleStockLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleStockSpinner))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleObservacionLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleProductoHLabel)
                                                                .addGap(88, 88, 88)
                                                                .addComponent(detalleAgregarPButton))
                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        detallePanelLayout.setVerticalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(detalleProductoLabel)
                                        .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleNombreLabel)
                                        .addComponent(detalleNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleLineaLabel)
                                        .addComponent(detalleLineaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleMarcaLabel)
                                        .addComponent(detalleMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleStockLabel)
                                        .addComponent(detalleStockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detallePrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detallePrecioUSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleObservacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleProductoHLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleAgregarPButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addContainerGap())
        );

        addTab(ComponentesTab.PRODUCTO_DETALLE.getTitulo(), detallePanel);

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
        if (consultaBuscarTextField.getText().length() > 1) {
            List<Producto> productos = productoController.consultar(consultaBuscarTextField.getText());

            if (productos.size() > 0) {
                productosTable.setModel(new ProductoTableModel(productos));
            }

        }
    }

    private void nuevoProductoButtonActionPerformed(ActionEvent evt) {
    }

    private class ProductoTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Id", "Nombre", "Marca", "Linea", "Precio", "Stock", "Creación", "Modificación"
                };

        private List<Producto> productos;

        public ProductoTableModel() {
            productos = new ArrayList<Producto>();
        }

        public ProductoTableModel(List<Producto> productos) {
            this.productos = productos;
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
            return productos.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            Producto producto = getProducto(row);

            switch (column) {
                case 0:
                    return producto.getId();
                case 1:
                    return producto.getNombre();
                case 2:
                    return producto.getMarca();
                case 3:
                    return producto.getLinea();
                case 4:
                    return producto.getPrecioUnitario();
                case 5:
                    return producto.getStock();
                case 6:
                    return formatDateToString(producto.getFechaCreacion());
                case 7:
                    return formatDateToString(producto.getFechaCreacion());
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            Producto producto = getProducto(row);

            switch (column) {
                case 0:
                    producto.setId((Integer) value);
                    break;
                case 1:
                    producto.setNombre((String) value);
                    break;
                case 2:
                    producto.setMarca((String) value);
                    break;
                case 3:
                    producto.setLinea((String) value);
                    break;
                case 4:
                    producto.setPrecioUnitario((Double) value);
                    break;
                case 5:
                    producto.setStock((Double) value);
                    break;
                case 6:
                    producto.setFechaCreacion((Date) value);
                    break;
                case 7:
                    producto.setFechaModificacion((Date) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public Producto getProducto(int row) {
            return productos.get(row);
        }

        private String formatDateToString(Date value) {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return parser.format(value);
        }

    }
}
