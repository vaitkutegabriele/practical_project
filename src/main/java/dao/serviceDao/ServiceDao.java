package dao.serviceDao;

import entities.Service;

import java.util.List;

public interface ServiceDao {

    public List<Service> getAllServices();

    public void addNewService (Service service);


}
