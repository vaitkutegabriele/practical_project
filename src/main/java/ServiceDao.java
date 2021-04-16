import org.hibernate.Session;
import org.hibernate.Transaction;

public class ServiceDao {

    public void createService(Service service) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Inserting new service into database");
        session.save(service);
        transaction.commit();
    }

    public void deleteService (Service service) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Service has been deleted");
        session.save(service);
        transaction.commit();
    }
}
