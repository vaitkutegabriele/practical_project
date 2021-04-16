import org.hibernate.Session;
import org.hibernate.Transaction;

public class SpecialistDao {

    public void createSpecialist (Specialist specialist) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Inserting new specialist into database");
        session.save(specialist);
        transaction.commit();
    }

    public void deleteSpecialist (Specialist specialist) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Specialist has been deleted");
        session.delete(specialist);
        transaction.commit();
    }

    public void updateSpecialist (Specialist specialist) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        System.out.println("Information has been updated");
        session.update(specialist);
        transaction.commit();
    }
}
