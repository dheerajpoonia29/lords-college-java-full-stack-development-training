package org.example.module_8_database.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.io.File;
import java.sql.Connection;
import java.util.List;

public class DatabaseOperation {
    SessionFactory sf;

    DatabaseOperation() {
        // initialize connection with database using configuration file

        // initializing configuration
        Configuration configuration = new Configuration();
        configuration.configure(new File("src/main/java/org/example/module_8_database/hibernate/hibernate.cfg.xml"));

        // connecting with database
        sf = configuration.buildSessionFactory();
    }

    public void createTeacher() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        Teacher t1 = new Teacher("xyz", 22); // row in a table
        session.save(t1);

        session.flush();
        transaction.commit();
        session.close();
    }

    public void readAllTeacher() {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // add read logic
        Query query = session.createQuery("from Teacher", Teacher.class);

        // transform query result into Teacher class list
        List<Teacher> lst = (List<Teacher>) query.list();

        for(Teacher t: lst) {
            System.out.println("teacher name = " + t.getName() + " age = " + t.getAge());
        }

        session.flush();
        transaction.commit();
        session.close();
    }

    public void readTeacherById(int id) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // add read by id logic

        session.flush();
        transaction.commit();
        session.close();
    }

    public void updateTeacher(TeacherReq req) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // add update logic

        session.flush();
        transaction.commit();
        session.close();
    }

    public void deleteTeacher(int id) {
        Session session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        // add delete logic

        session.flush();
        transaction.commit();
        session.close();
    }

}
