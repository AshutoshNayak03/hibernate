package dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entities.Student;
import utilities.HibernateUtil;

/**
 * 
 */
public class StudentRunner {
	public static void main(String[] args) {
        // Get Hibernate Session
        Session session = HibernateUtil.getSessionFactory().openSession();

        // Begin Transaction
        Transaction transaction = session.beginTransaction();

        // Create Student with manually assigned rollNo
        Student student = new Student(101, "John Doe");

        // Save student
        session.persist(student);

        // Commit and Close Session
        transaction.commit();
        session.close();

        System.out.println("Student saved successfully!");
    }

}