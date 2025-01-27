import java.util.ArrayList;

class Hospital
{
    public ArrayList<Doctor> doctors;
    public ArrayList<Patient> patients;

    public Hospital()
    {
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor)
    {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient)
    {
        patients.add(patient);
    }
}

class Doctor
{
    public String doctorName;
    public ArrayList<Patient> patients;

    public Doctor(String doctorName)
    {
        this.doctorName = doctorName;
        this.patients = new ArrayList<>();
    }

    public void consult(Patient patient)
    {
        patients.add(patient);
        System.out.println("Doctor : " + doctorName + " consults with patient : " + patient.patientName);
    }
}

class Patient
{
    public String patientName;

    public Patient(String patientName)
    {
        this.patientName = patientName;
    }
}

public class HospitalManagement
{
    public static void main (String args[])
    {
        Hospital hospital = new Hospital();

        Doctor doctor1 = new Doctor("Mokshini");
        hospital.addDoctor(doctor1);

        Patient patient1 = new Patient("Moksh");
        hospital.addPatient(patient1);

        doctor1.consult(patient1);
    }
}