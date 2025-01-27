package hospital_management;

public class OutPatient extends Patient implements MedicalRecord
{
    public String recordHistory;

    public OutPatient(int patientID, String name, int age)
    {
        super(patientID, name, age);
    }

    public int calculateBill(int price, int days)
    {
        return price * days;
    }

    public void addRecord(String record)
    {
        recordHistory = record;
    }

    public void viewRecord()
    {
        System.out.println("Patient record : " + recordHistory);
    }
}
