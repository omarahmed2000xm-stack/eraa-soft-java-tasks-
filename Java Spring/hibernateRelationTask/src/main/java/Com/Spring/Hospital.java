package Com.Spring;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Hospital {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long hospitalId ;

    private String name;
    private int numberOfDoctors ;
    private int numberOfPatient ;
    @OneToMany(mappedBy = "hospital")
    private List<Doctor>doctors=new ArrayList<>();
    @ManyToMany(cascade = {CascadeType.PERSIST,CascadeType.MERGE},fetch = FetchType.LAZY)

@JoinTable(name = "hospital_patient",
joinColumns=@JoinColumn(name = "hopital_id"),
    inverseJoinColumns = @JoinColumn(name = "patient_id"))
    private List<Patient>patients=new ArrayList<>();


    public long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfDoctors() {
        return numberOfDoctors;
    }

    public void setNumberOfDoctors(int numberOfDoctors) {
        this.numberOfDoctors = numberOfDoctors;
    }

    public int getNumberOfPatient() {
        return numberOfPatient;
    }

    public void setNumberOfPatient(int numberOfPatient) {
        this.numberOfPatient = numberOfPatient;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }
    public void addPatient(Patient patient) {
        patients.add(patient);
        patient.getName().add(this);
    }
}



