import javax.persistence.*;
import java.util.Set;

@Entity

public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String serviceName;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private Set<Specialist> specialists;

    @OneToMany(mappedBy = "service", cascade = CascadeType.ALL)
    private Set<Client> clients;




}
