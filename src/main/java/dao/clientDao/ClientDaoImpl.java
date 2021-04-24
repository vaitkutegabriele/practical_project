package dao.clientDao;

import entities.Client;
import connectionUtil.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.math.BigInteger;

public class ClientDaoImpl implements ClientDao {

    @Override
    public void assignClientToService(BigInteger serviceId, String lastName) {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createSQLQuery("UPDATE client SET serviceId = :id WHERE lastName = :name");
        query.setParameter("id", serviceId);
        query.setParameter("name", lastName);

        query.executeUpdate();
    }

    @Override
    public void addNewClient(Client client) {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        session.save(client);

        session.flush();
        session.clear();
    }
}
