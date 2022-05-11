/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.ClienteController;
import com.grupo.entity.Cliente;
import com.grupo.entity.Usuario;
import com.grupo.entity.Venta;
import com.grupo.util.Constantes;
import com.grupo.util.Constantes.ClienteTipoDocumento;
import com.grupo.util.Constantes.ClienteTipoPersona;
import com.grupo.util.Constantes.ComponentesTab;
import com.grupo.util.Constantes.PersonaTipo;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class ClienteView extends JTabbedPane {

    private ClienteController clienteController;
    private Usuario usuario;

    //CONSULTA
    private javax.swing.JTable clientesTable;
    private javax.swing.JLabel consultaBuscarLabel;
    private javax.swing.JTextField consultaBuscarTextField;
    private javax.swing.JPanel consultaPanel;
    private javax.swing.JButton nuevoClienteButton;
    private javax.swing.JScrollPane clienteTableScrollPane;
    private javax.swing.JButton detalleVerClienteButton;
    private Integer selectedProductosTable;

    //REGISTRO
    private javax.swing.JLabel nuevoApellidoLabel;
    private javax.swing.JTextField nuevoApellidoTextField;
    private javax.swing.JButton nuevoCancelarButton;
    private javax.swing.JLabel nuevoClienteLabel;
    private javax.swing.JLabel nuevoDIreccionLabel;
    private javax.swing.JTextField nuevoDireccionTextField;
    private javax.swing.JLabel nuevoEmailLabel;
    private javax.swing.JTextField nuevoEmailTextField;
    private javax.swing.JLabel nuevoNombreLabel;
    private javax.swing.JTextField nuevoNombreTextField;
    private javax.swing.JLabel nuevoNumeroDocLabel;
    private javax.swing.JTextField nuevoNumeroDocTextField;
    private javax.swing.JButton nuevoRegistrarButton;
    private javax.swing.JLabel nuevoTIpoPersonaLabel;
    private javax.swing.JLabel nuevoTelefonoLabel;
    private javax.swing.JComboBox<String> nuevoTipoDocJComboBox;
    private javax.swing.JLabel nuevoTipoDocULabel;
    private javax.swing.JComboBox<String> nuevoTipoPersonajComboBox;
    private javax.swing.JLabel nuevoValidacionLabel;
    private javax.swing.JTextField nuevotelefonoTextField;
    private javax.swing.JPanel registroPanel;

    private Cliente detalleCliente;
    private Boolean detalleInProgress = false;
    private Boolean detalleEditarInProgress = false;
    private javax.swing.JTable clienteVentaTable;
    private javax.swing.JLabel deatlleEmailLabel;
    private javax.swing.JTextField detalleApellidoTextField;
    private javax.swing.JLabel detalleClienteLabel;
    private javax.swing.JLabel detalleDIreccionLabel;
    private javax.swing.JTextField detalleDireccionTextField;
    private javax.swing.JButton detalleEditarButton;
    private javax.swing.JTextField detalleEmailTextField;
    private javax.swing.JLabel detalleMarcaLabel;
    private javax.swing.JLabel detalleNombreLabel;
    private javax.swing.JTextField detalleNombreTextField;
    private javax.swing.JLabel detalleNumeroDocLabel;
    private javax.swing.JTextField detalleNumeroDocTextField;
    private javax.swing.JPanel detallePanel;
    private javax.swing.JLabel detalleProductoHLabel;
    private javax.swing.JButton detalleSalirButton;
    private javax.swing.JLabel detalleTIpoPersonaLabel;
    private javax.swing.JLabel detalleTelefonoLabel;
    private javax.swing.JComboBox<String> detalleTipoDocJComboBox;
    private javax.swing.JLabel detalleTipoDocULabel;
    private javax.swing.JComboBox<String> detalleTipoPersonajComboBox;
    private javax.swing.JLabel detalleValidacionLabel;
    private javax.swing.JTextField detalletelefonoTextField;
    private javax.swing.JScrollPane jScrollPane4;

    public ClienteView() {
        initController();
        initComponents();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private void initController() {
        clienteController = new ClienteController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        consultaPanel = new javax.swing.JPanel();
        consultaBuscarLabel = new javax.swing.JLabel();
        consultaBuscarTextField = new javax.swing.JTextField();
        nuevoClienteButton = new javax.swing.JButton();
        clienteTableScrollPane = new javax.swing.JScrollPane();
        clientesTable = new javax.swing.JTable();
        detalleVerClienteButton = new javax.swing.JButton();
        registroPanel = new javax.swing.JPanel();
        nuevoClienteLabel = new javax.swing.JLabel();
        nuevoNombreTextField = new javax.swing.JTextField();
        nuevoNombreLabel = new javax.swing.JLabel();
        nuevoApellidoLabel = new javax.swing.JLabel();
        nuevoDireccionTextField = new javax.swing.JTextField();
        nuevoTIpoPersonaLabel = new javax.swing.JLabel();
        nuevoTipoDocULabel = new javax.swing.JLabel();
        nuevoRegistrarButton = new javax.swing.JButton();
        nuevoCancelarButton = new javax.swing.JButton();
        nuevoValidacionLabel = new javax.swing.JLabel();
        nuevoTipoDocJComboBox = new javax.swing.JComboBox<>();
        nuevoNumeroDocTextField = new javax.swing.JTextField();
        nuevoNumeroDocLabel = new javax.swing.JLabel();
        nuevoApellidoTextField = new javax.swing.JTextField();
        nuevoDIreccionLabel = new javax.swing.JLabel();
        nuevoTelefonoLabel = new javax.swing.JLabel();
        nuevotelefonoTextField = new javax.swing.JTextField();
        nuevoEmailLabel = new javax.swing.JLabel();
        nuevoEmailTextField = new javax.swing.JTextField();
        nuevoTipoPersonajComboBox = new javax.swing.JComboBox<>();
        detallePanel = new javax.swing.JPanel();
        detalleClienteLabel = new javax.swing.JLabel();
        detalleNombreLabel = new javax.swing.JLabel();
        detalleNombreTextField = new javax.swing.JTextField();
        detalleApellidoTextField = new javax.swing.JTextField();
        detalleMarcaLabel = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        clienteVentaTable = new javax.swing.JTable();
        detalleProductoHLabel = new javax.swing.JLabel();
        detalleEditarButton = new javax.swing.JButton();
        detalleSalirButton = new javax.swing.JButton();
        detalleValidacionLabel = new javax.swing.JLabel();
        detalleNumeroDocLabel = new javax.swing.JLabel();
        detalleNumeroDocTextField = new javax.swing.JTextField();
        detalleTipoPersonajComboBox = new javax.swing.JComboBox<>();
        detalleTIpoPersonaLabel = new javax.swing.JLabel();
        detalleTipoDocULabel = new javax.swing.JLabel();
        detalleTipoDocJComboBox = new javax.swing.JComboBox<>();
        detalleDireccionTextField = new javax.swing.JTextField();
        detalleDIreccionLabel = new javax.swing.JLabel();
        detalleTelefonoLabel = new javax.swing.JLabel();
        detalletelefonoTextField = new javax.swing.JTextField();
        deatlleEmailLabel = new javax.swing.JLabel();
        detalleEmailTextField = new javax.swing.JTextField();

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

        nuevoClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        nuevoClienteButton.setText("Nuevo");
        nuevoClienteButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoClienteButtonActionPerformed(evt);
        });

        clientesTable.setModel(new ClienteTableModel());
        clientesTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        clientesTable.setRowSelectionAllowed(true);

        clienteTableScrollPane.setViewportView(clientesTable);
        clientesTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!detalleInProgress) {
                    int row = clientesTable.getSelectedRow();

                    if (selectedProductosTable != null && selectedProductosTable.equals(row)) {
                        clientesTable.getSelectionModel().clearSelection();
                        selectedProductosTable = null;
                        detalleVerClienteButton.setVisible(false);
                    } else {
                        selectedProductosTable = row;
                        detalleVerClienteButton.setText("Cliente N°: " + clientesTable.getValueAt(row, 0));
                        detalleVerClienteButton.setVisible(true);
                    }
                }
            }
        });

        clienteTableScrollPane.setViewportView(clientesTable);

        detalleVerClienteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        detalleVerClienteButton.setVisible(false);
        detalleVerClienteButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleVerClienteButtonActionPerformed(evt);
        });

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(clienteTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addComponent(consultaBuscarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleVerClienteButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoClienteButton)))
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
                                                        .addComponent(nuevoClienteButton)
                                                        .addComponent(detalleVerClienteButton))))
                                .addGap(18, 18, 18)
                                .addComponent(clienteTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.CLIENTE_CONSULTA.getTitulo(), consultaPanel);

        nuevoClienteLabel.setText("Nuevo cliente");

        nuevoNombreLabel.setText("Nombre:");

        nuevoApellidoLabel.setText("Apellido:");

        nuevoTIpoPersonaLabel.setText("Tipo:");

        nuevoTipoDocULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nuevoTipoDocULabel.setText("<html><body>Tipo<br>documento:</body></html>");

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

        nuevoTipoDocJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Constantes.getNnombres(ClienteTipoDocumento.class)
        ));
        nuevoNumeroDocLabel.setText("<html><body>Numero<br>documento:</body></html>");

        nuevoDIreccionLabel.setText("DIrección:");

        nuevoTelefonoLabel.setText("Teléfono:");

        nuevoEmailLabel.setText("Email:");

        nuevoTipoPersonajComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(ClienteTipoPersona.class)
                )
        );

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoDIreccionLabel)
                                                .addGap(20, 20, 20)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoApellidoTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoNumeroDocTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(nuevoCancelarButton))
                                .addGap(18, 18, 18)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nuevoTIpoPersonaLabel)
                                        .addComponent(nuevoTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoTelefonoLabel)
                                        .addComponent(nuevoEmailLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(nuevoTipoPersonajComboBox, 0, 197, Short.MAX_VALUE)
                                                        .addComponent(nuevoTipoDocJComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(nuevotelefonoTextField)
                                                        .addComponent(nuevoEmailTextField))
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoRegistrarButton)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoClienteLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoValidacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(nuevoApellidoLabel)
                                                .addComponent(nuevoNombreLabel))
                                        .addComponent(nuevoNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(47, Short.MAX_VALUE))
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoClienteLabel)
                                        .addComponent(nuevoValidacionLabel))
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(31, 31, 31)
                                                .addComponent(nuevoTipoPersonajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nuevoNombreLabel)
                                                                .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(nuevoTIpoPersonaLabel, javax.swing.GroupLayout.Alignment.TRAILING))))
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(nuevoTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoApellidoLabel)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoNumeroDocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoTelefonoLabel)
                                                        .addComponent(nuevotelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(nuevoNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoEmailLabel)
                                        .addComponent(nuevoDIreccionLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoCancelarButton)
                                        .addComponent(nuevoRegistrarButton))
                                .addGap(50, 50, 50))
        );

        detalleNombreLabel.setText("Nombre:");
        detalleMarcaLabel.setText("Apellido:");

        clienteVentaTable.setModel(new ClienteVentaTableModel());
        jScrollPane4.setViewportView(clienteVentaTable);

        detalleProductoHLabel.setText("Historial de compras:");

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

        detalleValidacionLabel.setBackground(new java.awt.Color(255, 0, 0));
        detalleValidacionLabel.setFont(new java.awt.Font("Dialog", 0, 10)); // NOI18N
        detalleValidacionLabel.setForeground(new java.awt.Color(255, 0, 0));
        detalleValidacionLabel.setVisible(false);

        detalleNumeroDocLabel.setText("<html><body>Numero<br>documento:</body></html>");

        detalleTipoPersonajComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(ClienteTipoPersona.class)
                )
        );

        detalleTIpoPersonaLabel.setText("Tipo:");

        detalleTipoDocULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detalleTipoDocULabel.setText("<html><body>Tipo<br>documento:</body></html>");

        detalleTipoDocJComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(ClienteTipoDocumento.class)
                )
        );

        detalleDIreccionLabel.setText("DIrección:");

        detalleTelefonoLabel.setText("Teléfono:");

        deatlleEmailLabel.setText("Email:");

        javax.swing.GroupLayout detallePanelLayout = new javax.swing.GroupLayout(detallePanel);
        detallePanel.setLayout(detallePanelLayout);
        detallePanelLayout.setHorizontalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleClienteLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleValidacionLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(detalleDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(detalleNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(detalleMarcaLabel)
                                                                        .addComponent(detalleNombreLabel))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(detalleNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(detalleApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(detalleNumeroDocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addComponent(detalleTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(detalleTipoPersonajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(detalleTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addGap(2, 2, 2)
                                                                                .addComponent(detalleTIpoPersonaLabel))))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleTelefonoLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(detalletelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(deatlleEmailLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(detalleEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(detalleDIreccionLabel)
                                                        .addComponent(detalleProductoHLabel))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        detallePanelLayout.setVerticalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(detalleClienteLabel)
                                                .addComponent(detalleValidacionLabel))
                                        .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalleNombreLabel)
                                                        .addComponent(detalleNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalleMarcaLabel)
                                                        .addComponent(detalleApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalleTIpoPersonaLabel)
                                                        .addComponent(detalleTipoPersonajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(detalleTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(detalleTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(detalleNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(detalleNumeroDocTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(detalleTelefonoLabel)
                                                .addComponent(detalletelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleDIreccionLabel)
                                        .addComponent(deatlleEmailLabel)
                                        .addComponent(detalleEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(detalleProductoHLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                .addContainerGap())
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
            List<Cliente> productos = clienteController.consultar(consultaBuscarTextField.getText());

            if (productos.size() > 0) {
                clientesTable.setModel(new ClienteTableModel(productos));
            }
        }
    }

    private void nuevoClienteButtonActionPerformed(ActionEvent evt) {
        nuevoClienteButton.setEnabled(false);
        addTab(Constantes.ComponentesTab.CLIENTE_REGISTRO.getTitulo(), registroPanel);
        setSelectedComponent(registroPanel);
    }

    private void nuevoRegistrarButtonActionPerformed(ActionEvent evt) {
        boolean registroValido = true;

        if (nuevoNombreTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo nombre es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoApellidoTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo apellido es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoNumeroDocTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("EL campo numero de documento es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }

        if (registroValido) {

            nuevoValidacionLabel.setText("");
            nuevoValidacionLabel.setVisible(false);

            registrarCliente();
        }
    }

    private void registrarCliente() {

        String[] opciones = {"Sí", "No"};

        int registrar = JOptionPane.showOptionDialog(
                this,
                "Se registrará un nuevo cliente.",
                Constantes.ComponentesTab.CLIENTE_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (registrar == JOptionPane.YES_OPTION) {
            Cliente nuevoCliente = new Cliente();

            nuevoCliente.setTipo(PersonaTipo.C.name());
            nuevoCliente.setNombre(nuevoNombreTextField.getText());
            nuevoCliente.setApellidos(nuevoApellidoTextField.getText());
            nuevoCliente.setNumeroDocumento(nuevoNumeroDocTextField.getText());
            nuevoCliente.setTipoDocumento((String) nuevoTipoDocJComboBox.getSelectedItem());
            nuevoCliente.setTipoPersona((String) nuevoTipoPersonajComboBox.getSelectedItem());

            if (!nuevotelefonoTextField.getText().trim().equals("")) {
                nuevoCliente.setTelefono(nuevotelefonoTextField.getText());
            }
            if (!nuevoDireccionTextField.getText().trim().equals("")) {
                nuevoCliente.setDireccion(nuevoDireccionTextField.getText());
            }
            if (!nuevoEmailTextField.getText().trim().equals("")) {
                nuevoCliente.setEmail(nuevoEmailTextField.getText());
            }

            nuevoCliente.setCreador(usuario.getUsername());
            nuevoCliente.setFechaCreacion(new Date());

            try {
                clienteController.registrar(nuevoCliente);
                nuevoRegistroFinalizar();

            } catch (Exception e) {
                nuevoValidacionLabel.setText(e.getMessage());
                nuevoValidacionLabel.setVisible(true);
            }

        }
    }

    private void nuevoCancelarButtonActionPerformed(ActionEvent evt) {
        String[] opciones = {"Sí", "No"};

        int cancelar = JOptionPane.showOptionDialog(
                this,
                "¿Esta seguro de cancelar el registro?",
                ComponentesTab.CLIENTE_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (cancelar == JOptionPane.YES_OPTION) {
            nuevoRegistroFinalizar();
        }
    }

    private void nuevoRegistroFinalizar() {
        nuevoNombreTextField.setText("");
        nuevoApellidoTextField.setText("");
        nuevoNumeroDocTextField.setText("");
        nuevoTipoDocJComboBox.setSelectedItem(ClienteTipoDocumento.DNI.name());
        nuevoTipoPersonajComboBox.setSelectedItem(ClienteTipoPersona.NATURAL.name());
        nuevotelefonoTextField.setText("");
        nuevoDireccionTextField.setText("");
        nuevoEmailTextField.setText("");

        nuevoClienteButton.setEnabled(true);
        removeTab(ComponentesTab.CLIENTE_REGISTRO.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    private void detalleVerClienteButtonActionPerformed(ActionEvent evt) {

        detalleInProgress = true;
        clientesTable.setRowSelectionAllowed(false);
        detalleVerClienteButton.setVisible(false);
        nuevoClienteButton.setEnabled(false);

        Cliente clienteDetalle = clienteController.obtener(
                (Integer) clientesTable.getValueAt(clientesTable.getSelectedRow(), 0)
        );

        detalleCliente = clienteDetalle;

        fillDetalleCliente();
        addTab(ComponentesTab.CLIENTE_DETALLE.getTitulo(), detallePanel);
        setSelectedComponent(detallePanel);
    }

    private void fillDetalleCliente() {
        if (detalleCliente.getTelefono() == null) {
            detalleCliente.setTelefono("");
        }
        if (detalleCliente.getEmail() == null) {
            detalleCliente.setEmail("");
        }
        if (detalleCliente.getDireccion() == null) {
            detalleCliente.setDireccion("");
        }

        detalleClienteLabel.setText(" Detalle cliente : N° " + detalleCliente.getId());

        detalleNombreTextField.setText(detalleCliente.getNombre());
        detalleNombreTextField.setEditable(false);

        detalleApellidoTextField.setText(detalleCliente.getApellidos());
        detalleApellidoTextField.setEditable(false);

        detalleNumeroDocTextField.setText(detalleCliente.getNumeroDocumento());
        detalleNumeroDocTextField.setEditable(false);

        detalleTipoDocJComboBox.setSelectedItem(detalleCliente.getTipoDocumento());
        detalleTipoDocJComboBox.setEnabled(false);

        detalleTipoPersonajComboBox.setSelectedItem(detalleCliente.getTipoPersona());
        detalleTipoPersonajComboBox.setEnabled(false);

        detalletelefonoTextField.setText(detalleCliente.getTelefono());
        detalletelefonoTextField.setEditable(false);

        detalleDireccionTextField.setText(detalleCliente.getDireccion());
        detalleDireccionTextField.setEditable(false);

        detalleEmailTextField.setText(detalleCliente.getEmail());
        detalleEmailTextField.setEditable(false);

        if (!detalleCliente.getVentas().isEmpty()) {
            clienteVentaTable.setModel(new ClienteVentaTableModel(
                    detalleCliente.getVentas()
            ));
        }
    }

    private void detalleEditarButtonActionPerformed(ActionEvent evt) {

        if (!detalleEditarInProgress) {

            detalleEditarInProgress = true;

            detalleNombreTextField.setEditable(true);
            detalleApellidoTextField.setEditable(true);
            detalleNumeroDocTextField.setEditable(true);

            detalleTipoDocJComboBox.setEnabled(true);
            detalleTipoDocJComboBox.setEditable(true);

            detalleTipoPersonajComboBox.setEnabled(true);
            detalleTipoPersonajComboBox.setEditable(true);

            detalletelefonoTextField.setEditable(true);
            detalleDireccionTextField.setEditable(true);
            detalleEmailTextField.setEditable(true);

            detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/guardar.png")));
            detalleSalirButton.setEnabled(false);
        } else {
            boolean actualizacionValido = true;

            if (detalleNombreTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo nombre es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (detalleApellidoTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo apellidos es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (detalleNumeroDocTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("EL campo numero de documento es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }

            if (actualizacionValido) {

                detalleValidacionLabel.setText("");
                detalleValidacionLabel.setVisible(false);

                String[] opciones = {"Sí", "No"};

                int actualizar = JOptionPane.showOptionDialog(
                        this,
                        "¿Esta seguro de guardar los cambios",
                        ComponentesTab.CLIENTE_DETALLE.getTitulo(),
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[1]);

                if (actualizar == JOptionPane.YES_OPTION) {
                    if (!detalleCliente.getNombre().equals(detalleNombreTextField.getText())) {
                        detalleCliente.setNombre(detalleNombreTextField.getText());
                    }
                    if (!detalleCliente.getApellidos().equals(detalleApellidoTextField.getText())) {
                        detalleCliente.setApellidos(detalleApellidoTextField.getText());
                    }
                    if (!detalleCliente.getNumeroDocumento().equals(detalleNumeroDocTextField.getText())) {
                        detalleCliente.setNumeroDocumento(detalleNumeroDocTextField.getText());
                    }
                    if (!detalleCliente.getTipoDocumento().equals((String) detalleTipoDocJComboBox.getSelectedItem())) {
                        detalleCliente.setTipoDocumento((String) detalleTipoDocJComboBox.getSelectedItem());
                    }
                    if (!detalleCliente.getTipoPersona().equals((String) detalleTipoPersonajComboBox.getSelectedItem())) {
                        detalleCliente.setTipoPersona((String) detalleTipoPersonajComboBox.getSelectedItem());
                    }
                    if (!detalleCliente.getDireccion().equals(detalleDireccionTextField.getText())) {
                        detalleCliente.setDireccion(detalleDireccionTextField.getText());
                    }
                    if (!detalleCliente.getTelefono().equals(detalletelefonoTextField.getText())) {
                        detalleCliente.setTelefono(detalletelefonoTextField.getText());
                    }
                    if (!detalleCliente.getEmail().equals(detalleEmailTextField.getText())) {
                        detalleCliente.setEmail(detalleEmailTextField.getText());
                    }

                    detalleCliente.setModificador(usuario.getUsername());
                    detalleCliente.setFechaModificacion(new Date());

                    detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
                    detalleEditarInProgress = false;
                    detalleSalirButton.setEnabled(true);

                    try {
                        if (clienteController.actualizar(detalleCliente)) {
                            fillDetalleCliente();
                        }
                    } catch (Exception e) {
                        detalleValidacionLabel.setText(e.getMessage());
                        detalleValidacionLabel.setVisible(true);
                    }

                }
            }
        }
    }

    private void detalleSalirButtonActionPerformed(ActionEvent evt) {

        detalleClienteLabel.setText("");
        detalleNombreTextField.setText("");

        detalleApellidoTextField.setText("");
        detalleNumeroDocTextField.setText("");
        detalleTipoDocJComboBox.setSelectedItem(ClienteTipoDocumento.DNI.name());
        detalleTipoPersonajComboBox.setSelectedItem(ClienteTipoPersona.NATURAL.name());
        detalletelefonoTextField.setText("");
        detalleDireccionTextField.setText("");
        detalleEmailTextField.setText("");

        clienteVentaTable.setModel(
                new ClienteVentaTableModel()
        );

        clientesTable.setRowSelectionAllowed(true);
        detalleInProgress = false;
        nuevoClienteButton.setEnabled(true);

        removeTab(ComponentesTab.CLIENTE_DETALLE.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    private class ClienteTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Id", "Nombres", "Apellidos", "Tipo Doc.", "Num Doc.", "Tipo Clien.", "Creación", "Modificación"
                };

        private List<Cliente> clientes;

        public ClienteTableModel() {
            clientes = new ArrayList<Cliente>();
        }

        public ClienteTableModel(List<Cliente> clientes) {
            this.clientes = clientes;
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
            return clientes.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            Cliente cliente = getCliente(row);

            switch (column) {
                case 0:
                    return cliente.getId();
                case 1:
                    return cliente.getNombre();
                case 2:
                    return cliente.getApellidos();
                case 3:
                    return cliente.getTipoDocumento();
                case 4:
                    return cliente.getNumeroDocumento();
                case 5:
                    return cliente.getTipoPersona();
                case 6:
                    return formatDateToString(cliente.getFechaCreacion());
                case 7:
                    return formatDateToString(cliente.getFechaModificacion());
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            Cliente cliente = getCliente(row);

            switch (column) {
                case 0:
                    cliente.setId((Integer) value);
                    break;
                case 1:
                    cliente.setNombre((String) value);
                    break;
                case 2:
                    cliente.setApellidos((String) value);
                    break;
                case 3:
                    cliente.setTipoDocumento((String) value);
                    break;
                case 4:
                    cliente.setNumeroDocumento((String) value);
                    break;
                case 5:
                    cliente.setTipoPersona((String) value);
                    break;
                case 6:
                    cliente.setFechaCreacion((Date) value);
                    break;
                case 7:
                    cliente.setFechaModificacion((Date) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public Cliente getCliente(int row) {
            return clientes.get(row);
        }

        private String formatDateToString(Date value) {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return value != null ? parser.format(value) : "";
        }
    }

    private class ClienteVentaTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Correlativo", "Serie", "Importe Total", "Creador", "Creación"
                };

        private List<Venta> ventas;

        public ClienteVentaTableModel() {
            ventas = new ArrayList<Venta>();
        }

        public ClienteVentaTableModel(List<Venta> clientes) {
            this.ventas = clientes;
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
                    return venta.getCorrelativo();
                case 1:
                    return venta.getSerie();
                case 2:
                    return venta.getImporteTotal();
                case 3:
                    return venta.getCreador();
                case 4:
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
                    venta.setCorrelativo((String) value);
                    break;
                case 1:
                    venta.setSerie((String) value);
                    break;
                case 2:
                    venta.setImporteTotal((Double) value);
                    break;
                case 3:
                    venta.setCreador((String) value);
                    break;
                case 4:
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

}
