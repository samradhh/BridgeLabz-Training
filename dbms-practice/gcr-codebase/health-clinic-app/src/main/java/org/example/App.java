package org.example;

import org.example.model.Patient;
import org.example.service.PatientService;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
public static void main( String[] args ) throws Exception {

    Patient patient = new Patient();
    patient.setName("samradh");
    patient.setDob(LocalDate.of(2001, 5, 10));
    patient.setPhone("9876543210");
    patient.setEmail("samradh@gmail.com");
    patient.setAddress("UP");
    patient.setBloodGroup("AB+");

    PatientService patientService = new PatientService();
    int patientId = patientService.registerPatient(patient);

    System.out.println("Patient registered successfully. ID = " + patientId);

}
}