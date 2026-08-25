package Com.Spring;

import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
public class HibernateUtill {

private static final SessionFactory sessionFactory=buildSessionFactory();

private static SessionFactory buildSessionFactory(){
    try {
        return new Configuration().configure().buildSessionFactory();
    }catch (Throwable e){
        System.err.println("session factory creation failed  "+e);
        throw  new ExceptionInInitializerError(e);
    }

}

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
