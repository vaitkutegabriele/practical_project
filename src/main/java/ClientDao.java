import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClientDao {

    public void createClient(Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Inserting new client into database");
        session.save(client);
        transaction.commit();
    }

    public void deleteClient (Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("The client was deleted");
        session.delete(client);
        transaction.commit();
    }

    public void updateClient (Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Information has been updated");
        session.update(client);
        transaction.commit();

    }
}
