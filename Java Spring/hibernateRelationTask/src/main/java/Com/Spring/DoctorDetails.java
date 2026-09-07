package Com.Spring;

import jakarta.persistence.*;

@Entity
public class DoctorDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long doctorDetailsId;
    private String address;
    private String firstName;
    private String lastName;
    private int age ;



}
