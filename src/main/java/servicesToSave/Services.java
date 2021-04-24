package servicesToSave;

import entities.Service;
import connectionUtil.ConnectionUtil;
import org.hibernate.Session;

public class Services {

    public static void insertService() {

        Session session = ConnectionUtil.getSessionFactory().openSession();

        Service service1 = new Service();
        service1.setServiceName("Primary care");
        service1.setAvailableTimes(30);

        Service service2 = new Service();
        service2.setServiceName("Mental health care");
        service2.setAvailableTimes(20);

        Service service3 = new Service();
        service3.setServiceName("Dental care");
        service3.setAvailableTimes(15);

        Service service4 = new Service();
        service4.setServiceName("Prenatal care");
        service4.setAvailableTimes(10);
    }
}
