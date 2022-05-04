/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.view;

/**
 *
 * @author ccolome
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.grupo.controller.UsuarioController;
import com.grupo.entity.Usuario;
import com.grupo.util.Constantes.Evento;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.SwingConstants;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.apache.shiro.authc.credential.PasswordMatcher;
import org.apache.shiro.authc.credential.PasswordService;

/**
 *
 * @author ccolome
 */
public class LoginView extends JPanel {

    private final PasswordService passwordService = new PasswordMatcher().getPasswordService();

    private UsuarioController usuarioController;

    private JPanel principalPanel;

    private JLabel nombreLabel;

    private JSeparator separator;

    private JLabel usuarioLabel;
    private JLabel passwordLabel;

    private JTextField usuarioField;
    private JPasswordField passwordField;

    private JButton ingresarButton;

    private JLabel validacionPassLabel;
    private JLabel validacionSesionLabel;
    private JLabel validacionUsuarioLabel;

    public LoginView() {
        initController();
        initComponents();

    }

    private void initController() {
        this.usuarioController = new UsuarioController();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        principalPanel = new JPanel();
        nombreLabel = new JLabel();
        separator = new JSeparator(SwingConstants.VERTICAL);
        usuarioLabel = new JLabel();
        passwordLabel = new JLabel();
        usuarioField = new JTextField();
        passwordField = new JPasswordField();
        ingresarButton = new JButton();

        validacionUsuarioLabel = new JLabel();
        validacionPassLabel = new JLabel();
        validacionSesionLabel = new JLabel();

        principalPanel.setPreferredSize(new Dimension(720, 480));

        nombreLabel.setFont(new java.awt.Font("Dialog", 1, 30));
        nombreLabel.setText("<html><body>Sistema de gestión<br>bodega Rosita</body></html>");

        separator.setBackground(Color.black);

        usuarioLabel.setText("Usuario:");

        passwordLabel.setText("Contraseña:");

        validacionUsuarioLabel.setBackground(new Color(255, 0, 0));
        validacionUsuarioLabel.setFont(new Font("Dialog", 0, 10));
        validacionUsuarioLabel.setForeground(new Color(255, 0, 0));
        validacionUsuarioLabel.setText("El campo usuario es obligatorio");
        validacionUsuarioLabel.setVisible(false);

        validacionPassLabel.setBackground(new Color(255, 0, 0));
        validacionPassLabel.setFont(new Font("Dialog", 0, 10));
        validacionPassLabel.setForeground(new Color(255, 0, 0));
        validacionPassLabel.setText("El campo contraseña es obligatorio");
        validacionPassLabel.setVisible(false);

        validacionSesionLabel.setBackground(new Color(255, 0, 0));
        validacionSesionLabel.setFont(new Font("Dialog", 0, 11)); // NOI18N
        validacionSesionLabel.setForeground(new Color(255, 0, 0));
        validacionSesionLabel.setText("Usuario o Contraseña no válidos.");
        validacionSesionLabel.setVisible(false);

        usuarioField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                validacionSesionLabel.setVisible(false);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                validacionUsuarioLabel.setVisible(false);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
            }
        });

        passwordField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void removeUpdate(DocumentEvent e) {
                validacionSesionLabel.setVisible(false);
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                validacionPassLabel.setVisible(false);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        ingresarButton.setText("Ingresar");
        ingresarButton.setIcon(new ImageIcon(getClass().getResource("/imagenes/iniciar-sesion.png")));
        ingresarButton.addActionListener(e -> this.ingresarButtonActionPerformed(e));

        GroupLayout jPanel1Layout = new GroupLayout(principalPanel);
        principalPanel.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(nombreLabel, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(separator, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(usuarioField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(validacionSesionLabel)
                                        .addComponent(ingresarButton, GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(validacionPassLabel)
                                        .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(validacionUsuarioLabel)
                                        .addComponent(usuarioLabel)
                                        .addComponent(passwordLabel))
                                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(separator)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(108, Short.MAX_VALUE)
                                .addComponent(usuarioLabel)
                                .addGap(12, 12, 12)
                                .addComponent(usuarioField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validacionUsuarioLabel)
                                .addGap(18, 18, 18)
                                .addComponent(passwordLabel)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validacionPassLabel)
                                .addGap(18, 18, 18)
                                .addComponent(ingresarButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(validacionSesionLabel)
                                .addGap(135, 135, 135))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(nombreLabel, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(principalPanel, GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(principalPanel, GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

    private void ingresarButtonActionPerformed(ActionEvent evt) {

        boolean loginValidio = true;

        if (usuarioField.getText().trim().equals("")) {
            validacionUsuarioLabel.setVisible(true);
            loginValidio = false;
        }
        if (String.valueOf(passwordField.getPassword()).trim().equals("")) {
            validacionPassLabel.setVisible(true);
            loginValidio = false;
        }

        if (loginValidio) {
            try {
                Usuario user = usuarioController.obtener(usuarioField.getText());
                Boolean passValido = passwordService.passwordsMatch(
                        String.valueOf(passwordField.getPassword()),
                        user.getPassword());

                if (passValido) {
                    firePropertyChange(Evento.USUARIO_LOGUEADO.name(), null, user);
                } else {
                    throw new Exception("Invalid Password Exception");
                }
            } catch (Exception e) {
                validacionSesionLabel.setVisible(true);
                System.out.println(e);
            }

        }

    }
}
