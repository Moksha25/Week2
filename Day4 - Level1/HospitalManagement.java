import java.util.ArrayList;

class Hospital
{
    public String hospitalName;

    public Hospital(String hospitalName)
    {
        this.hospitalName = hospitalName;
        System.out.println("Hospital Name : " + hospitalName);
    }
}

class Doctor
{
    public String doctorName;
    public String speciality;
    public ArrayList<Patient> patients;

    public Doctor(String doctorName, String speciality)
    {
        this.doctorName = doctorName;
        this.speciality = speciality;
        this.patients = new ArrayList<>();
    }

    public void addPatient(String patientName, int age)
    {
        Patient patient = new Patient(patientName, age);
        patients.add(patient);
    }
}

class Patient
{
    public String patientName;
    public int age;
    public ArrayList<Doctor> doctors;

    public void addDoctor(String doctorName, String speciality)
    {
        Doctor doctor = new Doctor(doctorName, speciality);
        doctors.add(doctor);
        System.out.println("Consulting to doctor " + doctorName + " having speciality in " + speciality);
    }

    public Patient(String patientName, int age)
    {
        this.patientName = patientName;
        this.age = age;
        this.doctors = new ArrayList<>();
        
        System.out.println("Patient Name " + patientName + " of age " + age);
    }
}

public class HospitalManagement 
{
    public static void main (String args[])
    {
        Hospital hospital = new Hospital("Jainam shree");

        Patient patient1 = new Patient("Patient1", 22);
        patient1.addDoctor("Doctor1", "Brain");

        Patient patient2 = new Patient("Patient2", 32);
        patient2.addDoctor("Doctor1", "Brain");

        Patient patient3 = new Patient("Patient3", 26);
        patient3.addDoctor("Doctor2", "Lungs");
    }
}
