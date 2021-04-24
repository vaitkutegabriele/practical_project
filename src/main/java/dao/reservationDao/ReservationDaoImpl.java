package dao.reservationDao;

import connectionUtil.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.math.BigInteger;

public class ReservationDaoImpl implements ReservationDao {

    @Override
    public void addReservation(Long clientId, BigInteger serviceId, String appointmentTime) {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createSQLQuery("INSERT INTO Reservation(clientId, serviceID, appoitmentTime) VALUES(?, ?, ?, ?)");
        query.setParameter(1, clientId);
        query.setParameter(2, serviceId);
        query.setParameter(3, appointmentTime);

        query.executeUpdate();
    }

    @Override
    public Long getServiceIdByClientId(Long clientId) {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createSQLQuery("SELECT serviceId FROM reservation WHERE clientID = :id");
        query.setParameter("id", clientId);

        return (Long) query.getResultList().get(0);
    }
}















