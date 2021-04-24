package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientId;

    private String firstName;

    private String lastName;

    private String clientPassword;

    private String email;

    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "serviceId")
    private Service service;

    public Client(String firstName, String lastName, String clientPassword, String email, String phoneNumber) {
    }
}
