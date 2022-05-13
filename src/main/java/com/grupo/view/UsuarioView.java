/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

import com.grupo.controller.ProductoController;
import com.grupo.controller.ProductoHistorialController;
import com.grupo.controller.UsuarioController;
import com.grupo.entity.Cliente;
import com.grupo.entity.Usuario;
import com.grupo.util.Constantes;
import com.grupo.util.Constantes.ComponentesTab;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JTabbedPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ccolome
 */
public class UsuarioView extends JTabbedPane {

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
//        nuevoUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                nuevoUsuarioButtonActionPerformed(evt);
//            }
//        });

        usuariosTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Id", "Usuario", "Nombres", "Apellidos", "Num Doc.", "Creación", "Modificación"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        usuariosTable.setModel(new UsuarioTableModel());
        usuariosTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        usuariosTable.setRowSelectionAllowed(true);

        tablaUsuariosjScrollPane.setViewportView(usuariosTable);

        detalleVerUsuarioButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa.png"))); // NOI18N
        detalleVerUsuarioButton.setText("Usuario N°");
//        detalleVerUsuarioButton.addActionListener(new java.awt.event.ActionListener() {
//            public void actionPerformed(java.awt.event.ActionEvent evt) {
//                detalleVerUsuarioButtonActionPerformed(evt);
//            }
//        });
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
    }

    private void consultaBuscarTextFieldActionPerformed() {
         if (consultaBuscarTextField.getText().length() > 0) {
            List<Usuario> usuarios = usuarioController.consultar(consultaBuscarTextField.getText());

            if (usuarios.size() > 0) {
                usuariosTable.setModel(new UsuarioTableModel(usuarios));
            }
        }
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
