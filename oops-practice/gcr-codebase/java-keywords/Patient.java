import java.util.Scanner;

public class Patient {
    String name;
    int age;
    String ailment;
    final String patientID;
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;

    Patient(String patientID, String name, int age, String ailment){
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    static int getTotalPatients(){
        return totalPatients;
    }

    void displayDetails(Object obj){
        if(obj instanceof Patient){
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
        }
    }

    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        Patient p1 = new Patient("P001", "Lathika", 30, "Flu");
        Patient p2 = new Patient("P002", "Lidiya", 45, "Fracture");
        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
        p1.displayDetails(p1);
        p2.displayDetails(p2);
    }
}