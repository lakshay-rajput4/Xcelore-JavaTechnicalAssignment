package com.xcelore.medassist.services.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xcelore.medassist.dao.PatientRepository;
import com.xcelore.medassist.entities.Patient;
import com.xcelore.medassist.services.PatientService;

@Service
public class PatientServiceImpl implements PatientService {
	 private final PatientRepository patientRepository;

	    @Autowired
	    public PatientServiceImpl(PatientRepository patientRepository) {
	        this.patientRepository = patientRepository;
	    }

	    @Override
	    public Patient createPatient(Patient patient) {
	    	patient.setPatientuid(UUID.randomUUID().toString());
	        return patientRepository.save(patient);
	    }

	    @Override
	    public void deletePatient(String id) {
	        patientRepository.deleteById(id);
	    }

	    @Override
	    public Patient getPatientById(String id) {
	        return patientRepository.findById(id).orElse(null);
	    }
}
