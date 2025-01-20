public class Patient
{
    static String hospitalName = "Jainam Shree Hospital";
    private String name;
    private int age;
    private String ailment;
    final int patientID;
    static int total = 0;
    
    public Patient(String name, int age, String ailment, int patientID)
    {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        total++;
    }

    public void getTotalPatient()
    {
        System.out.println("Total patient are : " + total);
    }

    public static void main (String args [])
    {
        Patient patient1 = new Patient("Mokshini", 20, "Fever", 123);
        patient1.getTotalPatient();

        Patient patient2 = new Patient("Bhavesh", 22, "Headache", 456);
        patient2.getTotalPatient();
    }
}
