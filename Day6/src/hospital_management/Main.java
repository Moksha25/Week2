package hospital_management;

public class Main
{
    public static void main (String args[])
    {
        InPatient p1 = new InPatient(123,"Mokshini", 21);
        p1.getPatientDetails();
        p1.addRecord("Diagnosis");
        p1.viewRecord();
        System.out.println();

        OutPatient p2 = new OutPatient(456, "Bhavesh", 22);
        p2.getPatientDetails();
        p2.addRecord("Blood Test");
        p2.viewRecord();
    }
}
