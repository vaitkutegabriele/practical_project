package dao.clientDao;

import entities.Client;

import java.math.BigInteger;

public interface ClientDao {

    public void assignClientToService(BigInteger serviceId, String lastName);

    public void addNewClient (Client client);


}
