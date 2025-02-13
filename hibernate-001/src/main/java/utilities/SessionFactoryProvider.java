package utilities;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
    private static SessionFactory sessionFactory;

    public static SessionFactory provideSessionFactory() {
        if (sessionFactory == null) {
            try {
                // Explicitly load from classpath
                sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
            } catch (Exception e) {
                System.err.println("Failed to initialize SessionFactory: " + e);
            }
        }
        return sessionFactory;
    }
}
