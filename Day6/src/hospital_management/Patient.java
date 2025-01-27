package hospital_management;

public abstract class Patient
{
    private int patientID;
    private String name;
    private int age;

    public int getPatientID()
    {
        return patientID;
    }

    public void setPatientID()
    {
        this.patientID = patientID;
    }

    public String getName()
    {
        return name;
    }

    public void setName()
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge()
    {
        this.age = age;
    }

    public Patient(int patientID, String name, int age)
    {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
    }

    public abstract int calculateBill(int price, int days);

    public void getPatientDetails()
    {
        System.out.println("Patient ID : " + patientID);
        System.out.println("Patient name : " + name);
        System.out.println("Patient age : " + age);
        System.out.println("Total bill : " + calculateBill(2000,10));
    }
}
