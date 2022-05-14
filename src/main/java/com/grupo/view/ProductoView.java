/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.ProductoController;
import com.grupo.controller.ProductoHistorialController;
import com.grupo.entity.Producto;
import com.grupo.entity.ProductoHistorial;
import com.grupo.entity.Usuario;
import com.grupo.util.Constantes;
import com.grupo.util.Constantes.ComponentesTab;
import com.grupo.util.Constantes.ProductoOperacion;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSpinner.DefaultEditor;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ccolome
 */
public class ProductoView extends JTabbedPane {

    private ProductoController productoController;
    private ProductoHistorialController productoHistorialController;

    private Usuario usuario;

    private JPanel consultaPanel;

    private JLabel consultaBuscarLabel;
    private JTextField consultaBuscarTextField;
    private JButton nuevoProductoButton;
    private JButton detalleVerProductoButton;

    private JScrollPane productoTablaScrollPane;
    private JTable productosTable;
    private Integer selectedProductosTable;

    // REGISTRO
    private JPanel registroPanel;
    private JLabel nuevoNombreLabel;
    private JLabel nuevoLineaLabel;
    private JLabel nuevoProductoLabel;
    private JLabel nuevoValidacionLabel;
    private JLabel nuevoObservacionLabel;
    private JLabel nuevoPrecioULabel;
    private JLabel nuevoMarcaLabel;
    private JLabel nuevoStockLabel;
    private JTextField nuevoNombreTextField;
    private JTextField nuevoLineaTextField;
    private JTextField nuevoMarcaTextField;
    private JScrollPane nuevoObservacionScrollPane;
    private JSpinner nuevoPrecioUSpinner;
    private JSpinner nuevoStockSpinner;
    private JTextArea nuevoObservacionTextArea;

    private JButton nuevoCancelarButton;
    private JButton nuevoRegistrarButton;

    // DETALLE
    private Producto detalleProducto;
    private Boolean detalleInProgress = false;
    private Boolean detalleEditarInProgress = false;
    private javax.swing.JButton detalleAgregarPButton;
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
    private javax.swing.JScrollPane detalleProductoHTablaScrollPane;
    private javax.swing.JLabel detalleValidacionLabel;
    private javax.swing.JTable productoHTable;
    private javax.swing.JScrollPane jScrollPane5;

    // DETALLE DIALOG PRODUCTO HISTORIAL
    private JDialog detalleProductoHDialog;
    private javax.swing.JPanel detalleProductoHPanel;
    private javax.swing.JLabel detallePHTituloLabel;
    private javax.swing.JLabel detallePHOperacionLabel;
    private javax.swing.JTextField detallePHoperacionTextField;
    private javax.swing.JSpinner detallePHCantidadSpinner;
    private javax.swing.JLabel detallePHCantidadJLabel;
    private javax.swing.JSpinner detallePHPrecioUSpinner;
    private javax.swing.JLabel detallePHPrecioULabel;
    private javax.swing.JButton detalleRegistrarPHButton;
    private javax.swing.JLabel detalleProductoHValidacionLabel;

    public ProductoView() {
        initController();
        initComponents();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private void initController() {
        productoController = new ProductoController();
        productoHistorialController = new ProductoHistorialController();
    }

    //<editor-fold defaultstate="collapsed" desc="Código autogenerado del formulario">
    @SuppressWarnings("unchecked")
    private void initComponents() {
//        productoTabbedPane = new javax.swing.JTabbedPane();
        consultaPanel = new javax.swing.JPanel();
        consultaBuscarLabel = new javax.swing.JLabel();
        consultaBuscarTextField = new javax.swing.JTextField();
        nuevoProductoButton = new javax.swing.JButton();
        detalleVerProductoButton = new javax.swing.JButton();
        productosTable = new javax.swing.JTable();
        productoTablaScrollPane = new JScrollPane();
        registroPanel = new javax.swing.JPanel();
        nuevoProductoLabel = new javax.swing.JLabel();
        nuevoNombreTextField = new javax.swing.JTextField();
        nuevoNombreLabel = new javax.swing.JLabel();
        nuevoMarcaLabel = new javax.swing.JLabel();
        nuevoMarcaTextField = new javax.swing.JTextField();
        nuevoLineaLabel = new javax.swing.JLabel();
        nuevoLineaTextField = new javax.swing.JTextField();
        nuevoStockSpinner = new javax.swing.JSpinner();
        nuevoStockLabel = new javax.swing.JLabel();
        nuevoPrecioULabel = new javax.swing.JLabel();
        nuevoPrecioUSpinner = new javax.swing.JSpinner();
        nuevoObservacionTextArea = new javax.swing.JTextArea();
        nuevoObservacionLabel = new javax.swing.JLabel();
        nuevoObservacionScrollPane = new JScrollPane();
        nuevoRegistrarButton = new javax.swing.JButton();
        nuevoCancelarButton = new javax.swing.JButton();
        nuevoValidacionLabel = new javax.swing.JLabel();
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
        productoHTable = new javax.swing.JTable();
        detalleProductoHLabel = new javax.swing.JLabel();
        detalleProductoHTablaScrollPane = new JScrollPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        detalleObservacionTextArea = new javax.swing.JTextArea();
        detalleAgregarPButton = new javax.swing.JButton();
        detalleEditarButton = new javax.swing.JButton();
        detalleSalirButton = new javax.swing.JButton();
        detalleValidacionLabel = new javax.swing.JLabel();

        detalleProductoHPanel = new javax.swing.JPanel();
        detallePHTituloLabel = new javax.swing.JLabel();
        detallePHOperacionLabel = new javax.swing.JLabel();
        detallePHoperacionTextField = new javax.swing.JTextField();
        detallePHCantidadSpinner = new javax.swing.JSpinner();
        detallePHCantidadJLabel = new javax.swing.JLabel();
        detallePHPrecioUSpinner = new javax.swing.JSpinner();
        detallePHPrecioULabel = new javax.swing.JLabel();
        detalleRegistrarPHButton = new javax.swing.JButton();
        detalleProductoHValidacionLabel = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(620, 480));
        setPreferredSize(new java.awt.Dimension(620, 480));

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

        detalleVerProductoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        detalleVerProductoButton.setText("Producto N°");
        detalleVerProductoButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleVerProductoButtonActionPerformed(evt);
        });
        detalleVerProductoButton.setVisible(false);

        productosTable.setModel(new ProductoTableModel());

        productosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        productosTable.setRowSelectionAllowed(true);
        productoTablaScrollPane.setViewportView(productosTable);

        productosTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!detalleInProgress) {
                    int row = productosTable.getSelectedRow();

                    if (selectedProductosTable != null && selectedProductosTable.equals(row)) {
                        productosTable.getSelectionModel().clearSelection();
                        selectedProductosTable = null;
                        detalleVerProductoButton.setVisible(false);
                    } else {
                        selectedProductosTable = row;
                        detalleVerProductoButton.setText("Producto N°: " + productosTable.getValueAt(row, 0));
                        detalleVerProductoButton.setVisible(true);
                    }
                }
            }
        });

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(productoTablaScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addComponent(consultaBuscarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleVerProductoButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoProductoButton)
                                                        .addComponent(detalleVerProductoButton))))
                                .addGap(18, 18, 18)
                                .addComponent(productoTablaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.PRODUCTO_CONSULTA.getTitulo(), consultaPanel);

        nuevoProductoLabel.setText("Nuevo producto");

        nuevoNombreLabel.setText("Nombre:");

        nuevoMarcaLabel.setText("Marca:");

        nuevoLineaLabel.setText("Linea:");

        nuevoStockSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        nuevoStockLabel.setText("Stock:");

        nuevoPrecioULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoPrecioULabel.setText("<html><body>Precio<br>unitario:</body></html>");

        nuevoPrecioUSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        nuevoObservacionTextArea.setColumns(20);
        nuevoObservacionTextArea.setRows(5);
        nuevoObservacionScrollPane.setViewportView(nuevoObservacionTextArea);

        nuevoObservacionLabel.setText("Observaciones:");

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

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoPrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(nuevoPrecioUSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(nuevoMarcaLabel)
                                                        .addComponent(nuevoObservacionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(12, 12, 12)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoCancelarButton)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(nuevoRegistrarButton))
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGap(5, 5, 5)
                                                                .addComponent(nuevoStockLabel)
                                                                .addGap(19, 19, 19)
                                                                .addComponent(nuevoStockSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(nuevoObservacionLabel)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(nuevoMarcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addComponent(nuevoNombreLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoLineaLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoLineaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoProductoLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoValidacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(31, Short.MAX_VALUE))
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoProductoLabel)
                                        .addComponent(nuevoValidacionLabel))
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
                                        .addComponent(nuevoObservacionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(11, Short.MAX_VALUE))
        );

        detallePHTituloLabel.setText("Nuevo ingreso de stock");

        detallePHOperacionLabel.setText("Operación:");
        detallePHoperacionTextField.setText(ProductoOperacion.INGRESO.name());
        detallePHoperacionTextField.setEnabled(false);

        detallePHCantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        detallePHCantidadJLabel.setText("Cantidad:");

        detallePHPrecioUSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        detallePHPrecioULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detallePHPrecioULabel.setText("<html><body>Precio<br>unitario:</body></html>");

        detalleProductoHValidacionLabel.setBackground(new java.awt.Color(255, 0, 0));
        detalleProductoHValidacionLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        detalleProductoHValidacionLabel.setForeground(new java.awt.Color(255, 0, 0));
        detalleProductoHValidacionLabel.setVisible(false);

        detalleRegistrarPHButton.setText("Registrar");
        detalleRegistrarPHButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleRegistrarPHButtonActionPerformed(evt);
        });
        javax.swing.GroupLayout productoHPanelLayout = new javax.swing.GroupLayout(detalleProductoHPanel);
        detalleProductoHPanel.setLayout(productoHPanelLayout);
        productoHPanelLayout.setHorizontalGroup(
                productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(productoHPanelLayout.createSequentialGroup()
                                .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(productoHPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(detallePHTituloLabel)
                                                        .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addGroup(productoHPanelLayout.createSequentialGroup()
                                                                        .addComponent(detallePHPrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(detallePHPrecioUSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(productoHPanelLayout.createSequentialGroup()
                                                                        .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(detallePHOperacionLabel)
                                                                                .addComponent(detallePHCantidadJLabel))
                                                                        .addGap(18, 18, 18)
                                                                        .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(detallePHCantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(detallePHoperacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                        .addGroup(productoHPanelLayout.createSequentialGroup()
                                                .addGap(113, 113, 113)
                                                .addComponent(detalleRegistrarPHButton))
                                        .addGroup(productoHPanelLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(detalleProductoHValidacionLabel)))
                                .addContainerGap(14, Short.MAX_VALUE))
        );
        productoHPanelLayout.setVerticalGroup(
                productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(productoHPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(detallePHTituloLabel)
                                .addGap(37, 37, 37)
                                .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detallePHOperacionLabel)
                                        .addComponent(detallePHoperacionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detallePHCantidadSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detallePHCantidadJLabel))
                                .addGap(18, 18, 18)
                                .addGroup(productoHPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detallePHPrecioUSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detallePHPrecioULabel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(detalleProductoHValidacionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(detalleRegistrarPHButton)
                                .addContainerGap())
        );

        detalleProductoLabel.setText(" Detalle producto : N° ");

        detalleNombreLabel.setText("Nombre:");

        detalleMarcaLabel.setText("Marca:");

        detallePrecioULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detallePrecioULabel.setText("<html><body>Precio<br>unitario:</body></html>");

        detalleObservacionLabel.setText("Observaciones:");

        detalleLineaLabel.setText("Linea:");

        detalleStockLabel.setText("Stock:");

        detallePrecioUSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        detalleStockSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        productoHTable.setModel(new ProductoHistorialTableModel());
        detalleProductoHTablaScrollPane.setViewportView(productoHTable);

        detalleProductoHLabel.setText("Historial de operaciones:");

        detalleValidacionLabel.setBackground(new java.awt.Color(255, 0, 0));
        detalleValidacionLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        detalleValidacionLabel.setForeground(new java.awt.Color(255, 0, 0));
        detalleValidacionLabel.setVisible(false);

        detalleObservacionTextArea.setColumns(20);
        detalleObservacionTextArea.setRows(5);
        jScrollPane5.setViewportView(detalleObservacionTextArea);

        detalleAgregarPButton.setText("Agregar");
        // detalleAgregarPButton.setVisible(false);
        detalleAgregarPButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleAgregarPButtonActionPerformed(evt);
        });

        detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
        detalleEditarButton.setToolTipText("Editar");
        detalleEditarButton.setMaximumSize(new java.awt.Dimension(55, 40));
        detalleEditarButton.setMinimumSize(new java.awt.Dimension(55, 40));
        detalleEditarButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleEditarButtonActionPerformed(evt);
        });

        detalleSalirButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        detalleSalirButton.setToolTipText("Salir");
        detalleSalirButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleSalirButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout detallePanelLayout = new javax.swing.GroupLayout(detallePanel);
        detallePanel.setLayout(detallePanelLayout);
        detallePanelLayout.setHorizontalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleProductoLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleValidacionLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                                                                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleObservacionLabel)
                                                                .addGap(0, 0, Short.MAX_VALUE)))
                                                .addGap(18, 18, 18)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleProductoHLabel)
                                                                .addGap(88, 88, 88)
                                                                .addComponent(detalleAgregarPButton))
                                                        .addComponent(detalleProductoHTablaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addContainerGap())
        );
        detallePanelLayout.setVerticalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(detalleProductoLabel)
                                                .addComponent(detalleValidacionLabel))
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
                                        .addComponent(detalleProductoHTablaScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                                .addContainerGap())
        );

        //     addTab(ComponentesTab.PRODUCTO_DETALLE.getTitulo(), detallePanel);
    }

//</editor-fold>
    private void removeTab(String tabTitle) {
        for (int i = 0; i < getTabCount(); i++) {
            if (getTitleAt(i).equals(tabTitle)) {
                remove(i);
                break;
            }
        }
    }

    //se activa al hacer clic sobre el botón buscar producto
    private void consultaBuscarTextFieldActionPerformed() {
        //verifica que exista un texto
        if (consultaBuscarTextField.getText().length() > 0) {
            //se usa el controlador de productos llamando a su funcion 'consultar'
            //se agrega el producto encontrado a la lista de productos
            List<Producto> productos = productoController.consultar(consultaBuscarTextField.getText());

            //si encuentra el producto
            if (productos.size() > 0) {
                //carga el producto a la tabla de productos en memoria
                productosTable.setModel(new ProductoTableModel(productos));
            }
        }
    }

    //creación de nuevo producto
    private void nuevoProductoButtonActionPerformed(ActionEvent evt) {
        nuevoProductoButton.setEnabled(false);
        addTab(ComponentesTab.PRODUCTO_REGISTRO.getTitulo(), registroPanel);
        setSelectedComponent(registroPanel);
    }

    //ver detalles del producto, se busca por Id seleccionado
    private void detalleVerProductoButtonActionPerformed(ActionEvent evt) {
        detalleInProgress = true;
        productosTable.setRowSelectionAllowed(false);
        detalleVerProductoButton.setVisible(false);
        nuevoProductoButton.setEnabled(false);

        //obtiene el id del producto seleccionado usando el controlador
        //se crea el objeto producto
        Producto productoDetalle = productoController.obtener(
                (Integer) productosTable.getValueAt(productosTable.getSelectedRow(), 0)
        );

        detalleProducto = productoDetalle;

        //carga datos del producto al formulario 
        fillDetalleProducto();

        //agrega la pastaña de detalle del producto al formulario principal
        addTab(ComponentesTab.PRODUCTO_DETALLE.getTitulo(), detallePanel);

        //marca al panel del producto como el formulario activo
        setSelectedComponent(detallePanel);
    }

    //botón de edición y guardado de producto
    private void detalleEditarButtonActionPerformed(ActionEvent evt) {

        //se evalua el estado para saber si se está guardando o editando el producto
        if (!detalleEditarInProgress) { //se está editando

            //habilita la edición del formulario
            detalleEditarInProgress = true;

            detalleNombreTextField.setEditable(true);
            detalleMarcaTextField.setEditable(true);
            detalleLineaTextField.setEditable(true);
            detalleObservacionTextArea.setEditable(true);

            detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png")));
            detalleSalirButton.setEnabled(false);
        } else { //se está guardando

            boolean actualizacionValido = true;

            if (detalleNombreTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo nombre es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (detalleMarcaTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo marca es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (detalleLineaTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo linea es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }

            if (actualizacionValido) {

                detalleValidacionLabel.setText("");
                detalleValidacionLabel.setVisible(false);

                String[] opciones = {"Sí", "No"};

                //confirmación de guardado
                int actualizar = JOptionPane.showOptionDialog(
                        this,
                        "¿Esta seguro de guardar los cambios?",
                        ComponentesTab.PRODUCTO_DETALLE.getTitulo(),
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[1]);

                //si responde que sí
                if (actualizar == JOptionPane.YES_OPTION) {

                    //inicia guardado
                    //agrega datos al producto. valida antes que exista.
                    if (!detalleProducto.getNombre().equals(detalleNombreTextField.getText())) {
                        detalleProducto.setNombre(detalleNombreTextField.getText());
                    }
                    if (!detalleProducto.getMarca().equals(detalleMarcaTextField.getText())) {
                        detalleProducto.setMarca(detalleMarcaTextField.getText());
                    }
                    if (!detalleProducto.getLinea().equals(detalleLineaTextField.getText())) {
                        detalleProducto.setLinea(detalleLineaTextField.getText());
                    }
                    if (!detalleProducto.getObservaciones().equals(detalleObservacionTextArea.getText())) {
                        detalleProducto.setObservaciones(detalleObservacionTextArea.getText());
                    }

                    detalleProducto.setModificador(usuario.getUsername());
                    detalleProducto.setFechaModificacion(new Date());

                    detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
                    detalleEditarInProgress = false;
                    detalleSalirButton.setEnabled(true);

                    try {
                        //guardado del producto haciendo uso de la función del controlador
                        if (productoController.actualizar(detalleProducto)) {
                            //se vuelven a llenar los datos desde el objeto
                            fillDetalleProducto();
                        }
                    } catch (Exception e) {
                        detalleValidacionLabel.setText(e.getMessage());
                        detalleValidacionLabel.setVisible(true);
                    }
                }
            }
        }
    }

    //llenado de campos del formulario de producto
    private void fillDetalleProducto() {

        if (detalleProducto.getObservaciones() == null) {
            detalleProducto.setObservaciones("");
        }

        detalleProductoLabel.setText(" Detalle producto : N° " + detalleProducto.getId());

        detalleNombreTextField.setText(detalleProducto.getNombre());
        detalleNombreTextField.setEditable(false);

        detalleMarcaTextField.setText(detalleProducto.getMarca());
        detalleMarcaTextField.setEditable(false);

        detallePrecioUSpinner.setValue(detalleProducto.getPrecioUnitario());
        ((DefaultEditor) detallePrecioUSpinner.getEditor()).getTextField().setEditable(false);

        detalleLineaTextField.setText(detalleProducto.getLinea());
        detalleLineaTextField.setEditable(false);

        detalleStockSpinner.setValue(detalleProducto.getStock());
        ((DefaultEditor) detalleStockSpinner.getEditor()).getTextField().setEditable(false);

        detalleObservacionTextArea.setText(
                detalleProducto.getObservaciones() != null ? detalleProducto.getObservaciones() : ""
        );
        detalleObservacionTextArea.setEditable(false);

        if (!detalleProducto.getProductoHistorial().isEmpty()) {
            productoHTable.setModel(new ProductoHistorialTableModel(
                    detalleProducto.getProductoHistorial()
            ));
        }
    }

    //salir del formulario
    private void detalleSalirButtonActionPerformed(ActionEvent evt) {

        detalleProductoLabel.setText("");
        detalleNombreTextField.setText("");
        detalleMarcaTextField.setText("");
        detallePrecioUSpinner.setValue(0.0);
        detalleLineaTextField.setText("");
        detalleStockSpinner.setValue(0.0);
        detalleObservacionTextArea.setText("");

        productoHTable.setModel(
                new ProductoHistorialTableModel()
        );

        productosTable.setRowSelectionAllowed(true);
        detalleInProgress = false;
        nuevoProductoButton.setEnabled(true);

        removeTab(ComponentesTab.PRODUCTO_DETALLE.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    //botón de creación de nuevo producto
    private void nuevoRegistrarButtonActionPerformed(ActionEvent evt) {

        boolean registroValido = true;

        if (nuevoNombreTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo nombre es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoMarcaTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo marca es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoPrecioUSpinner.getValue().equals(0.0d)) {
            nuevoValidacionLabel.setText("EL campo precio unitario es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoLineaTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo linea es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoStockSpinner.getValue().equals(0.0d)) {
            nuevoValidacionLabel.setText("EL campo stock es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }

        if (registroValido) {

            nuevoValidacionLabel.setText("");
            nuevoValidacionLabel.setVisible(false);

            registrarProducto();
        }

    }

    //método de creación de producto
    private void registrarProducto() {

        String[] opciones = {"Sí", "No"};

        //confirmación
        int registrar = JOptionPane.showOptionDialog(
                this,
                "Se registrará un nuevo producto.",
                ComponentesTab.PRODUCTO_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (registrar == JOptionPane.YES_OPTION) {
            //se crea nuevo objeto Producto
            Producto nuevoProducto = new Producto();

            //se crea el objeto historia de producto
            ProductoHistorial nuevoProductoHistorial = new ProductoHistorial();

            //se cargan los campos
            nuevoProducto.setNombre(nuevoNombreTextField.getText());
            nuevoProducto.setMarca(nuevoMarcaTextField.getText());
            nuevoProducto.setPrecioUnitario((Double) nuevoPrecioUSpinner.getValue());
            nuevoProducto.setLinea(nuevoLineaTextField.getText());
            nuevoProducto.setStock((Double) nuevoStockSpinner.getValue());

            if (!nuevoObservacionTextArea.getText().trim().equals("")) {
                nuevoProducto.setObservaciones(nuevoObservacionTextArea.getText());
            }

            nuevoProducto.setCreador(usuario.getUsername());
            nuevoProducto.setFechaCreacion(new Date());

            //se intenta guardar el objeto haciendo uso del controlador
            try {
                productoController.registrar(nuevoProducto);

                //mensaje de confirmación para la consola
                System.out.println(nuevoProducto.toString());

                //REGISTRO DE PRODUCTO HISTORIAL
                nuevoProductoHistorial.setIdProducto(nuevoProducto.getId());
                nuevoProductoHistorial.setOperacion(Constantes.ProductoOperacion.INGRESO.name());
                nuevoProductoHistorial.setCantidad(nuevoProducto.getStock());
                nuevoProductoHistorial.setPrecioUnitario(nuevoProducto.getPrecioUnitario());

                nuevoProductoHistorial.setCreador(usuario.getUsername());
                nuevoProductoHistorial.setFechaCreacion(new Date());

                productoHistorialController.registrar(nuevoProductoHistorial);

                //limpieza del formulario
                nuevoRegistroFinalizar();

                //si hay un error muestra el mensaje de error
            } catch (Exception e) {
                nuevoValidacionLabel.setText(e.getMessage());
                nuevoValidacionLabel.setVisible(true);
            }
        }
    }

    private void nuevoRegistroFinalizar() {
        nuevoNombreTextField.setText("");
        nuevoMarcaTextField.setText("");
        nuevoPrecioUSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        nuevoLineaTextField.setText("");
        nuevoStockSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));
        nuevoObservacionTextArea.setText("");
        nuevoProductoButton.setEnabled(true);
        removeTab(ComponentesTab.PRODUCTO_REGISTRO.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    //cancela la creación del nuevo producto
    private void nuevoCancelarButtonActionPerformed(ActionEvent evt) {
        String[] opciones = {"Sí", "No"};

        int cancelar = JOptionPane.showOptionDialog(
                this,
                "¿Esta seguro de cancelar el registro?",
                ComponentesTab.PRODUCTO_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (cancelar == JOptionPane.YES_OPTION) {
            nuevoRegistroFinalizar();
        }
    }

    //botón de agregado de registro de compra o ingreso del producto
    private void detalleAgregarPButtonActionPerformed(ActionEvent ev) {

        JOptionPane detalleProductoHOP = new JOptionPane();
        detalleProductoHDialog = detalleProductoHOP.createDialog(ComponentesTab.VENTA_REGISTRO.getTitulo());
        detalleProductoHDialog.setSize(333, 266);
        detalleProductoHDialog.setContentPane(detalleProductoHPanel);
        detalleProductoHDialog.setVisible(true);

    }

    //aceptar guardado de compra o ingreso
    private void detalleRegistrarPHButtonActionPerformed(ActionEvent ev) {
        boolean registroValido = true;

        if (detallePHPrecioUSpinner.getValue().equals(0.0d)) {
            detalleProductoHValidacionLabel.setText("EL campo precio unitario es obligatorio.");
            detalleProductoHValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (detallePHCantidadSpinner.getValue().equals(0.0d)) {
            detalleProductoHValidacionLabel.setText("EL campo cantidad es obligatorio.");
            detalleProductoHValidacionLabel.setVisible(true);
            registroValido = false;
        }

        if (registroValido) {

            detalleProductoHValidacionLabel.setText("");
            detalleProductoHValidacionLabel.setVisible(false);

            String[] opciones = {"Sí", "No"};

            int registrar = JOptionPane.showOptionDialog(
                    this,
                    "Se registrará un ingreso de productos.",
                    ComponentesTab.PRODUCTO_DETALLE.getTitulo(),
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[1]);

            if (registrar == JOptionPane.YES_OPTION) {

                try {
                    ProductoHistorial nuevoProductoHistorial = new ProductoHistorial();

                    nuevoProductoHistorial.setIdProducto(detalleProducto.getId());
                    nuevoProductoHistorial.setOperacion(Constantes.ProductoOperacion.INGRESO.name());
                    nuevoProductoHistorial.setCantidad((Double) detallePHCantidadSpinner.getValue());
                    nuevoProductoHistorial.setPrecioUnitario((Double) detallePHPrecioUSpinner.getValue());

                    nuevoProductoHistorial.setCreador(usuario.getUsername());
                    nuevoProductoHistorial.setFechaCreacion(new Date());

                    productoHistorialController.registrar(nuevoProductoHistorial);

                    // ACTUALIZAR STOCK Y PRECIO
                    detalleProducto.setPrecioUnitario((Double) detallePHPrecioUSpinner.getValue());
                    detalleProducto.setStock(
                            detalleProducto.getStock() + (Double) detallePHCantidadSpinner.getValue()
                    );
                    detalleProducto.setModificador(usuario.getUsername());
                    detalleProducto.setFechaModificacion(new Date());

                    productoController.actualizar(detalleProducto);

                    Producto productoDetalle = productoController.obtener(
                            detalleProducto.getId()
                    );

                    detalleProducto = productoDetalle;
                    detalleProducto.setObservaciones("");

                    fillDetalleProducto();
                    nuevoProductoHRegistroFinalizar();
                } catch (Exception e) {
                    detalleProductoHValidacionLabel.setText(e.getMessage());
                    detalleProductoHValidacionLabel.setVisible(true);
                }
            }
        }
    }

    //finaliza el ingreso de compra
    private void nuevoProductoHRegistroFinalizar() {
        detallePHCantidadSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));;
        detallePHPrecioUSpinner.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));;

        detalleProductoHDialog.setVisible(false);
    }
    
    
    //<editor-fold defaultstate="collapsed" desc="Código autogenerado del formulario">
        
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
                    return formatDateToString(producto.getFechaModificacion());
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
            return value != null ? parser.format(value) : "";
        }
    }

    private class ProductoHistorialTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Operacion", "Cantidad", "Precio", "Creador", "Creación"
                };

        private List<ProductoHistorial> productosHistorial;

        public ProductoHistorialTableModel() {
            productosHistorial = new ArrayList<ProductoHistorial>();
        }

        public ProductoHistorialTableModel(List<ProductoHistorial> productosHistorial) {
            this.productosHistorial = productosHistorial;
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
            return productosHistorial.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            ProductoHistorial productoHistorial = getProducto(row);

            switch (column) {
                case 0:
                    return productoHistorial.getOperacion();
                case 1:
                    return productoHistorial.getCantidad();
                case 2:
                    return productoHistorial.getPrecioUnitario();
                case 3:
                    return productoHistorial.getCreador();
                case 4:
                    return formatDateToString(productoHistorial.getFechaCreacion());
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            ProductoHistorial productoHistorial = getProducto(row);

            switch (column) {
                case 0:
                    productoHistorial.setOperacion((String) value);
                    break;
                case 1:
                    productoHistorial.setCantidad((Double) value);
                    break;
                case 2:
                    productoHistorial.setPrecioUnitario((Double) value);
                    break;
                case 3:
                    productoHistorial.setCreador((String) value);
                    break;
                case 4:
                    productoHistorial.setFechaCreacion((Date) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public ProductoHistorial getProducto(int row) {
            return productosHistorial.get(row);
        }

        private String formatDateToString(Date value) {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return value != null ? parser.format(value) : "";
        }

    }
    
    //</editor-fold>
    
}
