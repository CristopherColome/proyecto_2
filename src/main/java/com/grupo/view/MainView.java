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

    private final EntityManager entityManager;

    private UsuarioController usuarioController;

    public MainView(EntityManager entityManager) {

        this.entityManager = entityManager;

        initController();
        initComponents();

    }

    private void initController() {
        this.usuarioController = new UsuarioController(entityManager);
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
