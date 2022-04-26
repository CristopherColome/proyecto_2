/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.app;

import com.grupo.view.MainView;
import java.awt.EventQueue;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author ccolome
 */
public class Application {

    static {
        BasicConfigurator.configure();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> new MainView(getEntityManager()).setVisible(true));
    }

    public static EntityManager getEntityManager() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("CONNECTION_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

}
