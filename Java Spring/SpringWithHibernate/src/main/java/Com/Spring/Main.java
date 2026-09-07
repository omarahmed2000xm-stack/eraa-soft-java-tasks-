package Com.Spring;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
   public static void main(String[] args){
       Transaction transaction=null;
       try {
           Session session =HibernateUtill.getSessionFactory().openSession();
           transaction=session.beginTransaction();
           Email email=new Email();
           email.setEmail("omarali@gmail.com");
           email.setId(1);
           email.setName("Omar");
           session.persist(email);
           transaction.commit();
           System.out.println("email saved successfully ");


       } catch (Exception e) {
           if (transaction!=null){
               transaction.rollback();

           }
           e.printStackTrace();

       }
       finally {
           HibernateUtill.getSessionFactory().close();
       }
   }
}
