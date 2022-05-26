/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.UsuarioController;
import com.grupo.entity.Usuario;
import com.grupo.util.Constantes;
import com.grupo.util.Constantes.ClienteTipoPersona;
import com.grupo.util.Constantes.ComponentesTab;
import com.grupo.util.Constantes.PersonaTipoDocumento;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.authc.credential.PasswordService;

/**
 *
 * @author ccolome
 */
public class UsuarioView extends JTabbedPane {

    private final PasswordService passwordService = new PasswordMatcher().getPasswordService();

    private UsuarioController usuarioController;

    private Usuario usuario;

    private javax.swing.JTable clienteVentaTable;
    private javax.swing.JLabel consultaBuscarLabel;
    private javax.swing.JTextField consultaBuscarTextField;
    private javax.swing.JPanel consultaPanel;
    private javax.swing.JButton nuevoUsuarioButton;
    private javax.swing.JScrollPane tablaUsuariosjScrollPane;
    private javax.swing.JTable usuariosTable;
    private javax.swing.JButton detalleVerUsuarioButton;

    private Integer selectedUsuariosTable;

    //REGISTRO
    private javax.swing.JLabel nuevoApellidoLabel;
    private javax.swing.JTextField nuevoApellidoTextField;
    private javax.swing.JButton nuevoCancelarButton;
    private javax.swing.JLabel nuevoConfirmarPasslLabel;
    private javax.swing.JPasswordField nuevoConfirmarjPasswordField;
    private javax.swing.JLabel nuevoContraseñaLabel;
    private javax.swing.JLabel nuevoDIreccionLabel;
    private javax.swing.JTextField nuevoDireccionTextField;
    private javax.swing.JLabel nuevoEmailLabel;
    private javax.swing.JTextField nuevoEmailTextField;
    private javax.swing.JLabel nuevoNombreLabel;
    private javax.swing.JTextField nuevoNombreTextField;
    private javax.swing.JLabel nuevoNombreUsuarioLabel;
    private javax.swing.JTextField nuevoNombreUsuarioTextField;
    private javax.swing.JLabel nuevoNumeroDocLabel;
    private javax.swing.JTextField nuevoNumeroDocTextField;
    private javax.swing.JButton nuevoRegistrarButton;
    private javax.swing.JLabel nuevoTIpoPersonaLabel;
    private javax.swing.JLabel nuevoTIpoUsuarioLabel1;
    private javax.swing.JLabel nuevoTelefonoLabel;
    private javax.swing.JComboBox<String> nuevoTipoDocJComboBox;
    private javax.swing.JLabel nuevoTipoDocULabel;
    private javax.swing.JComboBox<String> nuevoTipoPersonajComboBox;
    private javax.swing.JComboBox<String> nuevoTipoUsuariojComboBox;
    private javax.swing.JLabel nuevoUsuarioLabel;
    private javax.swing.JLabel nuevoValidacionLabel;
    private javax.swing.JPasswordField nuevojPasswordField;
    private javax.swing.JTextField nuevotelefonoTextField;
    private javax.swing.JPanel registroPanel;
    //DETALLE
    private Boolean detalleInProgress = false;
    private Boolean detalleEditarInProgress = false;
    private Usuario detalleUsuario;
    private javax.swing.JTextField detalleApellidoTextField;
    private javax.swing.JLabel detalleConfirmarPasslLabel;
    private javax.swing.JPasswordField detalleConfirmarjPasswordField;
    private javax.swing.JLabel detalleDIreccionLabel;
    private javax.swing.JTextField detalleDireccionTextField;
    private javax.swing.JButton detalleEditarButton;
    private javax.swing.JLabel detalleEmailLabel;
    private javax.swing.JTextField detalleEmailTextField;
    private javax.swing.JLabel detalleMarcaLabel;
    private javax.swing.JLabel detalleNombreLabel;
    private javax.swing.JTextField detalleNombreTextField;
    private javax.swing.JLabel detalleNombreUsuarioLabel;
    private javax.swing.JTextField detalleNombreUsuarioTextField;
    private javax.swing.JTextField detalletelefonoTextField;
    private javax.swing.JTextField detalleNumeroDocTextField;
    private javax.swing.JLabel detalleNumeroDocLabel;
    private javax.swing.JPanel detallePanel;
    private javax.swing.JButton detalleSalirButton;
    private javax.swing.JLabel detalleTIpoPersonaLabel;
    private javax.swing.JLabel detalleTIpoUsuarioLabel;
    private javax.swing.JLabel detalleTelefonoLabel;
    private javax.swing.JComboBox<String> detalleTipoDocJComboBox;
    private javax.swing.JLabel detalleTipoDocULabel;
    private javax.swing.JComboBox<String> detalleTipoPersonajComboBox;
    private javax.swing.JComboBox<String> detalleTipoUsuariojComboBox;
    private javax.swing.JLabel detalleUsuarioLabel;
    private javax.swing.JLabel detalleValidacionLabel;
    private javax.swing.JPasswordField detallejPasswordField;
    private javax.swing.JLabel detallepassLabel;

    public UsuarioView() {
        initController();
        initComponents();
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    private void initController() {
        usuarioController = new UsuarioController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        consultaPanel = new javax.swing.JPanel();
        consultaBuscarLabel = new javax.swing.JLabel();
        consultaBuscarTextField = new javax.swing.JTextField();
        nuevoUsuarioButton = new javax.swing.JButton();
        tablaUsuariosjScrollPane = new javax.swing.JScrollPane();
        usuariosTable = new javax.swing.JTable();
        detalleVerUsuarioButton = new javax.swing.JButton();
        registroPanel = new javax.swing.JPanel();
        nuevoUsuarioLabel = new javax.swing.JLabel();
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
        nuevoConfirmarPasslLabel = new javax.swing.JLabel();
        nuevoTipoPersonajComboBox = new javax.swing.JComboBox<>();
        nuevoNombreUsuarioLabel = new javax.swing.JLabel();
        nuevoNombreUsuarioTextField = new javax.swing.JTextField();
        nuevoConfirmarjPasswordField = new javax.swing.JPasswordField();
        nuevoContraseñaLabel = new javax.swing.JLabel();
        nuevoTIpoUsuarioLabel1 = new javax.swing.JLabel();
        nuevoTipoUsuariojComboBox = new javax.swing.JComboBox<>();
        nuevoEmailLabel = new javax.swing.JLabel();
        nuevoEmailTextField = new javax.swing.JTextField();
        nuevojPasswordField = new javax.swing.JPasswordField();
        detallePanel = new javax.swing.JPanel();
        detalleUsuarioLabel = new javax.swing.JLabel();
        detalleNombreLabel = new javax.swing.JLabel();
        detalleNombreTextField = new javax.swing.JTextField();
        detalleApellidoTextField = new javax.swing.JTextField();
        detalleMarcaLabel = new javax.swing.JLabel();
        detalleEditarButton = new javax.swing.JButton();
        detalleSalirButton = new javax.swing.JButton();
        detalleValidacionLabel = new javax.swing.JLabel();
        detalleTipoPersonajComboBox = new javax.swing.JComboBox<>();
        detalleTIpoPersonaLabel = new javax.swing.JLabel();
        detalleTipoDocULabel = new javax.swing.JLabel();
        detalleTipoDocJComboBox = new javax.swing.JComboBox<>();
        detalleNumeroDocLabel = new javax.swing.JLabel();
        detalleNombreUsuarioLabel = new javax.swing.JLabel();
        detalleNombreUsuarioTextField = new javax.swing.JTextField();
        detalleNumeroDocTextField = new javax.swing.JTextField();
        detalleTelefonoLabel = new javax.swing.JLabel();
        detalletelefonoTextField = new javax.swing.JTextField();
        detalleDIreccionLabel = new javax.swing.JLabel();
        detalleDireccionTextField = new javax.swing.JTextField();
        detalleEmailLabel = new javax.swing.JLabel();
        detalleEmailTextField = new javax.swing.JTextField();
        detalleConfirmarjPasswordField = new javax.swing.JPasswordField();
        detalleConfirmarPasslLabel = new javax.swing.JLabel();
        detallepassLabel = new javax.swing.JLabel();
        detallejPasswordField = new javax.swing.JPasswordField();
        detalleTIpoUsuarioLabel = new javax.swing.JLabel();
        detalleTipoUsuariojComboBox = new javax.swing.JComboBox<>();

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

        nuevoUsuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        nuevoUsuarioButton.setText("Nuevo");
        nuevoUsuarioButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            nuevoUsuarioButtonActionPerformed(evt);
        });

        usuariosTable.setModel(new UsuarioTableModel(usuarioController.listar()));
        usuariosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        usuariosTable.setRowSelectionAllowed(true);
        usuariosTable.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (!detalleInProgress) {
                    int row = usuariosTable.getSelectedRow();

                    if (selectedUsuariosTable != null && selectedUsuariosTable.equals(row)) {
                        usuariosTable.getSelectionModel().clearSelection();
                        selectedUsuariosTable = null;
                        detalleVerUsuarioButton.setVisible(false);
                    } else {
                        selectedUsuariosTable = row;
                        detalleVerUsuarioButton.setText("Usuario N°: " + usuariosTable.getValueAt(row, 0));
                        detalleVerUsuarioButton.setVisible(true);
                    }
                }
            }
        });

        tablaUsuariosjScrollPane.setViewportView(usuariosTable);

        detalleVerUsuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        detalleVerUsuarioButton.setText("Usuario N°");
        detalleVerUsuarioButton.addActionListener((java.awt.event.ActionEvent evt) -> {
            detalleVerUsuarioButtonActionPerformed(evt);
        });
        detalleVerUsuarioButton.setVisible(false);

        javax.swing.GroupLayout consultaPanelLayout = new javax.swing.GroupLayout(consultaPanel);
        consultaPanel.setLayout(consultaPanelLayout);
        consultaPanelLayout.setHorizontalGroup(
                consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, consultaPanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(consultaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(tablaUsuariosjScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)
                                        .addGroup(consultaPanelLayout.createSequentialGroup()
                                                .addComponent(consultaBuscarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(consultaBuscarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleVerUsuarioButton)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(nuevoUsuarioButton)))
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
                                                        .addComponent(nuevoUsuarioButton)
                                                        .addComponent(detalleVerUsuarioButton))))
                                .addGap(18, 18, 18)
                                .addComponent(tablaUsuariosjScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addTab(ComponentesTab.USUARIO_CONSULTA.getTitulo(), consultaPanel);

        nuevoUsuarioLabel.setText("Nuevo usuario");

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
                Constantes.getNnombres(Constantes.PersonaTipoDocumento.class)
        ));

        nuevoNumeroDocLabel.setText("<html><body>Numero<br>documento:</body></html>");

        nuevoDIreccionLabel.setText("DIrección:");

        nuevoTelefonoLabel.setText("Teléfono:");

        nuevoConfirmarPasslLabel.setText("<html><body>Contraseña<br>confirmar:</body></html>");

        nuevoTipoPersonajComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(ClienteTipoPersona.class)
                )
        );
        nuevoNombreUsuarioLabel.setText("<html><body>Nombre<br>de<br>Usuario:</body></html>");

        nuevoContraseñaLabel.setText("Contraseña:");

        nuevoTIpoUsuarioLabel1.setText("<html><body>Tipo<br>Usuario:</body></html>");

        nuevoTipoUsuariojComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(Constantes.Rol.class)
                )
        );
        nuevoEmailLabel.setText("Email:");

        javax.swing.GroupLayout registroPanelLayout = new javax.swing.GroupLayout(registroPanel);
        registroPanel.setLayout(registroPanelLayout);
        registroPanelLayout.setHorizontalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoUsuarioLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoValidacionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(nuevoApellidoLabel)
                                                                        .addComponent(nuevoNombreLabel))
                                                                .addGap(34, 34, 34)
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(registroPanelLayout.createSequentialGroup()
                                                                        .addComponent(nuevoTelefonoLabel)
                                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(registroPanelLayout.createSequentialGroup()
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(nuevoCancelarButton)
                                                                                        .addGap(83, 83, 83))
                                                                                .addGroup(registroPanelLayout.createSequentialGroup()
                                                                                        .addGap(29, 29, 29)
                                                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(nuevoDireccionTextField)
                                                                                                .addComponent(nuevotelefonoTextField)))))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, registroPanelLayout.createSequentialGroup()
                                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(nuevoNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(nuevoDIreccionLabel)
                                                                                .addComponent(nuevoNombreUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(nuevoNombreUsuarioTextField)
                                                                                .addComponent(nuevoNumeroDocTextField)))))
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGap(109, 109, 109)
                                                                .addComponent(nuevoRegistrarButton))
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                                .addGap(26, 26, 26)
                                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(nuevoTIpoUsuarioLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(nuevoTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(nuevoTIpoPersonaLabel))
                                                                                .addGap(22, 22, 22))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(nuevoConfirmarPasslLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(nuevoContraseñaLabel)
                                                                                        .addComponent(nuevoEmailLabel))
                                                                                .addGap(18, 18, 18)))
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(nuevoTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoTipoPersonajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoTipoUsuariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevojPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoConfirmarjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addContainerGap(22, Short.MAX_VALUE))
        );
        registroPanelLayout.setVerticalGroup(
                registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(registroPanelLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoUsuarioLabel)
                                        .addComponent(nuevoValidacionLabel))
                                .addGap(33, 33, 33)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nuevoTIpoPersonaLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(nuevoNombreLabel)
                                                                .addComponent(nuevoNombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addComponent(nuevoTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(nuevoApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(nuevoApellidoLabel)))))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addComponent(nuevoTipoPersonajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(nuevoTIpoUsuarioLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registroPanelLayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(nuevoNumeroDocTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoNumeroDocLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoTipoUsuariojComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(nuevoNombreUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevotelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoTelefonoLabel)
                                                        .addComponent(nuevoConfirmarPasslLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoConfirmarjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(registroPanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nuevoNombreUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nuevoContraseñaLabel)
                                                        .addComponent(nuevojPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoDIreccionLabel)
                                        .addComponent(nuevoDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nuevoEmailLabel)
                                        .addComponent(nuevoEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(42, 42, 42)
                                .addGroup(registroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(nuevoCancelarButton)
                                        .addComponent(nuevoRegistrarButton))
                                .addGap(35, 35, 35))
        );
        detalleUsuarioLabel.setText(" Detalle usuario : N° ");

        detalleNombreLabel.setText("Nombre:");

        detalleMarcaLabel.setText("Apellido:");

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
        detalleValidacionLabel.setVisible(true);

        detalleTipoPersonajComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(ClienteTipoPersona.class)
                )
        );
        detalleTIpoPersonaLabel.setText("Tipo:");

        detalleTipoDocULabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detalleTipoDocULabel.setText("<html><body>Tipo<br>documento:</body></html>");

        detalleTipoDocJComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(
                Constantes.getNnombres(Constantes.PersonaTipoDocumento.class)
        ));

        detalleNumeroDocLabel.setText("<html><body>Numero<br>documento:</body></html>");

        detalleNombreUsuarioLabel.setText("<html><body>Nombre<br>de<br>Usuario:</body></html>");

        detalleTelefonoLabel.setText("Teléfono:");

        detalleDIreccionLabel.setText("DIrección:");

        detalleEmailLabel.setText("Email:");

        detalleConfirmarPasslLabel.setText("<html><body>Contraseña<br>confirmar:</body></html>");
        detalleConfirmarPasslLabel.setVisible(false);

        detallepassLabel.setText("Contraseña:");
        detallepassLabel.setVisible(false);

        detalleTIpoUsuarioLabel.setText("<html><body>Tipo<br>Usuario:</body></html>");

        detallejPasswordField.setVisible(false);

        detalleConfirmarjPasswordField.setVisible(false);

        detalleTipoUsuariojComboBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(
                        Constantes.getNnombres(Constantes.Rol.class)
                )
        );

        javax.swing.GroupLayout detallePanelLayout = new javax.swing.GroupLayout(detallePanel);
        detallePanel.setLayout(detallePanelLayout);
        detallePanelLayout.setHorizontalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleUsuarioLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleValidacionLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(detalleEditarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(detalleMarcaLabel)
                                                        .addComponent(detalleNombreLabel))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(detalleTipoPersonajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(detalleTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleTelefonoLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(detalletelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(detalleNumeroDocLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(detalleDIreccionLabel)
                                                                        .addComponent(detalleEmailLabel)
                                                                        .addComponent(detalleNombreUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addComponent(detalleNumeroDocTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                                                                                        .addComponent(detalleApellidoTextField)
                                                                                        .addComponent(detalleNombreTextField)
                                                                                        .addComponent(detalleNombreUsuarioTextField)))
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addGap(12, 12, 12)
                                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(detalleEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(detalleDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                                .addGap(18, 18, 18)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addComponent(detalleTIpoUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(detallepassLabel)
                                                                                        .addComponent(detalleConfirmarPasslLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(detalleTipoUsuariojComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(detalleConfirmarjPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(detallejPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(detalleTIpoPersonaLabel)
                                                                        .addComponent(detalleTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap())
        );
        detallePanelLayout.setVerticalGroup(
                detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(detallePanelLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(detalleUsuarioLabel)
                                                .addComponent(detalleValidacionLabel))
                                        .addComponent(detalleSalirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleEditarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(detalleNombreLabel)
                                                                        .addComponent(detalleNombreTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, detallePanelLayout.createSequentialGroup()
                                                                .addComponent(detalleTIpoPersonaLabel)
                                                                .addGap(16, 16, 16)))
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalleMarcaLabel)
                                                        .addComponent(detalleApellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(detalleTipoDocULabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addComponent(detalleTipoPersonajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(21, 21, 21)
                                                .addComponent(detalleTipoDocJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(detalleTIpoUsuarioLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleNumeroDocTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleNumeroDocLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleTipoUsuariojComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(detalleNombreUsuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalletelefonoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(detalleTelefonoLabel)
                                                        .addComponent(detalleConfirmarPasslLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(detalleConfirmarjPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(detallePanelLayout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(detalleNombreUsuarioTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(detallepassLabel)
                                                        .addComponent(detallejPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleDireccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(detalleDIreccionLabel))
                                .addGap(22, 22, 22)
                                .addGroup(detallePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(detalleEmailLabel)
                                        .addComponent(detalleEmailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(58, Short.MAX_VALUE))
        );

        //addTab("Detalle de usuario", detallePanel);
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
            List<Usuario> usuarios = usuarioController.consultar(consultaBuscarTextField.getText());

            if (usuarios.size() > 0) {
                usuariosTable.setModel(new UsuarioTableModel(usuarios));
            }
        }
    }

    private void nuevoUsuarioButtonActionPerformed(ActionEvent evt) {
        nuevoUsuarioButton.setEnabled(false);
        addTab(Constantes.ComponentesTab.USUARIO_REGISTRO.getTitulo(), registroPanel);
        setSelectedComponent(registroPanel);
    }

    private void nuevoRegistrarButtonActionPerformed(ActionEvent evt) {
        boolean registroValido = true;

        if (nuevoNombreTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("El campo nombre es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoApellidoTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("El campo apellido es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoNumeroDocTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("El campo numero de documento es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (nuevoNombreUsuarioTextField.getText().trim().equals("")) {
            nuevoValidacionLabel.setText("El campo nombre de usuario es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (Arrays.toString(nuevojPasswordField.getPassword()).trim().equals("")) {
            nuevoValidacionLabel.setText("El campo contraseña es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (Arrays.toString(nuevoConfirmarjPasswordField.getPassword()).trim().equals("")) {
            nuevoValidacionLabel.setText("El campo confirmar contraseña es obligatorio.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }
        if (!Arrays.equals(nuevojPasswordField.getPassword(), nuevoConfirmarjPasswordField.getPassword())) {
            nuevoValidacionLabel.setText("Las contraseñas no coinciden.");
            nuevoValidacionLabel.setVisible(true);
            registroValido = false;
        }

        if (registroValido) {

            nuevoValidacionLabel.setText("");
            nuevoValidacionLabel.setVisible(false);

            registrarUsuario();
        }
    }

    private void registrarUsuario() {
        String[] opciones = {"Sí", "No"};

        int registrar = JOptionPane.showOptionDialog(
                this,
                "Se registrará un nuevo usuario.",
                Constantes.ComponentesTab.USUARIO_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (registrar == JOptionPane.YES_OPTION) {

            Usuario nuevoUsuario = new Usuario();
            nuevoUsuario.setTipo(Constantes.PersonaTipo.U.name());

            nuevoUsuario.setNombre(nuevoNombreTextField.getText());
            nuevoUsuario.setApellidos(nuevoApellidoTextField.getText());
            nuevoUsuario.setNumeroDocumento(nuevoNumeroDocTextField.getText());
            nuevoUsuario.setTipoDocumento((String) nuevoTipoDocJComboBox.getSelectedItem());
            nuevoUsuario.setTipoPersona((String) nuevoTipoPersonajComboBox.getSelectedItem());

            nuevoUsuario.setUsername(nuevoNombreUsuarioTextField.getText());
            nuevoUsuario.setActivo(Boolean.TRUE);
            nuevoUsuario.setRol((String) nuevoTipoUsuariojComboBox.getSelectedItem());

            String password = passwordService.encryptPassword(
                    String.valueOf(nuevojPasswordField.getPassword())
            );
            nuevoUsuario.setPassword(password);

            if (!nuevotelefonoTextField.getText().trim().equals("")) {
                nuevoUsuario.setTelefono(nuevotelefonoTextField.getText());
            }
            if (!nuevoDireccionTextField.getText().trim().equals("")) {
                nuevoUsuario.setDireccion(nuevoDireccionTextField.getText());
            }
            if (!nuevoEmailTextField.getText().trim().equals("")) {
                nuevoUsuario.setEmail(nuevoEmailTextField.getText());
            }

            nuevoUsuario.setCreador(usuario.getUsername());
            nuevoUsuario.setFechaCreacion(new Date());

            try {
                usuarioController.registrar(nuevoUsuario);
                nuevoRegistroFinalizar();

            } catch (Exception e) {
                nuevoValidacionLabel.setText(e.getMessage());
                nuevoValidacionLabel.setVisible(true);
            }

        }
    }

    private void nuevoRegistroFinalizar() {
        nuevoNombreTextField.setText("");
        nuevoApellidoTextField.setText("");
        nuevoNumeroDocTextField.setText("");
        nuevoTipoDocJComboBox.setSelectedItem(PersonaTipoDocumento.DNI.name());
        nuevoTipoPersonajComboBox.setSelectedItem(ClienteTipoPersona.NATURAL.name());
        nuevoTipoUsuariojComboBox.setSelectedItem(Constantes.Rol.VENDEDOR.name());
        nuevoNombreUsuarioTextField.setText("");
        nuevojPasswordField.setText("");
        nuevoConfirmarjPasswordField.setText("");
        nuevotelefonoTextField.setText("");
        nuevoDireccionTextField.setText("");
        nuevoEmailTextField.setText("");

        usuariosTable.setModel(new UsuarioTableModel(usuarioController.listar()));
        usuariosTable.setRowSelectionAllowed(true);

        nuevoUsuarioButton.setEnabled(true);
        removeTab(ComponentesTab.USUARIO_REGISTRO.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    private void nuevoCancelarButtonActionPerformed(ActionEvent evt) {
        String[] opciones = {"Sí", "No"};

        int cancelar = JOptionPane.showOptionDialog(
                this,
                "¿Esta seguro de cancelar el registro?",
                ComponentesTab.USUARIO_REGISTRO.getTitulo(),
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[1]);

        if (cancelar == JOptionPane.YES_OPTION) {
            nuevoRegistroFinalizar();
        }
    }

    private void detalleVerUsuarioButtonActionPerformed(ActionEvent evt) {
        detalleInProgress = true;
        usuariosTable.setRowSelectionAllowed(false);
        detalleVerUsuarioButton.setVisible(false);
        nuevoUsuarioButton.setEnabled(false);

        detalleUsuario = usuarioController.obtener(
                (Integer) usuariosTable.getValueAt(usuariosTable.getSelectedRow(), 0)
        );

        fillDetalleUsuario();
        addTab(ComponentesTab.USUARIO_DETALLE.getTitulo(), detallePanel);
        setSelectedComponent(detallePanel);
    }

    private void fillDetalleUsuario() {
        if (detalleUsuario.getTelefono() == null) {
            detalleUsuario.setTelefono("");
        }
        if (detalleUsuario.getEmail() == null) {
            detalleUsuario.setEmail("");
        }
        if (detalleUsuario.getDireccion() == null) {
            detalleUsuario.setDireccion("");
        }

        detalleUsuarioLabel.setText(" Detalle usuario : N° " + detalleUsuario.getId());

        detalleNombreTextField.setText(detalleUsuario.getNombre());
        detalleNombreTextField.setEditable(false);

        detalleApellidoTextField.setText(detalleUsuario.getApellidos());
        detalleApellidoTextField.setEditable(false);

        detalleNumeroDocTextField.setText(detalleUsuario.getNumeroDocumento());
        detalleNumeroDocTextField.setEditable(false);

        detalleTipoDocJComboBox.setSelectedItem(detalleUsuario.getTipoDocumento());
        detalleTipoDocJComboBox.setEnabled(false);

        detalleTipoPersonajComboBox.setSelectedItem(detalleUsuario.getTipoPersona());
        detalleTipoPersonajComboBox.setEnabled(false);

        detalleTipoUsuariojComboBox.setSelectedItem(detalleUsuario.getRol());
        detalleTipoPersonajComboBox.setEnabled(true);

        detalletelefonoTextField.setText(detalleUsuario.getTelefono());
        detalletelefonoTextField.setEditable(false);

        detalleDireccionTextField.setText(detalleUsuario.getDireccion());
        detalleDireccionTextField.setEditable(false);

        detalleEmailTextField.setText(detalleUsuario.getEmail());
        detalleEmailTextField.setEditable(false);

        detalleNombreUsuarioTextField.setText(detalleUsuario.getUsername());
        detalleNombreUsuarioTextField.setEditable(false);

        detallejPasswordField.setText(detalleUsuario.getPassword());
        detallejPasswordField.setEditable(false);
        detallejPasswordField.setVisible(false);
        detallepassLabel.setVisible(false);

        detalleConfirmarjPasswordField.setText(detalleUsuario.getPassword());
        detalleConfirmarjPasswordField.setEditable(false);
        detalleConfirmarjPasswordField.setVisible(false);
        detalleConfirmarPasslLabel.setVisible(false);

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

            detalleTipoUsuariojComboBox.setEnabled(true);
            detalleTipoUsuariojComboBox.setEditable(true);

            detalletelefonoTextField.setEditable(true);
            detalleDireccionTextField.setEditable(true);
            detalleEmailTextField.setEditable(true);

            detalleNombreUsuarioTextField.setEditable(true);
            detallejPasswordField.setEditable(true);
            detalleConfirmarjPasswordField.setEditable(true);

            detallepassLabel.setVisible(true);
            detallejPasswordField.setVisible(true);
            detalleConfirmarPasslLabel.setVisible(true);
            detalleConfirmarjPasswordField.setVisible(true);

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

            if (detalleNombreUsuarioTextField.getText().trim().equals("")) {
                detalleValidacionLabel.setText("El campo nombre de usuario es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (Arrays.toString(detallejPasswordField.getPassword()).trim().equals("")) {
                detalleValidacionLabel.setText("El campo contraseña es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (Arrays.toString(detalleConfirmarjPasswordField.getPassword()).trim().equals("")) {
                detalleValidacionLabel.setText("El campo confirmar contraseña es obligatorio.");
                detalleValidacionLabel.setVisible(true);
                actualizacionValido = false;
            }
            if (!Arrays.equals(detallejPasswordField.getPassword(), detalleConfirmarjPasswordField.getPassword())) {
                detalleValidacionLabel.setText("Las contraseñas no coinciden.");
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
                        ComponentesTab.USUARIO_DETALLE.getTitulo(),
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[1]);

                if (actualizar == JOptionPane.YES_OPTION) {
                    if (!detalleUsuario.getNombre().equals(detalleNombreTextField.getText())) {
                        detalleUsuario.setNombre(detalleNombreTextField.getText());
                    }
                    if (!detalleUsuario.getApellidos().equals(detalleApellidoTextField.getText())) {
                        detalleUsuario.setApellidos(detalleApellidoTextField.getText());
                    }
                    if (!detalleUsuario.getNumeroDocumento().equals(detalleNumeroDocTextField.getText())) {
                        detalleUsuario.setNumeroDocumento(detalleNumeroDocTextField.getText());
                    }
                    if (!detalleUsuario.getTipoDocumento().equals((String) detalleTipoDocJComboBox.getSelectedItem())) {
                        detalleUsuario.setTipoDocumento((String) detalleTipoDocJComboBox.getSelectedItem());
                    }
                    if (!detalleUsuario.getTipoPersona().equals((String) detalleTipoPersonajComboBox.getSelectedItem())) {
                        detalleUsuario.setTipoPersona((String) detalleTipoPersonajComboBox.getSelectedItem());
                    }
                    if (!detalleUsuario.getRol().equals((String) detalleTipoUsuariojComboBox.getSelectedItem())) {
                        detalleUsuario.setTipoPersona((String) detalleTipoUsuariojComboBox.getSelectedItem());
                    }
                    if (!detalleUsuario.getDireccion().equals(detalleDireccionTextField.getText())) {
                        detalleUsuario.setDireccion(detalleDireccionTextField.getText());
                    }
                    if (!detalleUsuario.getTelefono().equals(detalletelefonoTextField.getText())) {
                        detalleUsuario.setTelefono(detalletelefonoTextField.getText());
                    }
                    if (!detalleUsuario.getEmail().equals(detalleEmailTextField.getText())) {
                        detalleUsuario.setEmail(detalleEmailTextField.getText());
                    }
                    if (!detalleUsuario.getUsername().equals(detalleNombreUsuarioTextField.getText())) {
                        detalleUsuario.setUsername(detalleNombreUsuarioTextField.getText());
                    }
                    //PASS
                    if (!passwordService.passwordsMatch(
                            String.valueOf(detallejPasswordField.getPassword()),
                            detalleUsuario.getPassword()
                    )) {
                        String password = passwordService.encryptPassword(
                                String.valueOf(detallejPasswordField.getPassword())
                        );
                        detalleUsuario.setPassword(password);
                    }

                    detalleUsuario.setModificador(usuario.getUsername());
                    detalleUsuario.setFechaModificacion(new Date());

                    detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
                    detalleEditarInProgress = false;
                    detalleSalirButton.setEnabled(true);

                    try {
                        if (usuarioController.actualizar(detalleUsuario)) {
                            fillDetalleUsuario();
                        }
                    } catch (Exception e) {
                        detalleValidacionLabel.setText(e.getMessage());
                        detalleValidacionLabel.setVisible(true);
                    }
                } else {
                    detalleEditarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/editar.png"))); // NOI18N
                    detalleEditarInProgress = false;
                    detalleSalirButton.setEnabled(true);

                    fillDetalleUsuario();
                }
            }

        }
    }

    private void detalleSalirButtonActionPerformed(ActionEvent evt) {

        detalleUsuarioLabel.setText("");
        detalleNombreTextField.setText("");

        detalleApellidoTextField.setText("");
        detalleNumeroDocTextField.setText("");
        detalleTipoDocJComboBox.setSelectedItem(Constantes.PersonaTipoDocumento.DNI.name());
        detalleTipoPersonajComboBox.setSelectedItem(ClienteTipoPersona.NATURAL.name());
        detalleTipoUsuariojComboBox.setSelectedItem(Constantes.Rol.VENDEDOR.name());
        detalletelefonoTextField.setText("");
        detalleDireccionTextField.setText("");
        detalleEmailTextField.setText("");

        detalleNombreUsuarioTextField.setText("");
        detallejPasswordField.setText("");
        detalleConfirmarjPasswordField.setText("");

        usuariosTable.setRowSelectionAllowed(true);
        detalleInProgress = false;
        nuevoUsuarioButton.setEnabled(true);

        removeTab(ComponentesTab.USUARIO_DETALLE.getTitulo());
        setSelectedComponent(consultaPanel);
    }

    private class UsuarioTableModel extends AbstractTableModel {

        private String[] columnNames
                = new String[]{
                    "Id", "Usuario", "Nombres", "Apellidos", "Num Doc.", "Creación", "Modificación"
                };

        private List<Usuario> usuarios;

        public UsuarioTableModel() {
            usuarios = new ArrayList<Usuario>();
        }

        public UsuarioTableModel(List<Usuario> usuarios) {
            this.usuarios = usuarios;
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
            return usuarios.size();
        }

        @Override
        public Object getValueAt(int row, int column) {
            Usuario usuario = getUsuario(row);

            switch (column) {
                case 0:
                    return usuario.getId();
                case 1:
                    return usuario.getUsername();
                case 2:
                    return usuario.getNombre();
                case 3:
                    return usuario.getApellidos();
                case 4:
                    return usuario.getNumeroDocumento();
                case 5:
                    return formatDateToString(usuario.getFechaCreacion());
                case 6:
                    return formatDateToString(usuario.getFechaModificacion());
                default:
                    return null;
            }
        }

        @Override
        public void setValueAt(Object value, int row, int column) {
            Usuario usuario = getUsuario(row);

            switch (column) {
                case 0:
                    usuario.setId((Integer) value);
                    break;
                case 1:
                    usuario.setUsername((String) value);
                    break;
                case 2:
                    usuario.setNombre((String) value);
                    break;
                case 3:
                    usuario.setApellidos((String) value);
                    break;
                case 4:
                    usuario.setFechaCreacion((Date) value);
                    break;
                case 5:
                    usuario.setFechaModificacion((Date) value);
                    break;
            }

            fireTableCellUpdated(row, column);
        }

        public Usuario getUsuario(int row) {
            return usuarios.get(row);
        }

        private String formatDateToString(Date value) {
            SimpleDateFormat parser = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            return value != null ? parser.format(value) : "";
        }
    }
}
