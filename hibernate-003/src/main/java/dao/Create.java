package dao;

/**
 * 
 */



import entities.Student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilities.SessionFactoryProvider;

public class Create {
    public static void main(String[] args)
    {
        try {
            SessionFactory sessionFactory
                = SessionFactoryProvider
                      .provideSessionFactory();
            Session session = sessionFactory.openSession();
            Transaction t = session.beginTransaction();

            Student stu = new Student("Ashutosh");
            session.persist(stu);

            t.commit();
            System.out.println("Student inserted sucessfully");
            sessionFactory.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}