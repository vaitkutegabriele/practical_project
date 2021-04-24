package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long reservationId;

    @JoinColumn(name = "clientId")
    private Long clientId;

    @JoinColumn (name = "serviceId")
    private Long serviceId;

    private String appointmentTime;
}
