package Com.Spring;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {

    public static void main(String[] args) {

        Transaction transaction = null;

        try (Session session =
                     HibernateUtil.getSessionFactory().openSession()) {

            transaction = session.beginTransaction();

            Hospital hospital = new Hospital();
            hospital.setName("El Salam Hospital");
            hospital.setNumberOfDoctors(0);
            hospital.setNumberOfPatient(1);

            Patient patient = new Patient();
            patient.setName("Ahmed");
            patient.setTypeOfDisease("Diabetes");

            hospital.addPatient(patient);

            session.persist(hospital);

            transaction.commit();

            System.out.println("Data saved successfully");

        } catch (Exception exception) {

            if (transaction != null) {
                transaction.rollback();
            }

            exception.printStackTrace();

        } finally {
            HibernateUtil.shutdown();
        }
    }
}