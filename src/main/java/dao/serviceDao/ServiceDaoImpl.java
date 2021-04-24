package dao.serviceDao;

import entities.Service;
import connectionUtil.ConnectionUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class ServiceDaoImpl implements ServiceDao{
    @Override

    public List<Service> getAllServices() {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createQuery("from Service");
        List<Service> services = query.getResultList();

        return services;
    }

    @Override
    public void addNewService(Service service) {
        Session session = ConnectionUtil.getSessionFactory().openSession();
        session.getTransaction().begin();

        Query query = session.createSQLQuery("INSER INTO Service (serviceName, availability) VALUES(:serviceName, :availableTimes)");
        query.setParameter("serviceName", service.getServiceName());
        query.setParameter("availableTime", service.getAvailableTimes());

        query.executeUpdate();



    }
}
