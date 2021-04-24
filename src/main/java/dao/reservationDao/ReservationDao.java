package dao.reservationDao;

import java.math.BigInteger;

public interface ReservationDao {

    public void addReservation (Long clientId, BigInteger serviceId, String appointmentTime);

    public Long getServiceIdByClientId(Long clientId);
}
