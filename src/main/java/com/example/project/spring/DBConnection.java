package com.example.project.spring;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class DBConnection {

    public static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        return sessionFactory;
    }

    public static List<User> read() {
        Session session = getSessionFactory().openSession();
        @SuppressWarnings("unchecked")
        List<User> users = session.createQuery("FROM User").list();
        session.close();
        System.out.println("Found " + users.size() + " Users");
        return users;
    }

    public static User findByID(Integer id) {
        Session session = getSessionFactory().openSession();
        User e = (User) session.load(User.class, id);
        System.out.println("Found " + e.getName() + " id "+ e.getId());
        session.close();
        return e;
    }
}
