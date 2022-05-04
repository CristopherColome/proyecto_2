/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grupo.app;

import com.grupo.view.MainView;
import java.awt.EventQueue;
import org.apache.log4j.BasicConfigurator;

/**
 *
 * @author ccolome
 */
public class Application {

    static {
        BasicConfigurator.configure();
    }

    public static void main(String[] args) throws InterruptedException {
        EventQueue.invokeLater(() -> new MainView().setVisible(true));
    }

}
