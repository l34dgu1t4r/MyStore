package com.ccs.app;

import com.ccs.model.hibernate.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {

        Session session = (Session) HibernateUtil.getSessionFactory();

        session.load()

    }

    public static void showOptionPane() {
        JOptionPane.showMessageDialog(null, "Alerta de Edi");
    }
}
