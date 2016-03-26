package com.ccs.app;

import com.ccs.model.dao.PersonDAO;
import com.ccs.model.entity.Person;
import com.ccs.model.hibernate.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Person person = new Person();
        person.setNombre("Anderson");
        person.setApellido("Montañez");
        person.setDocIdentidad(20639227);
        person.setTelefono("0424-2977298");
        person.setDireccion("Propatria");
        person.setUsuarioId(1);

        PersonDAO dao = new PersonDAO();
        dao.addPerson(person);
    }
}
