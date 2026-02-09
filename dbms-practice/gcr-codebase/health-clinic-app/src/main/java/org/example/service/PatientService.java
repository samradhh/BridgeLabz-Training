package org.example.service;


import org.example.dao.PatientDao;
import org.example.model.Patient;

public class PatientService {

    private final PatientDoa patientDAO = new PatientDao();

    public int registerPatient(Patient patient) throws Exception {

        if (patientDAO.existsByPhoneOrEmail(
                patient.getPhone(), patient.getEmail())) {
            throw new RuntimeException("Patient already exists");
        }

        return patientDAO.save(patient);
    }
}