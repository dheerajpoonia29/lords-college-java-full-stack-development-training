package org.example.module_8.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.File;
import java.util.List;

public class TeacherService {
    SessionFactory sf;

    TeacherService () {
        Configuration conn = new Configuration();
        sf = conn.configure(new File("src/main/java/org/example/module_8/hibernate/hibernate.cfg.xml")).buildSessionFactory();
    }
    public void create() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Teacher obj = new Teacher();
        obj.setName("dheeraj");
        obj.setAge(22);
        session.save(obj);
        session.flush();
        transaction.commit();
        session.close();
    }

    public void readAll() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Teacher", Teacher.class);
        List<Teacher> lst = (List<Teacher>) query.list();
        for(Teacher obj: lst) {
            System.out.println(obj);
        }
        session.flush();
        transaction.commit();
        session.close();
    }

}
