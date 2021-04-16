import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Specialist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String firstName;
    private String lastName;
    private int telephoneNumber;
    private String serviceName;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    private Service service;





}
