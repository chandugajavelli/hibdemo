package com.demo.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println( "Hello World!" );
        Alien a = new Alien();
        a.setAid(1);
        a.setAname("suresh");
        a.setMarks(95);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();

        Session session = factory.openSession();

        // Start a transaction
        session.beginTransaction();

        // Save the Alien object
        session.persist(a); // Ensure `alien` is the instance you want to save

        // Commit the transaction
        session.getTransaction().commit();

        // Close the session
        session.close();
        factory.close();



        
    }
}
