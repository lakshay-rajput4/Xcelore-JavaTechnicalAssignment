package com.xcelore.medassist.services;

import com.xcelore.medassist.entities.Patient;


public interface PatientService {
	 Patient createPatient(Patient patient);
	    void deletePatient(String id);
	    Patient getPatientById(String id);
}
