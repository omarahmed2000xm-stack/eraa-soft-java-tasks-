package Com.Spring;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Doctor {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id ;
    private String userName;
    private double salary ;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "doctor_details_id" ,unique = true)
private DoctorDetails doctorDetails;
    @OneToMany(mappedBy = "doctor")
    private List<Patient> patients=new ArrayList<>();
    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    public int getId() {
        return id;


    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public DoctorDetails getDoctorDetails() {
        return doctorDetails;
    }

    public void setDoctorDetails(DoctorDetails doctorDetails) {
        this.doctorDetails = doctorDetails;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
