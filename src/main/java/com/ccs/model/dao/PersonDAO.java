package com.ccs.model.dao;

import com.ccs.model.entity.Person;
import com.ccs.model.hibernate.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by ANDERSON on 26/03/2016.
 */
public class PersonDAO {
    public Person addPerson(Person person) {
        Session session = null;
        Transaction transaction = null;
        try {
            session = HibernateUtil.getInstance().getSession();
            System.out.println("Session : "+session);
            transaction = session.beginTransaction();
            session.save(person);
            transaction.commit();
            return person;
        } catch (HibernateException e) {
            e.printStackTrace();
            if(transaction != null) {
                transaction.rollback();
            }
            return null;
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
}
