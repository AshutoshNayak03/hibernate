package dao;

import entities.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import utilities.SessionFactoryProvider;

public class Create {
    public static void main(String[] args) {
        SessionFactory sessionFactory = null;
        Transaction transaction = null;

        try {
            sessionFactory = SessionFactoryProvider.provideSessionFactory();
            Session session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            Employee emp = new Employee();
            emp.setEmpName("John"); // Do NOT set empId, let Hibernate handle it
            session.persist(emp);

            transaction.commit();
            session.close();
            System.out.println("Employee saved successfully!");
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            System.err.println("Error: " + e);
        } finally {
            if (sessionFactory != null) {
                sessionFactory.close();
            }
        }
    }
}
